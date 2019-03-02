package com.cs.yang.passcloudpojo.pojo;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
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
  private String createTime;



}
