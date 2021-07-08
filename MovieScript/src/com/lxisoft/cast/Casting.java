package com.lxisoft.cast;

public class Casting
{
public void doCasting()
{
	
//int i, ,numberOfHeroineCharacters,numberOfComedianCharacters,numberOfVillanCharacters;
//String heroCharacterName,heroineName,heroineCharacterName,comedianName,comedianCharacterName,villianName,villianCharacterName;

	
int j,n,m;
//j=actors.size();
	castMap.put("Hero",castHero());	
	castMap.put("Heroine",castHeroine());
	castMap.put("Comedian",castComedian());
	castMap.put("Villian",castVillan());
		
		
	//n=actors.size();
	
	//m=actors.size();
	



	/*for(Actor a:actors)
	{
		System.out.println(a.getActorName()+" "+a.getCharacterName());
	}*/
	System.out.print(castMap.get("Comedian").get(0).getCharacterName());
	System.out.print(castMap.get("Villian").get(0).getCharacterName());
	System.out.print(castMap.get("Heroine").get(0).getCharacterName());

}

}
