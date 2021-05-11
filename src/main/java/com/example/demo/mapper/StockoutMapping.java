package com.example.demo.mapper;

import com.example.demo.model.Stockout;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StockoutMapping {
    @Insert("insert into stockout values(#{id},#{stock},#{handerman})")
    int add(Stockout stockout);

    @Select("select * from stockout")
    List<Stockout> queryAll();

    @Select("select * from stockout where id=#{id}")
    List<Stockout> queryById(int id);
}
