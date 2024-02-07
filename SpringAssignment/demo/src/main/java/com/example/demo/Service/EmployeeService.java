package com.example.demo.Service;

import java.util.List;

import com.example.demo.Employee.Employee;

public interface EmployeeService {
    public List<Employee> findAll();
    //public Employee save(Employee u);
    public Employee findOne(int id);
    
}
