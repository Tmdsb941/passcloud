package com.cs.yang.passcloudpojo.pojo;


import javax.persistence.*;

@Entity
@Table(name="Product_Category")
public class ProductCategory implements java.io.Serializable{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer categoryId;
  private String categoryName;
  private String categoryCode;
  private Integer parentId;
  private Integer categoryLevel;
  private java.time.LocalDateTime modifiedTime;
  private String picUrl;


  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }


  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  public String getCategoryCode() {
    return categoryCode;
  }

  public void setCategoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
  }


  public Integer getParentId() {
    return parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }


  public Integer getCategoryLevel() {
    return categoryLevel;
  }

  public void setCategoryLevel(Integer categoryLevel) {
    this.categoryLevel = categoryLevel;
  }


  public java.time.LocalDateTime getModifiedTime() {
    return modifiedTime;
  }

  public void setModifiedTime(java.time.LocalDateTime modifiedTime) {
    this.modifiedTime = modifiedTime;
  }


  public String getPicUrl() {
    return picUrl;
  }

  public void setPicUrl(String picUrl) {
    this.picUrl = picUrl;
  }

}
