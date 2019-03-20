package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Data

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
}
