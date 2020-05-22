package com.example.demo.domain ;


public class Users {

  private long id;
  private String email;
  private String username;
  private String status;
  private long liked;
  private String passwordHash;
  private long roleId;
  private long confirmed;
  private long likePublic;
  private String name;
  private String location;
  private String website;
  private String background;
  private String aboutMe;
  private java.sql.Timestamp memberSince;
  private java.sql.Timestamp lastSeen;
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


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }


  public long getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(long confirmed) {
    this.confirmed = confirmed;
  }


  public long getLikePublic() {
    return likePublic;
  }

  public void setLikePublic(long likePublic) {
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


  public java.sql.Timestamp getMemberSince() {
    return memberSince;
  }

  public void setMemberSince(java.sql.Timestamp memberSince) {
    this.memberSince = memberSince;
  }


  public java.sql.Timestamp getLastSeen() {
    return lastSeen;
  }

  public void setLastSeen(java.sql.Timestamp lastSeen) {
    this.lastSeen = lastSeen;
  }


  public String getAvatarHash() {
    return avatarHash;
  }

  public void setAvatarHash(String avatarHash) {
    this.avatarHash = avatarHash;
  }

}
