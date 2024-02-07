package com.ltimindtree.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ltimindtree.demo.Entity.User;
import com.ltimindtree.demo.Repository.UserRespository;

@Service
public class UserService {
    @Autowired
    private UserRespository userRespository;

    
    public User registerUser(User user)
    {
        return userRespository.save(user);
    }
  
    public User getByUsername(String username)
    {
        return userRespository.findByUsername(username);
    }

    public Optional<User> updateStudent(Long id,User user)
    {
        return userRespository.findById(id).map(u->
        {
            u.setId(user.getId());
            u.setUsername(user.getUsername());
            u.setPassword(user.getPassword());
            return userRespository.save(u);
        });
    }
}
