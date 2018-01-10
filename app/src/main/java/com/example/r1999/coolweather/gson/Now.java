package com.example.r1999.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by R1999 on 2018/1/9.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("text")
        public String info;
    }
}
