package com.example.demo.service;

import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.domain.Users;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Component
@Service
@Validated
@Transactional(rollbackFor = Exception.class)
public class userServiceImpl  implements  userService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public  SimpleMessage insertUser(Users users) {
//        Users userList= userMapper.queryInfoById(users.getId());
        Users userList=userMapper.selectByPrimaryKey(users.getId());

        if(!Objects.isNull(userList)){
            return  SimpleMessage.warn("id重复");
        }
        userMapper.insertUser(users);
        return  SimpleMessage.info("创建成功");
    };
    @Override
    public SimpleMessage getUsers(String name){
        Users users= userMapper.queryInfo(name);
        return SimpleMessage.info(users);
    }
    @Override
    public SimpleMessage get1Info(String name){
        Users Users= userMapper.queryInfo(name);
        return SimpleMessage.info(Users);
    }

    @Override
    public SimpleMessage getUserById(Integer id) {
        Users Users= userMapper.queryInfoById(id);
        if(Objects.isNull(Users)){
            return SimpleMessage.warn("用户不存在");
        }
        return SimpleMessage.info(Users);
    }
    @Override
    public SimpleMessage deleteUser(Users users) {
        long id=users.getId();
        Users Usersinfo=userMapper.queryInfoById(id);
        if(Objects.isNull(Usersinfo)){
            return SimpleMessage.warn("用户不存在");
        }
        userMapper.deleteUser(users);
        return SimpleMessage.info("删除成功");
    }

    @Override
    public SimpleMessage updateUser(Users users) {
        long id=users.getId();
        Users usersinfo=userMapper.queryInfoById(id);
        if(Objects.isNull(usersinfo)){
            return SimpleMessage.warn("用户不存在");
        }
        userMapper.updateUsers(users);
        return SimpleMessage.info("更新成功");
    }
    @Override
    public SimpleMessage getUser(Integer id) {
        Users users = userMapper.getUser(id);
        return SimpleMessage.info(users);
    }

    @Override
    public SimpleMessage batchInsertUser(List<Users> listUsers){
        userMapper.batchInsert(listUsers);
        return SimpleMessage.info("批量增加成功");
    }

    @Override
    public SimpleMessage queryUser(Map map) {
        List<Users> users=userMapper.queryUser(map);
        return SimpleMessage.info(users);
    }
}
