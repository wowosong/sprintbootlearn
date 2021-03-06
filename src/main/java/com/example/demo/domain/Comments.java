package com.example.demo.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;
@Data
public class Comments {
  @Id
  private String id;
  @Column(name = "body")
  private String body;
  @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
  @Column(name = "`timestamp`")
  private Date timestamp;
  @Column(name = "disabled")
  private Boolean disabled;
  @Column(name = "author_id")
  private String authorId;
  @Column(name = "photo_id")
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


  public String getPhotoId() {
    return photoId;
  }

  public void setPhotoId(String photoId) {
    this.photoId = photoId;
  }

}
