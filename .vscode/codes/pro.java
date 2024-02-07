package codes;
import java.util.*;
class Person{
    private String name;
    private int age;
    private String country;

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;

    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
    public void setCountry(String country)
    {
        this.country = country;
    }
   public String getCountry()
  {
    return country;
 }
 public Person(String name,int age,String country)
 {
    this.name = name;
    this.age = age;
    this.country = country;
 }
}


public class pro {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter details");
        
        String name = s.nextLine();
        
        int age = Integer.parseInt(s.nextLine());

        String country = s.nextLine();
        Person c = new Person(name,age,country);
        System.out.println("........");
        System.out.println(c.getName());
        System.out.println(c.getAge());
        System.out.println(c.getCountry());
        
    }
    
}
