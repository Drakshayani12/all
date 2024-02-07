package com.example.bidirectional.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bidirectional.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    
}
