package com.lxisoft.cast;

import java.util.*;
import com.lxisoft.storyline.*;
import com.lxisoft.cast.*;

public class Casting
{
	
int numberOfCharacters,i;

Scanner sc=new Scanner(System.in);

Actors hero=new Hero();
Actors heroine=new Heroine();
Actors comedian=new Comedian();
Actors villan =new Villan();



ArrayList<Actors> actorsHero=new ArrayList<Actors>();
ArrayList<Actors> actorsHeroine=new ArrayList<Actors>();
ArrayList<Actors> actorsComedian=new ArrayList<Actors>();
ArrayList<Actors> actorsVillan=new ArrayList<Actors>();


public Map<String,ArrayList<Actors>> castMap=new HashMap<String,ArrayList<Actors>>();

public void setHeroName()
{
	System.out.println("Enter the number of heros: ");
	numberOfCharacters=sc.nextInt();
	for(i=0;i<numberOfCharacters;i++)
	{
		
			System.out.println("Enter the name of hero "+(i+1));
		hero.heroName=sc.next();	
		actorsHero.add(new Hero());
		actorsHero.get(i).setHeroName(hero.heroName);

	System.out.println("Enter the Character name of "+actorsHero.get(i).getHeroName());
		hero.heroCharacterName=sc.next();

		actorsHero.get(i).setHeroCharacterName(hero.heroCharacterName);
	castMap.put("Hero",actorsHero);	
		
	
	}


}
public void setHeroineName()
{
	System.out.println("Enter the number of heroines: ");
	numberOfCharacters=sc.nextInt();
	for(i=0;i<numberOfCharacters;i++)
	{	
			System.out.println("Enter the name of heroines "+(i+1));
		heroine.heroineName=sc.next();	
		actorsHeroine.add(new Heroine());
		actorsHeroine.get(i).setHeroineName(heroine.heroineName);


		System.out.println("Enter the Character name of "+actorsHeroine.get(i).getHeroineName());
		heroine.heroineCharacterName=sc.next();
		actorsHeroine.get(i).setHeroineCharacterName(heroine.heroineCharacterName);


	castMap.put("Heroine",actorsHeroine);	
		
		
	}


}
public void setComedianName()
{
	System.out.println("Enter the number of Comedian: ");
	numberOfCharacters=sc.nextInt();
	for(i=0;i<numberOfCharacters;i++)
	{	
			System.out.println("Enter the name of Comedian "+(i+1));
		comedian.comedianName=sc.next();	
		actorsComedian.add(new Comedian());
		actorsComedian.get(i).setComedianName(comedian.comedianName);

		System.out.println("Enter the Character name of "+actorsComedian.get(i).getComedianName());
		comedian.comedianCharacterName=sc.next();
		actorsComedian.get(i).setComedianCharacterName(comedian.comedianCharacterName);

		castMap.put("Comedian",actorsComedian);	
		
	
	}


}
public void setVillianName()
{
	System.out.println("Enter the number of Villian: ");
	numberOfCharacters=sc.nextInt();
	for(i=0;i<numberOfCharacters;i++)
	{
		
			System.out.println("Enter the name of Villian "+(i+1));
		 villan.villianName=sc.next();	
		 actorsVillan.add(new Villan());
		actorsVillan.get(i).setVillianName(villan.villianName);

	System.out.println("Enter the Character name of "+actorsVillan.get(i).getVillianName());
		 villan.villianCharacterName=sc.next();
		  actorsVillan.get(i).setVillianCharacterName(villan.villianCharacterName);

		 castMap.put("Villian",actorsVillan);	

		 
	}


}
public void displayHero()
{
	for(i=0;i<actorsHero.size();i++)
	{
 		
 			System.out.println(" "+castMap.get("Hero").get(i).getHeroName()+" "+castMap.get("Hero").get(i).getHeroCharacterName());
 		
  }	 

}

public void displayHeroine()
{
		 for (i=0;i<actorsHeroine.size() ;i++ ) {
     	  
 		
 		
 			System.out.println(" "+actorsHeroine.get(i).getHeroineName()+" "+actorsHeroine.get(i).getHeroineCharacterName());  
 			
 		}  
}
public void displayComedian()
{

     	 for (i=0;i<actorsComedian.size();i++ ) 
     	 {
     	
 		System.out.println(" "+actorsComedian.get(i).getComedianName()+" "+actorsComedian.get(i).getComedianCharacterName());
 		
 	 	   } 
}
public void displayVillan()
{ for (i=0;i<actorsVillan.size();i++ ) 
	{
     	  	   	  
     	  	   	   	
 		System.out.println(" "+actorsVillan.get(i).getVillianName()+" "+actorsVillan.get(i).getVillianCharacterName());	
 		
     	  	   	  } 	  
}



public Map<String,ArrayList<Actors>> getMap()
{
	return castMap;
}



	
	public void makeCasting()
{
			setHeroName();
			setHeroineName();
			setComedianName();
			setVillianName();


			//displayAll();

}

public void displayAllCast()
{

	
displayHero();
displayHeroine();
displayComedian();
displayVillan();
 

 
  
    
}



}