package com.lxisoft.direction;

import com.lxisoft.cast.*;
import com.lxisoft.movie.*;

import java.util.*;
import java.io.*;

import resources.*;

public class Director
{
    DisplayUtility du=new DisplayUtility();


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
	 
public List<Actor> castActors(List<Actor> actors)
   {
         //Casting the Heroes
    {
       System.out.println("---------------------------------------------------------------------------------------------------------");
	   System.out.println("Enter the number of heroes in the movie : ");
	   int numOfHero=sc.nextInt(); 
	   
	   System.out.println("Number of heroes in the Movie is : "+numOfHero);
	   System.out.println("---------------------------------------------------------------------------------------------------------");
	  for(int i=0 ; i<numOfHero ; i++)
	    {
		 
		 System.out.println("\r\n");
		 System.out.println("---------------------------------------------------------------------------------------------------------");
		 System.out.println("Enter the name of the Hero : ");  
		 String name=sc.next();
		 
		 System.out.println("Name of the Hero is: "+name);
		 System.out.println("---------------------------------------------------------------------------------------------------------");
         
         System.out.println("---------------------------------------------------------------------------------------------------------");
         System.out.println("Enter the Character name of the Hero : ");
		 String characterName=sc.next();
		 
		 System.out.println("Name of the Hero's Character is : "+characterName);
		 System.out.println("---------------------------------------------------------------------------------------------------------");  
         actors.add(new Hero(name,characterName));

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
		 String characterName=sc.next();
		 System.out.println("Name of the Heroine's Character is : "+characterName);
		 System.out.println("---------------------------------------------------------------------------------------------------------");  
		 actors.add(new Heroine(name,characterName));
         
         
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
		 String characterName=sc.next();
		 System.out.println("Name of the Comedian's Character is : "+characterName);
		 System.out.println("---------------------------------------------------------------------------------------------------------");  
		 actors.add(new Comedian(name,characterName));
		
		 
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
		 String characterName=sc.next();
		 System.out.println("Name of the Villain's Character is : "+characterName);  
		 System.out.println("---------------------------------------------------------------------------------------------------------");
		 actors.add(new Villain(name,characterName));
		 

        }

       System.out.println("\r\n");

  }

  return actors;

}	    





//To print the characters to the user
    
public void printCharacters(List<Actor> actors)
{
	  System.out.println("\r\n");
		
		System.out.println("******************************************************************************************************");	
        System.out.println("******************************************************************************************************");
            
               du.pauseScreen();

        System.out.println("**************************************=====CHARACTERS=====********************************************");
         du.pauseScreen();
		System.out.println("******************************************************************************************************");	
        System.out.println("******************************************************************************************************");
		
		        du.pauseScreen();
for(int i=0;i<actors.size();i++)
{
if(actors.get(i) instanceof Hero)
   {
    System.out.println("Starring>>>>>>"+actors.get(i).getName()+" : "+"Hero's Character Name : "+actors.get(i).getCharacterName());
   
           du.pauseScreen();
   }
 
  else if(actors.get(i) instanceof Heroine)
   {
    System.out.println("Starring>>>>>>"+actors.get(i).getName()+" : "+"Heroine's Character Name : "+actors.get(i).getCharacterName());
   
          du.pauseScreen();

   }
  else if(actors.get(i) instanceof Comedian)
   {
    System.out.println("Starring>>>>>>"+actors.get(i).getName()+" : "+"Comedian's Character Name : "+actors.get(i).getCharacterName());
   

           du.pauseScreen();
   }
  else if(actors.get(i) instanceof Villain)
   {
    System.out.println("Starring>>>>>>"+actors.get(i).getName()+" : "+"Villain's Character Name : "+actors.get(i).getCharacterName());
   
            du.pauseScreen();

   }      	
}
        System.out.println("******************************************************************************************************");	
        System.out.println("******************************************************************************************************");
        System.out.println("******************************************************************************************************");	
        
 }


}