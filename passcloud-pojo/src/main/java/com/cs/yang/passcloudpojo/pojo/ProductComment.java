package com.cs.yang.passcloudpojo.pojo;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "Product_Comment")
public class ProductComment implements  java.io.Serializable{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer commentId;
  private Integer productId;
  private Integer orderId;
  private Integer customerId;
  private String tietle;
  private String content;
  private Integer auditStatus;
  private String auditTime;
  private String modifiedTime;

}
