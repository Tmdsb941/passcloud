package com.cs.yang.passcloudpojo.pojo;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Setter
@Getter
@Entity
@Table(name = "Customer_Balnce_Log")
public class CustomerBalnceLog  implements  java.io.Serializable{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer balanceId;
  private Integer customerId;
  private Integer source;
  private Integer sourceSn;
  private String createTime;
  private Double amount;



}
