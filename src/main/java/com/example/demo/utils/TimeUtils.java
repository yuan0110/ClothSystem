package com.example.demo.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {
    public Timestamp getTimeStamp(){
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s_time = dateFormat.format(date);
        return Timestamp.valueOf(s_time);

    }
}
