package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/")
    List<User> getAll()
    {
        return userMapper.getAll();
    }

    @RequestMapping("/reception")
    User getReception(){
        return userMapper.queryByRole("reception");
    }

    @RequestMapping("/deliveryman")
    User getDeliveryman(){
        return userMapper.queryByRole("deliveryman");
    }

    @RequestMapping("/administrator")
    User getAdministrator(){
        return userMapper.queryByRole("administrator");
    }
}
