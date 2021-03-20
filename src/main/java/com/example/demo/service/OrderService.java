package com.example.demo.service;


import com.example.demo.mapper.OrderMapper;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Autowired
    UserMapper userMapper;




}
