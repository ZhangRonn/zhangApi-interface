package com.zhang.zhangapiinterface.controller;

import com.zhang.zhangapiinterface.pojo.UserDate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/universal")
public class UniversalController {
    @PostMapping("/compute")
    public String getUserBirthDayByPost(@RequestBody UserDate userDate, HttpServletRequest request) {
        long birthDay = userDate.getDate().getTime();
        //当前时间戳
        long ts = System.currentTimeMillis();
        long s=ts-birthDay;

        DecimalFormat dF = new DecimalFormat("0.0000");
        String format ="来到这个世界"+ dF.format((float) s / (1000 * 60 * 60 * 24))+"天啦！！！！！";

        return format;

    }
}