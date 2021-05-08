package com.example.demo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/hello")
public class HelloWorld {
    @RequestMapping("/example")
    public String hello(Model model) throws Exception{
        model.addAttribute("hello","你好，我是thymeleaf");
//        return "hello,controller!";
        log.info("visit helloController.");
        return "example/hello";
    }

}
