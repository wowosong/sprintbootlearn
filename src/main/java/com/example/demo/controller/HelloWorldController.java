package com.example.demo.controller;

import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.domain.UserInfo;
import com.example.demo.service.userService;
import com.sun.imageio.plugins.common.I18N;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@RestController
//@RequestMapping(value = "demo")
public class HelloWorldController {
    private  userService userService;
    public HelloWorldController(){

    }
    @Autowired
    public HelloWorldController(userService userService) {
        this.userService = userService;
    }
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String index() {
        return "Hello World";
    }
    @RequestMapping(value = "/queryUser",method = RequestMethod.GET)
    public SimpleMessage queryUser(@RequestParam Map map){
        return userService.queryUser(map) ;
    }
    @GetMapping(value="/{name}")
    public SimpleMessage get1Info(@PathVariable String name){
        String i="123";
        int i1=Integer.parseInt(i);
        long l=Long.parseLong(i);
        System.out.println('1'+1);
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
    @GetMapping(value="/user/{id}")
    public SimpleMessage getUser(@PathVariable Integer id){
        return  userService.getUser(id);
    }
    @PostMapping(value = "/insertUser")
    public SimpleMessage insertUser(@RequestBody @Valid UserInfo userinfo, BindingResult bindingResult){

            for(ObjectError error:bindingResult.getAllErrors()){
                return  SimpleMessage.warn(error.getDefaultMessage());
            }
            return userService.insertUser(userinfo);
    };
    @RequestMapping(value = "/deleteUser",method = RequestMethod.PUT)
    public SimpleMessage deleteUser(@RequestBody UserInfo userInfo){
        return  userService.deleteUser(userInfo);
    }
    @PostMapping(value = "/updateUser")
    public SimpleMessage updateUser(@RequestBody UserInfo userInfo){
        return userService.updateUser(userInfo);
    }
    @PostMapping(value = "/batchInsert")
    public  SimpleMessage batchInsert(@RequestBody List<UserInfo> listUserInfo){
        return userService.batchInsertUser(listUserInfo);
    }
}
