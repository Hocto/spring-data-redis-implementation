package com.redis.controller;

import com.redis.entity.Car;
import com.redis.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
public class CarRestController {

    @Autowired
    private CarService carService;

    @RequestMapping(value="/car", method = RequestMethod.POST)
    public ResponseEntity<String> addCar(@RequestBody Car car){
        carService.addCar(car);
        return new ResponseEntity<>(("Added"), new HttpHeaders(), HttpStatus.OK);
    }

    @RequestMapping(value="/car", method = RequestMethod.GET)
    public ResponseEntity<List<Car>> findAll(){
        List<Car> car = carService.findAll();
        return new ResponseEntity<>((car), new HttpHeaders(), HttpStatus.OK);
    }

    @RequestMapping(value="/car/id/{id}", method = RequestMethod.GET)
    public ResponseEntity<Car> findCar(@PathVariable(value = "id") Long id){
        Car car = carService.findCar(id);
        return new ResponseEntity<>((car), new HttpHeaders(), HttpStatus.OK);
    }

    @RequestMapping(value="/car/brand/{brand}", method = RequestMethod.GET)
    public ResponseEntity<List<Car>> findCarByBrand(@PathVariable(value = "brand") String brand){
        List<Car> carList = carService.findCarsByBrand(brand);
        return new ResponseEntity<>((carList), new HttpHeaders(), HttpStatus.OK);
    }
}
