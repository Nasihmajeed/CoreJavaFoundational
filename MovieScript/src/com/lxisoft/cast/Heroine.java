package com.lxisoft.cast;

public class Heroine  extends Actor {


String heroineName;
	String characterName;

	public void setActorName(String heroineName)
	{
		this.heroineName=heroineName;

	}
	public void setCharacterName(String characterName)
	{
		this.characterName=characterName;
		
	}


	public String getActorName()
	{
		return heroineName;
	}
	public String getCharacterName()
	{
		return characterName;
	}

	
}