package com.cs.yang.passcloudpojo.pojo;


import javax.persistence.*;

@Entity
@Table(name = "Shipping_Info")
public class ShippingInfo implements  java.io.Serializable{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer shipId;
  private String shipName;
  private String shipContact;
  private String telephone;
  private Double price;
  private java.time.LocalDateTime modifiedTime;


  public Integer getShipId() {
    return shipId;
  }

  public void setShipId(Integer shipId) {
    this.shipId = shipId;
  }


  public String getShipName() {
    return shipName;
  }

  public void setShipName(String shipName) {
    this.shipName = shipName;
  }


  public String getShipContact() {
    return shipContact;
  }

  public void setShipContact(String shipContact) {
    this.shipContact = shipContact;
  }


  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }


  public java.time.LocalDateTime getModifiedTime() {
    return modifiedTime;
  }

  public void setModifiedTime(java.time.LocalDateTime modifiedTime) {
    this.modifiedTime = modifiedTime;
  }

}
