package com.lxisoft.scripts;

import com.lxisoft.cast.*;

import java.io.*;
import java.util.*;
import java.nio.*;
import java.nio.file.Files;

import java.nio.file.Paths;

//create 3 arrayLists for saving heroname,heroinename and comedian name ---- their charname.....

// Ask for Movie Genre at the beginning itself

//add names of all to arrayLists and also to setheroCharName,.......in Characters Class

//add 

//enter names and characters and print them to the user

//save each script to file and read each dialogues from file and add to an arrayListand get dialogues using--- random----get(Random variable) 


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



public void selectScript(int genre)
{
	switch(genre)
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

}

}





//Characters Class




public class Characters extends Actors 
{
	Scanner sc=new Scanner(System.in);
	
	String heroName,heroineName,comedianName,heroCharName,heroineCharName,comedianCharName;
	
	int numOfHero,numOfHeroine,numOfCom;
	/*
	
	ArrayList<Actors> all=new ArrayList<Actors>();
	
	ArrayList<Hero> heroes=new ArrayList<Hero>();
	ArrayList<Heroine> heroines=new ArrayList<Heroine>();
	ArrayList<Comedian> comedians=new ArrayList<Comedian>();
	
	
	Map<String , ArrayList<Actors> > actorsMap=new HashMap<String , ArrayList<Actors>>(); //Map for saving all the actors using the key-----Hero
	*/
	
public void setHero()
{
	 System.out.println("Enter the number of heroes in the movie : ");
     numOfHero=sc.nextInt(); 
	 System.out.println("Number of heroes in the Movie is : "+numOfHero);
     System.out.println("\r\n");
	 
	 
	 for(int i=0 ; i<numOfHero ; i++)
	 {
		 System.out.println("\r\n");
		 System.out.println("Enter the name of the Hero : ");  
		 heroName=sc.next();
		 System.out.println("Name of the Hero is: "+heroName);
		 
		 all.add(new Actors());
		 all.get(i).setHeroName(heroName);
		 
		 System.out.println("\r\n");
		 System.out.println("Enter the Character name of the Hero : ");
		 heroCharName=sc.next();
		 System.out.println("Name of the Hero's Character is : "+heroCharName);  
		 System.out.println("\r\n");
		 
		 heroes.add(new Hero());
		 heroes.get(i).setHeroCharName(heroCharName);
		 
		 all.get(i).setHeroCharName(heroCharName);
		 
		 actorsMap.put("Hero",all);         // set a key for hero
		
	 }

}

public void setHeroine()
{
	 System.out.println("Enter the number of heroines in the movie : ");
     numOfHeroine=sc.nextInt(); 
	 System.out.println("Number of Heroines in the movie is : "+numOfHeroine);
	 System.out.println("\r\n");
	 
	 
     for(int i=0 ; i<numOfHeroine ; i++)
	 {
		 System.out.println("\r\n");
		 System.out.println("Enter Heroine Name : ");  
		 heroineName=sc.next();
		 System.out.println("Name of the Heroine is : "+heroineName);  
		 
		 all.add(new Actors());
		 all.get(i).setHeroineName(heroineName);
		 
		 System.out.println("\r\n");
		 System.out.println("Enter the Character name of the Heroine : ");
		 heroineCharName=sc.next();
		 System.out.println("Name of the Heroine's Character is : "+heroineCharName);  
		 
		 heroines.add(new Heroine());
		 heroines.get(i).setHeroineCharName(heroineCharName);
		 
		 System.out.println("\r\n");
		 
		 all.get(i).setHeroineCharName(heroineCharName);
		 
		 actorsMap.put("Heroine",all);         // set a key for heroine
		
	 }

}

public void setComedian()
{
	 System.out.println("Enter the number of comedians in the movie : ");
     numOfCom=sc.nextInt(); 
	 System.out.println("Number of Comedians in the movie is : "+numOfCom);  
	 System.out.println("\r\n");
	 
	 
     for(int i=0 ; i<numOfCom ; i++)
	 {
		 System.out.println("\r\n");
		 System.out.println("Enter Comedian Name : ");  
		 comedianName=sc.next();
		 System.out.println("Name of the Comedian is : "+comedianName);  
		 
		 
		 all.add(new Actors());
		 all.get(i).setComedianName(comedianName);
		 
		 System.out.println("\r\n");
		 System.out.println("Enter the Character name of the Comedian : ");
		 comedianCharName=sc.next();
		 System.out.println("Name of the Comedian's Character is : "+comedianCharName);  
		 
		 comedians.add(new Comedian());
		 comedians.get(i).setComedianCharName(comedianCharName);
		 
		 all.get(i).setComedianCharName(comedianCharName);
		 
		 actorsMap.put("Comedian",all);         // set a key for comedian
		
	 }
}



public void printCharacters()
{
	    System.out.println("\r\n");
		System.out.println("---------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("----------------------=====CHARACTERS=====--------------------");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("\r\n");
		
   for(int i=0 ; i<all.size() ; i++)
    {
		if( all.get(i).getHeroName()  != null)
		{
	      System.out.println("Hero name is: "+all.get(i).getHeroName());		
		}
	
	   if( all.get(i).getHeroCharName()  != null)
		{
	      System.out.println("Hero's Character name is: "+all.get(i).getHeroCharName());		
		}
	   
	    if( all.get(i).getHeroineName()  != null)
		{
	      System.out.println("Heroine  name is: "+all.get(i).getHeroineName());		
		}
	 
	   
	    if( all.get(i).getHeroineCharName()  != null)
		{
	      System.out.println("Heroine's Character name is: "+all.get(i).getHeroineCharName());	
		}
	 
	   
	   if( all.get(i).getComedianName()  != null)
		{
	      System.out.println("Comedian name is : "+all.get(i).getComedianName());
		}
	
	
	  if( all.get(i).getComedianCharName()  != null)
		{
	      System.out.println("Comedian's Character name is : "+all.get(i).getComedianCharName());
		}	
	}
	
	    System.out.println("---------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------------");
	    System.out.println("\r\n");
	
}

}