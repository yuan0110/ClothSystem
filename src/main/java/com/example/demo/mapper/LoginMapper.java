package com.example.demo.mapper;

import com.example.demo.model.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LoginMapper {
    @Insert("insert into userinfo values(#{account}," +
            "#{password},#{username},#{phone},#{role},#{sex},#{onwork})")
    int add(UserInfo userInfo);

    @Select("select * from userinfo where account=#{account}")
    UserInfo queryByAccount(String account);
}
