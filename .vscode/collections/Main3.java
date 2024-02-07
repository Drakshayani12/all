package collections;

import java.util.LinkedList;

public class Main3 {
    public static void main(String[] args){
        LinkedList l = new LinkedList();
        l.add("ram");
        l.add(10);
        l.add("siya");
        l.add("3");
        System.out.println(l);
        l.removeLast();
        System.out.println(l);
        System.out.println(l.getLast());
        l.addFirst("1");
        System.out.println(l);
        
    }
}
