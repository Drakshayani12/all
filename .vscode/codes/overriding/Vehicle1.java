package codes.overriding;
class Motor{
    void run(){
        System.out.println("motor cycle ");
    }
}
class Bicycle extends Motor{
    void run()
    {
        System.out.println("bicycle is running safely");
    }
}
public class Vehicle1 {
    public static void main(String[] args){
        Bicycle b = new Bicycle();
        b.run();
    }
}
