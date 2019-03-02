package com.cs.yang.passcloudpojo.pojo;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
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
  private String modifiedTime;


}
