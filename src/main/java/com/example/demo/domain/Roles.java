package com.example.demo.domain;


import lombok.Data;

import javax.persistence.Column;
@Data
public class Roles {

  private String id;
  private String name;
  @Column(name = "default")
  private String isDefault;
  private long permissions;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(String isDefault) {
    this.isDefault = isDefault;
  }

  public long getPermissions() {
    return permissions;
  }

  public void setPermissions(long permissions) {
    this.permissions = permissions;
  }

}
