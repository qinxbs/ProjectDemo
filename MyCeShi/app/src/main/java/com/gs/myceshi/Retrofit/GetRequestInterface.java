package com.gs.myceshi.Retrofit;


import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface GetRequestInterface {
    @Headers({"Content-Type: application/json","Accept: application/json"})//需要添加头
    @POST("entry")
    Call<ResponseBody> getCall(@Body RequestBody querymap);
}
