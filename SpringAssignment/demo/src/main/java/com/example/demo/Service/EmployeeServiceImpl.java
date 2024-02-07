package com.example.demo.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Employee.Employee;
import com.example.demo.Exception.EmployeeNotFound;

@Service

public class EmployeeServiceImpl implements EmployeeService{
    private static ArrayList<Employee> list = new ArrayList<>();

    static
    {
        list.add(new Employee(1,"ram","siya","abc",1000));
        list.add(new Employee(2,"rim","kim","ab",2000));
       // list.add(new Employee());
        
    }
    @Override
    public List<Employee> findAll() {
        return list;
    }

    @Override
    public Employee findOne(int id){
       for(Employee e : list)
       {
        if(e.getEmployeeId()==id)
        {
            return e;
        }  
       }
        return null;
    }
    
}
