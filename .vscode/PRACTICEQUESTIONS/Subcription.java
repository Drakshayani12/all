package PRACTICEQUESTIONS;

import java.util.Scanner;

public class Subcription
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n == 0)
        {
            System.out.println("your fitness subcription has ended");

        }
        else if (n > 0 && n<5){
            System.out.println("Your fitness subscription is about to end");
        }
        else if(n>5)
        {
            System.out.println("your fitness subscription is active");

        }
        else {
        System.out.println("Invalid input. Please enter a number between 0 and 30");
        }
    }
}