package com.cs.yang.passcloudpojo.pojo;

import javax.persistence.*;

@Entity
@Table(name = "Customer_Info")
public class CustomerInfo implements  java.io.Serializable{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer customerInfId;
  private Integer customerId;
  private String customerName;
  private Integer identityCardType;
  private String identityCardNo;
  private Integer mobilePhone;
  private String customerEmail;
  private String gender;
  private Integer userPoint;
  private java.time.LocalDateTime registerTime;
  private java.time.LocalDateTime birthday;
  private Integer customerLevel;
  private Double userMoner;
  private java.time.LocalDateTime modifiedTime;


  public Integer getCustomerInfId() {
    return customerInfId;
  }

  public void setCustomerInfId(Integer customerInfId) {
    this.customerInfId = customerInfId;
  }


  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }


  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }


  public Integer getIdentityCardType() {
    return identityCardType;
  }

  public void setIdentityCardType(Integer identityCardType) {
    this.identityCardType = identityCardType;
  }


  public String getIdentityCardNo() {
    return identityCardNo;
  }

  public void setIdentityCardNo(String identityCardNo) {
    this.identityCardNo = identityCardNo;
  }


  public Integer getMobilePhone() {
    return mobilePhone;
  }

  public void setMobilePhone(Integer mobilePhone) {
    this.mobilePhone = mobilePhone;
  }


  public String getCustomerEmail() {
    return customerEmail;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public Integer getUserPoint() {
    return userPoint;
  }

  public void setUserPoint(Integer userPoint) {
    this.userPoint = userPoint;
  }


  public java.time.LocalDateTime getRegisterTime() {
    return registerTime;
  }

  public void setRegisterTime(java.time.LocalDateTime registerTime) {
    this.registerTime = registerTime;
  }


  public java.time.LocalDateTime getBirthday() {
    return birthday;
  }

  public void setBirthday(java.time.LocalDateTime birthday) {
    this.birthday = birthday;
  }


  public Integer getCustomerLevel() {
    return customerLevel;
  }

  public void setCustomerLevel(Integer customerLevel) {
    this.customerLevel = customerLevel;
  }


  public Double getUserMoner() {
    return userMoner;
  }

  public void setUserMoner(Double userMoner) {
    this.userMoner = userMoner;
  }


  public java.time.LocalDateTime getModifiedTime() {
    return modifiedTime;
  }

  public void setModifiedTime(java.time.LocalDateTime modifiedTime) {
    this.modifiedTime = modifiedTime;
  }

}
