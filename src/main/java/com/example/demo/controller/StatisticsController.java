package com.example.demo.controller;

import com.example.demo.model.Order;
import com.example.demo.model.statistics.ClientSta;
import com.example.demo.model.statistics.ClothSta;
import com.example.demo.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//统计的Map
@RestController
@RequestMapping("/statistics")
public class StatisticsController {
    @Autowired
    StatisticsService statisticsService;

    @RequestMapping("/all")
    public List<Order> getAll(){
        return statisticsService.getAll();
    }

    //用户统计接口
    @RequestMapping("/client")
    public ClientSta queryByClient(String client){
        return statisticsService.queryByClient(client);
    }

    //布料名称统计接口
    @RequestMapping("/cloth")
    public List<ClothSta> statistByCname(String cname){
        return statisticsService.queryByCname(cname);
    }

}
