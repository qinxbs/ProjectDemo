package com.gs.myceshi.Retrofit;

import java.util.List;

public class ResponseBean {

    /**
     * taxPayer : {"djjgDm":"24406060700","bsrdzxx":"58322798@qq.com","gdghlxDm":"1","tzzebzsje":"0.0","zcdzxzqhszDm":"440606","tzze":"0.0","zgswjmc":"顺德区地方税务局","tzzebzyje":"0.0","scjydyzbm":"123123","swdlrlxdh":"6366","fddbrgddh":"132412349923","fddbrsfzjlxDm":"201","ggrs":"0","sjgsdq":"24406060700","fddbrdzxx":"123@qq.com","pzsljgDm":"100000000","scjydz":"顺德区","scjydzxzqhszDm":"440606","cyrs":"11","nsrztDm":"09","wjcyrs":"0","ssdabh":"10124406020000001300","fddbrxm":"姚望","zgswjDm":"24406060000","gdslxDm":"2","zczb":"0.0","wcjyhdssglzmbh":"顺地税乐 外证 〔2016〕 13 号,二七地税 外证 〔2017〕 135 号,顺地税乐 外证 〔2016〕 8 号,","bzfsDm":"3","swdlrmc":"电子税局APP专用户","cwfzrsfzjzlDm":"203","gdgrs":"0","nsrsbh":"440606A20151208","kyslrq":"2015-07-02","bsrgddh":"一高科技3","zcdlxdh":"13100000000","zrrtzbl":"100.0","hsfsDm":"20","scjyqxq":"2015-12-07","zgswskfjmc":"佛山市二七区地方税务局办税服务厅","zcdz":"顺德区ggbb","hyDm":"2511","wztzbl":"0.0","swdlrnsrsbh":"440606199519951","cwfzrgddh":"028-84550123","zgswskfjDm":"24406060700","jyfw":"开发、服务","pzsljglxDm":"01","zfjglxDm":"1","zczbbzeje":"0.0","djxh":"10124406020000001651","swdjblbz":"Y","gykglxDm":"2","nsrfyhyGrid":{"djnsrfyhyGridlb":[{"xh":"2","hyDm":"7610","fyhyuuid":"E70DF0F685DA9B7DE5C1BBAF002ECCEA","yxbz":"Y"},{"xh":"3","hyDm":"8020","fyhyuuid":"AF2FB2BB97EA9289783BA3272EF624A2","yxbz":"Y"},{"xh":"0","hyDm":"7010","fyhyuuid":"7A055872CB59912A64FCD39B76A30BBF","yxbz":"Y"}]},"scjyqxz":"9999-12-31","gytzbl":"0.0","scjydlxdh":"13100000000","zcdyzbm":"638000","fddbrsfzjhm":"510703199010270716","nsrmc":"客户端总机构-勿动-­汇总纳税企业专用!","zczbbzsje":"0.0","fddbryddh":"366699","zczbbzyje":"0.0","kjzdzzDm":"101","djrq":"2015-12-07 00:00:00.0","zzlxDm":"11","bsrxm":"王丽呵呵秘密","cwfzrxm":"201","cwfzrsfzjhm":"440606A20151208","hhrs":"0","lrrDm":"24406060735","ssglyDm":"24406060735","zzjglxDm":"1","cwfzryddh":"13550814189","tzzebzeje":"0.0","lrrq":"2015-12-07 14:20:07.0","kzztdjlxDm":"1110","bsrsfzjhm":"110102197811272321","djzclxDm":"120","fjmqybz":"N","bsrsfzjzlDm":"205","zzhm":"123123","jdxzDm":"440606101","zzjgDm":"A20151208","kqccsztdjbz":"N","dwlsgxDm":"20"}
     * SfrzYhDlYhxxVO : {"yhid":"20F5BAE589A72BD19AD430B4F57FDD27","sysflag":"hxzg","txxx":null,"nsrsbh":"440606A20151208","djxh":"10124406020000001651","sjhm":"13142111551","yhxm":"客户端总机构-勿动-­汇总纳税企业专用!","scdl":"1","yhzcm":"440606A20151208"}
     * ret_msg : 登录成功！
     * ret_code : 1
     */

    private TaxPayerBean taxPayer;
    private SfrzYhDlYhxxVOBean SfrzYhDlYhxxVO;
    private String ret_msg;
    private String ret_code;

    public TaxPayerBean getTaxPayer() {
        return taxPayer;
    }

    public void setTaxPayer(TaxPayerBean taxPayer) {
        this.taxPayer = taxPayer;
    }

    public SfrzYhDlYhxxVOBean getSfrzYhDlYhxxVO() {
        return SfrzYhDlYhxxVO;
    }

    public void setSfrzYhDlYhxxVO(SfrzYhDlYhxxVOBean SfrzYhDlYhxxVO) {
        this.SfrzYhDlYhxxVO = SfrzYhDlYhxxVO;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    public String getRet_code() {
        return ret_code;
    }

    public void setRet_code(String ret_code) {
        this.ret_code = ret_code;
    }

    public static class TaxPayerBean {
        /**
         * djjgDm : 24406060700
         * bsrdzxx : 58322798@qq.com
         * gdghlxDm : 1
         * tzzebzsje : 0.0
         * zcdzxzqhszDm : 440606
         * tzze : 0.0
         * zgswjmc : 顺德区地方税务局
         * tzzebzyje : 0.0
         * scjydyzbm : 123123
         * swdlrlxdh : 6366
         * fddbrgddh : 132412349923
         * fddbrsfzjlxDm : 201
         * ggrs : 0
         * sjgsdq : 24406060700
         * fddbrdzxx : 123@qq.com
         * pzsljgDm : 100000000
         * scjydz : 顺德区
         * scjydzxzqhszDm : 440606
         * cyrs : 11
         * nsrztDm : 09
         * wjcyrs : 0
         * ssdabh : 10124406020000001300
         * fddbrxm : 姚望
         * zgswjDm : 24406060000
         * gdslxDm : 2
         * zczb : 0.0
         * wcjyhdssglzmbh : 顺地税乐 外证 〔2016〕 13 号,二七地税 外证 〔2017〕 135 号,顺地税乐 外证 〔2016〕 8 号,
         * bzfsDm : 3
         * swdlrmc : 电子税局APP专用户
         * cwfzrsfzjzlDm : 203
         * gdgrs : 0
         * nsrsbh : 440606A20151208
         * kyslrq : 2015-07-02
         * bsrgddh : 一高科技3
         * zcdlxdh : 13100000000
         * zrrtzbl : 100.0
         * hsfsDm : 20
         * scjyqxq : 2015-12-07
         * zgswskfjmc : 佛山市二七区地方税务局办税服务厅
         * zcdz : 顺德区ggbb
         * hyDm : 2511
         * wztzbl : 0.0
         * swdlrnsrsbh : 440606199519951
         * cwfzrgddh : 028-84550123
         * zgswskfjDm : 24406060700
         * jyfw : 开发、服务
         * pzsljglxDm : 01
         * zfjglxDm : 1
         * zczbbzeje : 0.0
         * djxh : 10124406020000001651
         * swdjblbz : Y
         * gykglxDm : 2
         * nsrfyhyGrid : {"djnsrfyhyGridlb":[{"xh":"2","hyDm":"7610","fyhyuuid":"E70DF0F685DA9B7DE5C1BBAF002ECCEA","yxbz":"Y"},{"xh":"3","hyDm":"8020","fyhyuuid":"AF2FB2BB97EA9289783BA3272EF624A2","yxbz":"Y"},{"xh":"0","hyDm":"7010","fyhyuuid":"7A055872CB59912A64FCD39B76A30BBF","yxbz":"Y"}]}
         * scjyqxz : 9999-12-31
         * gytzbl : 0.0
         * scjydlxdh : 13100000000
         * zcdyzbm : 638000
         * fddbrsfzjhm : 510703199010270716
         * nsrmc : 客户端总机构-勿动-­汇总纳税企业专用!
         * zczbbzsje : 0.0
         * fddbryddh : 366699
         * zczbbzyje : 0.0
         * kjzdzzDm : 101
         * djrq : 2015-12-07 00:00:00.0
         * zzlxDm : 11
         * bsrxm : 王丽呵呵秘密
         * cwfzrxm : 201
         * cwfzrsfzjhm : 440606A20151208
         * hhrs : 0
         * lrrDm : 24406060735
         * ssglyDm : 24406060735
         * zzjglxDm : 1
         * cwfzryddh : 13550814189
         * tzzebzeje : 0.0
         * lrrq : 2015-12-07 14:20:07.0
         * kzztdjlxDm : 1110
         * bsrsfzjhm : 110102197811272321
         * djzclxDm : 120
         * fjmqybz : N
         * bsrsfzjzlDm : 205
         * zzhm : 123123
         * jdxzDm : 440606101
         * zzjgDm : A20151208
         * kqccsztdjbz : N
         * dwlsgxDm : 20
         */

        private String djjgDm;
        private String bsrdzxx;
        private String gdghlxDm;
        private String tzzebzsje;
        private String zcdzxzqhszDm;
        private String tzze;
        private String zgswjmc;
        private String tzzebzyje;
        private String scjydyzbm;
        private String swdlrlxdh;
        private String fddbrgddh;
        private String fddbrsfzjlxDm;
        private String ggrs;
        private String sjgsdq;
        private String fddbrdzxx;
        private String pzsljgDm;
        private String scjydz;
        private String scjydzxzqhszDm;
        private String cyrs;
        private String nsrztDm;
        private String wjcyrs;
        private String ssdabh;
        private String fddbrxm;
        private String zgswjDm;
        private String gdslxDm;
        private String zczb;
        private String wcjyhdssglzmbh;
        private String bzfsDm;
        private String swdlrmc;
        private String cwfzrsfzjzlDm;
        private String gdgrs;
        private String nsrsbh;
        private String kyslrq;
        private String bsrgddh;
        private String zcdlxdh;
        private String zrrtzbl;
        private String hsfsDm;
        private String scjyqxq;
        private String zgswskfjmc;
        private String zcdz;
        private String hyDm;
        private String wztzbl;
        private String swdlrnsrsbh;
        private String cwfzrgddh;
        private String zgswskfjDm;
        private String jyfw;
        private String pzsljglxDm;
        private String zfjglxDm;
        private String zczbbzeje;
        private String djxh;
        private String swdjblbz;
        private String gykglxDm;
        private NsrfyhyGridBean nsrfyhyGrid;
        private String scjyqxz;
        private String gytzbl;
        private String scjydlxdh;
        private String zcdyzbm;
        private String fddbrsfzjhm;
        private String nsrmc;
        private String zczbbzsje;
        private String fddbryddh;
        private String zczbbzyje;
        private String kjzdzzDm;
        private String djrq;
        private String zzlxDm;
        private String bsrxm;
        private String cwfzrxm;
        private String cwfzrsfzjhm;
        private String hhrs;
        private String lrrDm;
        private String ssglyDm;
        private String zzjglxDm;
        private String cwfzryddh;
        private String tzzebzeje;
        private String lrrq;
        private String kzztdjlxDm;
        private String bsrsfzjhm;
        private String djzclxDm;
        private String fjmqybz;
        private String bsrsfzjzlDm;
        private String zzhm;
        private String jdxzDm;
        private String zzjgDm;
        private String kqccsztdjbz;
        private String dwlsgxDm;

        public String getDjjgDm() {
            return djjgDm;
        }

        public void setDjjgDm(String djjgDm) {
            this.djjgDm = djjgDm;
        }

        public String getBsrdzxx() {
            return bsrdzxx;
        }

        public void setBsrdzxx(String bsrdzxx) {
            this.bsrdzxx = bsrdzxx;
        }

        public String getGdghlxDm() {
            return gdghlxDm;
        }

        public void setGdghlxDm(String gdghlxDm) {
            this.gdghlxDm = gdghlxDm;
        }

        public String getTzzebzsje() {
            return tzzebzsje;
        }

        public void setTzzebzsje(String tzzebzsje) {
            this.tzzebzsje = tzzebzsje;
        }

        public String getZcdzxzqhszDm() {
            return zcdzxzqhszDm;
        }

        public void setZcdzxzqhszDm(String zcdzxzqhszDm) {
            this.zcdzxzqhszDm = zcdzxzqhszDm;
        }

        public String getTzze() {
            return tzze;
        }

        public void setTzze(String tzze) {
            this.tzze = tzze;
        }

        public String getZgswjmc() {
            return zgswjmc;
        }

        public void setZgswjmc(String zgswjmc) {
            this.zgswjmc = zgswjmc;
        }

        public String getTzzebzyje() {
            return tzzebzyje;
        }

        public void setTzzebzyje(String tzzebzyje) {
            this.tzzebzyje = tzzebzyje;
        }

        public String getScjydyzbm() {
            return scjydyzbm;
        }

        public void setScjydyzbm(String scjydyzbm) {
            this.scjydyzbm = scjydyzbm;
        }

        public String getSwdlrlxdh() {
            return swdlrlxdh;
        }

        public void setSwdlrlxdh(String swdlrlxdh) {
            this.swdlrlxdh = swdlrlxdh;
        }

        public String getFddbrgddh() {
            return fddbrgddh;
        }

        public void setFddbrgddh(String fddbrgddh) {
            this.fddbrgddh = fddbrgddh;
        }

        public String getFddbrsfzjlxDm() {
            return fddbrsfzjlxDm;
        }

        public void setFddbrsfzjlxDm(String fddbrsfzjlxDm) {
            this.fddbrsfzjlxDm = fddbrsfzjlxDm;
        }

        public String getGgrs() {
            return ggrs;
        }

        public void setGgrs(String ggrs) {
            this.ggrs = ggrs;
        }

        public String getSjgsdq() {
            return sjgsdq;
        }

        public void setSjgsdq(String sjgsdq) {
            this.sjgsdq = sjgsdq;
        }

        public String getFddbrdzxx() {
            return fddbrdzxx;
        }

        public void setFddbrdzxx(String fddbrdzxx) {
            this.fddbrdzxx = fddbrdzxx;
        }

        public String getPzsljgDm() {
            return pzsljgDm;
        }

        public void setPzsljgDm(String pzsljgDm) {
            this.pzsljgDm = pzsljgDm;
        }

        public String getScjydz() {
            return scjydz;
        }

        public void setScjydz(String scjydz) {
            this.scjydz = scjydz;
        }

        public String getScjydzxzqhszDm() {
            return scjydzxzqhszDm;
        }

        public void setScjydzxzqhszDm(String scjydzxzqhszDm) {
            this.scjydzxzqhszDm = scjydzxzqhszDm;
        }

        public String getCyrs() {
            return cyrs;
        }

        public void setCyrs(String cyrs) {
            this.cyrs = cyrs;
        }

        public String getNsrztDm() {
            return nsrztDm;
        }

        public void setNsrztDm(String nsrztDm) {
            this.nsrztDm = nsrztDm;
        }

        public String getWjcyrs() {
            return wjcyrs;
        }

        public void setWjcyrs(String wjcyrs) {
            this.wjcyrs = wjcyrs;
        }

        public String getSsdabh() {
            return ssdabh;
        }

        public void setSsdabh(String ssdabh) {
            this.ssdabh = ssdabh;
        }

        public String getFddbrxm() {
            return fddbrxm;
        }

        public void setFddbrxm(String fddbrxm) {
            this.fddbrxm = fddbrxm;
        }

        public String getZgswjDm() {
            return zgswjDm;
        }

        public void setZgswjDm(String zgswjDm) {
            this.zgswjDm = zgswjDm;
        }

        public String getGdslxDm() {
            return gdslxDm;
        }

        public void setGdslxDm(String gdslxDm) {
            this.gdslxDm = gdslxDm;
        }

        public String getZczb() {
            return zczb;
        }

        public void setZczb(String zczb) {
            this.zczb = zczb;
        }

        public String getWcjyhdssglzmbh() {
            return wcjyhdssglzmbh;
        }

        public void setWcjyhdssglzmbh(String wcjyhdssglzmbh) {
            this.wcjyhdssglzmbh = wcjyhdssglzmbh;
        }

        public String getBzfsDm() {
            return bzfsDm;
        }

        public void setBzfsDm(String bzfsDm) {
            this.bzfsDm = bzfsDm;
        }

        public String getSwdlrmc() {
            return swdlrmc;
        }

        public void setSwdlrmc(String swdlrmc) {
            this.swdlrmc = swdlrmc;
        }

        public String getCwfzrsfzjzlDm() {
            return cwfzrsfzjzlDm;
        }

        public void setCwfzrsfzjzlDm(String cwfzrsfzjzlDm) {
            this.cwfzrsfzjzlDm = cwfzrsfzjzlDm;
        }

        public String getGdgrs() {
            return gdgrs;
        }

        public void setGdgrs(String gdgrs) {
            this.gdgrs = gdgrs;
        }

        public String getNsrsbh() {
            return nsrsbh;
        }

        public void setNsrsbh(String nsrsbh) {
            this.nsrsbh = nsrsbh;
        }

        public String getKyslrq() {
            return kyslrq;
        }

        public void setKyslrq(String kyslrq) {
            this.kyslrq = kyslrq;
        }

        public String getBsrgddh() {
            return bsrgddh;
        }

        public void setBsrgddh(String bsrgddh) {
            this.bsrgddh = bsrgddh;
        }

        public String getZcdlxdh() {
            return zcdlxdh;
        }

        public void setZcdlxdh(String zcdlxdh) {
            this.zcdlxdh = zcdlxdh;
        }

        public String getZrrtzbl() {
            return zrrtzbl;
        }

        public void setZrrtzbl(String zrrtzbl) {
            this.zrrtzbl = zrrtzbl;
        }

        public String getHsfsDm() {
            return hsfsDm;
        }

        public void setHsfsDm(String hsfsDm) {
            this.hsfsDm = hsfsDm;
        }

        public String getScjyqxq() {
            return scjyqxq;
        }

        public void setScjyqxq(String scjyqxq) {
            this.scjyqxq = scjyqxq;
        }

        public String getZgswskfjmc() {
            return zgswskfjmc;
        }

        public void setZgswskfjmc(String zgswskfjmc) {
            this.zgswskfjmc = zgswskfjmc;
        }

        public String getZcdz() {
            return zcdz;
        }

        public void setZcdz(String zcdz) {
            this.zcdz = zcdz;
        }

        public String getHyDm() {
            return hyDm;
        }

        public void setHyDm(String hyDm) {
            this.hyDm = hyDm;
        }

        public String getWztzbl() {
            return wztzbl;
        }

        public void setWztzbl(String wztzbl) {
            this.wztzbl = wztzbl;
        }

        public String getSwdlrnsrsbh() {
            return swdlrnsrsbh;
        }

        public void setSwdlrnsrsbh(String swdlrnsrsbh) {
            this.swdlrnsrsbh = swdlrnsrsbh;
        }

        public String getCwfzrgddh() {
            return cwfzrgddh;
        }

        public void setCwfzrgddh(String cwfzrgddh) {
            this.cwfzrgddh = cwfzrgddh;
        }

        public String getZgswskfjDm() {
            return zgswskfjDm;
        }

        public void setZgswskfjDm(String zgswskfjDm) {
            this.zgswskfjDm = zgswskfjDm;
        }

        public String getJyfw() {
            return jyfw;
        }

        public void setJyfw(String jyfw) {
            this.jyfw = jyfw;
        }

        public String getPzsljglxDm() {
            return pzsljglxDm;
        }

        public void setPzsljglxDm(String pzsljglxDm) {
            this.pzsljglxDm = pzsljglxDm;
        }

        public String getZfjglxDm() {
            return zfjglxDm;
        }

        public void setZfjglxDm(String zfjglxDm) {
            this.zfjglxDm = zfjglxDm;
        }

        public String getZczbbzeje() {
            return zczbbzeje;
        }

        public void setZczbbzeje(String zczbbzeje) {
            this.zczbbzeje = zczbbzeje;
        }

        public String getDjxh() {
            return djxh;
        }

        public void setDjxh(String djxh) {
            this.djxh = djxh;
        }

        public String getSwdjblbz() {
            return swdjblbz;
        }

        public void setSwdjblbz(String swdjblbz) {
            this.swdjblbz = swdjblbz;
        }

        public String getGykglxDm() {
            return gykglxDm;
        }

        public void setGykglxDm(String gykglxDm) {
            this.gykglxDm = gykglxDm;
        }

        public NsrfyhyGridBean getNsrfyhyGrid() {
            return nsrfyhyGrid;
        }

        public void setNsrfyhyGrid(NsrfyhyGridBean nsrfyhyGrid) {
            this.nsrfyhyGrid = nsrfyhyGrid;
        }

        public String getScjyqxz() {
            return scjyqxz;
        }

        public void setScjyqxz(String scjyqxz) {
            this.scjyqxz = scjyqxz;
        }

        public String getGytzbl() {
            return gytzbl;
        }

        public void setGytzbl(String gytzbl) {
            this.gytzbl = gytzbl;
        }

        public String getScjydlxdh() {
            return scjydlxdh;
        }

        public void setScjydlxdh(String scjydlxdh) {
            this.scjydlxdh = scjydlxdh;
        }

        public String getZcdyzbm() {
            return zcdyzbm;
        }

        public void setZcdyzbm(String zcdyzbm) {
            this.zcdyzbm = zcdyzbm;
        }

        public String getFddbrsfzjhm() {
            return fddbrsfzjhm;
        }

        public void setFddbrsfzjhm(String fddbrsfzjhm) {
            this.fddbrsfzjhm = fddbrsfzjhm;
        }

        public String getNsrmc() {
            return nsrmc;
        }

        public void setNsrmc(String nsrmc) {
            this.nsrmc = nsrmc;
        }

        public String getZczbbzsje() {
            return zczbbzsje;
        }

        public void setZczbbzsje(String zczbbzsje) {
            this.zczbbzsje = zczbbzsje;
        }

        public String getFddbryddh() {
            return fddbryddh;
        }

        public void setFddbryddh(String fddbryddh) {
            this.fddbryddh = fddbryddh;
        }

        public String getZczbbzyje() {
            return zczbbzyje;
        }

        public void setZczbbzyje(String zczbbzyje) {
            this.zczbbzyje = zczbbzyje;
        }

        public String getKjzdzzDm() {
            return kjzdzzDm;
        }

        public void setKjzdzzDm(String kjzdzzDm) {
            this.kjzdzzDm = kjzdzzDm;
        }

        public String getDjrq() {
            return djrq;
        }

        public void setDjrq(String djrq) {
            this.djrq = djrq;
        }

        public String getZzlxDm() {
            return zzlxDm;
        }

        public void setZzlxDm(String zzlxDm) {
            this.zzlxDm = zzlxDm;
        }

        public String getBsrxm() {
            return bsrxm;
        }

        public void setBsrxm(String bsrxm) {
            this.bsrxm = bsrxm;
        }

        public String getCwfzrxm() {
            return cwfzrxm;
        }

        public void setCwfzrxm(String cwfzrxm) {
            this.cwfzrxm = cwfzrxm;
        }

        public String getCwfzrsfzjhm() {
            return cwfzrsfzjhm;
        }

        public void setCwfzrsfzjhm(String cwfzrsfzjhm) {
            this.cwfzrsfzjhm = cwfzrsfzjhm;
        }

        public String getHhrs() {
            return hhrs;
        }

        public void setHhrs(String hhrs) {
            this.hhrs = hhrs;
        }

        public String getLrrDm() {
            return lrrDm;
        }

        public void setLrrDm(String lrrDm) {
            this.lrrDm = lrrDm;
        }

        public String getSsglyDm() {
            return ssglyDm;
        }

        public void setSsglyDm(String ssglyDm) {
            this.ssglyDm = ssglyDm;
        }

        public String getZzjglxDm() {
            return zzjglxDm;
        }

        public void setZzjglxDm(String zzjglxDm) {
            this.zzjglxDm = zzjglxDm;
        }

        public String getCwfzryddh() {
            return cwfzryddh;
        }

        public void setCwfzryddh(String cwfzryddh) {
            this.cwfzryddh = cwfzryddh;
        }

        public String getTzzebzeje() {
            return tzzebzeje;
        }

        public void setTzzebzeje(String tzzebzeje) {
            this.tzzebzeje = tzzebzeje;
        }

        public String getLrrq() {
            return lrrq;
        }

        public void setLrrq(String lrrq) {
            this.lrrq = lrrq;
        }

        public String getKzztdjlxDm() {
            return kzztdjlxDm;
        }

        public void setKzztdjlxDm(String kzztdjlxDm) {
            this.kzztdjlxDm = kzztdjlxDm;
        }

        public String getBsrsfzjhm() {
            return bsrsfzjhm;
        }

        public void setBsrsfzjhm(String bsrsfzjhm) {
            this.bsrsfzjhm = bsrsfzjhm;
        }

        public String getDjzclxDm() {
            return djzclxDm;
        }

        public void setDjzclxDm(String djzclxDm) {
            this.djzclxDm = djzclxDm;
        }

        public String getFjmqybz() {
            return fjmqybz;
        }

        public void setFjmqybz(String fjmqybz) {
            this.fjmqybz = fjmqybz;
        }

        public String getBsrsfzjzlDm() {
            return bsrsfzjzlDm;
        }

        public void setBsrsfzjzlDm(String bsrsfzjzlDm) {
            this.bsrsfzjzlDm = bsrsfzjzlDm;
        }

        public String getZzhm() {
            return zzhm;
        }

        public void setZzhm(String zzhm) {
            this.zzhm = zzhm;
        }

        public String getJdxzDm() {
            return jdxzDm;
        }

        public void setJdxzDm(String jdxzDm) {
            this.jdxzDm = jdxzDm;
        }

        public String getZzjgDm() {
            return zzjgDm;
        }

        public void setZzjgDm(String zzjgDm) {
            this.zzjgDm = zzjgDm;
        }

        public String getKqccsztdjbz() {
            return kqccsztdjbz;
        }

        public void setKqccsztdjbz(String kqccsztdjbz) {
            this.kqccsztdjbz = kqccsztdjbz;
        }

        public String getDwlsgxDm() {
            return dwlsgxDm;
        }

        public void setDwlsgxDm(String dwlsgxDm) {
            this.dwlsgxDm = dwlsgxDm;
        }

        public static class NsrfyhyGridBean {
            private List<DjnsrfyhyGridlbBean> djnsrfyhyGridlb;

            public List<DjnsrfyhyGridlbBean> getDjnsrfyhyGridlb() {
                return djnsrfyhyGridlb;
            }

            public void setDjnsrfyhyGridlb(List<DjnsrfyhyGridlbBean> djnsrfyhyGridlb) {
                this.djnsrfyhyGridlb = djnsrfyhyGridlb;
            }

            public static class DjnsrfyhyGridlbBean {
                /**
                 * xh : 2
                 * hyDm : 7610
                 * fyhyuuid : E70DF0F685DA9B7DE5C1BBAF002ECCEA
                 * yxbz : Y
                 */

                private String xh;
                private String hyDm;
                private String fyhyuuid;
                private String yxbz;

                public String getXh() {
                    return xh;
                }

                public void setXh(String xh) {
                    this.xh = xh;
                }

                public String getHyDm() {
                    return hyDm;
                }

                public void setHyDm(String hyDm) {
                    this.hyDm = hyDm;
                }

                public String getFyhyuuid() {
                    return fyhyuuid;
                }

                public void setFyhyuuid(String fyhyuuid) {
                    this.fyhyuuid = fyhyuuid;
                }

                public String getYxbz() {
                    return yxbz;
                }

                public void setYxbz(String yxbz) {
                    this.yxbz = yxbz;
                }
            }
        }
    }

    public static class SfrzYhDlYhxxVOBean {
        /**
         * yhid : 20F5BAE589A72BD19AD430B4F57FDD27
         * sysflag : hxzg
         * txxx : null
         * nsrsbh : 440606A20151208
         * djxh : 10124406020000001651
         * sjhm : 13142111551
         * yhxm : 客户端总机构-勿动-­汇总纳税企业专用!
         * scdl : 1
         * yhzcm : 440606A20151208
         */

        private String yhid;
        private String sysflag;
        private Object txxx;
        private String nsrsbh;
        private String djxh;
        private String sjhm;
        private String yhxm;
        private String scdl;
        private String yhzcm;

        public String getYhid() {
            return yhid;
        }

        public void setYhid(String yhid) {
            this.yhid = yhid;
        }

        public String getSysflag() {
            return sysflag;
        }

        public void setSysflag(String sysflag) {
            this.sysflag = sysflag;
        }

        public Object getTxxx() {
            return txxx;
        }

        public void setTxxx(Object txxx) {
            this.txxx = txxx;
        }

        public String getNsrsbh() {
            return nsrsbh;
        }

        public void setNsrsbh(String nsrsbh) {
            this.nsrsbh = nsrsbh;
        }

        public String getDjxh() {
            return djxh;
        }

        public void setDjxh(String djxh) {
            this.djxh = djxh;
        }

        public String getSjhm() {
            return sjhm;
        }

        public void setSjhm(String sjhm) {
            this.sjhm = sjhm;
        }

        public String getYhxm() {
            return yhxm;
        }

        public void setYhxm(String yhxm) {
            this.yhxm = yhxm;
        }

        public String getScdl() {
            return scdl;
        }

        public void setScdl(String scdl) {
            this.scdl = scdl;
        }

        public String getYhzcm() {
            return yhzcm;
        }

        public void setYhzcm(String yhzcm) {
            this.yhzcm = yhzcm;
        }
    }
}
