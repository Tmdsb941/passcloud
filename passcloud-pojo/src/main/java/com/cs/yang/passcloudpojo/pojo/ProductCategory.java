package com.cs.yang.passcloudpojo.pojo;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="Product_Category")
public class ProductCategory implements java.io.Serializable{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer categoryId;
  private String categoryName;
  private String categoryCode;
  private Integer parentId;
  private Integer categoryLevel;
  private String modifiedTime;
  private String picUrl;


}
