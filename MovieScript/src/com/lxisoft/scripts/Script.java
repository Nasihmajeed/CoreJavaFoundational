package com.lxisoft.scripts;

import com.lxisoft.cast.*;
import com.lxisoft.movie.*;

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
Scanner sc=new Scanner(System.in);
	
static final String romance="E:\\MovieScript\\src\\com\\lxisoft\\scripts\\RomanticScr.txt";
static final String emotional= "E:\\MovieScript\\src\\com\\lxisoft\\scripts\\EmotionalScr.txt";
static final String comedy= "E:\\MovieScript\\src\\com\\lxisoft\\scripts\\ComedyScr.txt";
 
 
//  Actors act=new Actors();
  Rating rating=new Rating();

    
    String heroName,heroineName,comedianName,heroCharName,heroineCharName,comedianCharName,villainName,villainCharName,line;
	
	int numOfHero,numOfHeroine,numOfCom,numOfVillain;
	
	long numOfLines=0;
	
	//For all actors
	ArrayList<Actors> allActors=new ArrayList<Actors>();
	
	//ArrayLists to save each category
	
	ArrayList<Hero> heroes=new ArrayList<Hero>();
	ArrayList<Heroine> heroines=new ArrayList<Heroine>();
	ArrayList<Comedian> comedians=new ArrayList<Comedian>();
	ArrayList<Villain> villains=new ArrayList<Villain>();
	
	ArrayList<String> romDialog=new ArrayList<String>();
    ArrayList<String> emoDialog=new ArrayList<String>();
    ArrayList<String> comDialog=new ArrayList<String>();	
	
	
	Map<String , String > actorsRole=new HashMap<String , String>();  //a Map for saving heroname and their respective roles 

								                 Long a=numberOfLinesInRomanceFile()-3;
												 Long b=numberOfLinesInEmotionalFile()-6;
												 Long c=numberOfLinesInComedyFile()-10;


	
public void selectScript(int genre)
{
	switch(genre)
            {
                 case 1 : 
                                             
							                                 try{
					                                                 Thread.sleep(2000);
				                                                  }
				                                       catch(InterruptedException e)
				                                                   {
					                                                  Thread.currentThread().interrupt();
				                                                    }
							  							   
							                                         rating.setRating(7.2f);
									  System.out.println("IMDB rating : "+rating.getRating());
							                     
												            try{
					                                                 Thread.sleep(2000);
				                                                  }
				                                       catch(InterruptedException e)
				                                                   {
					                                                  Thread.currentThread().interrupt();
				                                                    }
																
                                                   setHero();
                                                   setHeroine();
                                                   setComedian();
                                                   setVillain();

                                                           try{
					                                                 Thread.sleep(2000);
				                                                  }
				                                       catch(InterruptedException e)
				                                                   {
					                                                  Thread.currentThread().interrupt();
				                                                    }
                     
                                                 printCharacters();

                            //  File Reading and saving into the corresponding arraylist
	                            
                          try{
							               //Reading Complete Data from Romantic Script
							  
							         BufferedReader brom=new BufferedReader(new FileReader(romance));
								 
								         while( (line=brom.readLine()) != null)
								             {
									            romDialog.add(line);
								             }
											 
										//Reading partial data from Emotional Script
											 
								    BufferedReader bremo=new BufferedReader(new FileReader(emotional));
							
                                 for(int i=0 ; i<b ; i++)
								             {	 
		          						  while( ( (line=bremo.readLine()) != null) && i<b )
					     			             {
						    			            emoDialog.add(line);
							  	                 }
								             }
								         
									//Reading partial data from ComedyScript
											 
								    BufferedReader brcom=new BufferedReader(new FileReader(comedy));
							
                                 for(int i=0 ; i<c ; i++)
								             {	 
		          						  while( ( (line=brcom.readLine()) != null) && i<c )
					     			             {
						    			            comDialog.add(line);
							  	                 }
								             }
											 
											 
						       }  								
							catch(IOException e)
							   {
								e.printStackTrace();
							   }	 
								 
								   for(int i=0 ; i<numberOfLinesInRomanceFile() ; i++)
								          {
											   System.out.println(heroes.get(i).getHeroName()+" : "+actorsRole.get("Hero")+" : "+romDialog.get(i));
								               System.out.println(heroines.get(i).getHeroineName()+" : "+actorsRole.get("Heroine")+" : "+romDialog.get(i+1));         
										  }  
											  
									for(int j=0 ; j<b ; j++)
										 {		  
										      System.out.println(heroes.get(j).getHeroName()+" : "+actorsRole.get("Hero")+" : "+emoDialog.get(j));
									          System.out.println(heroines.get(j).getHeroineName()+" : "+actorsRole.get("Heroine")+" : "+emoDialog.get(j+1));
                                              System.out.println(villains.get(j).getVillainName()+" : "+actorsRole.get("Villain")+" : "+emoDialog.get(j+3));
					                     }
							       for(int k=0 ; k<c ; k++)
					                     {
											  System.out.println(heroes.get(k).getHeroName()+" : "+actorsRole.get("Hero")+" : "+comDialog.get(k));
								              System.out.println(heroines.get(k).getHeroineName()+" : "+actorsRole.get("Heroine")+" : "+comDialog.get(k+1));
                                              System.out.println(comedians.get(k).getComedianName()+" : "+actorsRole.get("Comedian")+" : "+comDialog.get(k+2));
                                         }
										 
								         
                                             								 
							   
							   break;
							   
				 case 2 : 
				 
													  rating.setRating(6.7f);
									  System.out.println("IMDB rating : "+rating.getRating());
				                                     System.out.println("\r\n");
							                          
													  try{
					                                         Thread.sleep(2000);
				                                           }
				                                catch(InterruptedException e)
				                                          {
					                                         Thread.currentThread().interrupt();
				                                          }
							  		   
							   
							   
							   break;
				 
				 case 3 :
				 
				 
													 rating.setRating(8.5f);
									  System.out.println("IMDB rating : "+rating.getRating());
				     	                            System.out.println("\r\n");
							                         
													 try{
					                                         Thread.sleep(2000);
				                                           }
				                                catch(InterruptedException e)
				                                          {
					                                         Thread.currentThread().interrupt();
				                                          }
							  
							   break;
            }

}


public long numberOfLinesInRomanceFile()
{
	
	
	try{
	         numOfLines=Files.lines(Paths.get(romance)).count();	
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
	return numOfLines;
}


public long numberOfLinesInEmotionalFile()
{
	
	
	try{
	         numOfLines=Files.lines(Paths.get(emotional)).count();	
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
	return numOfLines;
}


public long numberOfLinesInComedyFile()
{
	
	
	try{
	         numOfLines=Files.lines(Paths.get(comedy)).count();	
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
	return numOfLines;
}


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
		 
		 allActors.add(new Actors());
		 allActors.get(i).setHeroName(heroName);
		 
		 System.out.println("\r\n");
		 System.out.println("Enter the Character name of the Hero : ");
		 heroCharName=sc.next();
		 System.out.println("Name of the Hero's Character is : "+heroCharName);  
		 System.out.println("\r\n");
		 
		 heroes.add(new Hero());
		 heroes.get(i).setHeroCharName(heroCharName);
		 
		 allActors.get(i).setHeroCharName(heroCharName);
		 
		 actorsRole.put("Hero",heroCharName);         // set a key for hero
		
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
		 
		 allActors.add(new Actors());
		 allActors.get(i).setHeroineName(heroineName);
		 
		 System.out.println("\r\n");
		 System.out.println("Enter the Character name of the Heroine : ");
		 heroineCharName=sc.next();
		 System.out.println("Name of the Heroine's Character is : "+heroineCharName);  
		 
		 heroines.add(new Heroine());
		 heroines.get(i).setHeroineCharName(heroineCharName);
		 
		 System.out.println("\r\n");
		 
		 allActors.get(i).setHeroineCharName(heroineCharName);
		 
		 actorsRole.put("Heroine",heroineCharName);         // set a key for heroine
		
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
		 
		 
		 allActors.add(new Actors());
		 allActors.get(i).setComedianName(comedianName);
		 
		 System.out.println("\r\n");
		 System.out.println("Enter the Character name of the Comedian : ");
		 comedianCharName=sc.next();
		 System.out.println("Name of the Comedian's Character is : "+comedianCharName);  
		 
		 comedians.add(new Comedian());
		 comedians.get(i).setComedianCharName(comedianCharName);
		 
		 allActors.get(i).setComedianCharName(comedianCharName);
		 
		 actorsRole.put("Comedian",comedianCharName);         // set a key for comedian
		
	 }
}


public void setVillain()
{
	 System.out.println("Enter the number of villains in the movie : ");
     numOfVillain=sc.nextInt(); 
	 System.out.println("Number of Villains in the movie is : "+numOfVillain);  
	 System.out.println("\r\n");
	 
	 
     for(int i=0 ; i<numOfVillain ; i++)
	 {
		 System.out.println("\r\n");
		 System.out.println("Enter Villain Name : ");  
		 villainName=sc.next();
		 System.out.println("Name of the Villain is : "+villainName);  
		 
		 
		 allActors.add(new Actors());
		 allActors.get(i).setVillainName(villainName);
		 
		 System.out.println("\r\n");
		 System.out.println("Enter the Character name of the Villain : ");
		 villainCharName=sc.next();
		 System.out.println("Name of the Villain's Character is : "+villainCharName);  
		 
		 villains.add(new Villain());
		 villains.get(i).setVillainCharName(villainCharName);
		 
		 allActors.get(i).setVillainCharName(villainCharName);
		 
		 actorsRole.put("Villain",villainCharName);         // set a key for villain
		
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
		
   for(int i=0 ; i<allActors.size() ; i++)
    {
		if( allActors.get(i).getHeroName()  != null)
		{
	      System.out.println("Hero name is: "+allActors.get(i).getHeroName());		
		}
	
	   if( allActors.get(i).getHeroCharName()  != null)
		{
	      System.out.println("Hero's Character name is: "+allActors.get(i).getHeroCharName());		
		}
	   
	    if( allActors.get(i).getHeroineName()  != null)
		{
	      System.out.println("Heroine  name is: "+allActors.get(i).getHeroineName());		
		}
	 
	   
	    if( allActors.get(i).getHeroineCharName()  != null)
		{
	      System.out.println("Heroine's Character name is: "+allActors.get(i).getHeroineCharName());	
		}
	 
	   
	   if( allActors.get(i).getComedianName()  != null)
		{
	      System.out.println("Comedian name is : "+allActors.get(i).getComedianName());
		}
	
	
	  if( allActors.get(i).getComedianCharName()  != null)
		{
	      System.out.println("Comedian's Character name is : "+allActors.get(i).getComedianCharName());
		}	
		
		if( allActors.get(i).getVillainName()  != null)
		{
	      System.out.println("Villain name is : "+allActors.get(i).getVillainName());
		}
	
	
	  if( allActors.get(i).getVillainCharName()  != null)
		{
	      System.out.println("Villain's Character name is : "+allActors.get(i).getVillainCharName());
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

