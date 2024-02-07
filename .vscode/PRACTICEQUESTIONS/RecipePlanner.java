package PRACTICEQUESTIONS;

import java.util.Scanner;

public class RecipePlanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("What is the name of the dish you want to prepare?");
        //System.out.println("Recipe Details:");
        String name = s.nextLine();
        //System.out.println("Dish Name: "+name);
        System.out.println("How many servings do you want to make"); 
        int i = s.nextInt();
        s.nextLine();
        //System.out.println("Servings: "+i);
        System.out.println("What are the main ingredients for the dish ?");
        String ingre = s.nextLine();
        //System.out.println("Main Ingredients:"+ingre);
        System.out.println("Do you have any dietary restrictions or prefences?");
        String dietary = s.nextLine();
       // System.out.println("Dietary Preference:"+dietary);
        System.out.println("What is the estimated cooking time for the dish (in minutes)?");
        int time = s.nextInt();
       // System.out.println("Cooking Time: "+time+" minutes");
        System.out.println("Recipe Details:");
        System.out.println("Dish Name: "+name);
        System.out.println("Servings: "+i);
        System.out.println("Main Ingredients:"+ingre);
        System.out.println("Dietary Preference:"+dietary);
        System.out.println("Cooking Time: "+time+" minutes");
        System.out.println("Happy Cooking!");


    }
}
