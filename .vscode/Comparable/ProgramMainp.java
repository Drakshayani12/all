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
        return this.year - m.year;
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
class RatingCompare implements Comparator<Movie>
{
    public int compare(Movie m1,Movie m2)
    {
        //asc
        if(m1.getRating() < m2.getRating())
           return -1;
        if(m1.getRating() > m2.getRating())
           return 1;
        else
          return 0;
    }
}
    class NameCompare implements Comparator<Movie>
    {
    public int compare(Movie m1, Movie m2)
    {
        return m1.getName().compareTo(m2.getName());
    }
    }
public class ProgramMainp {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("force",7,2092));
        list.add(new Movie("name",9,2012));
        list.add(new Movie("star wars",5,2042));
        list.add(new Movie("return of jedi",7.7,2032));
        System.out.println("\nsorted by rating");
        RatingCompare r = new RatingCompare();
        
        Collections.sort(list,r);
        for(Movie m : list){
            System.out.println(m.getYear()+" "+m.getRating()+" "+m.getName());
        }
    }
}
