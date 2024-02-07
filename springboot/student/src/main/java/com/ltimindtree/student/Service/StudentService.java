package com.ltimindtree.student.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.ReturnedType;
import org.springframework.stereotype.Service;

import com.ltimindtree.student.Entity.StudentEntity;
import com.ltimindtree.student.Respository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository student;
    public StudentEntity getStudentByFirstName(String firstName)
    {
        return student.findByFirstName(firstName);
    }

    public List<StudentEntity> getAllStudents(){
        return student.findAll();
    }
public Optional<StudentEntity> getStudentById(Long id)
{
    return student.findById(id);
}
public StudentEntity saveEntity(StudentEntity stud)
{
    return student.save(stud);
}

public void deleteStudent(Long id)
{
    student.deleteById(id);
}

public Optional<StudentEntity> updateStudent(Long id,StudentEntity updatedStudent)
{
    return student.findById(id).map(stud->
    {
        stud.setFirstName(updatedStudent.getFirstName());
        stud.setLastName(updatedStudent.getLastName());
        stud.setEmail(updatedStudent.getEmail());
        return student.save(stud);
    });
}
}
