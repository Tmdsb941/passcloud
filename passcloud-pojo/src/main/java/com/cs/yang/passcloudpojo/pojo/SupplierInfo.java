package com.cs.yang.passcloudpojo.pojo;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "Supplier_Info")
public class SupplierInfo  implements java.io.Serializable{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer supplierId;
  private String supplierCode;
  private String supplierName;
  private Integer supplierType;
  private String linkMan;
  private String phoneNumber;
  private String bankName;
  private String bankAccount;
  private String address;
  private Integer supplierStatus;
  private String modifiedTime;

}
