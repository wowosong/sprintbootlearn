package com.example.demo.domain;


public class Follows {

  private long followerId;
  private long followedId;
  private java.sql.Timestamp timestamp;


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


  public java.sql.Timestamp getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(java.sql.Timestamp timestamp) {
    this.timestamp = timestamp;
  }

}
