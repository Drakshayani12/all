package inhertance;
class Animal{
    void bark(){
        System.out.println("barking=======");
    }
}
class Dog extends Animal{
    void eat()
    {
        System.out.println("eating......");
    }}
class BabyDog extends Dog{
    void sleep(){
        System.out.println("sleeping");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("meow.........");
    }
}

public class Multi {
    public static void main(String[] args)
    {
        //BabyDog d = new BabyDog();
        //d.bark();
        //d.sleep();
       // d.eat();
        Cat c = new Cat();
        c.meow();
    }
}
