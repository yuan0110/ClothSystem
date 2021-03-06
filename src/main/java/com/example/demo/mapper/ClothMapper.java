package com.example.demo.mapper;


import com.example.demo.model.Cloth;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ClothMapper {
    @Select("select * from cloth")
    List<Cloth> queryAll();

    @Select("select * from cloth where id=#{id}")
    Cloth queryById(int id);

    @Select("select * from cloth where name=#{name}")
    List<Cloth> queryByName(String name);

    @Insert("insert into cloth values(#{id}," +
            "#{name},#{color},#{style},#{price},#{stock})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int add(Cloth cloth);

    @Update("update cloth set price=#{price} where id=#{id}")
    int updatePriceById(Cloth cloth);

    @Update("update cloth set stock=#{stock} where id=#{id}")
    int updateStockById(Cloth cloth);
}
