package com.lxisoft.cast;

import java.util.*;

//import com.lxisoft.scripts.*;

import com.lxisoft.movie.*;

public class Characters extends Actors 
{
	Scanner sc=new Scanner(System.in);
	
	
	String heroName,heroineName,comedianName;
	
	String heroCharName,heroineCharName,comedianCharName;
	
	int numOfHero,numOfHeroine,numOfCom;
	
	
	ArrayList<Actors> all=new ArrayList<Actors>();
	
	Map<String , ArrayList<Actors> > actorsMap=new HashMap<String , ArrayList<Actors> >(); //Map for saving all the actors using the key-----Hero
	
	
public void setHero()
{
	System.out.println("Enter the number of heroes in the movie : ");
     numOfHero=sc.nextInt(); 
     for(int i=0 ; i<numOfHero ; i++)
	 {
		 System.out.println("Enter Hero Name : ");  
		 heroName=sc.next();
		 
		 all.add(new Actors());
		 all.get(i).setHeroName(heroName);
		 
		 System.out.println("Enter the Character name of the Hero : ");
		 heroCharName=sc.next();
		 all.get(i).setHeroCharName(heroCharName);
		 
		 actorsMap.put("Hero",all);         // set a key for hero
		
	 }

}

public void setHeroine()
{
	System.out.println("Enter the number of heroines in the movie : ");
     numOfHeroine=sc.nextInt(); 
     for(int i=0 ; i<numOfHeroine ; i++)
	 {
		 System.out.println("Enter Heroine Name : ");  
		 heroineName=sc.next();
		 
		 all.add(new Actors());
		 all.get(i).setHeroineName(heroineName);
		 
		 System.out.println("Enter the Character name of the Heroine : ");
		 heroineCharName=sc.next();
		 all.get(i).setHeroineCharName(heroineCharName);
		 
		 actorsMap.put("Heroine",all);         // set a key for heroine
		
	 }

}

public void setComedian()
{
	System.out.println("Enter the number of comedians in the movie : ");
     numOfCom=sc.nextInt(); 
     for(int i=0 ; i<numOfCom ; i++)
	 {
		 System.out.println("Enter Comedian Name : ");  
		 comedianName=sc.next();
		 
		 all.add(new Actors());
		 all.get(i).setComedianName(comedianName);
		 
		 System.out.println("Enter the Character name of the Comedian : ");
		 comedianCharName=sc.next();
		 all.get(i).setComedianCharName(comedianCharName);
		 
		 actorsMap.put("Comedian",all);         // set a key for comedian
		
	 }
}


public void printCharacters()
{
	
   for(int i=0 ; i<all.size() ; i++)
    {
		System.out.println("\r\n");
		System.out.println("---------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------------");


		if( all.get(i).getHeroName()  != null)
		{
	      System.out.println("Hero name : "+all.get(i).getHeroName());		
		}
	   else
	   {
		   System.out.println("---------------------------------------------------------------------------");
	   }
	   
	   if( all.get(i).getHeroCharName()  != null)
		{
	      System.out.println("Hero's Character name : "+all.get(i).getHeroCharName());		
		}
	   else
	   {
		   System.out.println("---------------------------------------------------------------------------");
	   }
	   
	    if( all.get(i).getHeroineName()  != null)
		{
	      System.out.println("Heroine  name : "+all.get(i).getHeroineName());		
		}
	   else
	   {
		   System.out.println("---------------------------------------------------------------------------");
	   }
	   
	   
	    if( all.get(i).getHeroineCharName()  != null)
		{
	      System.out.println("Heroine's Character name : "+all.get(i).getHeroineCharName());	
		}
	   else
	   {
		   System.out.println("---------------------------------------------------------------------------");
	   }
	   
	   
	   if( all.get(i).getComedianName()  != null)
		{
	      System.out.println("Comedian name : "+all.get(i).getComedianName());
		}
	   else
	   {
		   System.out.println("---------------------------------------------------------------------------");
	   }
	  
	
	  if( all.get(i).getComedianCharName()  != null)
		{
	      System.out.println("Comedian's Character name : "+all.get(i).getComedianCharName());
		}
	   else
	   {
		   System.out.println("---------------------------------------------------------------------------");
	   }
	
	System.out.println("\r\n");
	
	
			
	}
	
}

}

