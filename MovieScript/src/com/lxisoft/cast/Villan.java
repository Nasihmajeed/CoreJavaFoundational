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