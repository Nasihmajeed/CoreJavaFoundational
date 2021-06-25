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



public void setActorsName()
{	
	int i, numberOfHeroCharacters,numberOfHeroineCharacters,numberOfComedianCharacters,numberOfVillanCharacters;
	System.out.println("Enter the number of heros: ");
	numberOfHeroCharacters=sc.nextInt();
	
	for(i=0;i<numberOfHeroCharacters;i++)
	{
			actors.add(new Hero());

		System.out.println("Enter the name of hero "+(i+1));
		hero.heroName=sc.next();	
		actors.get(i).setHeroName(hero.heroName);
		
		System.out.println("Enter the Character name of "+hero.heroName);
		hero.heroCharacterName=sc.next();
	
		actors.get(i).setHeroCharacterName(hero.heroCharacterName);
		//if(actors.get(i) instanceof Hero)
		 castMap.put("Hero",actors);
		
		
	
		
	
	}
int j,n,m;
j=actors.size();
	System.out.println("Enter the number of heroines: ");
	numberOfHeroineCharacters=sc.nextInt();
	
	for( i=0;i<numberOfHeroineCharacters;i++)
	{	actors.add(new Heroine());
		System.out.println("Enter the name of heroines "+(i+1));
		heroine.heroineName=sc.next();
		
		actors.get(j).setHeroineName(heroine.heroineName);	
		System.out.println("Enter the Character name of "+heroine.heroineName);
		heroine.heroineCharacterName=sc.next();
		
		actors.get(j).setHeroineCharacterName(heroine.heroineCharacterName);
		//if(actors.get(i) instanceof Heroine)
			castMap.put("Heroine",actors);
		
		
	
j++;		
		
	}
		n=actors.size();
		System.out.println("Enter the number of Comedian: ");
	numberOfComedianCharacters=sc.nextInt();
	for( i=0;i<numberOfComedianCharacters;i++)
	{	actors.add(new Comedian());
		System.out.println("Enter the name of Comedian "+(i+1));
		comedian.comedianName=sc.next();
		
		actors.get(n).setComedianName(comedian.comedianName);	
		System.out.println("Enter the Character name of "+comedian.comedianName);
		comedian.comedianCharacterName=sc.next();
		
		actors.get(n).setComedianCharacterName(comedian.comedianCharacterName);
		//if(actors.get(i) instanceof Comedian)
		castMap.put("Comedian",actors);
		n++;
	
	}
	m=actors.size();
	System.out.println("Enter the number of Villian: ");
	numberOfVillanCharacters=sc.nextInt();
		
	for( i=0;i<numberOfVillanCharacters;i++)
	{
		actors.add(new Villan());
		System.out.println("Enter the name of Villian "+(i+1));
		 villan.villianName=sc.next();
		actors.get(m).setVillianName(villan.villianName);	
		System.out.println("Enter the Character name of "+villan.villianName);
		 villan.villianCharacterName=sc.next();
		actors.get(m).setVillianCharacterName(villan.villianCharacterName);
		//if(actors.get(i) instanceof Villan)
		castMap.put("Villian",actors);
		m++;
		

		 
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


	
	public void makeCasting()
{
			setActorsName();
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