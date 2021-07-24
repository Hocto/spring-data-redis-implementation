package com.redis.service;

import com.redis.entity.Car;

import java.util.List;

public interface CarService {
    void addCar(Car car);
    Car findCar(Long id);
    List<Car> findAll();
    List<Car> findCarsByBrand(String brand);
}
