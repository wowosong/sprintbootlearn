package com.example.demo.domain;


import lombok.Data;

import javax.persistence.Column;
import java.util.Date;
//@Data
public class Follows {
  @Column(name = "关注者Id")
  private String followerId;
  @Column(name = "被关注者Id")
  private String followedId;
  @Column(name = "关注时间")
  private Date timestamp;


  public String getFollowerId() {
    return followerId;
  }

  public void setFollowerId(String followerId) {
    this.followerId = followerId;
  }


  public String getFollowedId() {
    return followedId;
  }

  public void setFollowedId(String followedId) {
    this.followedId = followedId;
  }


  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

}
