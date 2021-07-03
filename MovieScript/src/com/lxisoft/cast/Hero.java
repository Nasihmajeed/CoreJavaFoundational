package com.lxisoft.cast;

public class Hero extends Actor
 {
 	String heroName; 
String heroCharacterName; 


	public void setHeroName(String heroName)
	{
		this.heroName=heroName;
	}
	public void setHeroCharacterName(String  heroCharacterName)
	{
		this.heroCharacterName= heroCharacterName;
	}

//getters

	public String getHeroName()
	{
		return heroName;
	}

	public String getHeroCharacterName()
	{
		return  heroCharacterName;
	}
	

}