package com.lxisoft.cast;

public class Hero extends Actor
{

	private String heroName;
	
	public void setHeroName(String heroName)
	{
		this.heroName=heroName;
	}
	
	
	public void setHeroCharName(String heroCharName)
	{
		this.heroCharName=heroCharName;
	}
	
	
	public String getHeroName()
	{
		return heroName;
	}
	
	
	public String getHeroCharName()
	{
		return heroCharName;
	}
	
	
}