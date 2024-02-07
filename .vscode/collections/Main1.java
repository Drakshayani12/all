package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main1 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println(arr);
        ListIterator iterator = arr.listIterator(arr.size());
        System.out.println("using listIterator");
        // while(iterator.hasNext()){
        //     System.out.println("value is "+iterator.next());
        // }
        while(iterator.hasPrevious()){
            System.out.println("reverse "+iterator.previous());
        }
    }
}
