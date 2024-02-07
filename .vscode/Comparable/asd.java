import java.io.*;
import java.util.*;
import java.lang.Math;

class Employee implements Comparable<Employee>{
    int empId;
    String empName;
    double empBasicSalary;

public double calculateNetSalary(){
    double temp = empBasicSalary+empBasicSalary*12;
    return temp;
}

public 
public int compareTo(Employee e)
{
    return this.e.getName - e.getName;
}


public void display()
{
    System.out.println(empId);
    System.out.println(empName);
    System.out.println(empBasicSalary);
    
}
}
class InvalidAgeException extends Exception{
    public InvalidAgeException(String s)
    {
        super(s);
    }
}
class InvalidSalaryException extends Exception{
    public InvalidSalaryException(String str);
    {
        super(str);
    }
}
public class Solution {
   

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0;i<n;i++);
        {
            int empId = scan.nextInt();
            String empName = scan.next();
            int age = scan.Int();
            double empBasicSalary = scan.nextDouble();
        }
      try {
          if(age<18)
          {
             InvalidAgeException m = new InvalidAgeException("Not eligible for Vote");
             throw m; 
          }
          if(empBasicSalary<10000 && age<18)
          {
              InvalidSalaryException u = new InvalidSalaryException("Basic Salary not in standard") ;
              throw u;
          }
          //catch()
      }
      Employee e = new Employee(empId,empName,empBasicSalary);
      e.display();
      System.out.println(e.calculateNetSalary());
    
    }
}