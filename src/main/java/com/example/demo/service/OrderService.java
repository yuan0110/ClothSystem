package com.example.demo.service;


import com.example.demo.mapper.OrderMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Autowired
    UserMapper userMapper;

    public Order queryById(int id) {
        return orderMapper.queryById(id);
    }

    public List<Order> queryAll() {
        return orderMapper.queryAll();
    }

}
