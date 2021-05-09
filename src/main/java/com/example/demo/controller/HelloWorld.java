package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Log4j2
@RequestMapping("/hello")
public class HelloWorld {
    @Autowired
    private UserService userService;

    @RequestMapping("/example")
    public String hello(Model model) throws Exception{
        model.addAttribute("hello","Hello Mythymeleaf");
        log.info("visit helloController.");
        List<User> users = userService.getAll();
        model.addAttribute("users",users);
        return "hello";
    }

}
