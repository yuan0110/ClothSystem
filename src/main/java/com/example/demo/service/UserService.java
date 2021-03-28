package com.example.demo.service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    //通过角色种类获取对象
    public User queryByRole(String role){
        return userMapper.queryByRole(role);
    }

    //获取数据库所有对象名称
    //todo：应该是管理者才有的权限，需要进行身份验证
    public List<User> getAll(){
        return userMapper.getAll();
    }

}
