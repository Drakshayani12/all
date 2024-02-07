package PRACTICEQUESTIONS;
import java.util.*;
class Student12
{
     int stuId;
     String studentName;
     String course;

     public Student12(int stuId,String studentName,String course)
     {
        this.stuId = stuId;
        this.course= course;
        this.studentName = studentName;
     }
     public String toString()
     {
        return "Student{studentID=" +stuId+ "name='" +studentName+ "',course= " +course+ " }";
     }
}

public class SetClas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Set<Student12> arr = new HashSet<Student12>();
        // int id = s.nextInt();
        // s.nextLine();
        // String name = s.nextLine();
        // String course = s.nextLine();
        arr.add(new Student12(1001,"johndoe","computer"));
         arr.add(new Student12(1002,"Jane Smith", "Biology"));
         arr.add(new Student12(1003,"boh john" ,"computer" ));
        
        //arr.add(m);
        //System.out.println(arr);
        for(Student12 o : arr)
        {System.out.println(o);}
        System.out.println("After removing");
//arr.remove();
Iterator i = arr.iterator();

     if(i.next().equals("jane Smith"))
     i.remove();

for(Student12 o : arr)
{
System.out.println(o);}
       // Iterator i = arr.iterator();
        // if(i.hasNext())

    }
}
