package com.example.demo.domain;


import lombok.Data;

import javax.persistence.Column;
import java.util.Date;
@Data
public class LikePhoto {
  @Column(name = "收藏照片Id")
  private String likePhotoId;
  @Column(name = "被收藏照片ID")
  private String photoLikedId;
  @Column(name = "收藏时间")
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
