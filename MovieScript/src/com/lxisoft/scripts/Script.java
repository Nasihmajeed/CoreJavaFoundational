package com.lxisoft.scripts;

import com.lxisoft.cast.*;

import java.io.*;
import java.util.*;
import java.nio.*;
import java.nio.file.Files;

import java.nio.file.Paths;


public class Script
{
	
static final String romance="E:\\MovieScriptProject\\src\\com\\lxisoft\\scripts\\RomanticScr.txt";
static final String emotional= "E:\\MovieScriptProject\\src\\com\\lxisoft\\scripts\\EmotionalScr.txt";
static final String comedy= "E:\\MovieScriptProject\\src\\com\\lxisoft\\scripts\\ComedyScr.txt";

String line;


Characters c=new Characters();


Actors actors=new Actors();
Cast casting =new Cast();
Script scripting=new Script();
Genre g=new Genre();
Rating rating=new Rating();
Characters characters=new Characters();



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

    
                try{
					Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }
System.out.println("\r\n");



switch(gtype)
            {
                 case 1 : 
                                                       g.setMovieGenre("Romantic");				  
				                    System.out.println(movieName+" is a movie of "+g.getMovieGenre()+" genre");
									                   System.out.println("\r\n");

                                                          try{
					                                              Thread.sleep(2000);
				                                               }
				                                        catch(InterruptedException e)
				                                               {
					                                              Thread.currentThread().interrupt();
				                                                }
									
				                                      rating.setRating(7.2f);
									  System.out.println(movieName+" has an IMDB rating of "+rating.getRating());
				                                      System.out.println("\r\n");
							                          
							                                 try{
					                                                 Thread.sleep(2000);
				                                                  }
				                                       catch(InterruptedException e)
				                                                   {
					                                                  Thread.currentThread().interrupt();
				                                                    }
							  							   
							   scripting.selectScript(gtype);
							   
							   break;
				 case 2 : 
				                                                                                 g.setMovieGenre("Emotional");				  
				                    System.out.println(movieName+" is a movie of "+g.getMovieGenre()+" genre");
													  System.out.println("\r\n");
													  try{
					                                         Thread.sleep(2000);
				                                           }
				                                catch(InterruptedException e)
				                                          {
					                                         Thread.currentThread().interrupt();
				                                          }
													  
													  
													  rating.setRating(6.7f);
									  System.out.println(movieName+" has an IMDB rating of "+rating.getRating());
				                                     System.out.println("\r\n");
							                          
													  try{
					                                         Thread.sleep(2000);
				                                           }
				                                catch(InterruptedException e)
				                                          {
					                                         Thread.currentThread().interrupt();
				                                          }
							  		   
							   scripting.selectScript(gtype);
							   
							   break;
				 case 3 : 
				                                                       g.setMovieGenre("Comedy");				  
				                    System.out.println(movieName+" is a movie of "+g.getMovieGenre()+" genre");
				                                                       System.out.println("\r\n");
								 
								                      try{
					                                         Thread.sleep(2000);
				                                           }
				                                catch(InterruptedException e)
				                                          {
					                                         Thread.currentThread().interrupt();
				                                          }
								 								 
													 rating.setRating(8.5f);
									  System.out.println(movieName+" has an IMDB rating of "+rating.getRating());
				     	                            System.out.println("\r\n");
							                         
													 try{
					                                         Thread.sleep(2000);
				                                           }
				                                catch(InterruptedException e)
				                                          {
					                                         Thread.currentThread().interrupt();
				                                          }
							  
							  scripting.selectScript(gtype);
							   break;
            }


public void selectScript(int genre)
{
	switch(genre)
	{


    }

}

}