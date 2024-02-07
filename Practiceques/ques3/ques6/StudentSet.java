package Practiceques.ques3.ques6;
import java.util.HashSet;
import java.util.Set;
 
public class StudentSet {
   
    public Set<Student> set = new HashSet<Student>();
 
    public void addStudent(Student student){
 
        //implement the method to add student in the set
       set.add(student);
 
    }
 
    public void addStudent(int studentId, String studentName, String course){
       
        //implement the method to add student in the set
             set.add(new Student(studentId,studentName,course)) ;
 
    }
 
    public void removeStudent(int studentId) {
       
        //  implement the method to remove a student
        Student m = null;
        for(Student n : set)
        {
            if(n.getStudentId()==(studentId))
            {
                m =n;
            }
        }
        set.remove(m);
    }
 
    public void removeStudent(Student student) {
       set.remove(student);
    }
}
//if()
