package codes.Abstract;
public interface  Bank{
     int getRateOfInterest();
}
class SBI implements Bank{
   public  int getRateOfInterest()
    {
        return 7;
    }
}
class PNB implements Bank{
    public int getRateOfInterest(){
        return 8;
    }
    
}

class Interface1 {
    public static void main(String[] args) {
        Bank b;
        b= new SBI();
        System.out.println("rate of intrest"+b.getRateOfInterest()+" %");
        b=new PNB();
        System.out.println("rate of intrest "+b.getRateOfInterest()+" %");
    }
}



