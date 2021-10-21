package com.example.be_car.service.car;

import com.example.be_car.model.Car;
import com.example.be_car.model.Comment;
import com.example.be_car.repository.ICarRepository;
import com.example.be_car.repository.ICommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import java.util.Optional;

public class CarService implements ICarService{
    @Autowired
    private ICarRepository carRepository;


    @Override
    public Page<Car> findAll() {
        return (Page<Car>) carRepository.findAll();
    }

    @Override
    public Optional<Car> findById(Long id) {
        return carRepository.findById(id);
    }

    @Override
    public void save(Car car) {
        carRepository.save(car);
    }

    @Override
    public void remote(Long id) {
        carRepository.deleteById(id);
    }
}
