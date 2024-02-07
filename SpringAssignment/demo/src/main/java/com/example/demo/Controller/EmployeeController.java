package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.*;
import com.example.demo.Employee.Employee;
import com.example.demo.Service.EmployeeService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService emp;
@GetMapping("/emp")


    public List<Employee> retriveAll(){
        return emp.findAll();
    }
@PostMapping("/emp/{id}")


    public Employee retriveUser(@PathVariable int id)
    {
        return emp.findOne(id);
    }
}
