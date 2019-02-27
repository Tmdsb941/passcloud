package com.cs.yang.passcloudpojo.pojo;


import javax.persistence.*;

@Entity
@Table(name = "Warehouse_Product")
public class WarehouseProduct  implements  java.io.Serializable{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer wpId;
  private Integer productId;
  private Integer wId;
  private Integer currentCnt;
  private Integer lockCnt;
  private Integer inTransitCnt;
  private Double averageCost;
  private java.time.LocalDateTime modifiedTime;


  public Integer getWpId() {
    return wpId;
  }

  public void setWpId(Integer wpId) {
    this.wpId = wpId;
  }


  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }


  public Integer getWId() {
    return wId;
  }

  public void setWId(Integer wId) {
    this.wId = wId;
  }


  public Integer getCurrentCnt() {
    return currentCnt;
  }

  public void setCurrentCnt(Integer currentCnt) {
    this.currentCnt = currentCnt;
  }


  public Integer getLockCnt() {
    return lockCnt;
  }

  public void setLockCnt(Integer lockCnt) {
    this.lockCnt = lockCnt;
  }


  public Integer getInTransitCnt() {
    return inTransitCnt;
  }

  public void setInTransitCnt(Integer inTransitCnt) {
    this.inTransitCnt = inTransitCnt;
  }


  public Double getAverageCost() {
    return averageCost;
  }

  public void setAverageCost(Double averageCost) {
    this.averageCost = averageCost;
  }


  public java.time.LocalDateTime getModifiedTime() {
    return modifiedTime;
  }

  public void setModifiedTime(java.time.LocalDateTime modifiedTime) {
    this.modifiedTime = modifiedTime;
  }

}
