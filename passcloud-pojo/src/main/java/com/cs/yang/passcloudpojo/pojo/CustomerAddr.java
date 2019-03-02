package com.cs.yang.passcloudpojo.pojo;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Customer_Addr")
public class CustomerAddr  implements java.io.Serializable{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer customerAddrId;
  private Integer customerId;
  private Integer zip;
  private Integer province;
  private Integer city;
  private Integer district;
  private String address;
  private Integer isDefault;
  private String modifiedTime;


}
