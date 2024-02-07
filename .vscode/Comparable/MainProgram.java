package Comparable;
import java.lang.*;
import java.util.*;
class Movie implements Comparable<Movie>
{
    private double rating;
    private String name;
    private int year;

    public int compareTo(Movie m)
    {
        return this.year -m.year;
    }
    public Movie(String name,double rating,int year)
    {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }
    public double getRating(){
        return rating;
    }
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }
}

public class MainProgram {
    public static void main(String[] args) {
        //Scanner s = new Scanner(System.in);
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("force",7,2092));
        list.add(new Movie("name",9,2012));
        list.add(new Movie("star wars",5,2042));
        list.add(new Movie("return of jedi",7.7,2032));
        System.out.println("\nsorted by year");
        Collections.sort(list);
        for(Movie m : list){
            System.out.println(m.getYear()+" "+m.getRating()+" "+m.getName());
        }
    }
}
