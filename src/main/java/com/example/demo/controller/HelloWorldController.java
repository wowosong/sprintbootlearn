package com.example.demo.controller;

import com.example.demo.domain.UserInfo;
import com.example.demo.service.userService;
//import com.hanboard.educloud.framework.web.message.SimpleMessage;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
@RequestMapping(value = "demo")
public class HelloWorldController {

    private  userService userService;
    @Autowired
    public HelloWorldController(userService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String index() {
        return "Hello World";
    }
    @RequestMapping(value = "/user/{name}",method = RequestMethod.GET)
    public UserInfo getUserInfo(@PathVariable String name){
        System.out.println(name+"-----------------------------------");
        return userService.getUserInfo(name);
    }
    @GetMapping(value = "/test")
    public String data(){
        return "test";
    }
    @GetMapping(value="/{name}")
    public UserInfo getInfo(@PathVariable String name){
        return  userService.getUserInfo(name);
    }
    @PostMapping(value = "/insertUser")
    public String insertUser(@RequestBody UserInfo userinfo){
            System.out.println(userinfo);
            System.out.println("1231312311111111111111111111");
            return userService.insertUser(userinfo);
    };
}
