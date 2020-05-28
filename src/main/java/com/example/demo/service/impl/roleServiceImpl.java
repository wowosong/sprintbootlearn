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

@Component
@Validated
@Service
@Transactional(rollbackFor = Exception.class)
public class roleServiceImpl implements roleService {
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public SimpleMessage addRole(Roles roles) {
        roleMapper.addRole(roles);
        return SimpleMessage.info("操作成功");
    }

    @Override
    public SimpleMessage editRole() {
        return null;
    }

    @Override
    public SimpleMessage deleteRole() {
        return null;
    }

    @Override
    public SimpleMessage getRole() {
        return null;
    }
}
