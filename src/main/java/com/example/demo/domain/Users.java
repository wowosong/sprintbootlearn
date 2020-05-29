package com.example.demo.domain ;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class Users {
  @NotNull
  private String  id;
  @NotNull
  @NotBlank
  @Email
  private String email;
  @NotBlank
  @Length(min=6, max=20)
  private String username;
  private String status;
  private long liked;
  private String passwordHash;
  private String role_Id;
  private boolean confirmed;
  private boolean like_public;
  private String name;
  private String location;
  private String website;
  private String background;
  private String about_me;
  private Date member_since;
  private Date last_seen;
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


  public boolean getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(boolean confirmed) {
    this.confirmed = confirmed;
  }


  public boolean getLikePublic() {
    return like_public;
  }

  public void setLikePublic(boolean likePublic) {
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
