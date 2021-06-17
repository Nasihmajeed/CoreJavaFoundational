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



ArrayList<Actors> actors=new ArrayList<Actors>();
/*ArrayList<Heroine> actorsHeroine=new ArrayList<Heroine>();
ArrayList<Comedian> actorsComedian=new ArrayList<Comedian>();
ArrayList<Villan> actorsVillan=new ArrayList<Villan>();*/



		Map<String,ArrayList<Actors>> castMap=new HashMap<String,ArrayList<Actors>>();
		/*Map<String,ArrayList<Heroine>> heroineMap=new HashMap<String,ArrayList<Heroine>>();
		Map<String,ArrayList<Comedian>> comedianMap=new HashMap<String,ArrayList<Comedian>>();
		Map<String,ArrayList<Villan>> villanMap=new HashMap<String,ArrayList<Villan>>();*/



public void setHeroName()
{
	System.out.println("Enter the number of heros: ");
	numberOfCharacters=sc.nextInt();
	for(i=0;i<numberOfCharacters;i++)
	{
		
		System.out.println("Enter the name of hero "+(i+1));
		hero.heroName=sc.next();	
		
		
		System.out.println("Enter the Character name of "+hero.heroName);
		hero.heroCharacterName=sc.next();
		actors.add(new Hero());
		actors.get(i).setHeroName(hero.heroName);
		actors.get(i).setHeroCharacterName(hero.heroCharacterName);
		if(actors.get(i) instanceof Hero)
		{castMap.put("Hero",actors);
		}
		
		
	
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
		System.out.println("Enter the Character name of "+heroine.heroineName);
		heroine.heroineCharacterName=sc.next();
		
		actors.add(new Heroine());
		actors.get(i).setHeroineName(heroine.heroineName);
		actors.get(i).setHeroineCharacterName(heroine.heroineCharacterName);
		//if(actors.get(i) instanceof Heroine)
		castMap.put("Heroine",actors);	
		
	
		
		
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
		System.out.println("Enter the Character name of "+comedian.comedianName);
		comedian.comedianCharacterName=sc.next();

		actors.add(new Comedian());
		actors.get(i).setComedianName(comedian.comedianName);
		actors.get(i).setComedianCharacterName(comedian.comedianCharacterName);
		//if(actors.get(i) instanceof Comedian)
		castMap.put("Comedian",actors);	
		
		
		
	
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
		System.out.println("Enter the Character name of "+villan.villianName);
		 villan.villianCharacterName=sc.next();
		
		  	actors.add(new Villan());
			actors.get(i).setVillianName(villan.villianName);
		  	actors.get(i).setVillianCharacterName(villan.villianCharacterName);
		//if(actors.get(i) instanceof Villan)
		castMap.put("Villian",actors);	
		
		

		 
	}


}
public void displayHero()
{
	for(i=0;i<actors.size();i++)
	{		if(actors.get(i) instanceof Hero)
 			{System.out.println(" "+castMap.get("Hero").get(i).getHeroName()+" "+castMap.get("Hero").get(i).getHeroCharacterName());
 			}
 			if(actors.get(i) instanceof Heroine)
 			{System.out.println(" "+castMap.get("Heroine").get(i).getHeroineName()+" "+castMap.get("Heroine").get(i).getHeroineCharacterName());
 			}
 			if(actors.get(i) instanceof Comedian)
 			{System.out.println(" "+castMap.get("Comedian").get(i).getComedianName()+" "+castMap.get("Comedian").get(i).getComedianCharacterName());
 			}
 			if(actors.get(i) instanceof Villan)
 			 {System.out.println(" "+castMap.get("Villian").get(i).getVillianName()+" "+castMap.get("Villian").get(i).getVillianCharacterName());
 			}
 			/*{
 				
 			}*/
 			
 		
  }	 

}

/*public void displayHeroine()
{
		 for (i=0;i<actors.size() ;i++ ) {
     	  
 		  	
 			if(actors.get(i) instanceof Heroine)
 			{
 			
 			}
 			
 			
 		}  
}
public void displayComedian()
{

     	 for (i=0;i<actors.size();i++ ) 
     	 {
     	 	
     	 	
     		if(actors.get(i) instanceof Comedian)
     		{
     			
     		}
 		
 		
 	 	   } 
}
public void displayVillan()
{ for (i=0;i<actors.size();i++ ) 
	{
     		 	   	  
     	if(actors.get(i) instanceof Villan)
     	 {
     	 	
     	 } 	     	
 		
 		
      } 	  
}
*/


public Map<String,ArrayList<Actors>> getMap()
{
	return castMap;
}

public void displayMap()
{
	 for(i=0;i<actors.size();i++)
	 {
	 	System.out.print(castMap.get("Villian").get(i).getVillianCharacterName());
	 }
}
/*public Map<String,ArrayList<Hero>> getHeroMap()
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
*/




	
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
/*displayHeroine();
displayComedian();
displayVillan();*/
 

 
  
    
}



}