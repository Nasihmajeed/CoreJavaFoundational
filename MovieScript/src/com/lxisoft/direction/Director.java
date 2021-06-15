package com.lxisoft.direction;

import com.lxisoft.cast.*;
import com.lxisoft.movie.*;

import java.util.*;

public class Director implements Directorable
{
	Scanner sc=new Scanner(System.in);
	
	//Director can set the actors
	
private int numOfMoviesDirected,numOfHero,numOfHeroine,numOfCom,numOfVillain;
private String directorName,directorLanguage;
private String heroName,heroineName,comedianName,villainName;
private String heroCharName,heroineCharName,comedianCharName,villainCharName;
	

ArrayList<Actor> allActors=new ArrayList<Actor>();
ArrayList<Hero> allHeroes=new ArrayList<Hero>();
ArrayList<Heroine> allHeroines=new ArrayList<Heroine>();
ArrayList<Comedian> allComedians=new ArrayList<Comedian>();
ArrayList<Villain> allVillains=new ArrayList<Villain>();

	
	public void setDirectorName(String directorName)
	{
		this.directorName=directorName;
	}
	
	
	public String getDirectorName()
	{
		return directorName;
	}
	
	
    public void setDirectorLanguage(String directorLanguage)
    {
      this.directorLanguage=directorLanguage;
    }

    public String getDirectorLanguage()
    {
     return directorLanguage;
    }



    public void setNumberOfMoviesDirected(int numOfMoviesDirected)
    {
      this.numOfMoviesDirected=numOfMoviesDirected;
    }

    public int getNumberOfMoviesDirected()
    {
     return numOfMoviesDirected;
    }
	
	 
	  
	
	
	  
	 //Casting the actors by the Director---
	 
	 public void castingTheHero()
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
		 
		 allActors.add(new Actor());
		 allHeroes.add(new Hero());

		 allActors.get(i).setActorName(heroName);
		 allHeroes.get(i).setHeroName(heroName);

		 System.out.println("\r\n");
		 
		 System.out.println("Enter the Character name of the Hero : ");
		 heroCharName=sc.next();
		 System.out.println("Name of the Hero's Character is : "+heroCharName);  
		 allActors.get(i).setActorCharName(heroCharName);
		 allHeroes.get(i).setHeroCharName(heroCharName);
		 
		 System.out.println("\r\n");
		 
		 
	 }
}

 public void castingTheHeroine()
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
		 
		 allActors.add(new Actor());
		 allHeroines.add(new Heroine());

		 allActors.get(i).setActorName(heroineName);
		 allHeroines.get(i).setHeroineName(heroineName);

		 System.out.println("\r\n");
		 
		 System.out.println("Enter the Character name of the Heroine : ");
		 heroineCharName=sc.next();
		 System.out.println("Name of the Heroine's Character is : "+heroineCharName);  
		 
		 allActors.get(i).setActorCharName(heroineCharName);
		 allHeroines.get(i).setHeroineCharName(heroineCharName);
		 
		
		 System.out.println("\r\n");
		  		 
	 }

}



 public void castingTheComedian()
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
		 
		 
		 allActors.add(new Actor());
		 allComedians.add(new Comedian());

		 allActors.get(i).setActorName(comedianName);
		 allComedians.get(i).setComedianName(comedianName);

		 System.out.println("\r\n");
		 
		 System.out.println("Enter the Character name of the Comedian : ");
		 comedianCharName=sc.next();
		 System.out.println("Name of the Comedian's Character is : "+comedianCharName);  
		 
		 allActors.get(i).setActorCharName(comedianCharName);
		 allComedians.get(i).setComedianCharName(comedianCharName);
		 
		 
		 System.out.println("\r\n");
		 
	 }

}



public void castingTheVillain()
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
		 
		 
		 allActors.add(new Actor());
		 allVillains.add(new Villain());
		 allActors.get(i).setActorName(villainName);
		 allVillains.get(i).setVillainName(villainName);

		 System.out.println("\r\n");
		 
		 System.out.println("Enter the Character name of the Villain : ");
		 villainCharName=sc.next();
		 System.out.println("Name of the Villain's Character is : "+villainCharName);  
		 
		 allActors.get(i).setActorCharName(villainCharName);
		 allVillains.get(i).setVillainCharName(villainCharName);

	 }

}



public ArrayList<Hero> returnHero()
{
	return allHeroes;
}

public ArrayList<Heroine> returnHeroine()
{
	return allHeroines;
}

public ArrayList<Comedian> returnComedian()
{
	return allComedians;
}

public ArrayList<Villain> returnVillain()
{
	return allVillains;
}


public void printCharacters()
{
	  System.out.println("\r\n");
		
		System.out.println("---------------------------------------------------------------------------");
    System.out.println("---------------------------------------------------------------------------");
    System.out.println("----------------------------=====CHARACTERS=====---------------------------");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------------");
		
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
		System.out.println("---------------------------------------------------------------------------------");
		
		
		
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
		System.out.println("----------------------------------------------------------------------------------");
	
	
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
		System.out.println("-----------------------------------------------------------------------------------");
		
		
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
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------");
	
	
}
	  	
}