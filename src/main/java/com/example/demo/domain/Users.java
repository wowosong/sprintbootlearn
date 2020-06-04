package com.example.demo.domain ;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.util.Date;
//@Data
public class Users {
  @NotNull
  private String  id;
  @NotNull
  @NotBlank
  @Email
  @Column(name = "邮箱")
  private String email;
  @NotBlank
  @Length(min=6, max=20)
  @Column(name = "用户名")
  private String username;
  @Column(name = "账号状态")
  private String status;
  @Column(name = "")
  private Long liked;
  @Column(name = "密钥")
  private String passwordHash;
  @Column(name = "角色")
  private String role_Id;
  @Column(name = "是否确认")
  private Boolean confirmed;
  @Column(name = "是否公开我的喜欢")
  private Boolean like_public;
  @Column(name = "姓名")
  private String name;
  @Column(name = "地址")
  private String location;
  @Column(name = "网址")
  private String website;
  @Column(name = "")
  private String background;
  @Column(name = "关于我")
  private String about_me;
  @JsonFormat(pattern = "yyyy/MM/dd",timezone = "GMT+8")
  @Column(name = "注册时间")
  private Date member_since;
  @JsonFormat(pattern = "yyyy/MM/dd")
  @Column(name = "上次登录时间")
  private Date last_seen;
  @Column(name = "头像")
  private String avatar_hash;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


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


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public Long getLiked() {
    return liked;
  }

  public void setLiked(Long liked) {
    this.liked = liked;
  }


  public String getPasswordHash() {
    return passwordHash;
  }

  public void setPasswordHash(String passwordHash) {
    this.passwordHash = passwordHash;
  }


  public String getRoleId() {
    return role_Id;
  }

  public void setRoleId(String role_Id) {
    this.role_Id = role_Id;
  }


  public Boolean getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(Boolean confirmed) {
    this.confirmed = confirmed;
  }


  public Boolean getLikePublic() {
    return like_public;
  }

  public void setLikePublic(Boolean likePublic) {
    this.like_public = like_public;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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


  public String getAboutMe() {
    return about_me;
  }

  public void setAboutMe(String aboutMe) {
    this.about_me = about_me;
  }


  public Date getMemberSince() {
    return member_since;
  }

  public void setMemberSince(Date memberSince) {
    this.member_since = member_since;
  }


  public Date getLastSeen() {
    return last_seen;
  }

  public void setLastSeen(Date lastSeen) {
    this.last_seen = last_seen;
  }


  public String getAvatarHash() {
    return avatar_hash;
  }

  public void setAvatarHash(String avatarHash) {
    this.avatar_hash = avatar_hash;
  }
  @Override
    public  String toString(){
      return this.name+this.about_me+this.email+this.location;
  }
}
