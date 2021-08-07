package com.hejiyao.demo.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author He_Ji_Yao
 */
@RestController
public class TestController {
    @Autowired
    private RedisTemplate redisTemplate;
    
    @RequestMapping("/test")
    public String test(String key) {
        ValueOperations value = redisTemplate.opsForValue();
        Object v = value.get(key);
        return (String) v;
    }
}
