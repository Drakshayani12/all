interface Addable{
int add(int a , int b);
}
public class LambdaExpression {
    public static void main(String[] args) {
        Addable ad = (a, b) -> (a+b);
        System.out.println(ad.add(5, 6));

    }
}
