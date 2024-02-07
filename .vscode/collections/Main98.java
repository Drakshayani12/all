package collections;

import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main98 {
    public static void main(String[] args) {
        HashMap h = new HashMap();
    h.put(1,"ram");
    h.put(2,"siya");
    h.put(3,5);
    h.put(6,5);

    h.put(8,5);
    System.out.println(h);

    // Map.Entry
    Set sw = h.entrySet();
    Iterator i = sw.iterator();
    while(i.hasNext()){
        Map.Entry m = (Map.Entry)(i.next());
        System.out.println(m);
    } 

    System.out.println(h);
     
    }
   
}
