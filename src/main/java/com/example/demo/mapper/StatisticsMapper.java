package com.example.demo.mapper;

import com.example.demo.model.Order;
import com.example.demo.model.statistics.ClientSta;
import com.example.demo.model.statistics.ClothSta;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StatisticsMapper {
    @Select("select * from myorder")
    List<Order> getAll();

    @Select("select cname as cname, sum(csum) as csum from myorder group by cname")
    List<ClothSta> queryByCname(String cname);

    @Select("select client as client, sum(csum) as csum from myorder group by client")
    ClientSta queryByClient(String client);
}
