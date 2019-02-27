package com.cs.yang.passcloudpojo.pojo;


import javax.persistence.*;

@Entity
@Table(name = "Customer_Login")
public class CustomerLogin  implements  java.io.Serializable{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer customerId;
  private String loginName;
  private String md5Password;
  private Integer userStats;
  private java.time.LocalDateTime modifiedTime;


  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }


  public String getLoginName() {
    return loginName;
  }

  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }


  public String getMd5Password() {
    return md5Password;
  }

  public void setMd5Password(String md5Password) {
    this.md5Password = md5Password;
  }


  public Integer getUserStats() {
    return userStats;
  }

  public void setUserStats(Integer userStats) {
    this.userStats = userStats;
  }


  public java.time.LocalDateTime getModifiedTime() {
    return modifiedTime;
  }

  public void setModifiedTime(java.time.LocalDateTime modifiedTime) {
    this.modifiedTime = modifiedTime;
  }

}
