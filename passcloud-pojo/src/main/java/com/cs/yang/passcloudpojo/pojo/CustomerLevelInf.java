package com.cs.yang.passcloudpojo.pojo;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "Customer_Level_Inf")
public class CustomerLevelInf implements  java.io.Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer customerLevel;
  private String levelName;
  private Integer minPoint;
  private Integer maxPoint;
  private String modifiedTime;


}
