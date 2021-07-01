package com.lxisoft.movie;

import com.lxisoft.direction.*;
import com.lxisoft.cast.*;
import com.lxisoft.scripts.*;

import java.util.*;

public class Movie
{

Scanner sc=new Scanner(System.in);

private String movieName,movieLanguage;
private float rating;
private int yearOfRelease,movieGenre;

//Movie has A director and a ScriptWriter

Director director=new Director();
Script scr;


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

public void setMovieGenre(int movieGenre)
{
this.movieGenre=movieGenre;	
}		

public int getMovieGenre()
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

	

public void setInitialDetails()
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



    public enum Genre{"Romantic","Emotional","Comedy","Action"};


    System.out.println("\r\n");
    System.out.println("--------------------------------------------------------------------------------------------------");	
	System.out.println("------Enter the number corresponding to the given below options to select genre of your movie-------");	
	System.out.println("--------------------------------------------------------------------------------------------------");	
	System.out.println(Genre);
	System.out.println("--------------------------------------------------------------------------------------------------");	
	System.out.println("--------------------------------------------------------------------------------------------------");	
	System.out.println("--------------------------------------------------------------------------------------------------");					
	
       

       setMovieGenre(sc.nextInt());
						  
	            
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


				    scr=new Script();
System.out.println("---------------------------------------------------------------------------------------------------------");
System.out.println("--------------------------------------Enter the name of the ScriptWriter---------------------------------");
System.out.println("---------------------------------------------------------------------------------------------------------");
     scr.setScriptWriterName(sc.next());


                  try{
					   Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }

}


 public void getInitialDetails()
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



                System.out.println("Language of the Movie : "+getMovieLanguage());


				
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


				System.out.println("Name of the Script Writer : "+scr.getScriptWriterName());
                  
                  try{
					   Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }

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