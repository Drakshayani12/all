package com.ltimindtree.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltimindtree.demo.Entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post,Long>{
    
}
