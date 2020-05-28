package com.example.demo.controller;

import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.domain.Roles;
import com.example.demo.service.roleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "角色管理")
public class RoleController {
    private roleService roleService;
    @Autowired
    public RoleController(roleService roleService){
        this.roleService=roleService;
    }
    @ApiOperation(value = "添加角色",notes = "添加角色")
    @PostMapping(value = "/addRole")
    public SimpleMessage addRole(@ApiParam(value = "增加角色") @RequestBody Roles role){
        System.out.println(role);
        roleService.addRole(role);
        return  SimpleMessage.info("操作成功");
    };
}
