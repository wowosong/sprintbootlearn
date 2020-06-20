package com.example.demo.controller;

import com.example.demo.SimpleMessage.PageQuery;
import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.SimpleMessage.SimplePage;
import com.example.demo.domain.Users;
import com.example.demo.service.userService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.*;
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
@CrossOrigin(value = "3600")
//@RequestMapping(value = "demo")
public class HelloWorldController {
    private  userService userService;
    public HelloWorldController(){

    }
    @Autowired
    public HelloWorldController(userService userService) {
        this.userService = userService;
    }
    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public SimpleMessage getAll() {
        return userService.getAll();
    }

    @ApiOperation(value = "分页查询培训计划", notes = "filter:keywords=;status=;", response = Users.class)
    @GetMapping("/query")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页码：第几页", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "size", value = "每页显示的数据条数", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "filter", value = "查询条件（keywords=;status=;）", paramType = "query"),
            @ApiImplicitParam(name = "order", value = "排序规则（createTime=desc）", paramType = "query")})
    public SimplePage<Users> queryUserByPage(PageQuery pageQuery){
        String filter = pageQuery.getFilter();
        pageQuery.setFilter(filter);
        return userService.queryUserByPage(pageQuery);
    }
    @RequestMapping(value = "/g0",method = RequestMethod.GET)
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
    public SimpleMessage insertUser(@ApiParam(value = "插入用户",required = true)@RequestBody Users users){
//            for(ObjectError error:bindingResult.getAllErrors()){
//                return  SimpleMessage.warn(error.getDefaultMessage());
//            }
            return userService.insertUser(users);
    };
    @ApiOperation(value="注册用户",notes = "注册用户")
    @PostMapping(value = "/register")
    public SimpleMessage registerUser(@ApiParam(value = "注册用户")@RequestBody Users users){
        return userService.registerUser(users);
    }
    @ApiOperation(value="登录",notes = "登录")
    @PostMapping(value = "/login")
    public SimpleMessage login(@ApiParam(value = "注册用户")@RequestParam String username,@RequestParam String password){
        return userService.login(username,password);
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
