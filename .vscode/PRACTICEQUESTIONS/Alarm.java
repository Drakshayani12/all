package PRACTICEQUESTIONS;
import java.util.*;
public class Alarm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Alarm System Controller");
        System.out.println("Enter the current state of the alarm(Armed/Disarmed/Triggered):");
        String state = s.nextLine();
        if(state.equalsIgnoreCase("Armed"))
        {
            System.out.println("System Armed. Be cautious!");

        }
        else if(state.equalsIgnoreCase("Disarmed"))
        {
            System.out.println("System Disarmed. No need to worry.");

        }
        else if(state.equalsIgnoreCase("Triggered"))
        {
            System.out.println("Alarm Triggered! Investigate immediately!");
        }
        else {
            System.out.println("Error: Invalid state. Please enter Armed, Disarmed, or Triggered");
        }
        System.out.println("Goodbye!");
    }
}
