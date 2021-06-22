package com.lxisoft.cast;

public class Villan extends Actor {


String villanName;
	String characterName;

	public void setActorName(String villanName)
	{
		this.villanName=villanName;

	}
	public void setCharacterName(String characterName)
	{
		this.characterName=characterName;
		
	}


	public String getActorName()
	{
		return villanName;
	}
	public String getCharacterName()
	{
		return characterName;
	}




}