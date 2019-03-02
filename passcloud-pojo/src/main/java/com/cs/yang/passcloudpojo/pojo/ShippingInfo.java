package com.cs.yang.passcloudpojo.pojo;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Shipping_Info")
public class ShippingInfo implements  java.io.Serializable{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer shipId;
  private String shipName;
  private String shipContact;
  private String telephone;
  private Double price;
  private String modifiedTime;

}
