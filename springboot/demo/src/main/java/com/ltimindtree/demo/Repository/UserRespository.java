package com.ltimindtree.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ltimindtree.demo.Entity.User;

public interface UserRespository extends JpaRepository<User,Long>{
    
    public User findByUsername(String username);
}
