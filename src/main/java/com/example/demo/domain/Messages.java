package com.example.demo.domain;


//import lombok.Data;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import java.util.Date;
//@Data
public class Messages {

  private String id;
  @Column(name = "body")
  private String body;
  @Column(name = "`timestamp`")
  private Date timestamp;
  @Column(name = "disabled")
  private Boolean disabled;
  @Column(name = "author_id")
  private String authorId;
  @Column(name = "user_id")
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

  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
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
