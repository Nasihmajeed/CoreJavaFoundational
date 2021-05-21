package com.lxisoft.movies;

import com.lxisoft.cast.*;
import com.lxisoft.scripts.*;

import java.util.*;
import java.util.Scanner;


public class Movie
{
	int num,type;
	
		Scanner sc=new Scanner(System.in);
	
	    Summary summary=new Summary();
		
		String sumry;
		
		
		Cast movieCasts=new Cast();
	
	    Rating rating=new Rating();
		
	    Genre genre=new Genre();
		
		Script scriptRead=new Script();
	
	public void projectName()
	{
		System.out.println("=====================================");
		System.out.println("=====================================");
		System.out.println("=====================================");
		System.out.println("_______________MOVIE_____________SCRIPT___________________");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------- \r\n");
		                              try{
			                             Thread.sleep(2000);
		                                }
		                          catch(InterruptedException e)
		                                {
			                            Thread.currentThread().interrupt();
		                                }
	}
	
	                                
	public void beginScript()
	{
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
	    System.out.println("Enter the Movie name to read the Script : ");
		System.out.println("1.Soorarai-Pottru");
		System.out.println("2.Niram");
		System.out.println("3.Kumbalangi-Nights");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------\r\n");
		
		num=sc.nextInt();

          switch(num)
		  {
			  case 1 : System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
			               System.out.println("Soorarai-Pootru is a Drama-movie"); 
						   System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------\r\n");     
								  
		                             try{
			                             Thread.sleep(2000);
		                                }
		                          catch(InterruptedException e)
		                                {
			                            Thread.currentThread().interrupt();
		                                }
							
						   System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------"); 
						   summary.setFirstSummary("Maara, a young man from a remote village, dreams of launching his own airline service. However, he must overcome several obstacles and challenges in order to be successful in his quest.");
						   System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------\r\n"); 
						   		   
								    try{
			                             Thread.sleep(2000);
		                                }
		                          catch(InterruptedException e)
		                                {
			                            Thread.currentThread().interrupt();
		                                }
										
						   sumry=summary.getFirstSummary();
                           System.out.println("---------------------------------------------------------------Summary---------------------------------------------------------------------------");
						   System.out.println(sumry);
						   System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------\r\n");
						          	 try{
			                             Thread.sleep(2000);
		                                }
		                          catch(InterruptedException e)
		                                {
			                            Thread.currentThread().interrupt();
		                                }

						   genre.setMovieGenre("Drama");
						   System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------"); 
						   System.out.println("The Genre of Soorarai-Pootru falls under "+genre.getMovieGenre()+" Category");
						   System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------\r\n"); 
						   
						             try{
			                             Thread.sleep(2000);
		                                }
		                          catch(InterruptedException e)
		                                {
			                            Thread.currentThread().interrupt();
		                                }
						   
						   rating.setFirstRating(9.1f);
						   System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------"); 
						   System.out.println("IMDB Rating : "+rating.getFirstRating());
						   System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------\r\n"); 
						   
						           try{
			                             Thread.sleep(2000);
		                                }
		                          catch(InterruptedException e)
		                                {
			                            Thread.currentThread().interrupt();
		                                }
										
							movieCasts.castsOfSp();
							
							          try{
			                             Thread.sleep(2000);
		                                }
		                          catch(InterruptedException e)
		                                {
			                            Thread.currentThread().interrupt();
		                                }
										
						   System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");						   
						   System.out.println("What type of Script do you want to view from the Movie : Soorarai Pottru ?");
						   System.out.println("1.Romantic \r\n");
						   System.out.println("2.Comedy \r\n");
						   System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------\r\n");
						   type=sc.nextInt();
						            if(type==1)
									{
                                          		scriptRead.spRomanticScript();										
									}
                                    else if(type==2)
									{
										        scriptRead.spComedyScript();
									}
									
						   break;
			  
			  case 2 : System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
			               System.out.println("Niram is a Romantic movie in Malayalam Language ");
						   System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------\r\n");          
									 
		                                try{
			                             Thread.sleep(2000);
		                                }
		                          catch(InterruptedException e)
		                                {
			                            Thread.currentThread().interrupt();
		                                }
							
                           summary.setSecondSummary("Aby realises that he is in love with Sona, his childhood friend, \r\n but is unable to express his feelings. \r\n However, he faces a dilemma when he learns that \r\n her marriage has already been arranged.");							
						   sumry=summary.getSecondSummary();
						   System.out.println("------------------------------------------------------Summary----------------------------------------------------- \r\n");
						   System.out.println(sumry);
						   System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------\r\n");
						          try{
			                             Thread.sleep(2000);
		                                }
		                          catch(InterruptedException e)
		                                {
			                            Thread.currentThread().interrupt();
		                                }
						   genre.setMovieGenre("Romantic");
						   System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
						   System.out.println("The Genre of Niram falls under "+genre.getMovieGenre()+" Category \r\n");
						   System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");       
								     try{
			                             Thread.sleep(2000);
		                                }
		                          catch(InterruptedException e)
		                                {
			                            Thread.currentThread().interrupt();
		                                }
										
						   rating.setSecondRating(7.1f);
						   System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
						   System.out.println("IMDB Rating : "+rating.getSecondRating());
						   System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------\r\n");
						   
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
                           System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");						   
						   System.out.println("What type of Script do you want to view from the Movie ?");
						   System.out.println("1.Romantic \r\n");
						   System.out.println("2.Comedy \r\n");
						   System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------\r\n");
						   type=sc.nextInt();
						            if(type==1)
									{
                                          						   scriptRead.niramRomanticScript();										
									}
                                    else if(type==2)
									{
										                           scriptRead.niramComedyScript();
									}
			               break;
						   
						   
			  case 3 :
			               System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------"); 
			               System.out.println("Kumbalangi-Nights is a Romantic-Comedy movie \r\n");      
						   System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------\r\n"); 
						   
		                                try{
			                             Thread.sleep(2000);
		                                    }
		                          catch(InterruptedException e)
		                                {
			                            Thread.currentThread().interrupt();
		                                }					
										
						   System.out.println("-------------------------------------------------------------Summary----------------------------------------------------------- \r\n"); 			
						   summary.setThirdSummary("Saji, Bonny, Bobby and Franky are siblings who mostly do not get along.\r\n However, a series of events forces them to keep their animosity aside and \r\n support each other.");			
						   System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------\r\n"); 
						   sumry=summary.getThirdSummary();
						   System.out.println(sumry);
						           
								   try{
			                             Thread.sleep(2000);
		                                    }
		                          catch(InterruptedException e)
		                                {
			                            Thread.currentThread().interrupt();
		                                }
										
						   genre.setMovieGenre("Romantic -Comedy");
						   System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------"); 
						   System.out.println("The Genre of Kumbalangi-Nights falls under "+genre.getMovieGenre()+" Category");
						   System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------\r\n"); 
						   
								   try{
			                             Thread.sleep(2000);
		                                }
		                          catch(InterruptedException e)
		                                {
			                            Thread.currentThread().interrupt();
		                                }
										
										
						   rating.setThirdRating(8.6f);
						   System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------"); 
						   System.out.println("IMDB Rating : "+rating.getThirdRating());
						   System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------\r\n"); 
						    
							      try{
			                             Thread.sleep(2000);
		                                }
		                          catch(InterruptedException e)
		                                {
			                            Thread.currentThread().interrupt();
		                                }
										
						   movieCasts.castsOfKn();
						   
						            try{
			                             Thread.sleep(2000);
		                                }
		                          catch(InterruptedException e)
		                                {
			                            Thread.currentThread().interrupt();
		                                }
                           System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");						   
						   System.out.println("What type of Script do you want to view from the Movie Kumbalangi-Nights ?");
						   System.out.println("1.Romantic \r\n");
						   System.out.println("2.Comedy \r\n");
						   System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------\r\n");
						   type=sc.nextInt();
						            if(type==1)
									{
                                          						   scriptRead.knRomanticScript();										
									}
                                    else if(type==2)
									{
										                           scriptRead.knComedyScript();
									}
			               break;
		  }
	}
	
}