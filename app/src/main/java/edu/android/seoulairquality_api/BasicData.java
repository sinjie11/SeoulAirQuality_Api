package edu.android.seoulairquality_api;

import java.util.List;


/**
 * ※ 서울시 열린데이터 광장 인증키 :  626b45544573696e36337a75776c4c
 * <p>
 * - 실시간 대기환경정보 주소 (샘플)
 * <p>
 * http://openAPI.seoul.go.kr:8088/626b45544573696e36337a75776c4c/xml/ListAirQualityByDistrictService/1/5/
 * <p>
 * - 중구 실시간 대기환경정보 (샘플)
 * <p>
 * http://openAPI.seoul.go.kr:8088/626b45544573696e36337a75776c4c/xml/ListAirQualityByDistrictService/1/5/111121/
 **/


/**
 * - 실시간 대기환경정보 주소 (샘플)
 * <p>
 * http://openAPI.seoul.go.kr:8088/626b45544573696e36337a75776c4c/xml/ListAirQualityByDistrictService/1/5/
 */


/**
 * - 중구 실시간 대기환경정보 (샘플)
 * <p>
 * http://openAPI.seoul.go.kr:8088/626b45544573696e36337a75776c4c/xml/ListAirQualityByDistrictService/1/5/111121/
 **/

/***
 *           ※ 측정소 행정코드

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


public class BasicData {

    private String MSRDATE;         // 측정날짜
    private int MSRADMCODE;         // 측정소 행정코드
    private String MSRSTENAME;      // 측정소명
    private int MAXINDEX;           // 통합대기환경지수
    private String GRADE;           // 통합대기환경지수 등급
    private String POLLUTANT;       // 지수결정물질
    private double NITROGEN;        // 이산화질소(단위:ppm)
    private double NITROGENINDEX;   // 이산화질소 지수
    private double OZONE;           // 오존(단위:ppm)
    private int OZONEINDEX;         // 오존 지수
    private double CARBON;          // 일산화탄소(단위:ppm)
    private int CARBONINDEX;        // 일산화탄소 지수
    private double SULFUROUS;       // 아황산가스(단위:ppm)
    private int SULFUROUSINDEX;     // 아황산가스 지수
    private int PM10;               // 미세먼지(단위:㎍/㎥)
    private int PM10INDEX;          // 미세먼지 지수
    private int PM24;               // 미세먼지(24시)농도
    private int PM24INDEX;          // 미세먼지(24시)지수
    private int MSRRGNCODE;         // 권역코드
    private String MSRRGNNAME;      // 권역명
    private int PM25;               // 초미세먼지(단위:㎍/㎥)
    private int PM25INDEX;          // 초미세먼지 지수


    /**
     * @ getter / setter
     */

    public String getMSRDATE() {
        return MSRDATE;
    }

    public void setMSRDATE(String MSRDATE) {
        this.MSRDATE = MSRDATE;
    }

    public int getMSRADMCODE() {
        return MSRADMCODE;
    }

    public void setMSRADMCODE(int MSRADMCODE) {
        this.MSRADMCODE = MSRADMCODE;
    }

    public String getMSRSTENAME() {
        return MSRSTENAME;
    }

    public void setMSRSTENAME(String MSRSTENAME) {
        this.MSRSTENAME = MSRSTENAME;
    }

    public int getMAXINDEX() {
        return MAXINDEX;
    }

    public void setMAXINDEX(int MAXINDEX) {
        this.MAXINDEX = MAXINDEX;
    }

    public String getGRADE() {
        return GRADE;
    }

    public void setGRADE(String GRADE) {
        this.GRADE = GRADE;
    }

    public String getPOLLUTANT() {
        return POLLUTANT;
    }

    public void setPOLLUTANT(String POLLUTANT) {
        this.POLLUTANT = POLLUTANT;
    }

    public double getNITROGEN() {
        return NITROGEN;
    }

    public void setNITROGEN(double NITROGEN) {
        this.NITROGEN = NITROGEN;
    }

    public double getNITROGENINDEX() {
        return NITROGENINDEX;
    }

    public void setNITROGENINDEX(double NITROGENINDEX) {
        this.NITROGENINDEX = NITROGENINDEX;
    }

    public double getOZONE() {
        return OZONE;
    }

    public void setOZONE(double OZONE) {
        this.OZONE = OZONE;
    }

    public int getOZONEINDEX() {
        return OZONEINDEX;
    }

    public void setOZONEINDEX(int OZONEINDEX) {
        this.OZONEINDEX = OZONEINDEX;
    }

    public double getCARBON() {
        return CARBON;
    }

    public void setCARBON(double CARBON) {
        this.CARBON = CARBON;
    }

    public int getCARBONINDEX() {
        return CARBONINDEX;
    }

    public void setCARBONINDEX(int CARBONINDEX) {
        this.CARBONINDEX = CARBONINDEX;
    }

    public double getSULFUROUS() {
        return SULFUROUS;
    }

    public void setSULFUROUS(double SULFUROUS) {
        this.SULFUROUS = SULFUROUS;
    }

    public int getSULFUROUSINDEX() {
        return SULFUROUSINDEX;
    }

    public void setSULFUROUSINDEX(int SULFUROUSINDEX) {
        this.SULFUROUSINDEX = SULFUROUSINDEX;
    }

    public int getPM10() {
        return PM10;
    }

    public void setPM10(int PM10) {
        this.PM10 = PM10;
    }

    public int getPM10INDEX() {
        return PM10INDEX;
    }

    public void setPM10INDEX(int PM10INDEX) {
        this.PM10INDEX = PM10INDEX;
    }

    public int getPM24() {
        return PM24;
    }

    public void setPM24(int PM24) {
        this.PM24 = PM24;
    }

    public int getPM24INDEX() {
        return PM24INDEX;
    }

    public void setPM24INDEX(int PM24INDEX) {
        this.PM24INDEX = PM24INDEX;
    }

    public int getMSRRGNCODE() {
        return MSRRGNCODE;
    }

    public void setMSRRGNCODE(int MSRRGNCODE) {
        this.MSRRGNCODE = MSRRGNCODE;
    }

    public String getMSRRGNNAME() {
        return MSRRGNNAME;
    }

    public void setMSRRGNNAME(String MSRRGNNAME) {
        this.MSRRGNNAME = MSRRGNNAME;
    }

    public int getPM25() {
        return PM25;
    }

    public void setPM25(int PM25) {
        this.PM25 = PM25;
    }

    public int getPM25INDEX() {
        return PM25INDEX;
    }

    public void setPM25INDEX(int PM25INDEX) {
        this.PM25INDEX = PM25INDEX;
    }


    @Override
    public String toString() {
        return "BasicData{" +
                "MSRDATE='" + MSRDATE + '\'' +
                ", MSRADMCODE=" + MSRADMCODE +
                ", MSRSTENAME='" + MSRSTENAME + '\'' +
                ", MAXINDEX=" + MAXINDEX +
                ", GRADE='" + GRADE + '\'' +
                ", POLLUTANT='" + POLLUTANT + '\'' +
                ", NITROGEN=" + NITROGEN +
                ", NITROGENINDEX=" + NITROGENINDEX +
                ", OZONE=" + OZONE +
                ", OZONEINDEX=" + OZONEINDEX +
                ", CARBON=" + CARBON +
                ", CARBONINDEX=" + CARBONINDEX +
                ", SULFUROUS=" + SULFUROUS +
                ", SULFUROUSINDEX=" + SULFUROUSINDEX +
                ", PM10=" + PM10 +
                ", PM10INDEX=" + PM10INDEX +
                ", PM24=" + PM24 +
                ", PM24INDEX=" + PM24INDEX +
                ", MSRRGNCODE=" + MSRRGNCODE +
                ", MSRRGNNAME='" + MSRRGNNAME + '\'' +
                ", PM25=" + PM25 +
                ", PM25INDEX=" + PM25INDEX +
                '}';
    }

}


//    public ListAirQualityByDistrictService LAQBDS;
//
//
//
//    public BasicData.ListAirQualityByDistrictService getLAQBDS() {
//        return LAQBDS;
//    }
//
//    @Override
//    public String toString() {
//        return "BasicData{" +
//                "LAQBDS=" + LAQBDS +
//                '}';
//    }
//
//
//    class ListAirQualityByDistrictService {
//
//        private int list_total_count;
//        private Result RESULT;
//        private List<Row> row;
//
//        public List<Row> getRow() {
//            return row;
//        }
//
//        class Result {
//            private String CODE;
//            private String MESSAGE;
//
//            @Override
//            public String toString() {
//                return "Result{" +
//                        "CODE='" + CODE + '\'' +
//                        ", MESSAGE='" + MESSAGE + '\'' +
//                        '}';
//            }
//        }
//
//    } // end class ListAirQualityByDistrictService
//
//    class Row {
//
//        private String MSRDATE;	        // 측정날짜
//        private int MSRADMCODE;         // 측정소 행정코드
//        private String MSRSTENAME;      // 측정소명
//        private int MAXINDEX;           // 통합대기환경지수
//        private String GRADE;           // 통합대기환경지수 등급
//        private String POLLUTANT;       // 지수결정물질
//        private double NITROGEN;        // 이산화질소(단위:ppm)
//        private double NITROGENINDEX;   // 이산화질소 지수
//        private double OZONE;           // 오존(단위:ppm)
//        private int OZONEINDEX;         // 오존 지수
//        private double CARBON;          // 일산화탄소(단위:ppm)
//        private int CARBONINDEX;        // 일산화탄소 지수
//        private double SULFUROUS;       // 아황산가스(단위:ppm)
//        private int SULFUROUSINDEX;     // 아황산가스 지수
//        private int PM10;               // 미세먼지(단위:㎍/㎥)
//        private int PM10INDEX;          // 미세먼지 지수
//        private int PM24;               // 미세먼지(24시)농도
//        private int PM24INDEX;          // 미세먼지(24시)지수
//        private int MSRRGNCODE;         // 권역코드
//        private String MSRRGNNAME;      // 권역명
//        private int PM25;               // 초미세먼지(단위:㎍/㎥)
//        private int PM25INDEX;          // 초미세먼지 지수
//
//
//        /**
//         * @ getter / setter
//         */
//
//        public String getMSRDATE() {
//            return MSRDATE;
//        }
//
//        public void setMSRDATE(String MSRDATE) {
//            this.MSRDATE = MSRDATE;
//        }
//
//        public int getMSRADMCODE() {
//            return MSRADMCODE;
//        }
//
//        public void setMSRADMCODE(int MSRADMCODE) {
//            this.MSRADMCODE = MSRADMCODE;
//        }
//
//        public String getMSRSTENAME() {
//            return MSRSTENAME;
//        }
//
//        public void setMSRSTENAME(String MSRSTENAME) {
//            this.MSRSTENAME = MSRSTENAME;
//        }
//
//        public int getMAXINDEX() {
//            return MAXINDEX;
//        }
//
//        public void setMAXINDEX(int MAXINDEX) {
//            this.MAXINDEX = MAXINDEX;
//        }
//
//        public String getGRADE() {
//            return GRADE;
//        }
//
//        public void setGRADE(String GRADE) {
//            this.GRADE = GRADE;
//        }
//
//        public String getPOLLUTANT() {
//            return POLLUTANT;
//        }
//
//        public void setPOLLUTANT(String POLLUTANT) {
//            this.POLLUTANT = POLLUTANT;
//        }
//
//        public double getNITROGEN() {
//            return NITROGEN;
//        }
//
//        public void setNITROGEN(double NITROGEN) {
//            this.NITROGEN = NITROGEN;
//        }
//
//        public double getNITROGENINDEX() {
//            return NITROGENINDEX;
//        }
//
//        public void setNITROGENINDEX(double NITROGENINDEX) {
//            this.NITROGENINDEX = NITROGENINDEX;
//        }
//
//        public double getOZONE() {
//            return OZONE;
//        }
//
//        public void setOZONE(double OZONE) {
//            this.OZONE = OZONE;
//        }
//
//        public int getOZONEINDEX() {
//            return OZONEINDEX;
//        }
//
//        public void setOZONEINDEX(int OZONEINDEX) {
//            this.OZONEINDEX = OZONEINDEX;
//        }
//
//        public double getCARBON() {
//            return CARBON;
//        }
//
//        public void setCARBON(double CARBON) {
//            this.CARBON = CARBON;
//        }
//
//        public int getCARBONINDEX() {
//            return CARBONINDEX;
//        }
//
//        public void setCARBONINDEX(int CARBONINDEX) {
//            this.CARBONINDEX = CARBONINDEX;
//        }
//
//        public double getSULFUROUS() {
//            return SULFUROUS;
//        }
//
//        public void setSULFUROUS(double SULFUROUS) {
//            this.SULFUROUS = SULFUROUS;
//        }
//
//        public int getSULFUROUSINDEX() {
//            return SULFUROUSINDEX;
//        }
//
//        public void setSULFUROUSINDEX(int SULFUROUSINDEX) {
//            this.SULFUROUSINDEX = SULFUROUSINDEX;
//        }
//
//        public int getPM10() {
//            return PM10;
//        }
//
//        public void setPM10(int PM10) {
//            this.PM10 = PM10;
//        }
//
//        public int getPM10INDEX() {
//            return PM10INDEX;
//        }
//
//        public void setPM10INDEX(int PM10INDEX) {
//            this.PM10INDEX = PM10INDEX;
//        }
//
//        public int getPM24() {
//            return PM24;
//        }
//
//        public void setPM24(int PM24) {
//            this.PM24 = PM24;
//        }
//
//        public int getPM24INDEX() {
//            return PM24INDEX;
//        }
//
//        public void setPM24INDEX(int PM24INDEX) {
//            this.PM24INDEX = PM24INDEX;
//        }
//
//        public int getMSRRGNCODE() {
//            return MSRRGNCODE;
//        }
//
//        public void setMSRRGNCODE(int MSRRGNCODE) {
//            this.MSRRGNCODE = MSRRGNCODE;
//        }
//
//        public String getMSRRGNNAME() {
//            return MSRRGNNAME;
//        }
//
//        public void setMSRRGNNAME(String MSRRGNNAME) {
//            this.MSRRGNNAME = MSRRGNNAME;
//        }
//
//        public int getPM25() {
//            return PM25;
//        }
//
//        public void setPM25(int PM25) {
//            this.PM25 = PM25;
//        }
//
//        public int getPM25INDEX() {
//            return PM25INDEX;
//        }
//
//        public void setPM25INDEX(int PM25INDEX) {
//            this.PM25INDEX = PM25INDEX;
//        }
//
//        @Override
//        public String toString() {
//            return "Row{" +
//                    "MSRDATE='" + MSRDATE + '\'' +
//                    ", MSRADMCODE=" + MSRADMCODE +
//                    ", MSRSTENAME='" + MSRSTENAME + '\'' +
//                    ", MAXINDEX=" + MAXINDEX +
//                    ", GRADE='" + GRADE + '\'' +
//                    ", POLLUTANT='" + POLLUTANT + '\'' +
//                    ", NITROGEN=" + NITROGEN +
//                    ", NITROGENINDEX=" + NITROGENINDEX +
//                    ", OZONE=" + OZONE +
//                    ", OZONEINDEX=" + OZONEINDEX +
//                    ", CARBON=" + CARBON +
//                    ", CARBONINDEX=" + CARBONINDEX +
//                    ", SULFUROUS=" + SULFUROUS +
//                    ", SULFUROUSINDEX=" + SULFUROUSINDEX +
//                    ", PM10=" + PM10 +
//                    ", PM10INDEX=" + PM10INDEX +
//                    ", PM24=" + PM24 +
//                    ", PM24INDEX=" + PM24INDEX +
//                    ", MSRRGNCODE=" + MSRRGNCODE +
//                    ", MSRRGNNAME='" + MSRRGNNAME + '\'' +
//                    ", PM25=" + PM25 +
//                    ", PM25INDEX=" + PM25INDEX +
//                    '}';
//        }
//
//    } // end class Row
//
//
//
//
//} // end class BasicData
//
