package com.example.demo.service;

import com.example.demo.domain.UserInfo;
import com.example.demo.mapper.UserMapper;
//import com.hanboard.educloud.framework.orm.mybatis.util.UUIDGeneratorUtil;
//import com.hanboard.educloud.framework.web.message.SimpleMessage;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class userServiceImpl  implements  userService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public  String insertUser(UserInfo userinfo) {
//        String id = UUIDGeneratorUtil.generate();
//        Integer id=1;
        UserInfo userList=userMapper.queryInfoById(userinfo.getId());
        if(userList.toString().length()>1){
            return  "id重复";
        }
        userinfo.setId(userinfo.getId());
        userinfo.setName(userinfo.getName());
        userinfo.setPassword(userinfo.getPassword());
        userinfo.setEmail(userinfo.getEmail());
        System.out.println("========================================");
        System.out.println(userinfo);
        userMapper.insertUser(userinfo);
        return "创建成功";
    };
    @Override
    public UserInfo getUserInfo(String name){
        System.out.println(name+"1111111111111111111111111111");
        UserInfo userInfo= userMapper.queryInfo(name);
        System.out.println(userInfo);
        return userInfo;
    }

    @Override
    public UserInfo getUserById(Integer id) {
        System.out.println(id+"1111111111111111111111111111");
        UserInfo userInfo= userMapper.queryInfoById(id);
        System.out.println(userInfo);
        return userInfo;
    }

}
