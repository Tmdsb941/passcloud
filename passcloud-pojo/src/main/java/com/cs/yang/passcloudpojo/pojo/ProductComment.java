package com.cs.yang.passcloudpojo.pojo;


import javax.persistence.*;

@Entity
@Table(name = "Product_Comment")
public class ProductComment implements  java.io.Serializable{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer commentId;
  private Integer productId;
  private Integer orderId;
  private Integer customerId;
  private String tietle;
  private String content;
  private Integer auditStatus;
  private java.time.LocalDateTime auditTime;
  private java.time.LocalDateTime modifiedTime;


  public Integer getCommentId() {
    return commentId;
  }

  public void setCommentId(Integer commentId) {
    this.commentId = commentId;
  }


  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }


  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }


  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }


  public String getTietle() {
    return tietle;
  }

  public void setTietle(String tietle) {
    this.tietle = tietle;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public Integer getAuditStatus() {
    return auditStatus;
  }

  public void setAuditStatus(Integer auditStatus) {
    this.auditStatus = auditStatus;
  }


  public java.time.LocalDateTime getAuditTime() {
    return auditTime;
  }

  public void setAuditTime(java.time.LocalDateTime auditTime) {
    this.auditTime = auditTime;
  }


  public java.time.LocalDateTime getModifiedTime() {
    return modifiedTime;
  }

  public void setModifiedTime(java.time.LocalDateTime modifiedTime) {
    this.modifiedTime = modifiedTime;
  }

}
