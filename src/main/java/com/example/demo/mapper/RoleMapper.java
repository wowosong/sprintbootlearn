package com.example.demo.mapper;

import com.example.demo.domain.Roles;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
@Repository
public interface RoleMapper extends BaseMapper {
    void getRole();
    void addRole(Roles role);
}
