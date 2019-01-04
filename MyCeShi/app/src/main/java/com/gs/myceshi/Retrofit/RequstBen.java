package com.gs.myceshi.Retrofit;

public class RequstBen {
    /**
     * extra : {}
     * sid : D1062
     * data : {"tranId":"DZSWJ.ZHGLXT.MHQX.YHGL.YHLOGIN","code":"6666","s":"<yhzcm>440606199519951<\/yhzcm><sdzhkg>Y<\/sdzhkg><dlztcs>03,06,09<\/dlztcs><yhdlm>440606199519951<\/yhdlm><klcwcs>0<\/klcwcs><dllx>DW<\/dllx><yhlx>DW<\/yhlx><yhkl>Abcd1234<\/yhkl><jrxt>L1CQYJSHX<\/jrxt><xkyhsqlnsbkg>Y<\/xkyhsqlnsbkg>"}
     */

    private ExtraBean extra;
    private String sid;
    private DataBean data;

    public ExtraBean getExtra() {
        return extra;
    }

    public void setExtra(ExtraBean extra) {
        this.extra = extra;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class ExtraBean {
    }

    public static class DataBean {
        /**
         * tranId : DZSWJ.ZHGLXT.MHQX.YHGL.YHLOGIN
         * code : 6666
         * s : <yhzcm>440606199519951</yhzcm><sdzhkg>Y</sdzhkg><dlztcs>03,06,09</dlztcs><yhdlm>440606199519951</yhdlm><klcwcs>0</klcwcs><dllx>DW</dllx><yhlx>DW</yhlx><yhkl>Abcd1234</yhkl><jrxt>L1CQYJSHX</jrxt><xkyhsqlnsbkg>Y</xkyhsqlnsbkg>
         */

        private String tranId;
        private String code;
        private String s;

        public String getTranId() {
            return tranId;
        }

        public void setTranId(String tranId) {
            this.tranId = tranId;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getS() {
            return s;
        }

        public void setS(String s) {
            this.s = s;
        }
    }
}
