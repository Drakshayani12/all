package inhertance;
class Person22
{
    int id;
    String name;
    String address;

    public Person22() {
    }
    public Person22(int id,String name,String address)
    {
        this.id = id;
        this.name = name;
        this.address=address;
    }
    public void display(){
        System.out.println("id"+id);
        System.out.println("name"+name);
        System.out.println("address"+address);
    }

}
class employee1 extends Person22{
    
    double salary;
    double bounus;

    public employee1(double salary,double bounus)
    {
        super();
        this.salary = salary;
        this.bounus = bounus;
    }

    
    public employee1(int id, String name, String address, double salary, double bounus) {
        super(id, name, address);
        this.salary = salary;
        this.bounus = bounus;
    }


    public void display1(){
        super.display();
        System.out.println("salary: "+salary);
        System.out.println("bounus: "+bounus);
    }
}
public class Data1 {
    public static void main(String[] args)
    {
     employee1 p = new employee1(1, "ram", "abc", 9000, 9000);
   p.display1();
    }
    
}
