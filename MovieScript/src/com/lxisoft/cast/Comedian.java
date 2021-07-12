package com.lxisoft.cast;

public class Comedian extends Actor
{
	
	Comedian()
	{

	}

	
Comedian(String comedianName,String comedianCharacterName)
	{	super(comedianName,comedianCharacterName);
		
		
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

/*
int numberOfComedianCharacters;
public void setNumberOfComedian(int numberOfComedianCharacters)
{
this.numberOfComedianCharacters=numberOfComedianCharacters;
}
public int getNumberOfComedian()
{
	return numberOfComedianCharacters;
}
*/

}