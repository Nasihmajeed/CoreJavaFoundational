package com.lxisoft.cast;
import java.util.*;
import com.lxisoft.storyline.*;
public class Characters extends Actors
{

String heroName; 
String heroineName; 
String comedianName; 
String villianName; 

String heroCharacterName; 
String heroineCharacterName; 
String comedianCharacterName; 
String villianCharacterName; 
Scanner sc=new Scanner(System.in);
Actors hero=new Actor();
ArrayList<Actors> actorsHero=new ArrayList<Actors>();
ArrayList<Actors> actorsHeroine=new ArrayList<Actors>();
ArrayList<Actors> actorsComedian=new ArrayList<Actors>();
ArrayList<Actors> actorsVillan=new ArrayList<Actors>();

//Mapping map=new Mapping();

public Map<String,ArrayList<Actors>> castMap=new HashMap<String,ArrayList<Actors>>();

public void setHeroName()
{
	System.out.println("Enter the number of heros: ");
	numberOfCharacters=sc.nextInt();
	for(i=0;i<numberOfCharacters;i++)
	{
		
			System.out.println("Enter the name of hero "+(i+1));
		heroName=sc.next();	
		actorsHero.add(new Hero());
		actorsHero.get(i).setHeroName(heroName);

	System.out.println("Enter the Character name of "+actorsHero.get(i).getHeroName());
		heroCharacterName=sc.next();
		//actors.add(new Actors());
		actorsHero.get(i).setHeroCharacterName(heroCharacterName);
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
		heroineName=sc.next();	
		actorsHeroine.add(new Heroine());
		actorsHeroine.get(i).setHeroineName(heroineName);


		System.out.println("Enter the Character name of "+actorsHeroine.get(i).getHeroineName());
		heroineCharacterName=sc.next();
		actorsHeroine.get(i).setHeroineCharacterName(heroineCharacterName);


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
		comedianName=sc.next();	
		actorsComedian.add(new Comedian());
		actorsComedian.get(i).setComedianName(comedianName);

		System.out.println("Enter the Character name of "+actorsComedian.get(i).getComedianName());
		comedianCharacterName=sc.next();
		actorsComedian.get(i).setComedianCharacterName(comedianCharacterName);

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
		 villianName=sc.next();	
		 actorsVillan.add(new Villan());
		actorsVillan.get(i).setVillianName(villianName);

	System.out.println("Enter the Character name of "+actorsVillan.get(i).getVillianName());
		 villianCharacterName=sc.next();
		  actorsVillan.get(i).setVillianCharacterName(villianCharacterName);

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
     	   //	if(actors.get(i) instanceof Heroine)
 		
 		
 			System.out.println(" "+actorsHeroine.get(i).getHeroineName()+" "+actorsHeroine.get(i).getHeroineCharacterName());  
 			
 		}  
}
public void displayComedian()
{

     	 for (i=0;i<actorsComedian.size();i++ ) 
     	 {
     	//  if(actors.get(i) instanceof Comedian)
 		System.out.println(" "+actorsComedian.get(i).getComedianName()+" "+actorsComedian.get(i).getComedianCharacterName());
 		
 	 	   } 
}
public void displayVillan()
{ for (i=0;i<actorsVillan.size();i++ ) {
     	  	   	   //	if(actors.get(i) instanceof Villan)
     	  	   	   	
 		System.out.println(" "+actorsVillan.get(i).getVillianName()+" "+actorsVillan.get(i).getVillianCharacterName());	
 		
     	  	   	  } 	  
}

public void displayAll()
{
/*for (Map.Entry<String,ArrayList<Actors>> entry : castMap.entrySet())
 	{
   	System.out.println(entry.getKey()+" : ");
	}*/
    //System.out.print(entry.getValue());
	
displayHero();
displayHeroine();
displayComedian();
displayVillan();
 

 
  // map.getCasting(castMap);
    
}

public Map<String,ArrayList<Actors>> getMap()
{
	return castMap;
}



}