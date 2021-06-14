package com.lxisoft.cast;

import java.util.*;
import com.lxisoft.storyline.*;
import com.lxisoft.cast.*;

public class Casting
{
	
int numberOfCharacters,i;

Scanner sc=new Scanner(System.in);

Hero hero=new Hero();
Heroine heroine=new Heroine();
Comedian comedian=new Comedian();
Villan villan =new Villan();



ArrayList<Hero> actorsHero=new ArrayList<Hero>();
ArrayList<Heroine> actorsHeroine=new ArrayList<Heroine>();
ArrayList<Comedian> actorsComedian=new ArrayList<Comedian>();
ArrayList<Villan> actorsVillan=new ArrayList<Villan>();



		Map<String,ArrayList<Hero>> heroMap=new HashMap<String,ArrayList<Hero>>();
		Map<String,ArrayList<Heroine>> heroineMap=new HashMap<String,ArrayList<Heroine>>();
		Map<String,ArrayList<Comedian>> comedianMap=new HashMap<String,ArrayList<Comedian>>();
		Map<String,ArrayList<Villan>> villanMap=new HashMap<String,ArrayList<Villan>>();

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
	heroMap.put("Hero",actorsHero);	
		
	
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


	heroineMap.put("Heroine",actorsHeroine);	
		
		
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

		comedianMap.put("Comedian",actorsComedian);	
		
	
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

		 villanMap.put("Villian",actorsVillan);	

		 
	}


}
public void displayHero()
{
	for(i=0;i<actorsHero.size();i++)
	{
 		
 			System.out.println(" "+heroMap.get("Hero").get(i).getHeroName()+" "+heroMap.get("Hero").get(i).getHeroCharacterName());
 		
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



/*public Map<String,ArrayList<Actors>> getMap()
{
	return castMap;
}*/

public Map<String,ArrayList<Hero>> getHeroMap()
{
	return heroMap;
}
public Map<String,ArrayList<Heroine>> getHeroineMap()
{
	return heroineMap;
}
public Map<String,ArrayList<Comedian>> getComedianMap()
{
	return comedianMap;
}
public Map<String,ArrayList<Villan>> getVillanMap()
{
	return villanMap;
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