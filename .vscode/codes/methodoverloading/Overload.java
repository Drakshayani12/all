package codes.methodoverloading;
class Over1
{
    void sum(int a ,int b)
    {
        System.out.println("int arg method invoked");
        System.out.println(a+b);
    }
    void sum(long a, long b){
        System.out.print("long arg method invoked");
        System.out.println(a+b);
    }
}
public class Overload {
    public static void main(String[] args)
    {
Over1 s = new Over1();
    s.sum(1l,2);
    }
    
}
