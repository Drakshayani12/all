package codes;

class Arithmetic {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class progr {
    public static void main(String args[]) {
        System.out.println(Arithmetic.add(2, 3));
        System.out.println(Arithmetic.add(3, 1, 2));
    }

}
