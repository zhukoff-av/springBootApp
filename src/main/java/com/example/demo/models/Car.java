package com.example.demo.models;

import java.math.BigDecimal;
import java.util.Date;

public class Car {

  private String name;
  private String email;
  private String phone;
  private String model;
  private String serialNumber;
  private BigDecimal purchasedPrice;
  private Date purchasedDate;
  private boolean contact;

  public boolean getContact() {
    return contact;
  }

  public void setContact(boolean contact) {
    this.contact = contact;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public BigDecimal getPurchasedPrice() {
    return purchasedPrice;
  }

  public void setPurchasedPrice(BigDecimal purchasedPrice) {
    this.purchasedPrice = purchasedPrice;
  }

  public Date getPurchasedDate() {
    return purchasedDate;
  }

  public void setPurchasedDate(Date purchasedDate) {
    this.purchasedDate = purchasedDate;
  }
}
