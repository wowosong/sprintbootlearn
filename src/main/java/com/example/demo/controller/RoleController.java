package com.example.demo.controller;

import com.example.demo.SimpleMessage.SimpleMessage;
import com.example.demo.domain.Roles;
import com.example.demo.service.roleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.management.relation.Role;

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

       return roleService.addRole(role);
    };
    @ApiOperation(value = "获取角色",notes="获取角色")
    @GetMapping(value = "/getRole/{name}")
    public SimpleMessage getRole(@ApiParam(value = "获取角色") @PathVariable String name){
        return  roleService.getRoleByName(name);
    }
    @ApiOperation(value = "编辑角色",notes="编辑角色")
    @PostMapping(value = "/editRole")
    public SimpleMessage editRole(@ApiParam(value = "获取角色") @RequestBody Roles roles){
        return  roleService.editRole(roles);
    }
    @GetMapping(value = "/getrole")
    public SimpleMessage getRole(){
        return roleService.getRole();
    }
}
