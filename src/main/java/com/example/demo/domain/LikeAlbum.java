package com.example.demo.domain;


public class LikeAlbum {

  private long likeAlbumId;
  private long albumLikedId;
  private java.sql.Timestamp timestamp;


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


  public java.sql.Timestamp getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(java.sql.Timestamp timestamp) {
    this.timestamp = timestamp;
  }

}
