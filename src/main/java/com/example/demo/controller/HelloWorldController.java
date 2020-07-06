package com.example.demo.controller;

import com.example.demo.SimpleMessage.PageQuery;
import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.SimpleMessage.SimplePage;
import com.example.demo.domain.Users;
import com.example.demo.service.userService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.*;
import lombok.extern.java.Log;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Validator;

@RestController
@Api(value = "用户信息")
//@CrossOrigin(origins = "http://localhost:8081")
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
        Map map=System.getenv();
        System.out.println(map);
        String s="afaea";
        System.out.println(s.substring(1,2));
        s.endsWith("e");
        s.startsWith("age");
        s.trim();
        StringBuffer sb=new StringBuffer("125f32ttt131");
        for(int i=0;i<sb.length();i++){
            System.out.println(sb.charAt(i));
        }
        Random random=new Random();
        Calendar calendar=Calendar.getInstance();
        calendar.get(Calendar.YEAR);
        random.nextFloat();
        String[] sss=s.split("ttt");
        for (String s1:sss ) {
            System.out.println(s1+"sssss");
        }
        Matcher b= Pattern.compile("\\w+").matcher("123123");
        Locale[] locales=Locale.getAvailableLocales();
        for(int i=0;i<locales.length;i++){
//            System.out.println(locales[i].getDisplayCountry()+"+"+locales[i].getDisplayLanguage()+"+"+locales[i].getLanguage());
        }
        System.out.println(locales);
        String strring=sb.reverse().toString();
        Collection collection=new ArrayList();
        collection.add("user");
        System.out.println(collection);
        Iterator iterator=collection.iterator();
        while (iterator.hasNext()){
            String dd=(String) iterator.next();
            iterator.remove();
            collection.remove(dd);
            System.out.println(dd);
        }
        List list=new ArrayList();
        Map map1=new HashMap();
        map1.keySet();
        map1.values();
        map1.entrySet();
        List<Users> usersList=new ArrayList<>();
        System.out.println(strring+random.nextFloat());
        return userService.getAll();
    }
    @ApiOperation(value = "分页查询用户", notes = "filter:keywords=;status=;", response = Users.class)
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
            return userService.insertUser(users);
    };
    @ApiOperation(value="注册用户",notes = "注册用户")
    @PostMapping(value = "/register")
    public SimpleMessage registerUser(@ApiParam(value = "注册用户")@RequestBody Users users){
        return userService.registerUser(users);
    }
    @ApiOperation(value="登录",notes = "登录")
    @PostMapping(value = "/login")
    public SimpleMessage login(@ApiParam(value = "登录")@RequestBody Users users){
        return userService.login(users.getUsername(),users.getPassword());
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
