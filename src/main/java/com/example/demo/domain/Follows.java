package com.example.demo.domain;


//import lombok.Data;

import javax.persistence.Column;
import java.util.Date;
//@Data
public class Follows {
  @Column(name = "follower_id")
  private String followerId;
  @Column(name = "followed_id")
  private String followedId;
  @Column(name = "`timestamp`")
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
