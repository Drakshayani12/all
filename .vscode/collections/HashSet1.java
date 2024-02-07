package collections;
import java.util.*;
import java.security.Policy;

public class HashSet1{
    public static void main(String[] args) {
        Set hs = new HashSet();
        hs.add("java");
        hs.add("python");
        hs.add("julia");
        hs.add("c");
        hs.addAll(Arrays.asList(new Integer[] {1,2,3,4,5}));
        System.out.println(hs);
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(3);
        a.add(1);
        a.add(3);
        System.out.println(a);
        HashSet<Integer> s = new HashSet<Integer>(a);

        System.out.println(s);
    }
}