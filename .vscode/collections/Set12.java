package collections;
import java.util.*;
public class Set12 {
    public static void main(String[] args) {
        Set h = new HashSet();
        h.addAll(Arrays.asList(new Integer[] {1,2,3,4,5}));
        HashSet h1 = new HashSet();
        h1.addAll(Arrays.asList(new Integer[] {1,8,9,4,5}));
       HashSet u = new HashSet(h);
       u.addAll(h1);
        System.out.println(u);
        HashSet i = new HashSet(h);

        i.retainAll(h1);
        System.out.println(i);

    }
}
