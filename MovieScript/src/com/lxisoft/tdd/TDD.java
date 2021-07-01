package com.lxisoft.tdd;

import com.lxisoft.movie.*;
import com.lxisoft.cast.*;
import com.lxisoft.direction.*;
import com.lxisoft.scripts.*;

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

Script scrObj;


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

movie.getInitialDetails();


                      try{
					    Thread.sleep(2000);
				       }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }


   switch(movie.getMovieGenre())
	{
		case 1 : 
                   System.out.println("Genre of the movie is Romantic ");
                   scrObj=new Script(Genre.valueOf("Romantic"));
        case 2 : 
                   System.out.println("Genre of the movie is Emotional ");
                   scrObj=new Script(Genre.valueOf("Emotional"));
        case 3 : 
                   System.out.println("Genre of the movie is Comedy ");
                   scrObj=new Script(Genre.valueOf("Comedy"));
        case 4 : 
                   System.out.println("Genre of the movie is Action ");
                   scrObj=new Script(Genre.valueOf("Action"));
	}


















        System.out.println("---------------------------------------------------------------------------");
                    
                    try{
					    Thread.sleep(2000);
				       }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }

        System.out.println("-----------------------------THE END---------------------------------------");
                    
                    try{
					    Thread.sleep(2000);
				       }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }

        System.out.println("---------------------------------------------------------------------------");
  }


}

