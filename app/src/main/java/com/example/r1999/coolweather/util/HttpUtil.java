package com.example.r1999.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by R1999 on 2018/1/8.
 */

public class HttpUtil {
    public static void sendOkhttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
