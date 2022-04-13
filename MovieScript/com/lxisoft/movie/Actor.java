package com.lxisoft.movie;



public abstract class Actor  {


 private String name;
 private String characterName;
	
 


public String getName()   {
	return name;
}
public void setName(String newName)  {
	this.name = newName;
}


public String getCharacterName()   {
	return characterName;
}
public void setCharacterName(String newCharacterName)  {
	this.characterName = newCharacterName;
}


public abstract void actorDetails();

	

  
}