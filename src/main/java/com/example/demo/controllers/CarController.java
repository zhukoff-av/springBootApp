package com.example.demo.controllers;

import com.example.demo.models.Car;
import com.example.demo.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/models")
public class CarController {

  @Autowired
  private CarRepository carRepository;

  @GetMapping
  public List<Car> list() {
    return carRepository.findAll();
  }

  @PostMapping
  @ResponseStatus(HttpStatus.OK)
  public void create(@RequestBody Car car) {
    carRepository.save(car);
  }

  @GetMapping("/{id}")
  public Car get(@PathVariable("id") long id) {
    return carRepository.getOne(id);
  }

}
