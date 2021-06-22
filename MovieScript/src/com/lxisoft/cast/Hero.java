package com.lxisoft.cast;

public class Hero extends Actor
 {

String heroName;
	String characterName;

	public void setActorName(String heroName)
	{
		this.heroName=heroName;

	}
	public void setCharacterName(String characterName)
	{
		this.characterName=characterName;
		
	}


	public String getActorName()
	{
		return heroName;
	}
	public String getCharacterName()
	{
		return characterName;
	}



	

}