package com.cs.yang.passcloudpojo.pojo;







import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Product_Info")
@Getter
@Setter
public class ProductInfo  {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer productId;
  private String productCore;
  private String productName;
  private String barCode;
  private Integer brandId;
  private Integer oneCategoryId;
  private Integer twoCagegoryId;
  private Integer threeCagegoryId;
  private Integer supplierId;
  private Double price;
  private Double averageCost;
  private Integer publishStatus;
  private Integer auditStatus;
  private Double weight;
  private Double lengths;
  private Double height;
  private Double weeith;
  @Enumerated(EnumType.STRING)
  private ColorType  colorType;
  private String productionDate;
  private Integer shelfLife;
  private String descript;
  private String indate;
  private String modifiedTime;
//  @ManyToOne(fetch = FetchType.EAGER)
//  @JoinColumn(name = "Product_id")
//  @JsonIgnore
 // private  ProductPicInfo productPicInfo;
    @OneToMany(mappedBy = "productInfo")
    private Set<ProductPicInfo> lists=new HashSet<>();


}
