package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * City 信息
 * countyName 记录县的名字
 * weatherId 纪录县所对应的天气ID
 * cityId 记录当前市所属省的ID值
 * Created by lenovo on 2017/11/17.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}

