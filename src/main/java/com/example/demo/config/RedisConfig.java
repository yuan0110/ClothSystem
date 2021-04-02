package com.example.demo.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;


import java.lang.reflect.Method;

/**
 * @author beike
 * @date 2021/4/2 - 13:23
 */
@Configuration
public class RedisConfig extends CachingConfigurerSupport {
    @Bean
    public KeyGenerator keyGenerator(){
        return new KeyGenerator(){
            //定义缓存数据key的生成策略
            @Override
            public Object generate(Object target, Method method,Object... params){
                StringBuilder sb = new StringBuilder();
                sb.append(target.getClass().getName());
                sb.append(method.getName());
                for (Object obj : params) {
                    sb.append(obj.toString());
                }
                return sb.toString();
            }
        };
    }

    //缓存管理器
    @SuppressWarnings("rawtypes")
    @Bean
    public CacheManager cacheManager(RedisConnectionFactory connectionFactory){
        RedisCacheManager redisCacheManager = RedisCacheManager.create(connectionFactory);
        return redisCacheManager;
    }

    //注册成Bean被spring管理，否则Redis可视化工具中的中文内容以二进制存储，不易检查
    @Bean
    public RedisTemplate<String,Object> redisTemplate(RedisConnectionFactory factory){
        RedisTemplate<String,Object> redisTemplate=new RedisTemplate<>();
        redisTemplate.setConnectionFactory(factory);
        return redisTemplate;
    }
    @Bean
    public StringRedisTemplate stringRedisTemplate(RedisConnectionFactory factory){
        StringRedisTemplate stringRedisTemplate = new StringRedisTemplate();
        stringRedisTemplate.setConnectionFactory(factory);
        return stringRedisTemplate;
    }


}
