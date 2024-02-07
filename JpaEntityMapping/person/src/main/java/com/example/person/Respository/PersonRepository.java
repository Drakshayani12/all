package com.example.person.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.person.Entity.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
    
}
