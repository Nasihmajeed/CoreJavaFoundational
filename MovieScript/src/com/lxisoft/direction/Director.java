package com.lxisoft.direction;

import com.lxisoft.cast.*;
import com.lxisoft.movie.*;
//import com.lxisoft.scripts.*;

import java.util.*;

public class Director implements Directorable
{
	Scanner sc=new Scanner(System.in);
	
	List<String> qualities=new ArrayList<String>();
	
	{
		qualities.add("Stress-Tolerant");
		qualities.add("having Positive Attitude");
		qualities.add("Flexible");
		qualities.add("Using Time Efficiently");
		qualities.add("always Knowing How to be Diplomatic");
		qualities.add("a man who had to deal with lots of contoversies due to his arrogant attitude");
	}
	
private int numOfMov,numOfHero,numOfHeroine,numOfCom,numOfVillain;
private String directorName;
private String heroName,heroineName,comedianName,villainName;
private String heroCharName,heroineCharName,comedianCharName,villainCharName;
	
	
	public void setDirectorName(String directorName)
	{
		this.directorName=directorName;
	}
	
	public void setNumberOfMoviesDirected(int numOfMov)
	{
		this.numOfMov=numOfMov;
	}
	
	
	public String getDirectorName()
	{
		return directorName;
	}
	
	public int getNumberOfMoviesDirected()
	{
		return numOfMov;
	}
	
	public void directorDetails()
	{
		System.out.println("Name of the director is : "+getDirectorName());
		System.out.println("--------------------Director has directed "+getNumberOfMoviesDirected()+" movies--------------------------");
		System.out.println("\r\n");
	}
	
	
	public void qualitiesOfDirector()
	{
		         try{
					   Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }
					
		for(String a : qualities)
		{
			System.out.println("Director of the Movie is : "+a);
		}
	}
	
/*	 
	 Movie m=new Movie();
	ScriptWriter writer=new ScriptWriter();   Script writer is selected by the Director of the Movie 
	
	*/
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 //Casting the actors by the Director---
	 
	 ArrayList<Actors> allActors=new ArrayList<Actors>();
	 ArrayList<Hero> allHeroes=new ArrayList<Hero>();
	 ArrayList<Heroine> allHeroines=new ArrayList<Heroine>();
	 ArrayList<Comedian> allComedians=new ArrayList<Comedian>();
	 ArrayList<Villain> allVillains=new ArrayList<Villain>();
	 
	 int num=0;
	 String genre="";
	 
	 
	 public ArrayList<Hero> setHero()
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
		 allActors.get(i).setHeroCharName(heroCharName);
		 
		 allHeroes.add(new Hero());
		 allHeroes.get(i).setHeroName(heroName);
		 
		 System.out.println("\r\n");
		 
		 
	 }
return allHeroes;
}

public ArrayList<Heroine> setHeroine()
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
		 allActors.get(i).setHeroineCharName(heroineCharName);
		 
		 allHeroines.add(new Heroine());
		 allHeroines.get(i).setHeroineName(heroineName);
		 
		 System.out.println("\r\n");
		 
         		 
	 }
return allHeroines;
}

public ArrayList<Comedian> setComedian()
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
		 allActors.get(i).setComedianCharName(comedianCharName);
		 
		 allComedians.add(new Comedian());
		 allComedians.get(i).setComedianName(comedianName);
		 
		 System.out.println("\r\n");
		 
	 }
return allComedians;
}


public ArrayList<Villain> setVillain()
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
		 allActors.get(i).setVillainCharName(villainCharName);
		 
		 allVillains.add(new Villain());
		 allVillains.get(i).setVillainName(villainName);
		 
	 }
return allVillains;
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
		
		          try{
					    Thread.sleep(2000);
				       }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }
		
		
		
		System.out.println("-----------------------------Heroes in the Movie--------------------------------");
		{
			for(int i=0 ; i<allHeroes.size() ; i++)
                  {
		             System.out.println(allHeroes.get(i).getHeroName());
	              }
		}
		System.out.println("------------------------------------------------------------------------------------");
		
		
		
		           try{
					    Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }
   
        System.out.println("-----------------------------Heroines in the Movie--------------------------------");
		{
			for(int i=0 ; i<allHeroines.size() ; i++)
                  {
		             System.out.println(allHeroines.get(i).getHeroineName());
	              }
		}
		System.out.println("------------------------------------------------------------------------------------");
	
	
	              try{
					    Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }
	    
		
		
		System.out.println("-----------------------------Comedians in the Movie--------------------------------");
		{
			for(int i=0 ; i<allComedians.size() ; i++)
                  {
		             System.out.println(allComedians.get(i).getComedianName());
	              }
		}
		System.out.println("------------------------------------------------------------------------------------");
		
		
		         try{
					    Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }
		
		
		
		System.out.println("-----------------------------Villains in the Movie--------------------------------");
		{
			for(int i=0 ; i<allVillains.size() ; i++)
                  {
		             System.out.println(allVillains.get(i).getVillainName());
	              }
		}
		System.out.println("------------------------------------------------------------------------------------");
		
		
		
		
		System.out.println("---------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------------");
	    System.out.println("\r\n");
	
	/*
	
	
	genre=m.getMovieGenre();
	
	
	
	if(genre.equals("Romantic"))
	{
		num=1;
	}
	else if(genre.equals("Emotional"))
	{
		num=2;
	}
	else if(genre.equals("Comedy"))
	{
		num=3;
	}
	else if(genre.equals("Action"))
	{
		num=4;
	}
	
	
	
	writer.writingTheScript(num , allHeroes , allHeroines , allComedians , allVillains);
*/
}
	  	
}