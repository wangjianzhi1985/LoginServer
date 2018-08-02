package com.tool;

import com.pojo.User;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2018-07-24.
 */
public class CacheFactory {
    static Map<String, User> cache = new ConcurrentHashMap<String, User>();

    public static Map<String, User> getCache() {
        return cache;
    }

    public static void setCache(String username, User user) {
        CacheFactory.cache.put(username, user);
    }
}

