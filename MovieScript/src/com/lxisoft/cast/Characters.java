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

Map<String,actors<Actors>> castMap=new HashMap<String,actors<Actors>>();

public void setHeroName()
{
	System.out.println("Enter the number of heros: ");
	numberOfCharacters=sc.nextInt();
	for(i=0;i<numberOfCharacters;i++)
	{
	System.out.println("Enter the name of hero "+(i+1));
		heroName=sc.next();	
		actors.add(new Actors());
		actors.setHeroName(heroName);

	System.out.println("Enter the Character name of "+heroName[i]);
		heroCharacterName=sc.next();
		//actors.add(new Actors());
		actors.setHeroCharacterName(heroCharacterName);
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
		actors.add(new Actors());
		actors.setHeroineName(heroineName);


		System.out.println("Enter the Character name of "+heroineName[i]);
		heroineCharacterName=sc.next();
		actors.setHeroineCharacterName(heroineCharacterName);


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
		actors.add(new Actors());
		actors.setComedianName(comedianName);

		System.out.println("Enter the Character name of "+comedianName[i]);
		comedianCharacterName=sc.next();
		actors.setComedianCharacterName(comedianCharacterName);

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
		 actors.add(new Actors());
		 actors.setVillianName(villianName);

	System.out.println("Enter the Character name of "+villianName[i]);
		 villianCharacterName=sc.next();
		  actors.setCharacterVillianName(villianCharacterName);

		 castMap.put("Villian",actors);		 
	}


}
public void displayAll()
{
for (Map.Entry<String,String> entry : castMap.entrySet()) {
    System.out.println(entry.getKey()+" : "+entry.getValue());
    map.getCasting(Map<String,String> castMap);
}

}



}