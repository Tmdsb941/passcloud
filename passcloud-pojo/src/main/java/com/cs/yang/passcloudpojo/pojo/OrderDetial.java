package com.cs.yang.passcloudpojo.pojo;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
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
  private String modifiedTime;


}
