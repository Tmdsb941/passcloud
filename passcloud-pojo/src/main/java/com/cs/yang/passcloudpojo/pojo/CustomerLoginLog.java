package com.cs.yang.passcloudpojo.pojo;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="Customer_Login_Log")
public class CustomerLoginLog  implements  java.io.Serializable{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer loginId;
  private Integer customerId;
  private java.time.LocalDateTime loginTime;
  private Integer loginIp;
  private Integer loginType;


}
