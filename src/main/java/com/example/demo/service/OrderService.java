package com.example.demo.service;


import com.example.demo.mapper.OrderMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@CacheConfig(cacheNames = "order")
@Service
public class OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Autowired
    UserMapper userMapper;

    @Cacheable(key="#p0")
    public Order queryById(int id) {
        return orderMapper.queryById(id);
    }

    public List<Order> queryAll() {
        return orderMapper.queryAll();
    }

}
