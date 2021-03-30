package com.example.demo.mapper;

import com.example.demo.model.Order;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OrderMapper {
    @Insert("insert into myorder values(#{id},#{client},#{producetime},#{cname},#{cprice},#{cnumber}," +
            "#{csum},#{handerman},#{deliveryman},#{endtime})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int add(Order order);

    @Update("update myorder set deliveryman=#{deliveryman},endtime=#{endtime} where id=#{id}")
    int updateById(Order order);

    @Select("Select * from myorder where id=#{id}")
    Order queryById(int id);

    @Select("select * from myorder")
    List<Order> queryAll();


}
