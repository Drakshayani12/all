package com.ltimindtree.student.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.ltimindtree.student.Entity.StudentEntity;
import com.ltimindtree.student.Service.StudentService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
@RequestMapping("/api/students")
public class StudentController {
    
    @Autowired
    private StudentService studentService;

    
    @GetMapping("/employees")
    public List<StudentEntity> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Optional<StudentEntity> getStudentById(@PathVariable Long id)
    {
        return studentService.getStudentById(id);
    }

    @PostMapping
    public StudentEntity saveStudent(@RequestBody StudentEntity student)
    {
        return studentService.saveEntity(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id)
    {
        studentService.deleteStudent(id);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<StudentEntity> UpdatedStudent(@PathVariable Long id, @RequestBody StudentEntity student)
    {
        Optional<StudentEntity> optionalStudent = studentService.updateStudent(id, student);
        return optionalStudent.map(stu-> new ResponseEntity<>(stu,HttpStatus.OK))
        .orElseGet(()-> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
   
    
}
