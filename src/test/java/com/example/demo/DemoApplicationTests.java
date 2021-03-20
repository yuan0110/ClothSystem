package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		Date date = new Date();//Mon May 13 16:17:07 CST 2013
		System.out.println(date);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//此处指定需要转换为那种日期格式
		String s_time = dateFormat.format(date);
		Timestamp t_time = Timestamp.valueOf(s_time);
		System.out.println("Date-->Timestamp:"+t_time);
	}

}
