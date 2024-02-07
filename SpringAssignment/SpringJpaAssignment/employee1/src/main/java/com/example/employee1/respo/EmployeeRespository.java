package com.example.employee1.respo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee1.entity.Employee;

public interface EmployeeRespository extends JpaRepository<Employee,Long> {
    
}
