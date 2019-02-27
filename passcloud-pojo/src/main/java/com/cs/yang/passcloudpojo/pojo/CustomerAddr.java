package com.cs.yang.passcloudpojo.pojo;


import javax.persistence.*;

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
  private java.time.LocalDateTime modifiedTime;


  public Integer getCustomerAddrId() {
    return customerAddrId;
  }

  public void setCustomerAddrId(Integer customerAddrId) {
    this.customerAddrId = customerAddrId;
  }


  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }


  public Integer getZip() {
    return zip;
  }

  public void setZip(Integer zip) {
    this.zip = zip;
  }


  public Integer getProvince() {
    return province;
  }

  public void setProvince(Integer province) {
    this.province = province;
  }


  public Integer getCity() {
    return city;
  }

  public void setCity(Integer city) {
    this.city = city;
  }


  public Integer getDistrict() {
    return district;
  }

  public void setDistrict(Integer district) {
    this.district = district;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public Integer getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Integer isDefault) {
    this.isDefault = isDefault;
  }


  public java.time.LocalDateTime getModifiedTime() {
    return modifiedTime;
  }

  public void setModifiedTime(java.time.LocalDateTime modifiedTime) {
    this.modifiedTime = modifiedTime;
  }

}
