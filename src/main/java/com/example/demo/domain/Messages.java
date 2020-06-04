package com.example.demo.domain;


import lombok.Data;

import javax.persistence.Column;
import java.util.Date;
//@Data
public class Messages {

  private String id;
  @Column(name = "消息内容")
  private String body;
  @Column(name = "消息发送时间")
  private Date timestamp;
  @Column(name = "消息")
  private boolean disabled;
  @Column(name = "消息产生者")
  private String authorId;
  @Column(name = "")
  private String userId;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }


  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }


  public boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(boolean disabled) {
    this.disabled = disabled;
  }


  public String getAuthorId() {
    return authorId;
  }

  public void setAuthorId(String authorId) {
    this.authorId = authorId;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

}
