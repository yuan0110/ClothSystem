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
public class RegisterController {
    @Autowired
    LoginService loginService;

    @RequestMapping("/registerAuthen")
    @ResponseBody
    public Result register(
            @RequestParam(value = "account") String account,
            @RequestParam(value = "password") String password,
            @RequestParam(value = "username") String username,
            @RequestParam(value = "phone") String phone,
            @RequestParam(value = "role") String role,
            @RequestParam(value = "sex") String sex
    )throws IOException {
        UserInfo userInfo = loginService.queryByAccount(account);
        if(userInfo==null){
            userInfo = new UserInfo();
            userInfo.setAccount(account);
            userInfo.setPassword(password);
            userInfo.setUsername(username);
            userInfo.setPhone(phone);
            userInfo.setRole(role);
            userInfo.setSex(sex);
            userInfo.setOnwork(1);
            int count=loginService.add(userInfo);
            if(count==1)
                return Result.success();
            else
                return Result.fail();
        }
        else{
            System.out.println("fail");
            return Result.fail();
        }

    }
}
