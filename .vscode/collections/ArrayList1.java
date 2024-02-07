package collections;

import codes.arrCop;
import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        // ArrayList<Integer> arr = new ArrayList<Integer>(5);
        // arr.add(1);
        // arr.add(2);
        // arr.add(3);
        // arr.add(4);
        // arr.add(5);
        // arr.add(3,6);
        ArrayList arr1 = new ArrayList();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);

        ArrayList arr2 = new ArrayList();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        arr2.add(4);
        arr2.add(5);
        arr1.add(arr2);
        //arr1.addAll(arr2);
        System.out.println(arr1);
       // System.out.println(arr2);
//         for(Integer num : arr){
// System.out.println("number: "+num);
//         }
    }
    
}
