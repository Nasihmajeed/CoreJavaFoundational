package com.lxisoft.movie;

import com.lxisoft.direction.*;
import com.lxisoft.cast.*;
import com.lxisoft.scripts.*;

import java.util.*;

public class Movie
{

Scanner sc=new Scanner(System.in);

private String movieName,movieGenre,movieLanguage;
private float rating;
private int yearOfRelease;

//Movie has A director and a ScriptWriter

Director director=new Director();
Script writer=new Script();


//Name of the movie

public void setMovieName(String movieName)
{
this.movieName=movieName;	
}		

public String getMovieName()
{
	return movieName;
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

//Language of the movie

public void setMovieLanguage(String movieLanguage)
{
this.movieLanguage=movieLanguage;	
}		

public String getMovieLanguage()
{
	return movieLanguage;
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

	

public void askMovieDetailsFromUse()
{
   System.out.println("\r\n");
   

   System.out.println("------------------------------------------------------------");	
   System.out.println("---------------: Enter the name of the movie :--------------");
   System.out.println("------------------------------------------------------------");
   setMovieName(sc.next());	
 

                try{
					Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }



   System.out.println("\r\n");
   System.out.println("------------------------------------------------------------");	
   System.out.println("---------------: Enter the Language of the movie :----------");
   System.out.println("------------------------------------------------------------");
   setMovieLanguage(sc.next());

                  try{
					Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }





    System.out.println("\r\n");
    System.out.println("--------------------------------------------------------------------------------------------------");	
	System.out.println("----------------------------------Enter the genre of your movie-----------------------------------");	
	System.out.println("--------------------------------------------------------------------------------------------------");	
	System.out.println("Romantic");
	System.out.println("Emotional");
	System.out.println("Comedy");
	System.out.println("Action");
	System.out.println("--------------------------------------------------------------------------------------------------");	
	System.out.println("--------------------------------------------------------------------------------------------------");	
	System.out.println("--------------------------------------------------------------------------------------------------");					
	
	setMovieGenre(sc.next());
						  
	            
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
						  
    setYear(sc.nextInt());
					


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





System.out.println("---------------------------------------------------------------------------------------------------------");
System.out.println("------------------------------------------Enter the name of the Director---------------------------------");
System.out.println("---------------------------------------------------------------------------------------------------------");
director.setDirectorName(sc.next());
System.out.println("\r\n");


                   try{
					    Thread.sleep(2000);
				       }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }

System.out.println("---------------------------------------------------------------------------------------------------------");
System.out.println("-------------------------------------Enter the language of the Director----------------------------------");
System.out.println("---------------------------------------------------------------------------------------------------------");
director.setDirectorLanguage(sc.next());
System.out.println("\r\n");
                  

                  try{
					    Thread.sleep(2000);
				       }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }

System.out.println("---------------------------------------------------------------------------------------------------------");
System.out.println("------------------------Enter the number of movies directed by the Director------------------------------");
System.out.println("---------------------------------------------------------------------------------------------------------");
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

}


 public void getMovieDetails()
 {
 	System.out.println("\r\n");
 	System.out.println("\r\n");
 	System.out.println("\r\n");
 	System.out.println("\r\n");
 	System.out.println("\r\n");
                 
    System.out.println("-----------------------------------------------------------------------------------");
                  
                  try{
					   Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }

	System.out.println("----------------------UNIVERSAL PICTURE PRODUCTIONS PRESENTS-----------------------");
                  
                  try{
					   Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }

	System.out.println("-----------------------------------------------------------------------------------");

                 try{
					   Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }

    System.out.println("\r\n");

    System.out.println("-----------------------------------------------------------------------------------");	
	System.out.println("-----------------------------------------------------------------------------------");	
	System.out.println("-----------------------------------------------------------------------------------");	
				System.out.println("Name of the Movie : "+getMovieName());


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


				System.out.println("Language of the Script Writer : "+writer.getWriterLanguage());

	System.out.println("-------------------------------------------------------------------------------------");	
	System.out.println("-------------------------------------------------------------------------------------");	
	System.out.println("-------------------------------------------------------------------------------------");	
                
                 try{
					   Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }
}

}