package com.example.employee1.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee1.Service.EmployeeService;
import com.example.employee1.entity.Employee;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    
    public List<Employee> getAllStudents(){
        return employeeService.getAllStudents();
    }
    @GetMapping("/employees/{id}")
    public Optional<Employee> getStudentById(@PathVariable Long id)
    {
        return employeeService.getStudentById(id);
    }

    @PostMapping("/employees")
    public Employee saveStudent(@RequestBody Employee student)
    {
        return employeeService.saveEntity(student);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteStudent(@PathVariable Long id)
    {
        employeeService.deleteStudent(id);
    }
    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> UpdatedStudent(@PathVariable Long id, @RequestBody Employee emp)
    {
        Optional<Employee> optional = employeeService.updateStudent(id, emp);
        return optional.map(stu-> new ResponseEntity<>(stu,HttpStatus.OK))
        .orElseGet(()-> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
