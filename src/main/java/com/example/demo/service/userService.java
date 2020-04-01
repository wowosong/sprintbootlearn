package com.example.demo.service;

//import com.hanboard.educloud.framework.web.message.SimpleMessage;
import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.domain.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface userService {
    String insertUser(UserInfo userinfo);
    UserInfo getUserInfo(String name);//@Param("name")
    UserInfo getUserById(Integer id);//@Param("id")
    SimpleMessage get1Info(String name);
}
