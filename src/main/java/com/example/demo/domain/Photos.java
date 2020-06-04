package com.example.demo.domain;


import lombok.Data;

import javax.persistence.Column;
import java.util.Date;
@Data
public class Photos {

  private String id;
  @Column(name = "照片获取地址url")
  private String url;
  private String urlS;
  private String urlT;
  @Column(name = "照片描述")
  private String about;
  @Column(name = "上传时间")
  private Date timestamp;
  @Column(name = "照片快速排序")
  private Integer order;
  @Column(name = "照片上传者Id")
  private Integer authorId;
  @Column(name = "照片上传到相册Id")
  private String albumId;


  public String getId() {
    return id;
  }

  public void setId(String  id) {
    this.id = id;
  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public String getUrlS() {
    return urlS;
  }

  public void setUrlS(String urlS) {
    this.urlS = urlS;
  }


  public String getUrlT() {
    return urlT;
  }

  public void setUrlT(String urlT) {
    this.urlT = urlT;
  }


  public String getAbout() {
    return about;
  }

  public void setAbout(String about) {
    this.about = about;
  }


  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }


  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }


  public Integer getAuthorId() {
    return authorId;
  }

  public void setAuthorId(Integer authorId) {
    this.authorId = authorId;
  }


  public String getAlbumId() {
    return albumId;
  }

  public void setAlbumId(String  albumId) {
    this.albumId = albumId;
  }

}
