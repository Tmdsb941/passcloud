package com.cs.yang.passcloudpojo.pojo;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "Order_Cart")
public class OrderCart  implements  java.io.Serializable{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer cartId;
  private Integer customerId;
  private Integer productId;
  private Integer productAmount;
  private Double price;
  private String addTimetime;
  private String modifiedTime;

  public OrderCart(){

  }

  public OrderCart(OrderCart cart) {
    this.customerId = cart.customerId;
    this.productId = cart.productId;
    this.productAmount = cart.productAmount;
    this.price = cart.price;
    this.addTimetime = cart.addTimetime;
    this.modifiedTime =cart.modifiedTime;
  }
}
