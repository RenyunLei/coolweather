package com.example.r1999.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by R1999 on 2018/1/9.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
