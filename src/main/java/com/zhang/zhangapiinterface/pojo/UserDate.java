package com.zhang.zhangapiinterface.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class UserDate {
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date date;
}
