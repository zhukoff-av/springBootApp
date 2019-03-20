package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Car {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private String id;

  private String name;
  private String email;
  private String phone;
  private String model;
  private String serial_number;
  private BigDecimal purchase_price;

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
  private Date purchase_date;
  private boolean contact;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

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

  public String getSerial_number() {
    return serial_number;
  }

  public void setSerial_number(String serial_number) {
    this.serial_number = serial_number;
  }

  public BigDecimal getPurchase_price() {
    return purchase_price;
  }

  public void setPurchase_price(BigDecimal purchase_price) {
    this.purchase_price = purchase_price;
  }

  public Date getPurchase_date() {
    return purchase_date;
  }

  public void setPurchase_date(Date purchase_date) {
    this.purchase_date = purchase_date;
  }
}
