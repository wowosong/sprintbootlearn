package com.example.demo.domain;


//import lombok.Data;

import javax.persistence.Column;
import java.util.Date;
//@Data
public class LikePhoto {
  @Column(name = "like_photo_id")
  private String likePhotoId;
  @Column(name = "photo_liked_id")
  private String photoLikedId;
  @Column(name = "`timestamp`")
  private Date timestamp;


  public String getLikePhotoId() {
    return likePhotoId;
  }

  public void setLikePhotoId(String likePhotoId) {
    this.likePhotoId = likePhotoId;
  }


  public String getPhotoLikedId() {
    return photoLikedId;
  }

  public void setPhotoLikedId(String photoLikedId) {
    this.photoLikedId = photoLikedId;
  }


  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

}
