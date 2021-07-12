package com.lxisoft.cast;

public class Hero extends Actor
 {
 	 


		Hero(){

		}
		Hero(String heroName,String heroCharacterName)
		{
			super(heroName,heroCharacterName);
			
		
		}

	
	public void setHeroName(String heroName)
	{	
		this.heroName=heroName;
		
	}
	public void setHeroCharacterName(String heroCharacterName)
	{
		this.heroCharacterName= heroCharacterName;
	}

//getters

	/*public String getHeroName()
	{
		return heroName;
	}

	public String getHeroCharacterName()
	{
		return  heroCharacterName;
	}*/
	/*int numberOfHeroCharacters;
	public void setNumberOfHeros(int numberOfHeroCharacters)
	{
		this.numberOfHeroCharacters=numberOfHeroCharacters;
	}
	public int getNumberOfHero()
	{
		return numberOfHeroCharacters;
	}*/

}