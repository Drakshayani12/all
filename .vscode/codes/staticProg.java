package codes;
import java.util.*;
public class staticProg {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter object 1");
        System.out.println("Enter i1");
        int i1 = s.nextInt();
        System.out.println("enter i2");
        int i2 = s.nextInt();
        StaticIiu obj1 = new StaticIiu();
        obj1.setI1(i1);
        obj1.setI2(i2);
        //System.out.println(i1);
        //System.out.println(i2);
        obj1.displayDetails();
        System.out.print("enter again");
         i1 = s.nextInt();
         i2 = s.nextInt();
         StaticIiu obj2 = new StaticIiu();
        obj2.setI1(i1);
        obj2.setI2(i2);
        obj2.displayDetails();
        obj1.displayDetails();

    }
}

class StaticIiu{
    private int i1;
    private static int i2;

    public void setI1(int i1)
    {
        this.i1 = i1;
    }
    public int getI1(){
        return i1;
    }
    public void setI2(int i2){
        this.i2 = i2;
    }
    public int getI2(){
        return i2;
    } 
    void displayDetails(){
        System.out.println("Object 1 Details: i1 =  " +getI1()+"i2 = "+getI2());
    }

}
