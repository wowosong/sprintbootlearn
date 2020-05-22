package com.example.demo.domain ;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class Users {
  @NotNull
  private long id;
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
  private String roleId;
  private boolean confirmed;
  private boolean likePublic;
  private String name;
  private String location;
  private String website;
  private String background;
  private String aboutMe;
  private Date memberSince;
  private Date lastSeen;
  private String avatarHash;


  public long getId() {
    return id;
  }

  public void setId(long id) {
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
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }


  public boolean getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(boolean confirmed) {
    this.confirmed = confirmed;
  }


  public boolean getLikePublic() {
    return likePublic;
  }

  public void setLikePublic(boolean likePublic) {
    this.likePublic = likePublic;
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
    return aboutMe;
  }

  public void setAboutMe(String aboutMe) {
    this.aboutMe = aboutMe;
  }


  public Date getMemberSince() {
    return memberSince;
  }

  public void setMemberSince(Date memberSince) {
    this.memberSince = memberSince;
  }


  public Date getLastSeen() {
    return lastSeen;
  }

  public void setLastSeen(Date lastSeen) {
    this.lastSeen = lastSeen;
  }


  public String getAvatarHash() {
    return avatarHash;
  }

  public void setAvatarHash(String avatarHash) {
    this.avatarHash = avatarHash;
  }

}
