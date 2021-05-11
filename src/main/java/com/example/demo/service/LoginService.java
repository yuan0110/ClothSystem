package com.example.demo.service;

import com.example.demo.mapper.LoginMapper;
import com.example.demo.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

@CacheConfig(cacheNames = "login")
@Service
public class LoginService {
    @Autowired
    LoginMapper loginMapper;

    public UserInfo queryByAccount(String account){
        return loginMapper.queryByAccount(account);
    }

    public int add(UserInfo userInfo){
        return loginMapper.add(userInfo);
    }
}

