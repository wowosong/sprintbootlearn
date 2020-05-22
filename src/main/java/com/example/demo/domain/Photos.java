package com.example.demo.domain;


public class Photos {

  private long id;
  private String url;
  private String urlS;
  private String urlT;
  private String about;
  private java.sql.Timestamp timestamp;
  private long order;
  private long authorId;
  private long albumId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
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


  public java.sql.Timestamp getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(java.sql.Timestamp timestamp) {
    this.timestamp = timestamp;
  }


  public long getOrder() {
    return order;
  }

  public void setOrder(long order) {
    this.order = order;
  }


  public long getAuthorId() {
    return authorId;
  }

  public void setAuthorId(long authorId) {
    this.authorId = authorId;
  }


  public long getAlbumId() {
    return albumId;
  }

  public void setAlbumId(long albumId) {
    this.albumId = albumId;
  }

}
