package com.example.demo.service;

import com.example.demo.SimpleMessage.PageQuery;
import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.SimpleMessage.SimplePage;
import com.example.demo.domain.Users;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public interface userService  {
    SimpleMessage insertUser(Users Users);
    SimpleMessage getUsers(String name);
    SimpleMessage getUserById(String id);
    SimpleMessage getUserById1(String id);
    SimpleMessage deleteUser(Users Users);
    SimpleMessage updateUser(Users Users);
    SimpleMessage getUser(String  id);
    SimpleMessage batchInsertUser(List<Users> listUsers);
    SimpleMessage queryUser(Map map);
    SimplePage queryUserByPage(PageQuery pageQuery);
    SimpleMessage registerUser(Users users);
    SimpleMessage login(String username,String password);
    SimpleMessage logout();
    SimpleMessage getAll();
}
