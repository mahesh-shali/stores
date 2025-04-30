package com.example.stores.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

public class RedisService {
    @Autowired
    private StringRedisTemplate redisTemplate;

    public void saveToCache(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    public String getFromCache(String key) {
        return redisTemplate.opsForValue().get(key);
    }
}
