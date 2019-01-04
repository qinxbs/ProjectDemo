package com.gs.myceshi.Retrofit;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.util.LruCache;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;

import com.google.gson.Gson;
import com.gs.myceshi.R;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.SecureRandom;
import java.security.cert.CertificateFactory;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;

import PbUtils.JSONUtils;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//已提交github
public class RetrofitActivity extends Activity {
    LruCache<String,Bitmap> mlruCache;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);
    }

    InputStream ksIn = null;
    HttpsUtils.SSLParams sslParams = null;
    String obj = "";
    public void onBtn(View view) {
        Map<String, Object> map = new HashMap<>();
        Map<String, Object> map1 = new HashMap<>();
        map.put("operation","=");
        map.put("extra", new HashMap<String, Object>());
        map.put("sid", "D1062");
//        map.put("sid", "D6666");
        map1.put("tranId", "DZSWJ.ZHGLXT.MHQX.YHGL.YHLOGIN");
        map1.put("s", "<yhzcm>440605201703121</yhzcm><sdzhkg>Y</sdzhkg><dlztcs>03,06,09</dlztcs><yhdlm>440605201703121</yhdlm><klcwcs>0</klcwcs><dllx>DW</dllx><yhlx>DW</yhlx><yhkl>Abcd1234</yhkl><jrxt>L1CQYJSHX</jrxt><xkyhsqlnsbkg>Y</xkyhsqlnsbkg>");
        map1.put("code", "6666");
//        map1.put("tranId", "DZSWJ.ZHGLXT.XXFW.APP.OA.GETSUBSWRY");
//        map1.put("s", "<sjswjgDm>104796144</sjswjgDm>" +
//                "<depth>1" +
//                "</depth>");
        map.put("data", map1);

        try {
            obj = JSONUtils.asJSONString(map);
            Log.e("Tag", "-------" + obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                String str = doJsonPost(Constans.BaseUrl + "entry", obj);
//                Log.e("Tag", "=====" + str);
//            }
//        }).start();
        onRetrofit();
    }

    private void onRetrofit() {
         OkHttpClient.Builder okbuilder=new OkHttpClient.Builder();
         okbuilder.sslSocketFactory(getSSLSocketFactoryForTwoWay(RetrofitActivity.this));
//          okbuilder.hostnameVerifier(new HostnameVerifier() {
//              @Override
//              public boolean verify(String hostname, SSLSession session) {
//                  return true;
//              }
//          });
        Retrofit retrofit;
        Retrofit.Builder builder = new Retrofit.Builder();
        retrofit=builder
                .addConverterFactory(GsonConverterFactory.create()).baseUrl(Constans.BaseUrl).client(okbuilder.build()).build();
        RequestBody body = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), obj);
        GetRequestInterface requestInterface =   retrofit.create(GetRequestInterface.class);
        requestInterface.getCall(body)
                .enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        //请求成功
                         Log.e("Tag","==="+response.body().toString());
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {
                        //请求失败
                        Log.e("Tag","error"+t.toString());
                    }
                });

    }

    private final static String CLIENT_PRI_KEY = "";
    private final static String CLIENT_BKS_PASSWORD = "";
    private final static String KEYSTORE_TYPE = "PKCS12";
    private final static String PROTOCOL_TYPE = "TLSv1";//TLS
    private final static String CERTIFICATE_FORMAT = "X509";


    public static SSLSocketFactory getSSLSocketFactory(Context context) {
        SSLContext sslContext = null;
        try {
            //取得SSL的SSLContext实例
            sslContext = SSLContext.getInstance(PROTOCOL_TYPE);
            //取得TrustManagerFactory的X509密钥管理器实例
            TrustManagerFactory trustManager = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            //取得BKS密库实例
            KeyStore tks = KeyStore.getInstance(KEYSTORE_TYPE);
            InputStream is = context.getAssets().open(CLIENT_PRI_KEY);
            try {
                tks.load(is, CLIENT_BKS_PASSWORD.toCharArray());
            } finally {
                is.close();
            }
            //初始化密钥管理器
            trustManager.init(tks);
            //SSL加载自己的证书
            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            keyManagerFactory.init(tks, CLIENT_BKS_PASSWORD.toCharArray());
            //初始化SSLContext
            sslContext.init(keyManagerFactory.getKeyManagers(), trustManager.getTrustManagers(), new java.security.SecureRandom());
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("SslContextFactory", e.getMessage());
        }
        return sslContext.getSocketFactory();
    }


    /**
     * 双向认证
     *
     * @return SSLSocketFactory
     */

    public static SSLSocketFactory getSSLSocketFactoryForTwoWay(Context context) {
        try {
            InputStream certificate = context.getAssets().open(CLIENT_PRI_KEY);
            //  CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509", "BC");
            KeyStore keyStore = KeyStore.getInstance(KEYSTORE_TYPE);
            keyStore.load(certificate, CLIENT_BKS_PASSWORD.toCharArray());
            KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            kmf.init(keyStore, CLIENT_BKS_PASSWORD.toCharArray());
            try {
                if (certificate != null)
                    certificate.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            //初始化keystore
            KeyStore clientKeyStore = KeyStore.getInstance(KEYSTORE_TYPE);
            clientKeyStore.load(context.getAssets().open(CLIENT_PRI_KEY), CLIENT_BKS_PASSWORD.toCharArray());
            SSLContext sslContext = SSLContext.getInstance(PROTOCOL_TYPE);
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.
                    getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(clientKeyStore);
            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            keyManagerFactory.init(clientKeyStore, CLIENT_BKS_PASSWORD.toCharArray());
            sslContext.init(kmf.getKeyManagers(), trustManagerFactory.getTrustManagers(), new SecureRandom());
            return sslContext.getSocketFactory();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public static String doJsonPost(String urlPath, String Json) {
        // HttpClient 6.0被抛弃了
        String result = "";
        BufferedReader reader = null;
        try {
            URL url = new URL(urlPath);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            conn.setRequestProperty("Connection", "Keep-Alive");
            conn.setRequestProperty("Charset", "UTF-8");
            // 设置文件类型:
            conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            // 设置接收类型否则返回415错误
//            conn.setRequestProperty("accept", "*/*");// 此处为暴力方法设置接受所有类型，以此来防范返回415;
               conn.setRequestProperty("accept","application/json");
            // 往服务器里面发送数据
            if (Json != null && !TextUtils.isEmpty(Json)) {
                byte[] writebytes = Json.getBytes();
                // 设置文件长度
                conn.setRequestProperty("Content-Length", String.valueOf(writebytes.length));
                OutputStream outwritestream = conn.getOutputStream();
                outwritestream.write(Json.getBytes());
                outwritestream.flush();
                outwritestream.close();
                Log.d("hlhupload", "doJsonPost: conn" + conn.getResponseCode());
            }
            if (conn.getResponseCode() == 200) {
                reader = new BufferedReader(
                        new InputStreamReader(conn.getInputStream()));
                result = reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }


}
