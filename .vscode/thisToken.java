import java.util.*;
public class thisToken {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter details");
        int rollno = Integer.parseInt(s.nextLine());
        String name = s.nextLine();
        float fee = Float.parseFloat(s.nextLine());
        Student c = new Student(rollno, name, fee);
        System.out.println("........");
        System.out.print(c.getRollno());
        System.out.println(c.getName());
        System.out.println(c.getFee());
    }
}

class Student{
    int rollno;
    String name;
    float fee;

public Student(int rollno,String name, float fee)
{
    this.rollno = rollno;
    this.name = name;
    this.fee = fee;
}
public int getRollno(){
    return rollno;
}
public String getName(){
    return name;
}
public float getFee(){
    return fee;
}

}
