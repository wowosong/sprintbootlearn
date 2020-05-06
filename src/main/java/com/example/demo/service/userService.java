package com.example.demo.service;

//import com.hanboard.educloud.framework.web.message.SimpleMessage;
import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.domain.UserInfo;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface userService {
    SimpleMessage insertUser(UserInfo userinfo);
    SimpleMessage getUserInfo(String name);//@Param("name")
    SimpleMessage getUserById(Integer id);//@Param("id")
    SimpleMessage get1Info(String name);
    SimpleMessage deleteUser(UserInfo userInfo);
    SimpleMessage updateUser(UserInfo userInfo);
    SimpleMessage getUser(Integer id);
    SimpleMessage batchInsertUser(List<UserInfo> listUserInfo);
    SimpleMessage queryUser(Map map);
}
