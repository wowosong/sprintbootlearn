package com.example.demo.service.impl;

import com.example.demo.SimpleMessage.MessageCode;
import com.example.demo.SimpleMessage.PageQuery;
import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.SimpleMessage.SimplePage;
import com.example.demo.domain.Users;
import com.example.demo.mapper.RoleMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.userService;
import com.example.demo.utils.MD5;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.xml.internal.xsom.impl.scd.SCDImpl;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import tk.mybatis.orderbyhelper.OrderByHelper;

import java.util.List;
import java.util.Map;
import java.util.Objects;
@Component
//@Service
@Validated
@Transactional(rollbackFor = Exception.class)
public class userServiceImpl  implements userService {
    private static final Log logger= LogFactory.getLog(userService.class);
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;
//    @Autowired
//    private PasswordEncoder passwordEncoder;
    @Override
    public  SimpleMessage insertUser(Users users) {
        Users userList= userMapper.queryInfoById(users.getId());
//        List<Users> userList = userMapper.select(users);
        System.out.println(userList);
        if(!Objects.isNull(userList)){
            return  SimpleMessage.warn("id重复");
        }
        String md5=MD5.getMD5(users.getPassword(),64);
        users.setMember_since(MD5.getTimestamp());
        users.setPassword(md5);
        users.setLiked(1L);
        users.setConfirmed(true);
        users.setRole_Id(users.getRole_Id());
//        userMapper.insertUser(users);
        userMapper.insert(users);
        return  SimpleMessage.info("创建成功");
    };
    @Override
    public SimpleMessage getUsers(String name){
        Users users= userMapper.queryInfo(name);
        return SimpleMessage.info(users);
    }

    @Override
    public SimpleMessage getUserById(String id) {
//        Users users= userMapper.queryInfoById(id);
        Users users= userMapper.selectByPrimaryKey(id);
        if(Objects.isNull(users)){
            return SimpleMessage.warn("用户不存在");
        }
        return SimpleMessage.info(users);
    }
    @Override
    public SimpleMessage deleteUser(Users users) {
        String id=users.getId();
        Users Usersinfo=userMapper.queryInfoById(id);
        if(Objects.isNull(Usersinfo)){
            return SimpleMessage.warn("用户不存在");
        }
        userMapper.deleteUser(users);
        return SimpleMessage.info(MessageCode.SUCCESS,"删除成功");
    }

    @Override
    public SimpleMessage updateUser(Users users) {
        String id=users.getId();
        Users usersinfo=userMapper.queryInfoById(id);
        if(Objects.isNull(usersinfo)){
            return SimpleMessage.warn(MessageCode.NORMAL_ERROR,"用户不存在");
        }
//        userMapper.updateUsers(users);
        userMapper.updateByPrimaryKeySelective(users);
        return SimpleMessage.info(MessageCode.SUCCESS,"更新成功");
    }
    @Override
    public SimpleMessage getUser(String id) {
//        Users users = userMapper.getUser(id);
        Users users=new Users();
        users.setId(id);
        Users usersinfo = userMapper.selectOne(users);
        return SimpleMessage.info(MessageCode.SUCCESS,usersinfo);
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

    @Override
    public SimplePage queryUserByPage(PageQuery pageQuery) {
        Map map = pageQuery.convertFilterToMap();
        OrderByHelper.orderBy(pageQuery.convertSort());
        PageHelper.startPage(pageQuery.getPage(), pageQuery.getSize());
        System.out.println(map);
        List<Users> list = userMapper.queryUser(map);
        PageInfo pageInfo = new PageInfo(list);
        return new SimplePage<Users>().convert(pageInfo);
    }

    @Override
    public SimpleMessage registerUser(Users users) {
        Users userinfo=userMapper.queryInfo(users.getUsername());
        if(!Objects.isNull(userinfo)){
            return SimpleMessage.warn("用户已经存在");
        }
        System.out.println(users);
        Users userEmail=userMapper.queryUserByEmail(users.getEmail());
        String md5=MD5.getMD5(users.getPassword(),64);
        if(!Objects.isNull(userEmail)){
            return SimpleMessage.warn("邮箱已经存在");
        }
        users.setMember_since(MD5.getTimestamp());
        users.setPassword(md5);
        users.setLiked(1L);
        users.setConfirmed(true);
        users.setRole_Id(users.getRole_Id());
        userMapper.insert(users);
//        userMapper.registerUser(users);
        return SimpleMessage.info("注册成功");
    }

    @Override
    public SimpleMessage login(String username,String password) {
        Users users=userMapper.queryInfo(username);
        if(Objects.isNull(users)){
            return SimpleMessage.info("不存在该学生");
        }
        if(users.getPassword().equals(MD5.getMD5(password, 64))){
            return SimpleMessage.info("登录成功");
        }else{
            return SimpleMessage.warn("登录失败");
        }
    }

    @Override
    public SimpleMessage logout() {
        return null;
    }

    @Override
    public SimpleMessage getAll() {
        List<Users> usersList=userMapper.selectAll();
        return SimpleMessage.info(usersList);
    }

}
