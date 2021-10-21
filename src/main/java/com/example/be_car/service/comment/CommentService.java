package com.example.be_car.service.comment;

import com.example.be_car.model.Comment;
import com.example.be_car.model.Like;
import com.example.be_car.repository.ICommentRepository;
import com.example.be_car.repository.ILikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import java.util.Optional;

public class CommentService implements ICommentService{
    @Autowired
    private ICommentRepository commentRepository;


    @Override
    public Page<Comment> findAll() {
        return (Page<Comment>) commentRepository.findAll();
    }

    @Override
    public Optional<Comment> findById(Long id) {
        return commentRepository.findById(id);
    }

    @Override
    public void save(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public void remote(Long id) {
        commentRepository.deleteById(id);
    }
}
