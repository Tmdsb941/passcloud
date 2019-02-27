package com.cs.yang.passcloudpojo.pojo;


import javax.persistence.*;

@Entity
@Table(name = "Customer_Balnce_Log")
public class CustomerBalnceLog  implements  java.io.Serializable{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer balanceId;
  private Integer customerId;
  private Integer source;
  private Integer sourceSn;
  private java.time.LocalDateTime createTime;
  private Double amount;


  public Integer getBalanceId() {
    return balanceId;
  }

  public void setBalanceId(Integer balanceId) {
    this.balanceId = balanceId;
  }


  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }


  public Integer getSource() {
    return source;
  }

  public void setSource(Integer source) {
    this.source = source;
  }


  public Integer getSourceSn() {
    return sourceSn;
  }

  public void setSourceSn(Integer sourceSn) {
    this.sourceSn = sourceSn;
  }


  public java.time.LocalDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.time.LocalDateTime createTime) {
    this.createTime = createTime;
  }


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

}
