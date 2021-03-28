package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    List<User> getAll()
    {
        return userService.getAll();
    }

    @RequestMapping("/reception")
    User getReception(){
        return userService.queryByRole("reception");
    }

    @RequestMapping("/deliveryman")
    User getDeliveryman(){
        return userService.queryByRole("deliveryman");
    }

    @RequestMapping("/administrator")
    User getAdministrator(){
        return userService.queryByRole("administrator");
    }
}
