package collections;
import java.util.*;
class Man
{
    String name;
    int rollNo;
    String address;

    public Man(String name,int rollNo,String address)
    {
        this.name = name;
        this.rollNo = rollNo;
        this.address = address;
    }


}
public class Main4 {
    public static void main(String[] args) {
        ArrayList<Man> arr = new ArrayList<Man>();
       Scanner s = new Scanner(System.in);
       //int n = s.nextInt();
       String name = s.next();
       int rollNo = s.nextInt();
       String address = s.next();

        Man m = new Man(name,rollNo,address);
        arr.add(m);
        //    arr.add(new Man(name,rollNo,address));
        for(Man n : arr){
            System.out.println(n.name + " "+ n.rollNo + " " + n.address);
        }
        //System.out.println(arr);
    }
}
