package com.cs.yang.passcloudpojo.pojo;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="Order_Master")
@Getter
@Setter
public class OrderMaster implements  java.io.Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer orderId;
  private Integer orderSn;
  private Integer customerId;
  private String shippingUser;
  private Integer province;
  private Integer city;
  private Integer district;
  private String address;
  private Integer paymentMethod;
  private Double orderMoney;
  private Double districtMoney;
  private Double shippingMoney;
  private Double paymentMoney;
  private String shippingCompName;
  private String shippingSn;
  private String createTime;
  private String shipingTime;
  private String payTime;
  private String receiveTime;
  private Integer orderStatus;
  private Integer orderPoint;
  private String invoiceTime;
  private java.time.LocalDateTime modifiedTime;
}



