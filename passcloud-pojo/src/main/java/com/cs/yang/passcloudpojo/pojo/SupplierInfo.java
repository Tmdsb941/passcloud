package com.cs.yang.passcloudpojo.pojo;


import javax.persistence.*;

@Entity
@Table(name = "Supplier_Info")
public class SupplierInfo  implements java.io.Serializable{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer supplierId;
  private String supplierCode;
  private String supplierName;
  private Integer supplierType;
  private String linkMan;
  private String phoneNumber;
  private String bankName;
  private String bankAccount;
  private String address;
  private Integer supplierStatus;
  private java.time.LocalDateTime modifiedTime;


  public Integer getSupplierId() {
    return supplierId;
  }

  public void setSupplierId(Integer supplierId) {
    this.supplierId = supplierId;
  }


  public String getSupplierCode() {
    return supplierCode;
  }

  public void setSupplierCode(String supplierCode) {
    this.supplierCode = supplierCode;
  }


  public String getSupplierName() {
    return supplierName;
  }

  public void setSupplierName(String supplierName) {
    this.supplierName = supplierName;
  }


  public Integer getSupplierType() {
    return supplierType;
  }

  public void setSupplierType(Integer supplierType) {
    this.supplierType = supplierType;
  }


  public String getLinkMan() {
    return linkMan;
  }

  public void setLinkMan(String linkMan) {
    this.linkMan = linkMan;
  }


  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }


  public String getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public Integer getSupplierStatus() {
    return supplierStatus;
  }

  public void setSupplierStatus(Integer supplierStatus) {
    this.supplierStatus = supplierStatus;
  }


  public java.time.LocalDateTime getModifiedTime() {
    return modifiedTime;
  }

  public void setModifiedTime(java.time.LocalDateTime modifiedTime) {
    this.modifiedTime = modifiedTime;
  }

}
