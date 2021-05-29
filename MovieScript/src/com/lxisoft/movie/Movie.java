package com.lxisoft.movie;

import java.util.*;
import com.lxisoft.cast.*;
import com.lxisoft.scripts.*;


public class Movie
{

Scanner sc=new Scanner(System.in);

Actors actors=new Actors();
Cast casting =new Cast();
Script scripting=new Script();
Genre g=new Genre();
Rating rating=new Rating();
Characters characters=new Characters();

String movieName;
int gtype;

public void begin()
{
System.out.println("-------------: Enter the name of the movie :------------");
movieName=sc.next();	

System.out.println("\r\n");
System.out.println("\r\n");
System.out.println("\r\n");
	            
				try{
					Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }
					
characters.setHero();
characters.setHeroine();
characters.setComedian();
characters.printCharacters();

              try{
					Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }

System.out.println("Enter the Movie Genre you want-----");
	System.out.println("1.Romantic");
	System.out.println("2.Emotional");
	System.out.println("3.Comedy");
gtype=sc.nextInt();

System.out.println("\r\n");
System.out.println("\r\n");
System.out.println("\r\n");


switch(gtype)
            {
                 case 1 : 
                                                       g.setMovieGenre("Romantic");				  
				                    System.out.println(movieName+" is a movie of "+g.getMovieGenre()+" genre");
									
									System.out.println("\r\n");
									System.out.println("\r\n");
									System.out.println("\r\n");
									
				                                      rating.setRating(7.2f);
									  System.out.println(movieName+" has an IMDB rating of "+rating.getRating());
				               
							   System.out.println("\r\n");
							   System.out.println("\r\n");
							   System.out.println("\r\n");
							   
							   
							   
							   scripting.selectScript(gtype);
							   
							   break;
				 case 2 : 
				                                                                                 g.setMovieGenre("Emotional");				  
				                    System.out.println(movieName+" is a movie of "+g.getMovieGenre()+" genre");
				                                      
													  System.out.println("\r\n");
													  System.out.println("\r\n");
													  System.out.println("\r\n");
													  
													  
													  rating.setRating(6.7f);
									  System.out.println(movieName+" has an IMDB rating of "+rating.getRating());
				               
							   System.out.println("\r\n");
							   System.out.println("\r\n");
							   System.out.println("\r\n");
							   
							   
							   scripting.selectScript(gtype);
							   
							   break;
				 case 3 : 
				                                                                              g.setMovieGenre("Comedy");				  
				                    System.out.println(movieName+" is a movie of "+g.getMovieGenre()+" genre");
				                                     
                                 System.out.println("\r\n");
								 System.out.println("\r\n");
								 System.out.println("\r\n");
								 
								 
													 rating.setRating(8.5f);
									  System.out.println(movieName+" has an IMDB rating of "+rating.getRating());
				     	      
							  System.out.println("\r\n");
							  System.out.println("\r\n");
							  System.out.println("\r\n");
							  
							  scripting.selectScript(gtype);
							   
							   
							   break;

	
            }

}


}












// A Java program to demonstrate use of Comparable
import java.io.*;
import java.util.*;
 
// A class 'Movie' that implements Comparable
class Movie implements Comparable<Movie>
{
    private double rating;
    private String name;
    private int year;
 
    // Used to sort movies by year
    public int compareTo(Movie m)
    {
        return this.year - m.year;
    }
 
    // Constructor
    public Movie(String nm, double rt, int yr)
    {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }
 
    // Getter methods for accessing private data
    public double getRating() { return rating; }
    public String getName()   {  return name; }
    public int getYear()      {  return year;  }
}
 
// Driver class
class Main
{
    public static void main(String[] args)
    {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));
 
        Collections.sort(list);
 
        System.out.println("Movies after sorting : ");
        for (Movie movie: list)
        {
            System.out.println(movie.getName() + " " +
                               movie.getRating() + " " +
                               movie.getYear());
        }
    }
}






//A Java program to demonstrate Comparator interface
import java.io.*;
import java.util.*;
 
// A class 'Movie' that implements Comparable
class Movie implements Comparable<Movie>
{
    private double rating;
    private String name;
    private int year;
 
    // Used to sort movies by year
    public int compareTo(Movie m)
    {
        return this.year - m.year;
    }
 
    // Constructor
    public Movie(String nm, double rt, int yr)
    {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }
 
    // Getter methods for accessing private data
    public double getRating() { return rating; }
    public String getName()   {  return name; }
    public int getYear()      {  return year;  }
}
 
// Class to compare Movies by ratings
class RatingCompare implements Comparator<Movie>
{
    public int compare(Movie m1, Movie m2)
    {
        if (m1.getRating() < m2.getRating()) return -1;
        if (m1.getRating() > m2.getRating()) return 1;
        else return 0;
    }
}
 
// Class to compare Movies by name
class NameCompare implements Comparator<Movie>
{
    public int compare(Movie m1, Movie m2)
    {
        return m1.getName().compareTo(m2.getName());
    }
}
 
// Driver class
class Main
{
    public static void main(String[] args)
    {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));
 
        // Sort by rating : (1) Create an object of ratingCompare
        //                  (2) Call Collections.sort
        //                  (3) Print Sorted list
        System.out.println("Sorted by rating");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        for (Movie movie: list)
            System.out.println(movie.getRating() + " " +
                               movie.getName() + " " +
                               movie.getYear());
 
 
        // Call overloaded sort method with RatingCompare
        // (Same three steps as above)
        System.out.println("\nSorted by name");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        for (Movie movie: list)
            System.out.println(movie.getName() + " " +
                               movie.getRating() + " " +
                               movie.getYear());
 
        // Uses Comparable to sort by year
        System.out.println("\nSorted by year");
        Collections.sort(list);
        for (Movie movie: list)
            System.out.println(movie.getYear() + " " +
                               movie.getRating() + " " +
                               movie.getName()+" ");
    }
} 