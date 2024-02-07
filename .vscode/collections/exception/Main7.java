package collections.exception;
class InSuffBalException extends Exception
{
    
    InSuffBalException(String str)
    {
        super(str);
    }
}
// class Account {
//       int accno[] ={100,101,102,103};
//       String name[] = {"ram","siya","priya","prem"};
//       double bal[] = {11000.0,2100.22,334.21,12.21};
// }

public class Main7 {
    public static void main(String[] args) {
        
            int accno[] ={100,101,102,103};
            String name[] = {"ram","siya","priya","prem"};
            double bal[] = {11000.0,2100.22,334.21,12.21};
      
        try{
            System.out.println("account "+  "\t"+"customer" + "\t"+ "Balance");
            for(int i = 0;i<5;i++)
            {
                System.out.println(accno[i]+ "\t" + name[i] + "\t" + bal[i]);
                if (bal[i] < 1000){
                    InSuffBalException me = new InSuffBalException("balance is less than 1000");
                    throw me;
                }
            }
        }
        catch(InSuffBalException e) {
            System.out.println(e);
        }
    }
}
