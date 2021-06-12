package com.lxisoft.movie;

import com.lxisoft.direction.*;
import com.lxisoft.cast.*;
import com.lxisoft.scripts.*;

import java.util.*;
//Movie contains Director who selects actors and ScriptWriter.....(Does the casting) ,  Script contains a method selectScript()

public class Movie
{

Scanner sc=new Scanner(System.in);

private String movieName,movieGenre;
private float rating;
private int yearOfRelease;

//Movie has A director and a ScriptWriter

Director director=new Director();
ScriptWriter writer=new ScriptWriter();

ArrayList<Hero> heros=new ArrayList<Hero>();
ArrayList<Heroine> heroin=new ArrayList<Heroine>();
ArrayList<Comedian> comediann=new ArrayList<Comedian>();
ArrayList<Villain> vilain=new ArrayList<Villain>();


public void begin()
{
System.out.println("\r\n");
System.out.println("------------------------------------------------------------");	
System.out.println("---------------: Enter the name of the movie :--------------");
System.out.println("------------------------------------------------------------");
movieName=sc.next();	

                try{
					Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }

    System.out.println("\r\n");
    System.out.println("---------------------------------------------------------------------------------------------------------");	
	System.out.println("----------------------------------Enter the genre of your movie------------------------------------");	
	System.out.println("---------------------------------------------------------------------------------------------------------");	
	System.out.println("Romantic");
	System.out.println("Emotional");
	System.out.println("Comedy");
	System.out.println("Action");
	System.out.println("---------------------------------------------------------------------------------------------------------");	
	System.out.println("---------------------------------------------------------------------------------------------------------");	
	System.out.println("---------------------------------------------------------------------------------------------------------");					
   
   
                           movieGenre=sc.next();
						   setMovieGenre(movieGenre);
						  
	            
				try{
					Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }

    System.out.println("\r\n");
                          System.out.println("---------------------------------------------------------------------------------------------------------");
                          System.out.println("-----------------------------Enter the Year in which the Movie was Released------------------------------"); 
                          System.out.println("---------------------------------------------------------------------------------------------------------");
						  yearOfRelease=sc.nextInt();
						  setYear(yearOfRelease);
						  						 
						  
    System.out.println("\r\n");

				try{
					Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }

                          System.out.println("---------------------------------------------------------------------------------------------------------");
                          System.out.println("---------------------------------------Enter the Rating of the Movie-------------------------------------"); 
                          System.out.println("---------------------------------------------------------------------------------------------------------");
						  setRating(sc.nextFloat());
	
	System.out.println("\r\n");

				try{
					Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }	 


System.out.println("Enter the name of the Director");
director.setDirectorName(sc.next());
System.out.println("\r\n");

System.out.println("Enter the language of the Director ");
director.setDirectorLanguage(sc.next());
System.out.println("\r\n");

System.out.println("Enter the number of movies directed by the Director");
director.setNumberOfMoviesDirected(sc.nextInt());
System.out.println("\r\n");
                   
                   try{
					   Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }

writer.writerDetails();

                  try{
					   Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }
					
//Casting the actors

heros=director.castingTheHero();
heroin=director.castingTheHeroine();
comediann=director.castingTheComedian();
vilain=director.castingTheVillain();
                
                 try{
					   Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }
    System.out.println("\r\n");

    System.out.println("---------------------------------------------------------------------------------------------------------");	
	System.out.println("---------------------------------------------------------------------------------------------------------");	
	System.out.println("---------------------------------------------------------------------------------------------------------");	
				System.out.println("Name of the Movie : "+movieName);


				try{
					   Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }


				System.out.println("Genre of the movie : "+getMovieGenre());


				try{
					   Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }


				System.out.println("Year of Release : "+getYear());
				

				try{
					   Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }


				System.out.println("Rating of the movie : "+getRating());
				

				try{
					   Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }


				System.out.println("Name of the Director : "+director.getDirectorName());


				try{
					   Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }


				System.out.println("Language of the Director : "+director.getDirectorLanguage());


				try{
					   Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }


				System.out.println("Number of movies directed by the Director : "+director.getNumberOfMoviesDirected());


				try{
					   Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }


				System.out.println("Name of the Script Writer : "+writer.getWriterName());

				try{
					   Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }


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

    System.out.println("\r\n");

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





    