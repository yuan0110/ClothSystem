package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrameController {
    @RequestMapping("/frame")
    public String testFrame(){
        return "/frame";
    }
}
