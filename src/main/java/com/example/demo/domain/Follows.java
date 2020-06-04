package com.example.demo.domain;


import lombok.Data;

import java.util.Date;
//@Data
public class Follows {

  private long followerId;
  private long followedId;
  private Date timestamp;


  public long getFollowerId() {
    return followerId;
  }

  public void setFollowerId(long followerId) {
    this.followerId = followerId;
  }


  public long getFollowedId() {
    return followedId;
  }

  public void setFollowedId(long followedId) {
    this.followedId = followedId;
  }


  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

}
