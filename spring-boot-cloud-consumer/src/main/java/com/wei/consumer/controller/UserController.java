package com.wei.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author weiyongjian
 * @Description //TODO
 * @Date
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    public  static  String url="http://provider-user/";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("login")
    public String login(){
        return restTemplate.getForObject(UserController.url+"user/login",String.class);
    }
    @GetMapping("logout")
    public String logout(){
        return restTemplate.getForObject(UserController.url+"user/logout",String.class);
    }
}
