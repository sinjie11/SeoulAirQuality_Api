package edu.android.seoulairquality_api;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class MainActivity extends AppCompatActivity {

    /***
            ※ 서울시 측정소 행정코드 (25개 구)

     111123 : 종로구,  111121 : 중구,    111131 : 용산구,
     111142 : 성동구,  111141 : 광진구,   111152 : 동대문구,
     111151 : 중랑구,  111161 : 성북구,   111291 : 강북구,
     111171 : 도봉구,  111311 : 노원구,   111181 : 은평구,
     111191 : 서대문구, 111201 : 마포구,   111301 : 양천구,
     111212 : 강서구,  111221 : 구로구,   111281 : 금천구,
     111231 : 영등포구, 111241 : 동작구,   111251 : 관악구,
     111262 : 서초구,  111261 : 강남구,   111273 : 송파구,
     111274 : 강동구

     ***/


    /**
       ※ 서울시 열린데이터 광장 인증키 :  626b45544573696e36337a75776c4c
     **/
    public String KEYS = "626b45544573696e36337a75776c4c";


    /***
       - 실시간 대기환경정보 주소 (전체 리스트)

     * http://openAPI.seoul.go.kr:8088/626b45544573696e36337a75776c4c/xml/ListAirQualityByDistrictService/1/25/
     ***/
    public String realTimeAllAddr = "http://openAPI.seoul.go.kr:8088/" + KEYS + "/xml/ListAirQualityByDistrictService/1/25/";


    /****
       - 중구 실시간 대기환경정보 (행정코드 검색 조건)

     * http://openAPI.seoul.go.kr:8088/626b45544573696e36337a75776c4c/xml/ListAirQualityByDistrictService/1/5/111121/
     ****/
    public String realTimeOnlyAddr = "http://openAPI.seoul.go.kr:8088/" + KEYS + "/xml/ListAirQualityByDistrictService/1/5/" + "111121" + "/";



    private TextView textDate, textCode, textName, textPm10, textPm25, textMaxIndex, textGrade;
    private EditText editText;

    ArrayList<BasicData> basicDatas;

    private String tag;

    private String inputAddrText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textDate = findViewById(R.id.textDate);
        textCode = findViewById(R.id.textCode);
        textName = findViewById(R.id.textName);
        textPm10 = findViewById(R.id.textPm10);
        textPm25 = findViewById(R.id.textPm25);
        textMaxIndex = findViewById(R.id.textMaxIndex);
        textGrade = findViewById(R.id.textGrade);

        editText = findViewById(R.id.editText);


    }

    public void readAddrClick(View view) {

        new GetXmlData().execute();
    } // end readAddrClick


    public ArrayList<BasicData> listBasicData() { // 데이터 가져오기

        ArrayList<BasicData> lists = new ArrayList<>();

        inputAddrText = editText.getText().toString(); // editText 에 입력한 값

        try {
            Thread.sleep(500);
            URL url = new URL(realTimeAllAddr); // 문자열로 된 요청 realTimeAllAddr 을 URL 객체로 생성.
            InputStream is = url.openStream(); // url 위치로 InputStream 연결

            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            XmlPullParser xpp = factory.newPullParser();
            xpp.setInput(new InputStreamReader(is)); // InputStream 으로부터 XML 입력받음

            String tag;
            xpp.next();

            int eventType = xpp.getEventType();
            BasicData basicData = new BasicData();

            while (eventType != XmlPullParser.END_DOCUMENT) {

                switch (eventType) {
                    case XmlPullParser.START_DOCUMENT:// 파싱 시작

                        break;

                    case XmlPullParser.START_TAG:
                        tag = xpp.getName();// 태그 이름 얻어오기

                        if (tag.equals("MSRDATE")) { // 측정날짜 및 시간
                            xpp.next();
                            basicData.setMSRDATE(xpp.getText());

                        } else if (tag.equals("MSRADMCODE")) { // 측정소 행정코드
                            xpp.next();
                            basicData.setMSRADMCODE(Integer.parseInt(xpp.getText()));

                        } else if (tag.equals("MSRSTENAME")) { // 측정소명
                            xpp.next();
                            basicData.setMSRSTENAME(xpp.getText());

                        } else if (tag.equals("MAXINDEX")) { // 통합대기환경지수
                            xpp.next();
                            basicData.setMAXINDEX(Integer.parseInt(xpp.getText()));

                        } else if (tag.equals("GRADE")) { // 통합대기환경지수 등급
                            xpp.next();
                            basicData.setGRADE(xpp.getText());

                        } else if (tag.equals("PM10")) { // 미세먼지(단위:㎍/㎥)
                            xpp.next();
                            basicData.setPM10(Integer.parseInt(xpp.getText()));

                        } else if (tag.equals("PM25")) { // 초 미세먼지(단위:㎍/㎥)
                            xpp.next();
                            basicData.setPM25(Integer.parseInt(xpp.getText()));
                        }

                        break;

                    case XmlPullParser.TEXT:
                        break;

                    case XmlPullParser.END_TAG:
                        tag = xpp.getName(); // 태그 이름 얻어오기
                        if (tag.equals("row")) {
                            lists.add(basicData);
                            basicData = new BasicData();
                        }

                        break;
                }
                eventType = xpp.next();
            }

        } catch (Exception e) {
            e.printStackTrace();

        } // end try-catch

        return lists;
    } // end listBasicData()


    class GetXmlData extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            basicDatas = listBasicData();
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {

            if (inputAddrText == null || inputAddrText.equals("")) {
                Toast.makeText(MainActivity.this, "검색할 주소가 입력 되지 않았습니다." + "\n" + "주소를 다시 입력해주세요.", Toast.LENGTH_SHORT).show();

            } else {
                textDate.setText("날짜 및 시간 : ");
                textCode.setText("측정소 행정코드 : ");
                textName.setText("측정소명 : ");
                textMaxIndex.setText("통합대기환경지수(CAI) : ");
                textGrade.setText("통합대기환경지수(CAI) 등급 : ");
                textPm10.setText("미세먼지(단위:㎍/㎥) : ");
                textPm25.setText("초미세먼지(단위:㎍/㎥) : ");
            }


            for (int i = 0; i < basicDatas.size(); i++) {

                if (basicDatas.get(i).getMSRSTENAME().equals(inputAddrText)) { // 입력한 검색 조건(inputAddrText) 과 주소 비교 후 조회

                    String s = basicDatas.get(i).getMSRDATE();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmm");
                    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm");;

                    try {
                        Date date = sdf.parse(s);
                        String out = sdf2.format(date);
                        textDate.append(out);

                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    textCode.append(basicDatas.get(i).getMSRADMCODE() + "");
                    textName.append(basicDatas.get(i).getMSRSTENAME());
                    textMaxIndex.append(basicDatas.get(i).getMAXINDEX() + "");
                    textGrade.append(basicDatas.get(i).getGRADE());
                    textPm10.append(basicDatas.get(i).getPM10() + " " + "㎍/㎥");
                    textPm25.append(basicDatas.get(i).getPM25() + " " + "㎍/㎥");

                } // end if

            } // end for

        } // end onPostExecute

    } // end class GetXmlData


} // end class MainActivity




    /**
       - 아래 행정코드 배열 값은 필요하면 가져다 쓰면 됨 -
     *
     public String[] addrGu1 = {
     "111123", "111121", "111131",
     "111142", "111141", "111152",
     "111151", "111161", "111291",
     "111171", "111311", "111181",
     "111191", "111201", "111301",
     "111212", "111221", "111281",
     "111231", "111241", "111251",
     "111262", "111261", "111273",
     "111274"

     };


     public int[] addrGu2 = {
     111123, 111121, 111131,
     111142, 111141, 111152,
     111151, 111161, 111291,
     111171, 111311, 111181,
     111191, 111201, 111301,
     111212, 111221, 111281,
     111231, 111241, 111251,
     111262, 111261, 111273,
     111274

     };


     public String[] addrGu3 = {
     "종로구", "중구", "용산구",
     "성동구", "광진구", "동대문구",
     "중랑구", "성북구", "강북구",
     "도봉구", "노원구", "은평구",
     "서대문구", "마포구", "양천구",
     "강서구", "구로구", "금천구",
     "영등포구", "동작구", "관악구",
     "서초구", "강남구", "송파구",
     "강동구"
     };

     */

