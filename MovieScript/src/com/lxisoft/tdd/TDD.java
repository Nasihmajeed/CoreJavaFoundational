package com.lxisoft.tdd;

import com.lxisoft.movie.*;
import com.lxisoft.cast.*;
import com.lxisoft.direction.*;


public class TDD
{
public static void main(String[] args)
{


{
System.out.println("------------------------------------------------------------------------------------------------------");	
System.out.println("------------------------------------------------------------------------------------------------------");	
System.out.println("------------------------------------------Movie_Script------------------------------------------------");
System.out.println("------------------------------------------------------------------------------------------------------");
System.out.println("------------------------------------------------------------------------------------------------------");	
} 


Movie movie=new Movie();



                    try{
					    Thread.sleep(2000);
				       }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }


movie.setInitialDetails();

 


                      try{
					    Thread.sleep(2000);
				       }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }

director.castingTheActors();


movie.getInitialDetails();


director.printCharactersOfTheMovie();


   switch(movie.getMovieGenre())
	{
		case 1 : 
                   
                   director.startMovie(Movie.Genre.Romantic.toString());
                   break;
        case 2 : 
                   
                   director.startMovie(Movie.Genre.Emotional.toString());
                   break;
        case 3 : 
                   
                   director.startMovie(Movie.Genre.Comedy.toString());
                   break;
        case 4 : 
                   
                   director.startMovie(Movie.Genre.Action.toString());
                   break;
	}






        System.out.println("-----------------------------------------------------------------------------------------------------------");
                    
                    try{
					    Thread.sleep(2000);
				       }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }

        System.out.println("-----------------------------------------------THE END-----------------------------------------------------");
                    
                    try{
					    Thread.sleep(2000);
				       }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }

        System.out.println("-----------------------------------------------------------------------------------------------------------");
  }


}

