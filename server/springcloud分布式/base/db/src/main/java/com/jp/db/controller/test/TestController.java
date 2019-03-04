package com.jp.db.controller.test;

import com.icu.tool.util.redis.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test/index")
public class TestController {
    @Autowired
    private RedisUtils redisUtils;

    @RequestMapping("redisAdd")
    public Object a(){
        redisUtils.set("a","1392393714");
        return "插入成功";
    }

    @RequestMapping("redisGet")
    public Object b(){
        return redisUtils.get("a");
    }
}
