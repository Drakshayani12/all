package collections.exception;

public class Main9 {
    public static void main(String[] args) {
        int a =1;
        int b= 0;
        try{System.out.println(a/b);}
       // System.out.println(a/b);
       catch(ArithmeticException e){
       e.printStackTrace();
       System.out.println(e.toString());
       System.out.println(e.getMessage());}
    }
    
}
