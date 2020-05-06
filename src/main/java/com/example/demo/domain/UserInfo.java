package com.example.demo.domain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Email;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Table(name = "userinfo")
@ApiModel(description = "用户管理")
public class UserInfo {
    @Id
    @Column(name="id")
    private  Integer id;
    @Column(name="name")
    @NotNull(message = "用户名不能为空")
    @Size(min=6,max = 20,message = "用户名只能在6-20个字符")
    @ApiModelProperty(name = "用户姓名",value = "用户姓名")
    private String username;
//
//    @Column(name="password")
//    @ApiModelProperty(name = "密码", value = "密码")
//    private  String  password;
    @Column(name="email")
    @Email(message = "邮箱格式不正确")
    @ApiModelProperty(name = "邮箱",value = "邮箱")
    private String email;
    @Column(name="用户状态")
    @ApiModelProperty(name = "用户状态",value = "用户状态")
    private boolean status;
    @Column(name="密码")
    @ApiModelProperty(name = "密码",value = "密码")
    private  String password_hash;
    @Column(name="角色id")
    @ApiModelProperty(name = "角色id",value = "角色id")
    private  int role_id;
    @Column(name="确认状态")
    @ApiModelProperty(name = "确认状态",value = "确认状态")
    private boolean isConfiremd;
    @Column(name="关注")
    @ApiModelProperty(name="关注",value = "关注")
    private boolean like_public;
    @Column(name="姓名")
    @Size(max = 64,message = "用户名只能在6-64个字符")
    @ApiModelProperty(name="姓名",value = "姓名")
    private  String name;
    @Column(name="位置")
    @Size(max = 64,message = "用户名只能在6-64个字符")
    @ApiModelProperty(name = "位置",value = "位置")
    private  String location;
    @Column(name = "个人网站")
    @Size(max = 64,message = "用户名只能在6-64个字符")
    @ApiModelProperty(name = "个人网站",value = "个人网站")
    private  String website;
    @Column(name="背景")
    @Size(max = 64,message = "用户名只能在6-64个字符")
    @ApiModelProperty(name="背景",value = "背景")
    private String  background;
    @Column(name="自我介绍")
    @Size(min=0,max = 200,message = "用户名只能在6-200个字符")
    @ApiModelProperty(name = "自我介绍",value = "自我介绍")
    private  String about_me;
    @Column(name="注册时间")
    @ApiModelProperty(name="注册时间",value = "注册时间")
    private Date member_since;
    @Column(name="登录时间")
    @ApiModelProperty(name="登录时间",value = "登录时间")
    private  Date last_seen;
    @Column(name="头像")
    @ApiModelProperty(name="头像",value = "头像")
    private  String avatar_hash;
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

//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getPassword_hash() {
        return password_hash;
    }

    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public boolean isConfiremd() {
        return isConfiremd;
    }

    public void setConfiremd(boolean confiremd) {
        isConfiremd = confiremd;
    }

    public boolean isLike_public() {
        return like_public;
    }

    public void setLike_public(boolean like_public) {
        this.like_public = like_public;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getAbout_me() {
        return about_me;
    }

    public void setAbout_me(String about_me) {
        this.about_me = about_me;
    }

    public Date getMember_since() {
        return member_since;
    }

    public void setMember_since(Date member_since) {
        this.member_since = member_since;
    }

    public Date getLast_seen() {
        return last_seen;
    }

    public void setLast_seen(Date last_seen) {
        this.last_seen = last_seen;
    }

    public String getAvatar_hash() {
        return avatar_hash;
    }

    public void setAvatar_hash(String avatar_hash) {
        this.avatar_hash = avatar_hash;
    }

    @Override
    public String toString() {
        return name+email;
    }
}
