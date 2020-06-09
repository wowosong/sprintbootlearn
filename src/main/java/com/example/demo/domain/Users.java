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
  @Column(name = "email")
  private String email;
  @NotBlank
  @Length(min=6, max=20)
  @Column(name = "username")
  private String username;
  @Column(name = "status")
  private String status;
  @Column(name = "liked")
  private Long liked;
  @Column(name = "password_hash")
  private String password_hash;
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


  public Long getLiked() {
    return liked;
  }

  public void setLiked(Long liked) {
    this.liked = liked;
  }


  public String getPassword_hash() {
    return password_hash;
  }

  public void setPasswordHash(String password_hash) {
    this.password_hash = password_hash;
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
