package com.cs.yang.passcloudpojo.pojo;


import javax.persistence.*;

@Entity
@Table(name="Customer_Point_Log")
public class CustomerPointLog  implements  java.io.Serializable{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer pointId;
  private Integer customerId;
  private Integer source;
  private Integer referNumber;
  private Integer changePoint;
  private java.time.LocalDateTime createTime;


  public Integer getPointId() {
    return pointId;
  }

  public void setPointId(Integer pointId) {
    this.pointId = pointId;
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


  public Integer getReferNumber() {
    return referNumber;
  }

  public void setReferNumber(Integer referNumber) {
    this.referNumber = referNumber;
  }


  public Integer getChangePoint() {
    return changePoint;
  }

  public void setChangePoint(Integer changePoint) {
    this.changePoint = changePoint;
  }


  public java.time.LocalDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.time.LocalDateTime createTime) {
    this.createTime = createTime;
  }

}
