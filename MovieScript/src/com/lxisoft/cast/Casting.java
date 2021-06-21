package com.lxisoft.cast;

import java.util.*;
import com.lxisoft.storyline.*;
import com.lxisoft.cast.*;

public class Casting
{
	
int numberOfCharacters;

Scanner sc=new Scanner(System.in);

Actor hero=new Hero();
Actor heroine=new Heroine();
Actor comedian=new Comedian();
Actor villan =new Villan();



ArrayList<Actor> actors=new ArrayList<Actor>();

Map<String,ArrayList<Actor>> castMap=new HashMap<String,ArrayList<Actor>>();

Map<String,ArrayList<Actor>> heroMap=new HashMap<String,ArrayList<Actor>>();
Map<String,ArrayList<Actor>> heroineMap=new HashMap<String,ArrayList<Actor>>();
Map<String,ArrayList<Actor>> comedianMap=new HashMap<String,ArrayList<Actor>>();
Map<String,ArrayList<Actor>> villanMap=new HashMap<String,ArrayList<Actor>>();		


public void setHeroName()
{
	System.out.println("Enter the number of heros: ");
	numberOfCharacters=sc.nextInt();
	for(int i=0;i<numberOfCharacters;i++)
	{
		
		System.out.println("Enter the name of hero "+(i+1));
		hero.actorName=sc.next();	
		
		
		System.out.println("Enter the Character name of "+hero.actorName);
		hero.characterName=sc.next();
		actors.add(new Hero());
		actors.get(i).setActorName(hero.actorName);
		actors.get(i).setCharacterName(hero.characterName);
		//if(actors.get(i) instanceof Hero)
		 heroMap.put("Hero",actors);
		
		
		
	
	}


}
public void setHeroineName()
{
	System.out.println("Enter the number of heroines: ");
	numberOfCharacters=sc.nextInt();
	for(int i=0;i<numberOfCharacters;i++)
	{	
		System.out.println("Enter the name of heroines "+(i+1));
		heroine.actorName=sc.next();	
		System.out.println("Enter the Character name of "+heroine.actorName);
		heroine.characterName=sc.next();
		
		actors.add(new Heroine());
		actors.get(i).setActorName(heroine.actorName);
		actors.get(i).setCharacterName(heroine.characterName);
		//if(actors.get(i) instanceof Heroine)
		heroineMap.put("Heroine",actors);	
		
	
		
		
	}


}
public void setComedianName()
{
	System.out.println("Enter the number of Comedian: ");
	numberOfCharacters=sc.nextInt();
	for(int i=0;i<numberOfCharacters;i++)
	{	
		System.out.println("Enter the name of Comedian "+(i+1));
		comedian.actorName=sc.next();	
		System.out.println("Enter the Character name of "+comedian.actorName);
		comedian.characterName=sc.next();

		actors.add(new Comedian());
		actors.get(i).setActorName(comedian.actorName);
		actors.get(i).setCharacterName(comedian.characterName);
		//if(actors.get(i) instanceof Comedian)
		comedianMap.put("Comedian",actors);	
		
		
		
	
	}


}
public void setVillianName()
{
	System.out.println("Enter the number of Villian: ");
	numberOfCharacters=sc.nextInt();
	for(int i=0;i<numberOfCharacters;i++)
	{
		
			System.out.println("Enter the name of Villian "+(i+1));
		 villan.actorName=sc.next();	
		System.out.println("Enter the Character name of "+villan.actorName);
		 villan.characterName=sc.next();
		
		  	actors.add(new Villan());
			actors.get(i).setActorName(villan.actorName);
		  	actors.get(i).setCharacterName(villan.characterName);
		//if(actors.get(i) instanceof Villan)
		villanMap.put("Villian",actors);	
		
		

		 
	}


}
public void displayCast()
{
	for(int i=0;i<actors.size();i++)
	{		if(actors.get(i) instanceof Hero)
 			{System.out.println(" "+castMap.get("Hero").get(i).getActorName()+" "+castMap.get("Hero").get(i).getCharacterName());
 			}
 			if(actors.get(i) instanceof Heroine)
 			{System.out.println(" "+castMap.get("Heroine").get(i).getActorName()+" "+castMap.get("Heroine").get(i).getCharacterName());
 			}
 			if(actors.get(i) instanceof Comedian)
 			{System.out.println(" "+castMap.get("Comedian").get(i).getActorName()+" "+castMap.get("Comedian").get(i).getCharacterName());
 			}
 			if(actors.get(i) instanceof Villan)
 			 {System.out.println(" "+castMap.get("Villian").get(i).getActorName()+" "+castMap.get("Villian").get(i).getCharacterName());
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


/*public Map<String,ArrayList<Actor>> getMap()
{	
	castMap.putAll(heroMap);
	castMap.putAll(heroineMap);
	castMap.putAll(comedianMap);
	castMap.putAll(villanMap);
	return castMap;
}*/

/*public void displayMap()
{
	 for(int i=0;i<actors.size();i++)
	 {
	 	System.out.print(castMap.get("Villian").get(i).getVillianCharacterName());
	 }
}*/
public Map<String,ArrayList<Actor>> getHeroMap()
{
	return heroMap;
}
public Map<String,ArrayList<Actor>> getHeroineMap()
{
	return heroineMap;
}
public Map<String,ArrayList<Actor>> getComedianMap()
{
	return comedianMap;
}
public Map<String,ArrayList<Actor>> getVillanMap()
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

/*public void displayAllCast()
{

	
displayHero();
displayHeroine();
displayComedian();
displayVillan();
 

 
  
    
}*/



}