package com.cs.yang.passcloudpojo.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Warehouse_Info")
public class WarehouseInfo  implements  java.io.Serializable{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer wId;
  private String warehouseSn;
  private String warehouseName;
  private String warehousePhone;
  private String contact;
  private Integer provice;
  private Integer city;
  private Integer distrct;
  private String addres;
  private Integer warehouseStatus;
  private String modifiedTime;


}
