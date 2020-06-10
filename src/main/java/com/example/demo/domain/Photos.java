package com.example.demo.domain;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class Photos {
  @Id
  @Column(name = "id")
  private String id;
  @Column(name = "url")
  private String url;
  @Column(name="url_s")
  private String urlS;
  @Column(name="url_t")
  private String urlT;
  @Column(name = "about")
  private String about;
  @Column(name = "timestamp")
  private Date timestamp;
  @Column(name = "order")
  private Integer order;
  @Column(name = "author_id")
  private String authorId;
  @Column(name = "album_id")
  private String albumId;
  @Transient
  private Users users;
  @Transient
  private Albums albums;

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


  public String getAuthorId() {
    return authorId;
  }

  public void setAuthorId(String authorId) {
    this.authorId = authorId;
  }


  public String getAlbumId() {
    return albumId;
  }

  public void setAlbumId(String  albumId) {
    this.albumId = albumId;
  }

  public Users getUsers() {
    return users;
  }

  public void setUsers(Users users) {
    this.users = users;
  }

  public Albums getAlbums() {
    return albums;
  }

  public void setAlbums(Albums albums) {
    this.albums = albums;
  }
}
