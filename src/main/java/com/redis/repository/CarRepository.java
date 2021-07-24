package com.redis.repository;

import com.redis.entity.Car;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarRepository extends BaseRepository<Car, Long> {
    Optional<Car> findById(@Param("id") Long id);
    List<Car> findByBrand(@Param("name") String query);
}
