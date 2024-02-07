package collections.exception;

public class Main8 {
    public static void main(String[] args) {
        int []arr = new int[4];
        try{
            int i =arr[4];
        
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println(e);
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        }
    }
}
