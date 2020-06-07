package com.example.demo.controller;

import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.domain.Users;
import com.example.demo.service.userService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import org.springframework.validation.Validator;

@RestController
@Api(value = "用户信息")
//@RequestMapping(value = "demo")
public class HelloWorldController {
    private  userService userService;
    public HelloWorldController(){

    }
    @Autowired
    public HelloWorldController(userService userService) {
        this.userService = userService;
    }
    @RequestMapping
    public PageInfo<Users> getAll(@PathVariable String name) {
        List<Users> userInfoList = (List<Users>) userService.getUsers(name);
        return new PageInfo<Users>(userInfoList);
    }
    @RequestMapping("/g0")
    public  SimpleMessage get(@RequestParam(value = "name", required = true,defaultValue = "admin") String name){
        return SimpleMessage.info("");
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET,consumes = "application/json")
    public String index() {
        return "Hello World";
    }
    @CrossOrigin(maxAge = 3600)
    @ApiOperation(value="获取用户",notes = "通过多个关键字查询用户")
    @RequestMapping(value = "/queryUser",method = RequestMethod.GET)
    public SimpleMessage queryUser(@ApiParam(value = "用户姓名",required = true)@RequestParam Map map){
        return userService.queryUser(map);
    }
//    @GetMapping(value="/{name}")
//    public SimpleMessage get1Info(@PathVariable String name){
//        String i="123";
//        int i1=Integer.parseInt(i);
//        long l=Long.parseLong(i);
//        System.out.println('1'+1);
//        return  userService.get1Info(name);
//    }
//
//    @GetMapping(value = "/test")
//    public String data(){
//        return "test";
//    }
//    @GetMapping(value="/test/{name}")
//    public SimpleMessage getInfo(@PathVariable String name){
//        return  userService.getUsers(name);
//    }
    @ApiOperation(value = "获取用户信息",notes ="通过id获取用户信息" )
    @GetMapping(value="/user/{id}")
    public SimpleMessage getUser(@PathVariable String id){
        return  userService.getUser(id);
    }
    @ApiOperation(value = "获取用户信息",notes ="通过id获取用户信息" )
    @GetMapping(value="/{id}")
    public SimpleMessage getUserById(@PathVariable String id){
        return  userService.getUserById(id);
    }
    @ApiOperation(value="插入用户",notes = "插入用户")
    @PostMapping(value = "/insertUser")
    public SimpleMessage insertUser(@ApiParam(value = "插入用户",required = true)@RequestBody @Valid Users users, BindingResult bindingResult){
            for(ObjectError error:bindingResult.getAllErrors()){
                return  SimpleMessage.warn(error.getDefaultMessage());
            }
            return userService.insertUser(users);
    };
    @ApiOperation(value="注册用户",notes = "注册用户")
    @PostMapping(value = "/register")
    public SimpleMessage registerUser(@ApiParam(value = "注册用户")@RequestBody Users users){
        return userService.registerUser(users);
    }
    @ApiOperation(value="删除用户",notes = "删除用户")
    @RequestMapping(value = "/deleteUser",method = RequestMethod.PUT)
    public SimpleMessage deleteUser(@ApiParam(value = "删除用户",required = true)@RequestBody Users users){
        return  userService.deleteUser(users);
    }
    @ApiOperation(value="更新用户",notes = "更新用户信息")
    @PostMapping(value = "/updateUser")
    public SimpleMessage updateUser(@ApiParam(value = "更新用户信息",required = true)@RequestBody Users users){
        return userService.updateUser(users);
    }
    @ApiOperation(value="批量插入",notes = "批量插入用户")
    @PostMapping(value = "/batchInsert")
    public  SimpleMessage batchInsert(@ApiParam(value = "批量插入用户信息",required = true)@RequestBody List<Users> listUsers){
        return userService.batchInsertUser(listUsers);
    }
}
