package com.example.be_car.repository;

import com.example.be_car.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {
    Optional<User> findByNameUser(String name);
    Boolean existsByUsername(String name);
    Boolean existsByEmail(String email);
}
