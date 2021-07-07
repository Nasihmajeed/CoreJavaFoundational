package com.lxisoft.cast;

public class Comedian extends Actor
{
	String comedianName; 
	String comedianCharacterName;
	Comedian()
	{

	}

	
Comedian(String comedianName,String comedianCharacterName)
	{	super(comedianName,comedianCharacterName);
		this.comedianName=comedianName;
		this.comedianCharacterName=comedianCharacterName;
		
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