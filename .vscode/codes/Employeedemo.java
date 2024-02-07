package codes;
class Person1{
    String name;
    float Salary;
    int empid;

    public float CalcBounus(float days, float Salary)
    {
        return days*Salary;
    }
    public double CalcBounus(double days,double Salary)
    {
        return days+Salary;
    }
}

public class Employeedemo {
    public static void main(String[] args) {
        Person1 p = new Person1();
        System.out.println( p.CalcBounus(12.00f, 56.0f));
 //p.CalcBounus(12.00f, 56.0f);
 System.out.println(p.CalcBounus(10, 43.7));
        //p.CalcBounus(10, 43.7);

    }
    
}
