package com.gs.myceshi.notification;

import android.webkit.JavascriptInterface;

public class JsInterface {
    DataInterface dataInterface;
    public JsInterface(DataInterface Interface) {
        super();
        this.dataInterface=Interface;
    }
    @JavascriptInterface//标识 javaScrip 能够识别此方法
    public void setValue(String str){
        dataInterface.setValue(str);
    }
}
