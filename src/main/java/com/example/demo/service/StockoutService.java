package com.example.demo.service;

import com.example.demo.mapper.StockoutMapping;
import com.example.demo.model.Stockout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockoutService {
    @Autowired
    StockoutMapping stockoutMapping;
    public int add(Stockout stockout){
        return stockoutMapping.add(stockout);
    }
    public List<Stockout> queryAll(){
        return stockoutMapping.queryAll();
    }
    public int queryById(int id){
        return stockoutMapping.queryById(id).size();
    }
}
