package com.example.demo.domain;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "userinfo")

@ApiModel(description = "用户管理")
public class UserInfo {
    @Id
    @Column(name="id")
    private  Integer id;
    @Column(name="name")
    @ApiModelProperty(name = "用户姓名",value = "用户姓名")
    private String name;
    @Column(name="password")
    @ApiModelProperty(name = "密码", value = "密码")
    private  String  password;
    @Column(name="email")
    @ApiModelProperty(name = "邮箱",value = "邮箱")
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name+password+email;
    }
}
