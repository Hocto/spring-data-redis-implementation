package com.redis.repository;

import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.List;

interface BaseRepository<T, ID extends Serializable> extends Repository<T, ID> {
    T save(T entity);
    List<T> findAll();
}