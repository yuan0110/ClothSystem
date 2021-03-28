package com.example.demo.controller;

import com.example.demo.mapper.StatisticsMapper;
import com.example.demo.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//统计的Map
@RestController
@RequestMapping("/statistics")
public class StatisticsController {
    @Autowired
    StatisticsMapper statisticsMapper;
    @RequestMapping("/all")
    public List<Order> getAll(){
        return statisticsMapper.getAll();
    }

}
