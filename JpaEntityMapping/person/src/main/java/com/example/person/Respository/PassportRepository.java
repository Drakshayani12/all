package com.example.person.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.person.Entity.Passport;
@Repository
public interface PassportRepository extends JpaRepository<Passport,Long> {
    
}
