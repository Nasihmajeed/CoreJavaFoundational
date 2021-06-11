package com.lxisoft.movie;

import com.lxisoft.direction.*;
import com.lxisoft.cast.*;
import com.lxisoft.scripts.*;

import java.util.*;
import java.io.*;
//Movie contains Director who selects actors and ScriptWriter.....(Does the casting) ,  Script contains a method selectScript()


public class Movie
{

Scanner sc=new Scanner(System.in);

private String movieName,movieGenre,st;
private float rating;
private int yearOfRelease;

static final String summaryOfNiram="E:\\MovieScript\\src\\com\\lxisoft\\scripts\\Summary.txt";

Director director=new Director();



ArrayList<Hero> heros=new ArrayList<Hero>();
ArrayList<Heroine> heroin=new ArrayList<Heroine>();
ArrayList<Comedian> com=new ArrayList<Comedian>();
ArrayList<Villain> vill=new ArrayList<Villain>();



public void begin()
{
System.out.println("------------------------------------------------------------");	
System.out.println("-------------: Enter the name of the movie :------------");
System.out.println("------------------------------------------------------------");
movieName=sc.next();	

                try{
					Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }


    System.out.println("---------------------------------------------------------------------------------------------------------");	
	System.out.println("----------------------------------Enter the genre of your movie------------------------------------");	
	System.out.println("---------------------------------------------------------------------------------------------------------");	
	System.out.println("Romantic");
	System.out.println("Emotional");
	System.out.println("Comedy");
	System.out.println("---------------------------------------------------------------------------------------------------------");	
	System.out.println("---------------------------------------------------------------------------------------------------------");	
	System.out.println("---------------------------------------------------------------------------------------------------------");					
   
   
                           movieGenre=sc.next();
						   setMovieGenre(movieGenre);
						   
System.out.println("\r\n");
	            

				try{
					Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }
					
					      System.out.println("---------------------------------Enter the Rating of the Movie----------------------------------------------"); 
						  rating=sc.nextFloat();
						  setRating(rating);
						  

System.out.println("\r\n");
	            
				try{
					Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }


                          System.out.println("---------------------------------Enter the Year in which the Movie was Released----------------------------------------------"); 
						  yearOfRelease=sc.nextInt();
						  setYear(yearOfRelease);
						  						  
						  
						  
						  
System.out.println("\r\n");
	
	System.out.println("---------------------------------------------------------------------------------------------------------");	
	System.out.println("---------------------------------------------------------------------------------------------------------");	
	System.out.println("---------------------------------------------------------------------------------------------------------");	
				System.out.println("Name of the Movie is : "+movieName);
				System.out.println("Genre of the movie is : "+getMovieGenre());
				System.out.println("Movie was Released in the Year : "+getYear());
				System.out.println("Rating of the movie is : "+getRating());
	System.out.println("---------------------------------------------------------------------------------------------------------");	
	System.out.println("---------------------------------------------------------------------------------------------------------");	
	System.out.println("---------------------------------------------------------------------------------------------------------");				
				
				try{
					Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }



System.out.println("Enter the name of the Director");
director.setDirectorName(sc.next());
System.out.println("Enter the number of movies directed by the Director");
director.setNumberOfMoviesDirected(sc.nextInt());
director.directorDetails();
director.qualitiesOfDirector();


                  try{
					   Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }
					
//Summary of the movie
						  
						                            
							                         System.out.println("=========================Movie Summary=========================");
							                              try{
								BufferedReader br=new BufferedReader(new FileReader(summaryOfNiram));
								                     while( (st=br.readLine()) != null)
													 {
                                                            System.out.println(st);																
													 }
	                                            System.out.println("---------------------------------------------------------------------------------------------------------");	
	                                            System.out.println("---------------------------------------------------------------------------------------------------------");	
	                                            System.out.println("---------------------------------------------------------------------------------------------------------");	
							                                   }
							                            catch(IOException e)
							                                  {
								                                   e.printStackTrace();
							                                  }
//Casting the actors

heros=director.setHero();
heroin=director.setHeroine();
com=director.setComedian();
vill=director.setVillain();



director.printCharacters();
						  
						  
			     try{
					    Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }
						
}


//Genre of the movie

public void setMovieGenre(String movieGenre)
{
this.movieGenre=movieGenre;	
}		

public String getMovieGenre()
{
	return movieGenre;
}


//Movie Rating


	
	public void setRating(float rating)
	{
		this.rating=rating;
	}
		
	public float getRating()
	{
		return rating;
	}


//Year of Release

public void setYear(int yearOfRelease)
	{
		this.yearOfRelease=yearOfRelease;
	}
		
	public int getYear()
	{
		return yearOfRelease;
	}
	

}