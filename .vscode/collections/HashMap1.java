package collections;
import java.util.*;
    public class HashMap1
    {
        public static void main(String[] args) {
            HashMap<Integer,String> h =new HashMap<Integer,String>();
            h.put(1,"ram");
            h.put(2,"siya");
            h.put(3,"radha");
            h.put(3,"rim");
            h.remove(3);
            

            Set h1 = h.keySet();
            Collection h2 = h.values();
            System.out.println(h);
            System.out.println(h1);
            System.out.println(h2);
        }
    }
