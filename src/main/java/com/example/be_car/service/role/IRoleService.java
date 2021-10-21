package com.example.be_car.service.role;

import com.example.be_car.model.Role;
import com.example.be_car.service.IGeneric;

import java.util.Optional;

public interface IRoleService extends IGeneric<Role> {
    Optional<Role> findByName(RoleName name);

}
