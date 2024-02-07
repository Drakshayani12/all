package com.example.employee1.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee1.entity.Employee;
import com.example.employee1.respo.EmployeeRespository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRespository empRepo;

    public List<Employee> getAllStudents()
    {
        return empRepo.findAll();
    }

    public Optional<Employee> getStudentById(Long id)
    {
        return empRepo.findById(id);
    }
    public Employee saveEntity(Employee emp)
   {
    return empRepo.save(emp);
   }
   public void deleteStudent(Long id)
{
    empRepo.deleteById(id);
}
public Optional<Employee> updateStudent(Long id,Employee updatedStudent)
{
    return empRepo.findById(id).map(emp->
    {
        emp.setFirstName(updatedStudent.getFirstName());
        emp.setLastName(updatedStudent.getLastName());
        emp.setEmail(updatedStudent.getEmail());
        return empRepo.save(emp);
    });
}
}
