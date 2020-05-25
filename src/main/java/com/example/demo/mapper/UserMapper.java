package com.example.demo.mapper;

import com.example.demo.domain.Users;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface UserMapper extends  BaseMapper<Users>{
    void insertUser(User user);
    Users queryInfo(String name);
    Users queryInfoById(long id);
    List<Users> queryUser(Map map);
    void deleteUser(User user);
    @Options(useGeneratedKeys = true,keyColumn = "id")
    void updateUser(User user);
//    @Select("select id,name,email from users where id=#{id}")
    Users getUser(Integer id);
    List<User> getMutiUser();
    void insertUser(Users users);
    void deleteUser(Users users);
    void batchInsert(List<Users> listUsers);

    void updateUsers(Users users);
}
