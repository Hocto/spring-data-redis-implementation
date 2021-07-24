package com.redis.service;

import com.redis.entity.Car;
import com.redis.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Locale;

@Component
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private RedisMessagePublisher redisMessagePublisher;

    @Override
    public void addCar(Car car) {
        carRepository.save(new Car(car.getId(), car.getBrand().toUpperCase(Locale.ROOT), car.getModel(), car.getEngine()));
    }

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public Car findCar(Long id) {
        return carRepository.findById(id).orElse(null);
    }

    @Override
    public List<Car> findCarsByBrand(String brand) {
        return carRepository.findByBrand(brand.toUpperCase(Locale.ROOT));
    }
}
