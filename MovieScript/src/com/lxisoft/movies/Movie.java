package com.lxisoft.movies;

import com.lxisoft.cast.*;
import com.lxisoft.scripts.*;

import java.util.*;
import java.util.Scanner;


public class Movie
{
	int num;
	
		Scanner sc=new Scanner(System.in);
	
	    Summary summary=new Summary();
		
		String sumry;
		
		
		Cast movieCasts=new Cast();
	
	    Rating rating=new Rating();
		
	    Genre genre=new Genre();
		
		Script nirmScr=new Script();
	
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
							
						   summary.setFirstSummary("Maara, a young man from a remote village, dreams of launching his own airline service. However, he must overcome several obstacles and challenges in order to be successful in his quest.");
						   sumry=summary.getFirstSummary();
                           System.out.println("-----Summary-----");
						   System.out.println(sumry);
						   
						   genre.setMovieGenre("Drama");
						   System.out.println("Soorarai-Pootru is a "+genre.getMovieGenre());
						   
						          try{
			                             Thread.sleep(2000);
		                                }
		                          catch(InterruptedException e)
		                                {
			                            Thread.currentThread().interrupt();
		                                }
						   
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
							
                           summary.setSecondSummary("Aby realises that he is in love with Sona, his childhood friend, but is unable to express his feelings. However, he faces a dilemma when he learns that her marriage has already been arranged.");							
						   sumry=summary.getSecondSummary();
						   System.out.println("-----Summary-----");
						   System.out.println(sumry);
						   
						   genre.setMovieGenre("Romantic");
						   System.out.println("Niram is a "+genre.getMovieGenre());
						          
								  try{
			                             Thread.sleep(2000);
		                                }
		                          catch(InterruptedException e)
		                                {
			                            Thread.currentThread().interrupt();
		                                }
										
						   rating.setSecondRating(7.1f);
						   System.out.println("IMDB Rating : "+rating.getSecondRating());
						          
								  try{
			                             Thread.sleep(2000);
		                                }
		                          catch(InterruptedException e)
		                                {
			                            Thread.currentThread().interrupt();
		                                }
										
						   movieCasts.castsOfNiram();
						   
						          try{
			                             Thread.sleep(2000);
		                                }
		                          catch(InterruptedException e)
		                                {
			                            Thread.currentThread().interrupt();
		                                }
						   
						   nirmScr.niramScript();
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
										
						   summary.setThirdSummary("Saji, Bonny, Bobby and Franky are siblings who mostly do not get along. However, a series of events forces them to keep their animosity aside and support each other.");			
						   sumry=summary.getThirdSummary();
						   System.out.println("-----Summary-----");
						   System.out.println(sumry);
						   
						   genre.setMovieGenre("Romantic -Comedy");
						   System.out.println("Kumbalangi-Nights is a "+genre.getMovieGenre());
						         
								 try{
			                             Thread.sleep(2000);
		                                }
		                          catch(InterruptedException e)
		                                {
			                            Thread.currentThread().interrupt();
		                                }
										
										
						   rating.setThirdRating(8.6f);
						   System.out.println("IMDB Rating : "+rating.getThirdRating());
						   
			               break;
		  }
	}
	
	
	
}