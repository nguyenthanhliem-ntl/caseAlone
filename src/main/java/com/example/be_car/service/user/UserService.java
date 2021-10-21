package com.example.be_car.service.user;

import com.example.be_car.model.User;
import com.example.be_car.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService implements IUserService{

    @Autowired
    private IUserRepository userRepository;


    @Override
    public Page<User> findAll() {
        return (Page<User>) userRepository.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void remote(Long id) {
        userRepository.deleteById(id);
    }
}
