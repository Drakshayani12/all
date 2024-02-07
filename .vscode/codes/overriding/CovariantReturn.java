package codes.overriding;
class A{
    A get(){
        return this;
    }

}
class B1 extends A{
    B1 get(){
        return this;
    }
    void message(){
        System.out.println("welcome to covariant");
    }
   public  String toString(){
        return "str";
    }
}
public class CovariantReturn {
    public static void main(String[] args)
    {
        new B1().get().message();
        System.out.println(new B1().get());
    }
    
}
