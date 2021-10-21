package com.example.be_car.repository;

import com.example.be_car.model.ERole;
import com.example.be_car.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IRoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByRole(ERole name);
}
