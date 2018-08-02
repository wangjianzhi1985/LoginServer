package com.service.impl;

import com.pojo.User;
import com.service.LoginService;
import com.tool.CacheFactory;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by Administrator on 2018-07-24.
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public boolean login(String username, String password) {
        Map<String, User> cache = CacheFactory.getCache();
        for(String name : cache.keySet()){
            if(name.equals(username)){
                if(cache.get(username).getPassword().equals(password)){
                    return true;
                }
            }
        }
        return false;
    }
}
