package com.example.demo.controllers;

import com.example.demo.models.Car;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/models")
public class CarController {
  @GetMapping
  public List<Car> list() {
    List<Car> cars = new ArrayList<>();
    return cars;
  }

  @PostMapping
  @ResponseStatus(HttpStatus.OK)
  public void create(@RequestBody Car car) {

  }

  @GetMapping("/{id}")
  public Car get(@PathVariable("id") long id) {
    return new Car();
  }

}
