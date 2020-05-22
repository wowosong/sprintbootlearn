package com.example.demo.domain;


public class LikePhoto {

  private long likePhotoId;
  private long photoLikedId;
  private java.sql.Timestamp timestamp;


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


  public java.sql.Timestamp getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(java.sql.Timestamp timestamp) {
    this.timestamp = timestamp;
  }

}
