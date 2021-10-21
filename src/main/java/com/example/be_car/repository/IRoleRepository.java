package com.example.be_car.repository;

import com.example.be_car.model.ERole;
import com.example.be_car.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface IRoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(ERole name);
}
