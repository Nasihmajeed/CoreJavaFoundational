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
ArrayList<Actors> actors=new ArrayList<Actors>();

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
		actors.add(new Hero());
		actors.get(i).setHeroName(heroName);

	System.out.println("Enter the Character name of "+actors.get(i).getHeroName());
		heroCharacterName=sc.next();
		//actors.add(new Actors());
		actors.get(i).setHeroCharacterName(heroCharacterName);
	castMap.put("Hero",actors);	
		
	
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
		actors.add(new Heroine());
		actors.get(i).setHeroineName(heroineName);


		System.out.println("Enter the Character name of "+actors.get(i).getHeroineName());
		heroineCharacterName=sc.next();
		actors.get(i).setHeroineCharacterName(heroineCharacterName);


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
		comedianName=sc.next();	
		actors.add(new Comedian());
		actors.get(i).setComedianName(comedianName);

		System.out.println("Enter the Character name of "+actors.get(i).getComedianName());
		comedianCharacterName=sc.next();
		actors.get(i).setComedianCharacterName(comedianCharacterName);

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
		 villianName=sc.next();	
		 actors.add(new Villan());
		 actors.get(i).setVillianName(villianName);

	System.out.println("Enter the Character name of "+actors.get(i).getVillianName());
		 villianCharacterName=sc.next();
		  actors.get(i).setVillianCharacterName(villianCharacterName);

		 castMap.put("Villian",actors);	

		 
	}


}
public void displayHero()
{
	for(i=0;i<actors.size();i++)
	{
 		
 			System.out.println(" "+castMap.get("Hero").get(i).getHeroName()+" "+castMap.get("Hero").get(i).getHeroCharacterName());
 		
  }	 

}

public void displayHeroine()
{
	 for (i=0;i<actors.size() ;i++ ) {
     	   	if(actors.get(i) instanceof Heroine)
 		{
 			System.out.println(" "+actors.get(i).getHeroineName()+" "+actors.get(i).getHeroineCharacterName());  
 		}
 	
  		
   	
     	 }  
}
public void displayComedian()
{

     	 for (i=0;i<actors.size();i++ ) 
     	 {
     	  if(actors.get(i) instanceof Comedian)
 		{ System.out.println(" "+actors.get(i).getComedianName()+" "+actors.get(i).getComedianCharacterName());
 		}
 	 	   } 
}
public void displayVillan()
{ for (i=0;i<actors.size();i++ ) {
     	  	   	   	if(actors.get(i) instanceof Villan)
     	  	   	   	{
 		System.out.println(" "+actors.get(i).getVillianName()+" "+actors.get(i).getVillianCharacterName());	
 		}
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