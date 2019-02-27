package com.cs.yang.passcloudpojo.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "Brand_Info")
public class BrandInfo  implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer brandId;
  private String brandName;
  private String telephone;
  private String brandWeb;
  private String brandLogo;
  private String brandDesc;
  private Integer brandStatus;
  private Integer brandOrder;
  private java.time.LocalDateTime modifiedTime;

}
