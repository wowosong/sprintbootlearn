package com.example.demo.domain;


//import lombok.Data;

import javax.persistence.Column;
import java.util.Date;
//@Data
public class LikeAlbum {
  @Column(name = "like_album_id")
  private String likeAlbumId;
  @Column(name = "album_liked_id")
  private String albumLikedId;
  @Column(name = "`timestamp`")
  private Date timestamp;


  public String getLikeAlbumId() {
    return likeAlbumId;
  }

  public void setLikeAlbumId(String likeAlbumId) {
    this.likeAlbumId = likeAlbumId;
  }


  public String getAlbumLikedId() {
    return albumLikedId;
  }

  public void setAlbumLikedId(String albumLikedId) {
    this.albumLikedId = albumLikedId;
  }


  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

}
