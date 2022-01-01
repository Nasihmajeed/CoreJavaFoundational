package com.lxisoft.movie;



public class Actor  {

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


public void actorDetails()  {

    System.out.println("\t\tName :" + name);
	System.out.println("\t\tCharacter Name :" + characterName);
 
	
	System.out.println("\t\t.................");
	System.out.println("\n");
	
}	
}