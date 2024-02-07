package PRACTICEQUESTIONS;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Grade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int score = s.nextInt();
        if(score> 90 && score <100)
        {
            System.out.println("A");
        }
        else if (score > 80 && score < 90)
        {
            System.out.println("B");
        }
        else if(score > 70 && score < 80)
        {System.out.println("C");}
        else if(score > 60 && score < 70 )
        {
            System.out.println("D");
        }
        else {System.out.println("F");}

        int c = s.nextInt();
        switch(c){
            case 1:
            
        }

    }
}
