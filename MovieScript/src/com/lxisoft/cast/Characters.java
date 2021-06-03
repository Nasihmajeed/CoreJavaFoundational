package com.lxisoft.cast;

import java.util.*;

import com.lxisoft.scripts.*;

import com.lxisoft.movie.*;


public class Characters extends Actors 
{
	Scanner sc=new Scanner(System.in);
	
	String heroName,heroineName,comedianName,heroCharName,heroineCharName,comedianCharName;
	
	int numOfHero,numOfHeroine,numOfCom;
	
	
	ArrayList<Actors> all=new ArrayList<Actors>();
	
	ArrayList<Hero> heroes=new ArrayList<Hero>();
	ArrayList<Heroine> heroines=new ArrayList<Heroine>();
	ArrayList<Comedian> comedians=new ArrayList<Comedian>();
	
	
	Map<String , ArrayList<Actors> > actorsMap=new HashMap<String , ArrayList<Actors>>(); //Map for saving all the actors using the key-----Hero
	
	
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

