package com.lxisoft.movie;



public abstract class Actor  {


 private String name;
 private String characterName;
	private String heroNumber;
 


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



public String getHeroName()  {
	return heroNumber;
}
public void setHeroNumber(String newHeroNumber)  {
this.heroNumber = newHeroNumber;
}

public abstract void actorDetails();

	

  
}