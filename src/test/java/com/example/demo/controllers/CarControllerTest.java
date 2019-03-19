package com.example.demo.controllers;

import com.example.demo.models.Car;
import com.example.demo.repositories.CarRepository;
import com.google.common.collect.ImmutableList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CarControllerTest {

  @Mock
  private CarRepository carRepository;
  @InjectMocks
  CarController sut;

  @Test
  public void testList() throws Exception {
    Mockito.when(carRepository.findAll()).thenReturn(ImmutableList.of());
    List<Car> list = sut.list();
    Mockito.verify(carRepository.findAll());
  }
}