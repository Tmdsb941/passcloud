package com.cs.yang.passcloudpojo.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Customer_Info")
public class CustomerInfo implements  java.io.Serializable{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer customerInfId;
  private Integer customerId;
  private String customerName;
  private Integer identityCardType;
  private String identityCardNo;
  private Integer mobilePhone;
  private String customerEmail;
  private String gender;
  private Integer userPoint;
  private String registerTime;
  private String birthday;
  private Integer customerLevel;
  private Double userMoner;
  private String modifiedTime;


}
