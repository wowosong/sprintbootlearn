package com.example.demo.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
//@Data
@Table(name = "albums")
@JsonIgnoreProperties(value = "handler")
public class Albums  implements Serializable {
  private final  static long uuid=12313L;
  @Id
  @Column(name = "id")
  private String id;
  @Column(name = "title")
  private String title;
  @Column(name="about")
  private String about;
  @Column(name = "cover")
  private String cover;
  @Column(name = "type")
  private Long type;

  private String tag;
  @Column(name = "no_public")
  private Boolean noPublic;
  @Column(name = "no_comment")
  private Boolean noComment;
  @Column(name = "asc_order")
  private String  ascOrder;
  @Column(name = "`timestamp`")
  private Date timestamp;
  @Column(name = "author_id")
  private String authorId;


  public String  getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getAbout() {
    return about;
  }

  public void setAbout(String about) {
    this.about = about;
  }


  public String getCover() {
    return cover;
  }

  public void setCover(String cover) {
    this.cover = cover;
  }


  public Long getType() {
    return type;
  }

  public void setType(Long type) {
    this.type = type;
  }


  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


  public Boolean getNoPublic() {
    return noPublic;
  }

  public void setNoPublic(Boolean noPublic) {
    this.noPublic = noPublic;
  }


  public Boolean getNoComment() {
    return noComment;
  }

  public void setNoComment(Boolean noComment) {
    this.noComment = noComment;
  }


  public String getAscOrder() {
    return ascOrder;
  }

  public void setAscOrder(String ascOrder) {
    this.ascOrder = ascOrder;
  }


  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }


  public String getAuthorId() {
    return authorId;
  }

  public void setAuthorId(String authorId) {
    this.authorId = authorId;
  }

}
