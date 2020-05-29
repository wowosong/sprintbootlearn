package com.example.demo.service.impl;

import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.domain.Roles;
import com.example.demo.mapper.RoleMapper;
import com.example.demo.service.roleService;
//import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import javax.management.relation.Role;
import java.util.List;
import java.util.Objects;

@Component
@Validated
@Service
@Transactional(rollbackFor = Exception.class)
public class roleServiceImpl implements roleService {
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public SimpleMessage addRole(Roles roles) {
        Roles role=roleMapper.getRoleByName(roles.getName());
        if(!Objects.isNull(role)){
            return  SimpleMessage.warn("该角色已存在");
        }
        roleMapper.addRole(roles);
//        roleMapper.insert(roles);
        return SimpleMessage.info("操作成功");
    }

    @Override
    public SimpleMessage editRole(Roles roles) {
        Roles roleinfo=roleMapper.getRoleById(roles.getId());
        if(Objects.isNull(roleinfo)){
            return  SimpleMessage.warn("该角色不存在");
        }
        roleMapper.updateRole(roles);
        return SimpleMessage.info("操作成功");
    }

    @Override
    public SimpleMessage deleteRole() {
        return null;
    }

    @Override
    public SimpleMessage getRoleByName(String name) {
        Roles roleinfo=roleMapper.getRoleByName(name);
        return SimpleMessage.info(roleinfo);
    }

    @Override
    public SimpleMessage getRole() {
        List<Roles> roleinfo=roleMapper.select(null);
        return SimpleMessage.info(roleinfo);
    }

}
