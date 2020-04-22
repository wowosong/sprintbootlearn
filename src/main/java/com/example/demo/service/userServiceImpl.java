package com.example.demo.service;

import com.example.demo.domain.UserInfo;
import com.example.demo.mapper.UserMapper;
import com.example.demo.SimpleMessage.SimpleMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Component
@Service
@Validated
@Transactional(rollbackFor = Exception.class)
public class userServiceImpl  implements  userService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public  SimpleMessage insertUser(UserInfo userinfo) {
        List<UserInfo> userList=userMapper.queryInfoById(userinfo.getId());
        if(userList.size()>0){
            return  SimpleMessage.warn("id重复");
        }
        userMapper.insertUser(userinfo);
        return  SimpleMessage.info("创建成功");
    };
    @Override
    public SimpleMessage getUserInfo(String name){
        UserInfo userInfo= userMapper.queryInfo(name);
        return SimpleMessage.info(userInfo);
    }
    @Override
    public SimpleMessage get1Info(String name){
        UserInfo userInfo= userMapper.queryInfo(name);
        return SimpleMessage.info(userInfo);
    }
    @Override
    public SimpleMessage getUserById(Integer id) {
        List<UserInfo> userInfo= userMapper.queryInfoById(id);
        if(userInfo.size()==0){
            return SimpleMessage.warn("用户不存在");
        }
        return SimpleMessage.info(userInfo);
    }

    @Override
    public SimpleMessage deleteUser(UserInfo userInfo) {
        Integer id=userInfo.getId();
        List<UserInfo> userinfo=userMapper.queryInfoById(id);
        if(userinfo.size()==0){
            return SimpleMessage.warn("用户不存在");
        }
        userMapper.deleteUser(userInfo);
        return SimpleMessage.info("删除成功");
    }

    @Override
    public SimpleMessage updateUser(UserInfo userInfo) {
        Integer id=userInfo.getId();
        List<UserInfo> userList=userMapper.queryInfoById(id);
        if(userList.size()==0){
            return SimpleMessage.warn("用户不存在");
        }
        userMapper.updateUserInfo(userInfo);
        return SimpleMessage.info("更新成功");
    }

    @Override
    public SimpleMessage batchInsertUser(List<UserInfo> listUserInfo) {
        userMapper.batchInsert(listUserInfo);
        return SimpleMessage.info("批量增加成功");
    }
}
