package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    @Select("select * from user where role=#{role}")
    User queryByRole(String role);

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Select("select * from user")
    List<User> getAll();
}
