package com.cs.yang.passcloudpojo.pojo;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Customer_Login")
public class CustomerLogin  implements  java.io.Serializable{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer customerId;
  private String loginName;
  private String md5Password;
  private Integer userStats;
  private String modifiedTime;

}
