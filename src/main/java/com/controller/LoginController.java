package com.controller;

import com.pojo.User;
import com.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018-07-24.
 */
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String lgn(@RequestBody User user){
        boolean flag = this.loginService.login(user.getUsername(), user.getPassword());
        if(flag){
            System.out.println("Login Success!");
            return "index";
        }
        System.out.println("Error!");
        return "error";
    }

}
