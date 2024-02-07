package com.ltimindtree.student.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ltimindtree.student.Entity.StudentEntity;
import java.util.List;


public interface StudentRepository extends JpaRepository<StudentEntity,Long> {
    
    public StudentEntity findByFirstName(String firstName);

    @Query("select u FROM StudentEntity u")
    public List<StudentEntity> getAllUser();
}
