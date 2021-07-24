package com.redis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.io.Serializable;

@RedisHash("car")
@Data
@AllArgsConstructor
public class Car{

    private @Id Long id;
    private @Indexed String brand;
    private String model;
    private float engine;

    @Override
    public String toString() {
        return "Car{" + "id='" + id + '\'' + ", brand='" + brand + '\'' + ", model=" + model + ", engine=" + engine + '}';
    }
}
