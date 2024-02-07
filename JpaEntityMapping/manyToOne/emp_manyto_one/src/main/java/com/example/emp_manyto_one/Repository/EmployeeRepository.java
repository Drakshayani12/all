package com.example.emp_manyto_one.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.emp_manyto_one.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository <Employee,Long> {
    
}
