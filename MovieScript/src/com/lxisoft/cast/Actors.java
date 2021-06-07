package com.lxisoft.cast;

public class Actors{

	
String actorName;
String []actor=new String[3];

int numberOfCharacters,i;
String heroName; 
String heroineName; 
String comedianName; 
String villianName; 

String heroCharacterName; 
String heroineCharacterName; 
String comedianCharacterName; 
String villianCharacterName; 

public void setHeroName(String heroName)
{
	this.heroName=heroName;
}
public void setHeroineName(String heroineName)
{
	this.heroineName=heroineName;
}
public void setComedianName(String comedianName)
{
	this.comedianName=comedianName;
}
public void setVillianName(String villianName)
{
	this.villianName=villianName;
}



///------------------------------Character setter-------------------




public void setHeroCharacterName(String heroCharacterName)
{
	this.heroCharacterName=heroCharacterName;
}
public void setHeroineCharacterName(String heroineCharacterName)
{
	this.heroineCharacterName=heroineCharacterName;
}
public void setComedianCharacterName(String comedianCharacterName)
{
	this.comedianCharacterName=comedianCharacterName;
}
public void setVillianCharacterName(String villianCharacterName)
{
	this.villianCharacterName=villianCharacterName;
}

//getters for Actor names

public String getHeroName()
{
	return heroName;
}
public String getHeroineName()
{
	return heroineName;
}
public String getComedianName()
{
	return comedianName;
}
public String getVillianName()
{
	return villianName;
}
//--------------getters for characher names
public String getHeroCharacterName()
{
	return heroCharacterName;
}
public String getHeroineCharacterName()
{
	return heroineCharacterName;
}
public String getComedianCharacterName()
{
	return comedianCharacterName;
}
public String getVillianCharacterName()
{
	return villianCharacterName;
}


}