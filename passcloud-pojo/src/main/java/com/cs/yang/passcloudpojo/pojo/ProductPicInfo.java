package com.cs.yang.passcloudpojo.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name ="Product_Pic_Info")
@Getter
@Setter
public class ProductPicInfo  implements java.io.Serializable{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer productPicId;
//  private Integer productIds;
  private String picDesc;
  private String picUrl;
  private Integer isMaster;
  private Integer picOrder;
  private Integer picStatus;
  private java.time.LocalDateTime modifiedTime;
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name="Product_id")
  @JsonIgnore
  private  ProductInfo productInfo;
//  @OneToMany(mappedBy = "productPicInfo")
//  public Set<ProductInfo> sets=new HashSet<>();
}
