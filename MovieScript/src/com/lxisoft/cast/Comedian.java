package com.lxisoft.cast;

public class Comedian extends Actor
{
	String comedianName; 
	String comedianCharacterName;
	
public void setComedianName(String comedianName)
	{	
		this.comedianName=comedianName;
		
	}
	public void setComedianCharacterName(String comedianCharacterName)
	{
		this.comedianCharacterName=comedianCharacterName;
	}

	
//getters
	public String getComedianName()
	{
		return comedianName;
	}
	public String getComedianCharacterName()
	{
		return comedianCharacterName;
	}
}