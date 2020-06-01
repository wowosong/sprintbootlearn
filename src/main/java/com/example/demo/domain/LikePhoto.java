package com.example.demo.domain;


import lombok.Data;

import java.util.Date;
@Data
public class LikePhoto {

  private long likePhotoId;
  private long photoLikedId;
  private Date timestamp;


  public long getLikePhotoId() {
    return likePhotoId;
  }

  public void setLikePhotoId(long likePhotoId) {
    this.likePhotoId = likePhotoId;
  }


  public long getPhotoLikedId() {
    return photoLikedId;
  }

  public void setPhotoLikedId(long photoLikedId) {
    this.photoLikedId = photoLikedId;
  }


  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

}
