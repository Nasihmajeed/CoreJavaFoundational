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












