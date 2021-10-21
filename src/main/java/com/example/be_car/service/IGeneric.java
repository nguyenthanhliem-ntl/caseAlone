package com.example.be_car.service;

import org.springframework.data.domain.Page;

import java.util.Optional;

public interface IGeneric<T> {
    Page<T> findAll();

    Optional<T> findById(Long id);

    void save(T t);

    void remote(Long id);
}
