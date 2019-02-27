package com.cs.yang.passcloudpojo.pojo;


import javax.persistence.*;

@Entity
@Table(name="Customer_Login_Log")
public class CustomerLoginLog  implements  java.io.Serializable{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer loginId;
  private Integer customerId;
  private java.time.LocalDateTime loginTime;
  private Integer loginIp;
  private Integer loginType;


  public Integer getLoginId() {
    return loginId;
  }

  public void setLoginId(Integer loginId) {
    this.loginId = loginId;
  }


  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }


  public java.time.LocalDateTime getLoginTime() {
    return loginTime;
  }

  public void setLoginTime(java.time.LocalDateTime loginTime) {
    this.loginTime = loginTime;
  }


  public Integer getLoginIp() {
    return loginIp;
  }

  public void setLoginIp(Integer loginIp) {
    this.loginIp = loginIp;
  }


  public Integer getLoginType() {
    return loginType;
  }

  public void setLoginType(Integer loginType) {
    this.loginType = loginType;
  }

}
