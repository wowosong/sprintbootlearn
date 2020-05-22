package com.example.demo.domain;


public class Albums {

  private long id;
  private String title;
  private String about;
  private String cover;
  private long type;
  private String tag;
  private long noPublic;
  private long noComment;
  private long ascOrder;
  private java.sql.Timestamp timestamp;
  private long authorId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
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


  public long getType() {
    return type;
  }

  public void setType(long type) {
    this.type = type;
  }


  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


  public long getNoPublic() {
    return noPublic;
  }

  public void setNoPublic(long noPublic) {
    this.noPublic = noPublic;
  }


  public long getNoComment() {
    return noComment;
  }

  public void setNoComment(long noComment) {
    this.noComment = noComment;
  }


  public long getAscOrder() {
    return ascOrder;
  }

  public void setAscOrder(long ascOrder) {
    this.ascOrder = ascOrder;
  }


  public java.sql.Timestamp getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(java.sql.Timestamp timestamp) {
    this.timestamp = timestamp;
  }


  public long getAuthorId() {
    return authorId;
  }

  public void setAuthorId(long authorId) {
    this.authorId = authorId;
  }

}
