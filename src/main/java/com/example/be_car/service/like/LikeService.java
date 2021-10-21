package com.example.be_car.service.like;

import com.example.be_car.model.Like;
import com.example.be_car.repository.ILikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import java.util.Optional;

public class LikeService implements ILikeService{

    @Autowired
    private ILikeRepository likeRepository;


    @Override
    public Page<Like> findAll() {
        return (Page<Like>) likeRepository.findAll();
    }

    @Override
    public Optional<Like> findById(Long id) {
        return likeRepository.findById(id);
    }

    @Override
    public void save(Like like) {
        likeRepository.save(like);
    }

    @Override
    public void remote(Long id) {
        likeRepository.deleteById(id);
    }
}
