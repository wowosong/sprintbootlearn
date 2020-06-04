package com.example.demo.domain;


import lombok.Data;

import javax.persistence.Column;
import java.util.Date;
@Data
public class Albums {

  private String id;
  @Column(name = "相册标题")
  private String title;
  @Column(name="相册描述")
  private String about;
  @Column(name = "封面")
  private String cover;
  @Column(name = "照片是否最新或最热")
  private long type;

  private String tag;
  @Column(name = "是否公开")
  private Boolean noPublic;
  @Column(name = "是否允许评论")
  private Boolean noComment;
  @Column(name = "照片按照上传时间排序方式")
  private String  ascOrder;
  @Column(name = "相册创建时间")
  private Date timestamp;
  @Column(name = "相册创建者id")
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
