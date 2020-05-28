package com.example.demo.service;

import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface userService {
    SimpleMessage insertUser(Users Users);
    SimpleMessage getUsers(String name);
    SimpleMessage getUserById(String id);

    SimpleMessage deleteUser(Users Users);
    SimpleMessage updateUser(Users Users);
    SimpleMessage getUser(String  id);
    SimpleMessage batchInsertUser(List<Users> listUsers);
    SimpleMessage queryUser(Map map);
    SimpleMessage registerUser(Users users);
    SimpleMessage login();
    SimpleMessage logout();
}
