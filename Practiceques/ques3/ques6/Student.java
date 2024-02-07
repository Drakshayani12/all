package Practiceques.ques3.ques6;

public class Student {
    private int studentId;
    private String studentName;
    private String course;
    public Student()
    {

    } 
public Student(int studentId, String studentName,String course)
{
    this.course = course;
    this.studentId = studentId;
    this.studentName = studentName;
}
public int getStudentId()
{
    return studentId;
}
public String getStudentName()
{
return studentName;
}
public String getCourse(){
        return course;
}
}
