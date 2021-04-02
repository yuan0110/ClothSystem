package com.example.demo.service;

import com.example.demo.mapper.ClothMapper;
import com.example.demo.model.Cloth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@CacheConfig(cacheNames = "cloth")
@Service
public class ClothService {
    

    @Autowired
    public ClothMapper clothMapper;

//    1.获取所有的布料信息
    public List<Cloth> queryAll(){
        return clothMapper.queryAll();
    }

//    2.根据id查询
    @Cacheable(key="#p0")
    public Cloth queryById(int id){
        return clothMapper.queryById(id);
    }

//    3根据布料名字查询
    @Cacheable(key="#p0")
    public Cloth queryByName(String name){
            return clothMapper.queryByName(name);
    }

//    4添加布料
    @CachePut(key="#p0")
    public int add(Cloth cloth){
        return clothMapper.add(cloth);
    }

//    5更新价格
    @CachePut(key="#p0")
    public  int updatePriceById(Cloth cloth){
        return clothMapper.updatePriceById(cloth);
    }

//    6更新库存
    @CachePut(key="p0")
    public int updateStockById(Cloth cloth){
        return clothMapper.updateStockById(cloth);
    }
}
