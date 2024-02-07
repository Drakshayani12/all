package com.example.book1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.book1.entity.Book;

import jakarta.persistence.Entity;


public interface BookRepository extends JpaRepository <Book,Long>{
     


}
