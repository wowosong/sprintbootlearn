package com.example.demo.mapper;

import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.domain.UserInfo;
import io.swagger.models.auth.In;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;
import java.util.Map;
@Mapper
@Repository
public interface UserMapper extends  BaseMapper<UserInfo>{
    void insertUser(UserInfo userInfo);
    UserInfo queryInfo(@Param("name") String name);
    UserInfo queryInfoById(@Param("id")Integer id);
    void deleteUser(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);

}
