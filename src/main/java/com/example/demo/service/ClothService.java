package com.example.demo.service;

import com.example.demo.mapper.ClothMapper;
import com.example.demo.model.Cloth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClothService {

    @Autowired
    public ClothMapper clothMapper;

//    1.获取所有的布料信息
    public List<Cloth> queryAll(){
        return clothMapper.queryAll();
    }

//    2.根据id查询
    public Cloth queryById(int id){
        return clothMapper.queryById(id);
    }

//    3根据布料名字查询
    public Cloth queryByname(String name){
            return clothMapper.queryByname(name);
    }

//    4添加布料
    public int add(Cloth cloth){
        return clothMapper.add(cloth);
    }

//    5更新价格
    public  int updatePriceById(Cloth cloth){
        return clothMapper.updatePriceById(cloth);
    }

//    6更新库存
    public int updateStockById(Cloth cloth){
        return clothMapper.updateStockById(cloth);
    }
}
