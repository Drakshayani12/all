package com.example.user.Controller;

import java.net.URI;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.Exception.UserNotFoundException;
import com.example.user.Service.UserService;
import com.example.user.entity.User;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class UserController {
    @Autowired
    private UserService service;
    
    @GetMapping("/users")
    
        public List<User> retriveAll()
        {
            return service.findAll();
        }
    
    @GetMapping("/users/{id}")
    
        public User retriveUser(@PathVariable int id)
        {
            return service.findOne(id);
        }
        // @PostMapping("/users")
        // public void createUser(@RequestBody User user)
        // {
        //     User sevedUser = service.save(user);
        //     // URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(sevedUser.getId().toUri());
        //     // return ResponseEntity.created(location).build();
        // }
        @PostMapping("/users1")
       public ResponseEntity<Object> createUser(@RequestBody User user)
       {
        User sevedUser = service.save(user);
        // URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(sevedUser.getId()).toUri();
        // return ResponseEntity.created(location).build();
        //return new ResponseEntity<>(sevedUser.getId(),HttpStatus.CREATED);
        return new ResponseEntity<>(HttpStatus.CREATED);
       }

       @DeleteMapping("/users/{id}")
       public void deletUser(@PathVariable int id) throws UserNotFoundException
       {
        User delUser = service.deletUser(id);
        if(delUser == null)
        throw new UserNotFoundException("id:"+id);
       }
        
        
}
    
    


