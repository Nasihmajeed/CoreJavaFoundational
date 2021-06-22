package com.lxisoft.cast;

public class Comedian extends Actor
{
String comedianName;
	String characterName;

	public void setActorName(String comedianName)
	{
		this.comedianName=comedianName;

	}
	public void setCharacterName(String characterName)
	{
		this.characterName=characterName;
		
	}


	public String getActorName()
	{
		return comedianName;
	}
	public String getCharacterName()
	{
		return characterName;
	}



}