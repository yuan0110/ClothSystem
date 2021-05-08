package com.example.demo;

import lombok.extern.log4j.Log4j2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.demo.mapper")
@SpringBootApplication
@Log4j2
public class DemoApplication {

	public static void main(String[] args) {
		log.info("程序启动！");
		SpringApplication.run(DemoApplication.class, args);
	}

}
