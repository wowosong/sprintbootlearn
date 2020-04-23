package com.example.demo.mapper;

import com.example.demo.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
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
    UserInfo queryInfoById(Integer id);
    void deleteUser(UserInfo userInfo);
    @Options(useGeneratedKeys = true,keyColumn = "id")
    void updateUserInfo(UserInfo userInfo);
    @Select("select id,name,email from userinfo where id=#{id}")
    UserInfo getUser(Integer id);
    void batchInsert(List<UserInfo> ListUserInfo);
    List<UserInfo> getMutiUser();
}
