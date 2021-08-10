package com.lxisoft.direction;

import com.lxisoft.cast.*;
import com.lxisoft.movie.*;

import java.util.*;
import java.io.*;

import com.lxisoft.resources.DisplayUtility;

public class Director
{
    DisplayUtility sleep=new DisplayUtility();


	Scanner sc=new Scanner(System.in);
	
    private String name;
 
 
	public void setName(String name)
	{
		this.name=name;
	}
	
	
	public String getName()
	{
		return name;
	}
	  
	 //Casting the actors by the Director---
	 
public ArrayList<Actor> castingTheActors(ArrayList<Actor> actors)
   {
         //Casting the Heroes
    {
       System.out.println("---------------------------------------------------------------------------------------------------------");
	   System.out.println("Enter the number of heroes in the movie : ");
	   int numOfHero=sc.nextInt(); 
	   sleep.sleepStatement();
	   System.out.println("Number of heroes in the Movie is : "+numOfHero);
	   System.out.println("---------------------------------------------------------------------------------------------------------");
	  for(int i=0 ; i<numOfHero ; i++)
	    {
		 
		 System.out.println("\r\n");
		 System.out.println("---------------------------------------------------------------------------------------------------------");
		 System.out.println("Enter the name of the Hero : ");  
		 String name=sc.next();
		 sleep.sleepStatement();
		 System.out.println("Name of the Hero is: "+name);
		 System.out.println("---------------------------------------------------------------------------------------------------------");
         
         System.out.println("---------------------------------------------------------------------------------------------------------");
         System.out.println("Enter the Character name of the Hero : ");
		 String charName=sc.next();
		 sleep.sleepStatement();
		 System.out.println("Name of the Hero's Character is : "+charName);
		 System.out.println("---------------------------------------------------------------------------------------------------------");  
         actors.add(new Hero(name,charName));

        } 	 
		
		 System.out.println("\r\n"); 
     

		//Casting the Heroine
           
           
     
        System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println("Enter the number of heroines in the movie : ");
        int numOfHeroine=sc.nextInt(); 
	    System.out.println("Number of heroines in the Movie is : "+numOfHeroine);
	    System.out.println("---------------------------------------------------------------------------------------------------------");
	   for(int i=0 ; i<numOfHeroine ; i++)
	    {
		 System.out.println("\r\n");
		 System.out.println("---------------------------------------------------------------------------------------------------------");
		 System.out.println("Enter the name of the Heroine : ");  
		 String name=sc.next();
		 System.out.println("Name of the Heroine is: "+name);
         System.out.println("---------------------------------------------------------------------------------------------------------");

         System.out.println("---------------------------------------------------------------------------------------------------------");
         System.out.println("Enter the Character name of the Heroine : ");
		 String charName=sc.next();
		 System.out.println("Name of the Heroine's Character is : "+charName);
		 System.out.println("---------------------------------------------------------------------------------------------------------");  
		 actors.add(new Heroine(name,charName));
         
         
        }
     
       System.out.println("\r\n");
    
       //Casting the Comedians
       

       System.out.println("---------------------------------------------------------------------------------------------------------");
       System.out.println("Enter the number of Comedian in the movie : ");
       int numOfComedian=sc.nextInt();
	   System.out.println("Number of comedians in the Movie is : "+numOfComedian);
	   System.out.println("---------------------------------------------------------------------------------------------------------");
	

	   for(int i=0 ; i<numOfComedian ; i++)
	    {
		 System.out.println("\r\n");
		 System.out.println("---------------------------------------------------------------------------------------------------------");
		 System.out.println("Enter the name of the Comedian : ");  
		 String name=sc.next();
		 System.out.println("Name of the Comedian is: "+name);
     	 System.out.println("---------------------------------------------------------------------------------------------------------");
         
         System.out.println("---------------------------------------------------------------------------------------------------------");
         System.out.println("Enter the Character name of the Comedian : ");
		 String charName=sc.next();
		 System.out.println("Name of the Comedian's Character is : "+charName);
		 System.out.println("---------------------------------------------------------------------------------------------------------");  
		 actors.add(new Comedian(name,charName));
		
		 
        }
          
        System.out.println("\r\n");

        //Casting the Villains
       

       System.out.println("---------------------------------------------------------------------------------------------------------");
       System.out.println("Enter the number of villains in the movie : ");
       int numOfVillain=sc.nextInt(); 
	   System.out.println("Number of villains in the Movie is : "+numOfVillain);
	   System.out.println("---------------------------------------------------------------------------------------------------------");

	    for(int i=0 ; i<numOfVillain ; i++)
	    {
		 System.out.println("\r\n");
		 System.out.println("---------------------------------------------------------------------------------------------------------");
		 System.out.println("Enter the name of the Villain : ");  
		 String name=sc.next();
		 System.out.println("Name of the Villain is: "+name);
         System.out.println("---------------------------------------------------------------------------------------------------------");
         
         System.out.println("---------------------------------------------------------------------------------------------------------");
         System.out.println("Enter the Character name of the Villain : ");
		 String charName=sc.next();
		 System.out.println("Name of the Villain's Character is : "+charName);  
		 System.out.println("---------------------------------------------------------------------------------------------------------");
		 actors.add(new Villain(name,charName));
		 

        }

       System.out.println("\r\n");

  }

  return actors;

}	    





//To print the characters to the user
    
public void printCharactersOfTheMovie( ArrayList<Actor> actors)
{
	  System.out.println("\r\n");
		
		System.out.println("******************************************************************************************************");	
        System.out.println("******************************************************************************************************");
            
                sleep.sleepStatement();

        System.out.println("**************************************=====CHARACTERS=====********************************************");
          sleep.sleepStatement();
		System.out.println("******************************************************************************************************");	
        System.out.println("******************************************************************************************************");
		
		        sleep.sleepStatement();

for(int i=0;i<actors.size();i++)
{
if(actors.get(i) instanceof Hero)
   {
    System.out.println("Starring>>>>>>"+actors.get(i).getActorName()+" : "+"Hero's Character Name : "+actors.get(i).getActorCharName());
   
            sleep.sleepStatement();
   }
 
  else if(actors.get(i) instanceof Heroine)
   {
    System.out.println("Starring>>>>>>"+actors.get(i).getActorName()+" : "+"Heroine's Character Name : "+actors.get(i).getActorCharName());
   
          sleep.sleepStatement();

   }
  else if(actors.get(i) instanceof Comedian)
   {
    System.out.println("Starring>>>>>>"+actors.get(i).getActorName()+" : "+"Comedian's Character Name : "+actors.get(i).getActorCharName());
   

            sleep.sleepStatement();
   }
  else if(actors.get(i) instanceof Villain)
   {
    System.out.println("Starring>>>>>>"+actors.get(i).getActorName()+" : "+"Villain's Character Name : "+actors.get(i).getActorCharName());
   
             sleep.sleepStatement();

   }      	
}
        System.out.println("******************************************************************************************************");	
        System.out.println("******************************************************************************************************");
        System.out.println("******************************************************************************************************");	
        
 }


}