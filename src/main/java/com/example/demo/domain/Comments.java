package com.example.demo.domain;


import java.util.Date;

public class Comments {

  private long id;
  private String body;
  private Date timestamp;
  private boolean disabled;
  private long authorId;
  private long photoId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
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


  public long getAuthorId() {
    return authorId;
  }

  public void setAuthorId(long authorId) {
    this.authorId = authorId;
  }


  public long getPhotoId() {
    return photoId;
  }

  public void setPhotoId(long photoId) {
    this.photoId = photoId;
  }

}