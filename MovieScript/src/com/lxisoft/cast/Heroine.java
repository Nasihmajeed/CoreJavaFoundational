package com.lxisoft.cast;

public class Heroine  extends Actor {

	String heroineName;
String heroineCharacterName;

	Heroine()
	{

	}
	Heroine(String heroineName,String heroineCharacterName)
	{	super(heroineName,heroineCharacterName);
		this.heroineName= heroineName;
		this.heroineCharacterName=heroineCharacterName;
	}



	public void setHeroineName(String  heroineName)
	{	
		this.heroineName= heroineName;
		
	}
	public void setHeroineCharacterName(String  heroineCharacterName)
	{
		this.heroineCharacterName=heroineCharacterName;
	}
	
	
//getters
	public String getHeroineName()
	{
		return heroineName;
	}
	public String getHeroineCharacterName()
	{
		return heroineCharacterName;
	}

	
}