package com.cs.yang.passcloudpojo.pojo;


import javax.persistence.*;

@Entity
@Table(name="Order_Detial")
public class OrderDetial implements java.io.Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer orderDetailId;
  private Integer orderId;
  private Integer productId;
  private String productName;
  private Integer productCnt;
  private Double productPrice;
  private Double averageCost;
  private Double weight;
  private Double feeMoney;
  private Integer wId;
  private java.time.LocalDateTime modifiedTime;


  public Integer getOrderDetailId() {
    return orderDetailId;
  }

  public void setOrderDetailId(Integer orderDetailId) {
    this.orderDetailId = orderDetailId;
  }


  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }


  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }


  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }


  public Integer getProductCnt() {
    return productCnt;
  }

  public void setProductCnt(Integer productCnt) {
    this.productCnt = productCnt;
  }


  public Double getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(Double productPrice) {
    this.productPrice = productPrice;
  }


  public Double getAverageCost() {
    return averageCost;
  }

  public void setAverageCost(Double averageCost) {
    this.averageCost = averageCost;
  }


  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }


  public Double getFeeMoney() {
    return feeMoney;
  }

  public void setFeeMoney(Double feeMoney) {
    this.feeMoney = feeMoney;
  }


  public Integer getWId() {
    return wId;
  }

  public void setWId(Integer wId) {
    this.wId = wId;
  }


  public java.time.LocalDateTime getModifiedTime() {
    return modifiedTime;
  }

  public void setModifiedTime(java.time.LocalDateTime modifiedTime) {
    this.modifiedTime = modifiedTime;
  }

}
