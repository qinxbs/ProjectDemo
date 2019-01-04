package com.gs.myceshi.notification;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebView;
import android.widget.TextView;

import com.gs.myceshi.R;

/**
 * js 调用java 方法
 */
public class JstoJavaActivity extends AppCompatActivity implements DataInterface{
     private WebView id_webview;
     private TextView id_tv;
     private Handler handler;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_webview);
        initView();
    }
    private void initView(){
        id_webview=(WebView)findViewById(R.id.id_webview);
        id_tv=(TextView)findViewById(R.id.id_tv);
        handler=new Handler();
         //设置webview 支持js
        id_webview.getSettings().setJavaScriptEnabled(true);
        //webview 添加js接口
        id_webview.addJavascriptInterface(new JsInterface(this),"myJs");
//        id_webview.loadUrl("https://xxxxx");
//        id_webview.loadUrl("file:///android_assets/xxx.jsp");加载项目内jsp/html

             //java 调用js方法
//          id_webview.loadUrl("javascript:if(window.xx){window.xx('"+str+"')}");
    }

    @Override
    public void setValue(final String str) {
        handler.post(new Runnable() {
            @Override
            public void run() {
                id_tv.setText(str);
                Log.e("Tag","WebView 调用java方法"+str);
            }
        });

    }
}
