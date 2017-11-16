package com.coolweather.android.db;

/**
 * Province 信息
 * City 信息
 * ID 是每个实体类中都应该有的字段
 * provinceName 记录省的名字
 * provinceCode 纪录市的代号
 *
 * Created by lenovo on 2017/11/17.
 */

public class Province {
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}

