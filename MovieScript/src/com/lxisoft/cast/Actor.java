package com.lxisoft.cast;

public class Actor
{

 protected String name,characterName;

	
   public Actor(String name,String characterName)
   {
   	this.name=name;
   	this.characterName=characterName;
   }


	public String getName()
	{
		return name;
	}
	
	
	public String getCharacterName()
	{
		return characterName;
	}


}