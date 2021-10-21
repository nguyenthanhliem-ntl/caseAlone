package com.example.be_car.service.user;

import com.example.be_car.model.User;
import com.example.be_car.service.IGeneric;

import java.util.Optional;

public interface IUserService extends IGeneric<User> {
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}
