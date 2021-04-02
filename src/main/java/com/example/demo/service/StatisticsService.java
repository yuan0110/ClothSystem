package com.example.demo.service;

import com.example.demo.mapper.StatisticsMapper;
import com.example.demo.model.Order;
import com.example.demo.model.statistics.ClientSta;
import com.example.demo.model.statistics.ClothSta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author beike
 * @date 2021/3/30 - 23:42
 */


@CacheConfig(cacheNames = "statistics")
@Service
public class StatisticsService {
    @Autowired
    StatisticsMapper statisticsMapper;

    public List<Order> getAll(){
        return statisticsMapper.getAll();
    }

    //todo 根据布料名称种类统计
    @Cacheable(key="p0")
    public List<ClothSta> queryByCname(String cname){
        return statisticsMapper.queryByCname(cname);
    }

    //根据客户统计
    @Cacheable(key="p0")
    public ClientSta queryByClient(String client){
        return statisticsMapper.queryByClient(client);
    }
}
