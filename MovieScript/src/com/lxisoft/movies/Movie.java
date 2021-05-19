package com.lxisoft.movies;

import java.util.*;
import java.util.Scanner;

public class Movie
{
	int num;
	
		Scanner sc=new Scanner(System.in);
	
	    Summary summary=new Summary();
		StringBuffer sumry=new StringBuffer();
		
		
	//	Cast casting=new Cast();
	
	    Rating rating=new Rating();
		
	    Genre genre=new Genre();
	
	public void projectName()
	{
		System.out.println("=====================================");
		System.out.println("=====================================");
		System.out.println("=====================================");
		System.out.println("_______________MOVIE_____________SCRIPT___________________");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------");
	}
	
	                                
		                                try{
			                             Thread.sleep(2000);
		                                }
		                          catch(InterruptedException e)
		                                {
			                            Thread.currentThread().interrupt();
		                                }
	
	
	
	
	public void beginScript()
	{
	    System.out.println("Enter the Movie name to read the Script : ");
		System.out.println("1.Soorarai-Pottru");
		System.out.println("2.Niram");
		System.out.println("3.Kumbalangi-Nights");
		
		num=sc.nextInt();

          switch(num)
		  {
			  case 1 :
			               System.out.println("Soorarai-Pootru is a Drama-movie"); 
						          
								  
		                          try{
			                             Thread.sleep(2000);
		                                }
		                          catch(InterruptedException e)
		                                {
			                            Thread.currentThread().interrupt();
		                                }
										
						   System.out.println("-----Summary-----");
						   sumry=summary.getFirstSummary();
						   
						   genre.setMovieGenre("Drama");
						   System.out.println("Soorarai-Pootru is a "+genre.getMovieGenre());
						   
						   rating.setFirstRating(9.1f);
						   System.out.println("IMDB Rating : "+rating.getFirstRating());
						   
						   break;
			  
			  case 2 :
			               System.out.println("Niram is a Romantic movie");
						             
									 
		                                try{
			                             Thread.sleep(2000);
		                                }
		                          catch(InterruptedException e)
		                                {
			                            Thread.currentThread().interrupt();
		                                }
										
						   System.out.println("-----Summary-----");
						   sumry=summary.getSecondSummary();
						   
						   genre.setMovieGenre("Romantic");
						   System.out.println("Niram is a "+genre.getMovieGenre());
						   
						   rating.setSecondRating(7.1f);
						   System.out.println("IMDB Rating : "+rating.getSecondRating());
						   
			               break;
						   
						   
			  case 3 :
			               System.out.println("Kumbalangi-Nights is a Romantic-Comedy movie");
                                       
									   
		                                try{
			                             Thread.sleep(2000);
		                                    }
		                          catch(InterruptedException e)
		                                {
			                            Thread.currentThread().interrupt();
		                                }					
										
						   System.out.println("-----Summary-----");
						   sumry=summary.getThirdSummary();
						   
						   genre.setMovieGenre("Romantic -Comedy");
						   System.out.println("Kumbalangi-Nights is a "+genre.getMovieGenre());
						   
						   rating.setThirdRating(8.6f);
						   System.out.println("IMDB Rating : "+rating.getThirdRating());
						   
			               break;
		  }
	}
	
	
	
}