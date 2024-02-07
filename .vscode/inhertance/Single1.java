package inhertance;

import codes.progr;

//import codes.progr;
class Emp1 {
    float salary;
    public Emp1(){
        System.out.println("in emp1 constructor");
    }
    public Emp1(int salary){
        System.out.println("in parent parameter constructor");
        this.salary = salary;
    }
    public  void display()
    {
        System.out.println("display in parent class");
    }

}

class programmer extends Emp1 {
    int bonus = 15000;

    public programmer()
    {
        System.out.println("in child constructor");
    }
    public programmer(int salary, int bonus)
    {
        super(salary);
        System.out.println("in child parameter constructor   ");
        System.out.println(bonus);
        this.bonus = bonus;
    }

    public void display(){
        
        super.display();
        System.out.println("display in child classs");
    }
}


public class Single1 {
    public static void main(String[] args) {
        programmer p = new programmer(34,34);
        System.out.println("salary" + p.salary);
        System.out.println("bonus:" + p.bonus);
        p.display();
        
    }
}
