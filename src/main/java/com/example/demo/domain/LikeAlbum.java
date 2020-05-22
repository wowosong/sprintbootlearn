package com.example.demo.domain;


import java.util.Date;

public class LikeAlbum {

  private long likeAlbumId;
  private long albumLikedId;
  private Date timestamp;


  public long getLikeAlbumId() {
    return likeAlbumId;
  }

  public void setLikeAlbumId(long likeAlbumId) {
    this.likeAlbumId = likeAlbumId;
  }


  public long getAlbumLikedId() {
    return albumLikedId;
  }

  public void setAlbumLikedId(long albumLikedId) {
    this.albumLikedId = albumLikedId;
  }


  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

}
