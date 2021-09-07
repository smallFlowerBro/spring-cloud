package com.wei.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author weiyongjian
 * @Description //TODO
 * @Date
 */
@RestController
@RequestMapping(value ="/user")
public class UserController {

    @GetMapping("login")
    public String login(){
        return "login success,I am provider two";
    }
    @GetMapping("logout")
    public String logout(){
        return "logout success,I am provider two";
    }

}
