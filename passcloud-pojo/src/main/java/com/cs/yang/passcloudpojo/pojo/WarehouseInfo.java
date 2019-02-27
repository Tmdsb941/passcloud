package com.cs.yang.passcloudpojo.pojo;

import javax.persistence.*;

@Entity
@Table(name = "Warehouse_Info")
public class WarehouseInfo  implements  java.io.Serializable{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer wId;
  private String warehouseSn;
  private String warehouseName;
  private String warehousePhone;
  private String contact;
  private Integer provice;
  private Integer city;
  private Integer distrct;
  private String addres;
  private Integer warehouseStatus;
  private java.time.LocalDateTime modifiedTime;


  public Integer getWId() {
    return wId;
  }

  public void setWId(Integer wId) {
    this.wId = wId;
  }


  public String getWarehouseSn() {
    return warehouseSn;
  }

  public void setWarehouseSn(String warehouseSn) {
    this.warehouseSn = warehouseSn;
  }


  public String getWarehouseName() {
    return warehouseName;
  }

  public void setWarehouseName(String warehouseName) {
    this.warehouseName = warehouseName;
  }


  public String getWarehousePhone() {
    return warehousePhone;
  }

  public void setWarehousePhone(String warehousePhone) {
    this.warehousePhone = warehousePhone;
  }


  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }


  public Integer getProvice() {
    return provice;
  }

  public void setProvice(Integer provice) {
    this.provice = provice;
  }


  public Integer getCity() {
    return city;
  }

  public void setCity(Integer city) {
    this.city = city;
  }


  public Integer getDistrct() {
    return distrct;
  }

  public void setDistrct(Integer distrct) {
    this.distrct = distrct;
  }


  public String getAddres() {
    return addres;
  }

  public void setAddres(String addres) {
    this.addres = addres;
  }


  public Integer getWarehouseStatus() {
    return warehouseStatus;
  }

  public void setWarehouseStatus(Integer warehouseStatus) {
    this.warehouseStatus = warehouseStatus;
  }


  public java.time.LocalDateTime getModifiedTime() {
    return modifiedTime;
  }

  public void setModifiedTime(java.time.LocalDateTime modifiedTime) {
    this.modifiedTime = modifiedTime;
  }

}
