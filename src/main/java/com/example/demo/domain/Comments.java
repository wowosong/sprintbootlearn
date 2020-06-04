package com.example.demo.domain;


import lombok.Data;

import javax.persistence.Column;
import java.util.Date;
@Data
public class Comments {

  private String id;
  @Column(name = "评论内容")
  private String body;
  @Column(name = "评论时间")
  private Date timestamp;
  @Column(name = "是否可以删除")
  private boolean disabled;
  @Column(name = "评论者Id")
  private String authorId;
  @Column(name = "评论对应的照片Id")
  private String photoId;


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


  public String getPhotoId() {
    return photoId;
  }

  public void setPhotoId(String photoId) {
    this.photoId = photoId;
  }

}
