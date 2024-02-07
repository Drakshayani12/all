package com.example.user.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.user.entity.User;

 public interface UserService{
    public List<User> findAll();
    public User save(User u);
    public User findOne(int id);
    public User deletUser(int id);
}
