package com.example.r1999.coolweather.gson;

/**
 * Created by R1999 on 2018/1/9.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
