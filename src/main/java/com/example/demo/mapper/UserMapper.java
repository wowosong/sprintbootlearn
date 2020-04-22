package com.example.demo.mapper;

import com.example.demo.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;
@Mapper
@Repository
public interface UserMapper extends  BaseMapper<UserInfo>{
    void insertUser(UserInfo userInfo);
    UserInfo queryInfo(String name);
    UserInfo queryInfoById(Integer id);
    void deleteUser(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void batchInsert(List<UserInfo> ListUserInfo);

    List<UserInfo> getMutiUser();
}
