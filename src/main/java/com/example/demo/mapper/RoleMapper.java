package com.example.demo.mapper;

import com.example.demo.domain.Roles;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;

import javax.management.relation.Role;

@Mapper
@Repository
public interface RoleMapper extends BaseMapper<Roles> {
    Roles getRoleByName(String name);
    void addRole(Roles role);

    Roles getRoleById(String id);

    void updateRole(Roles roles);
}
