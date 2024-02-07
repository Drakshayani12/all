package com.ltimindtree.demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ltimindtree.demo.Entity.User;
import com.ltimindtree.demo.Service.UserService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User registerUser(@RequestBody User user)
    {
        return userService.registerUser(user);
    }
    @GetMapping("/user/{username}")
    public User getByUsername(@PathVariable String username)
    {
        return userService.getByUsername(username);
    }
    @PutMapping("/user/{id}")
    public Optional<User> updateStudent(@PathVariable Long id,@RequestBody User user)
    {
       return userService.updateStudent(id, user);
       
    }
}
