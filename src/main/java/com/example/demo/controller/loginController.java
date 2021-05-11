package com.example.demo.controller;

import com.example.demo.model.UserInfo;
import com.example.demo.service.LoginService;
import com.example.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class loginController {
    @Autowired
    LoginService loginService;

    @RequestMapping("/loginAuthen")
    @ResponseBody
    public Result loginAuthen(
        @RequestParam(value = "account") String account,
        @RequestParam(value = "password") String password
        )throws IOException{
        UserInfo userInfo = loginService.queryByAccount(account);
        if(userInfo==null)
            return Result.fail();
        else if(userInfo.getPassword().equals(password)){
            return Result.success();

        }
        else{
            return Result.fail();
        }
    }
}
