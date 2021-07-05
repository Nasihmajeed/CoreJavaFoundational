package com.lxisoft.cast;

import java.util.*;
import com.lxisoft.storyline.*;
import com.lxisoft.cast.*;

public class Casting
{
	


Scanner sc=new Scanner(System.in);

/*Actor hero=new Hero();
Actor heroine=new Heroine();
Actor comedian=new Comedian();
Actor villan =new Villan();*/

Map<String,ArrayList<Actor>> castMap=new HashMap<String,ArrayList<Actor>>();
ArrayList<Actor> actors=new ArrayList<Actor>();

public void setActorsName()
{	
	int i, numberOfHeroCharacters,numberOfHeroineCharacters,numberOfComedianCharacters,numberOfVillanCharacters;
	String heroName,heroCharacterName,heroineName,heroineCharacterName,comedianName,comedianCharacterName,villianName,villianCharacterName;

	System.out.println("Enter the number of heros: ");
	numberOfHeroCharacters=sc.nextInt();
	
	for(i=0;i<numberOfHeroCharacters;i++)
	{
			

		System.out.println("Enter the name of hero "+(i+1));
		heroName=sc.next();	
		//actors.get(i).setHeroName(hero.heroName);
		
		System.out.println("Enter the Character name of "+heroName);
		heroCharacterName=sc.next();
		actors.add(new Hero(heroName,heroCharacterName));
	
		//actors.get(i).setHeroCharacterName(hero.heroCharacterName);
		//if(actors.get(i) instanceof Hero)
		 castMap.put("Hero",actors);
		
		}
int j,n,m;
//j=actors.size();
	System.out.println("Enter the number of heroines: ");
	numberOfHeroineCharacters=sc.nextInt();
	
	for( i=0;i<numberOfHeroineCharacters;i++)
	{	
		System.out.println("Enter the name of heroines "+(i+1));
		heroineName=sc.next();
		
		//actors.get(i).setHeroineName(heroine.heroineName);	
		System.out.println("Enter the Character name of "+heroineName);
		heroineCharacterName=sc.next();
		actors.add(new Heroine(heroineName,heroineCharacterName));
		//actors.get(i).setHeroineCharacterName(heroine.heroineCharacterName);
		//if(actors.get(i) instanceof Heroine)
			castMap.put("Heroine",actors);
		
		
	
//j++;		
		
	}
		//n=actors.size();
		System.out.println("Enter the number of Comedian: ");
	numberOfComedianCharacters=sc.nextInt();
	for( i=0;i<numberOfComedianCharacters;i++)
	{	
		System.out.println("Enter the name of Comedian "+(i+1));
		comedianName=sc.next();
		
		//actors.get(i).setComedianName(comedian.comedianName);	
		System.out.println("Enter the Character name of "+comedianName);
		comedianCharacterName=sc.next();
		actors.add(new Comedian(comedianName,comedianCharacterName));
		//actors.get(i).setComedianCharacterName(comedian.comedianCharacterName);
		//if(actors.get(i) instanceof Comedian)
		castMap.put("Comedian",actors);
		//n++;
	
	}
	//m=actors.size();
	System.out.println("Enter the number of Villian: ");
	numberOfVillanCharacters=sc.nextInt();
		
	for( i=0;i<numberOfVillanCharacters;i++)
	{
		
		System.out.println("Enter the name of Villian "+(i+1));
		villianName=sc.next();
		//actors.get(i).setVillianName(villan.villianName);	
		System.out.println("Enter the Character name of "+villianName);
		 villianCharacterName=sc.next();
		 actors.add(new Villan(villianName,villianCharacterName));
		//actors.get(i).setVillianCharacterName(villan.villianCharacterName);
		//if(actors.get(i) instanceof Villan)
		castMap.put("Villian",actors);
		//m++;
		

		 
	}



}



public Map<String,ArrayList<Actor>> getMap()
{	
	//putActorsInMap();
	return castMap;
}




public ArrayList<Actor> getActorsArraylist()
{
	return actors;
}


	








}