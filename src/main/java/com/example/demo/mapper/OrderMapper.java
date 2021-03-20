package com.example.demo.mapper;

import com.example.demo.model.Order;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OrderMapper {
    @Insert("insert into clothorder values(#{id},#{client},#{producetime},#{cname},#{cprice},#{cnumber}," +
            "#{csum},#{handerman},#{deliveryman},#{endtime})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int add(Order order);

    @Update("update clothorder set deliveryman=#{deliveryman},endtime=#{endtime} where id=#{id}")
    int updateById(Order order);

    @Select("Select * from clothorder where id=#{id}")
    Order queryById(int id);

    @Select("select * from clothorder")
    List<Order> queryAll();


}
