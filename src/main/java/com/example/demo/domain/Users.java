package com.example.demo.domain ;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;
@Data
@JsonIgnoreProperties(value = "handler")
public class Users implements Serializable {
  @NotNull
  @Id
  private String  id;
  @NotNull
  @NotBlank
  @Email
  @Column(name = "email")
  private String email;
  @NotBlank
  @Length(min=6, max=20)
  @Column(name = "username")
  private String username;
  @Column(name = "status")
  private String status;
  @Column(name = "liked")
  private long liked;
  @Column(name = "password_hash")
  private String password;
  @Column(name = "role_Id")
  private String role_Id;
  @Column(name = "confirmed")
  private Boolean confirmed;
  @Column(name = "like_public")
  private Boolean like_public;
  @Column(name = "name")
  private String name;
  @Column(name = "location")
  private String location;
  @URL
  @Column(name = "website")
  private String website;
  @Column(name = "background")
  private String background;
  @Column(name = "about_me")
  private String about_me;
//  @JsonFormat(pattern = "yyyy/MM/dd",timezone = "GMT+8")
  @Column(name = "member_since")
  private Date member_since;
//  @JsonFormat(pattern = "yyyy/MM/dd")
  @Column(name = "last_seen")
  private Date last_seen;
  @Column(name = "avatar_hash")
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

  public long getLiked() {
    return liked;
  }

  public void setLiked(long liked) {
    this.liked = liked;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getRole_Id() {
    return role_Id;
  }

  public void setRole_Id(String role_Id) {
    this.role_Id = role_Id;
  }

  public Boolean getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(Boolean confirmed) {
    this.confirmed = confirmed;
  }

  public Boolean getLike_public() {
    return like_public;
  }

  public void setLike_public(Boolean like_public) {
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
    public  String toString(){
      return this.name+this.about_me+this.email+this.location;
  }
}
