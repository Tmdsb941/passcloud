package com.cs.yang.passcloudpojo.pojo;


import javax.persistence.*;

@Entity
@Table(name = "Customer_Level_Inf")
public class CustomerLevelInf implements  java.io.Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer customerLevel;
  private String levelName;
  private Integer minPoint;
  private Integer maxPoint;
  private java.time.LocalDateTime modifiedTime;


  public Integer getCustomerLevel() {
    return customerLevel;
  }

  public void setCustomerLevel(Integer customerLevel) {
    this.customerLevel = customerLevel;
  }


  public String getLevelName() {
    return levelName;
  }

  public void setLevelName(String levelName) {
    this.levelName = levelName;
  }


  public Integer getMinPoint() {
    return minPoint;
  }

  public void setMinPoint(Integer minPoint) {
    this.minPoint = minPoint;
  }


  public Integer getMaxPoint() {
    return maxPoint;
  }

  public void setMaxPoint(Integer maxPoint) {
    this.maxPoint = maxPoint;
  }


  public java.time.LocalDateTime getModifiedTime() {
    return modifiedTime;
  }

  public void setModifiedTime(java.time.LocalDateTime modifiedTime) {
    this.modifiedTime = modifiedTime;
  }

}
