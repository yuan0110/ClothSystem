package com.example.demo.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

//获取当前时间的时间戳
public class TimeUtils {
    public static Timestamp getTimeStamp(){
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s_time = dateFormat.format(date);
        return Timestamp.valueOf(s_time);

    }
}
