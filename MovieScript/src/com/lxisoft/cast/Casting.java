package com.lxisoft.cast;

import java.util.*;
import com.lxisoft.storyline.*;
import com.lxisoft.cast.*;

public class Casting
{
	


Scanner sc=new Scanner(System.in);

Actor hero=new Hero();
Actor heroine=new Heroine();
Actor comedian=new Comedian();
Actor villan =new Villan();



 

 Map<String,ArrayList<Actor>> castMap=new HashMap<String,ArrayList<Actor>>();
ArrayList<Actor> actors=new ArrayList<Actor>();



public void setHeroName()
{
	int i, numberOfHeroCharacters,numberOfHeroineCharacters,numberOfComedianCharacters,numberOfVillanCharacters;
	System.out.println("Enter the number of heros: ");
	numberOfHeroCharacters=sc.nextInt();
	
	for(i=0;i<numberOfHeroCharacters;i++)
	{
			actors.add(new Hero());

		System.out.println("Enter the name of hero "+(i+1));
		hero.actorName=sc.next();	
		actors.get(i).setActorName(hero.actorName);
		
		System.out.println("Enter the Character name of "+hero.actorName);
		hero.characterName=sc.next();
	
		actors.get(i).setCharacterName(hero.characterName);
		//if(actors.get(i) instanceof Hero)
		 //castMap.put("Hero",actors);
		
		
	
		
	
	}
int j,n,m;
j=actors.size();
	System.out.println("Enter the number of heroines: ");
	numberOfHeroineCharacters=sc.nextInt();
	
	for( i=0;i<numberOfHeroineCharacters;i++)
	{	actors.add(new Heroine());
		System.out.println("Enter the name of heroines "+(i+1));
		heroine.actorName=sc.next();
		actors.get(j).setActorName(heroine.actorName);	
		System.out.println("Enter the Character name of "+heroine.actorName);
		heroine.characterName=sc.next();
		actors.get(j).setCharacterName(heroine.characterName);
		//if(actors.get(i) instanceof Heroine)
			
		
		
	
j++;		
		
	}
		n=actors.size();
		System.out.println("Enter the number of Comedian: ");
	numberOfComedianCharacters=sc.nextInt();
	for( i=0;i<numberOfComedianCharacters;i++)
	{	actors.add(new Comedian());
		System.out.println("Enter the name of Comedian "+(i+1));
		comedian.actorName=sc.next();
		actors.get(n).setActorName(comedian.actorName);	
		System.out.println("Enter the Character name of "+comedian.actorName);
		comedian.characterName=sc.next();
		actors.get(n).setCharacterName(comedian.characterName);
		//if(actors.get(i) instanceof Comedian)
		n++;
	
	}
	m=actors.size();
	System.out.println("Enter the number of Villian: ");
	numberOfVillanCharacters=sc.nextInt();
		
	for( i=0;i<numberOfVillanCharacters;i++)
	{
		actors.add(new Villan());
			System.out.println("Enter the name of Villian "+(i+1));
		 villan.actorName=sc.next();
		 actors.get(m).setActorName(villan.actorName);	
		System.out.println("Enter the Character name of "+villan.actorName);
		 villan.characterName=sc.next();
		actors.get(m).setCharacterName(villan.characterName);
		//if(actors.get(i) instanceof Villan)
		
		
		//m++;
		

		 
	}



}
/*
public void setHeroineName()
{
	System.out.println("Enter the number of heroines: ");
	numberOfCharacters=sc.nextInt();
	
	for(int i=0;i<numberOfCharacters;i++)
	{	actors.add(new Heroine());
		System.out.println("Enter the name of heroines "+(i+1));
		heroine.actorName=sc.next();
		actors.get(i).setActorName(heroine.actorName);	
		System.out.println("Enter the Character name of "+heroine.actorName);
		heroine.characterName=sc.next();
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
	{	actors.add(new Comedian());
		System.out.println("Enter the name of Comedian "+(i+1));
		comedian.actorName=sc.next();
		actors.get(i).setActorName(comedian.actorName);	
		System.out.println("Enter the Character name of "+comedian.actorName);
		comedian.characterName=sc.next();

		
		
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
		actors.add(new Villan());
			System.out.println("Enter the name of Villian "+(i+1));
		 villan.actorName=sc.next();
		 actors.get(i).setActorName(villan.actorName);	
		System.out.println("Enter the Character name of "+villan.actorName);
		 villan.characterName=sc.next();
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
 			
 		
 /* }	 

}*/

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


public Map<String,ArrayList<Actor>> getMap()
{	
	putActorsInMap();
	return castMap;
}

public void putActorsInMap()
{	setHeroName();
	 for(int i=0;i<actors.size();i++)
	 {
	 	if(actors.get(i) instanceof Hero)
	 	{
	 		 
	 		//System.out.println(actors.get(i).getActorName()+" "+actors.get(i).getCharacterName());
	 		castMap.put("Hero",actors);
	 	}
	 
	 	if(actors.get(i) instanceof Heroine)
	 	{
	 		//System.out.println(actors.get(i).getActorName()+" "+actors.get(i).getCharacterName());
	 		castMap.put("Heroine",actors);
	 	}
	
	 	if(actors.get(i) instanceof Comedian)
	 	{
	 		//System.out.println(actors.get(i).getActorName()+" "+actors.get(i).getCharacterName());
	 		castMap.put("Comedian",actors);	
	 	}
	 	
	 	if(actors.get(i) instanceof Villan)
	 	{
	 		//
	 		castMap.put("Villian",actors);	
	 		//
	 	}
	 	//System.out.println(actors.get(i).getActorName()+" "+actors.get(i).getCharacterName());

	 }
	 //System.out.println(castMap.get("Hero").getActorName()+" "+castMap.get("Hero").getCharacterName());
	// viewArraylist();
}


public ArrayList<Actor> getActorsArraylist()
{
	return actors;
}


	
	public void makeCasting()
{
			setHeroName();
			/*setHeroineName();
			setComedianName();
			setVillianName();*/


			//displayAll();

}


public void viewArraylist()
{
	//setHeroName();
	/*setHeroineName();
	setComedianName();
	setVillianName();*/
	//for(int k=0; k<actors.size();k++)
	//{	
		//System.out.println(" "+castMap.get("Hero").get(k).getActorName()+" "+castMap.get("Hero").get(k).getCharacterName()+" ");
		//System.out.println(" "+castMap.get("Heroine").get(k).getActorName()+" "+castMap.get("Heroine").get(k).getCharacterName()+" ");
		//System.out.println(" "+castMap.get("Comedian").get(0).getActorName()+" "+castMap.get("Comedian").get(0).getCharacterName()+" ");
		//System.out.println(" "+castMap.get("Villian").get(k).getActorName()+" "+castMap.get("Villian").get(k).getCharacterName()+" ");
	//}

	
}
/*public void displayAllCast()
{

	
displayHero();
displayHeroine();
displayComedian();
displayVillan();
 

 
  
    
}*/



}