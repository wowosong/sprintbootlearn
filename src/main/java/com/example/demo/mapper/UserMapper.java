package com.example.demo.mapper;

import com.example.demo.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;
@Mapper
@Repository
public interface UserMapper extends  BaseMapper<UserInfo>{
    void insertUser(UserInfo userInfo);
    UserInfo queryInfo(String name);
    List<UserInfo> queryInfoById(Integer id);
    void deleteUser(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    @Select("select id,name,email from userinfo where id=#{id}")
    UserInfo getUser(Integer id);
}
