package com.lxisoft.cast;

public class Villan extends Actor {


	String villianName; 
String villianCharacterName; 

		
Villan()
{

}
Villan(String villianName,String villianCharacterName)
{
	super(villianName,villianCharacterName);
	this.villianName=villianName;
	this.villianCharacterName=villianCharacterName;
}


	public void setVillanName(String villianName)
	{	
		this.villianName=villianName;
		
	}
	public void setVillanCharacterName(String villianCharacterName)
	{
		this.villianCharacterName=villianCharacterName;
	}


/*int numberOfVillanCharacters;
public void setNumberOfVillan(int getNumberOfVillanCharacter)
{
	this.numberOfVillanCharacters=numberOfVillanCharacters;
}
public int getNumberOfVillan()
{
	return numberOfVillanCharacters;
} 
*/

//getters 


	public String getVillianName()
	{
		return villianName;
	}	
	public String getVillianCharacterName()
	{
		return villianCharacterName;
	}

}