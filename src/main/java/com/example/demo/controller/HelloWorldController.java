package com.example.demo.controller;

import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.domain.UserInfo;
import com.example.demo.service.userService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;
@RestController
//@RequestMapping(value = "demo")
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
    public SimpleMessage getUserInfo(@PathVariable String name){
        System.out.println(name+"-----------------------------------");
        return userService.getUserInfo(name);
    }
    @GetMapping(value="/{name}")
    public SimpleMessage get1Info(@PathVariable String name){
        return  userService.get1Info(name);
    }
    @GetMapping(value = "/test")
    public String data(){
        return "test";
    }
    @GetMapping(value="/test/{name}")
    public SimpleMessage getInfo(@PathVariable String name){
        return  userService.getUserInfo(name);
    }
    @PostMapping(value = "/insertUser")
    public SimpleMessage insertUser(@RequestBody UserInfo userinfo){
            System.out.println(userinfo);
            System.out.println("1231312311111111111111111111");
            return userService.insertUser(userinfo);
    };
    @PutMapping(value = "deleteUser")
    public SimpleMessage deleteUser(@RequestBody UserInfo userInfo){
        return  userService.deleteUser(userInfo);
    }
    @PostMapping(value = "updateUser")
    public SimpleMessage updateUser(@RequestBody UserInfo userInfo){
        return userService.updateUser(userInfo);
    }
}
