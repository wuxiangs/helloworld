package com.aisino.helloworld.controller;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CountController {


    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("/getCount")
    public String count(){
        Long increment = stringRedisTemplate.opsForValue().increment("count-person");
        return "有【"+increment+"】多少人访问了我的页面";
    }
}
