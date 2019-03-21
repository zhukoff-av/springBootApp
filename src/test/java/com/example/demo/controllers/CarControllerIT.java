package com.example.demo.controllers;

import com.example.demo.models.Car;
import com.google.common.collect.ImmutableList;
import org.hibernate.dialect.SQLiteDialect;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;
import org.sqlite.SQLiteDataSource;

import java.util.List;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest

public class CarControllerIT {
  RestTemplate restTemplate = new RestTemplate();

  @Test
  public void testGetListOfProviders() throws Exception {
    ResponseEntity<List<Car>> responseEntity =
            restTemplate.exchange("http://localhost:8080/api/v1/models", HttpMethod.GET, null,
                    new ParameterizedTypeReference<List<Car>>() {
                    });
    List<Car> actualList = responseEntity.getBody();
    //validate
    assertThat(actualList.size(), is(2));
    List<String> actualIds = actualList.stream()
            .map(car -> car.getId())
            .collect(collectingAndThen(toList(), ImmutableList::copyOf));

    assertThat(actualIds, containsInAnyOrder("9", "10"));
  }
}
