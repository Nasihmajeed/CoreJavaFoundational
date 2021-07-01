package com.lxisoft.cast;

public class Hero extends Actor
{
	private int numOfHero;

	private String heroName,heroCharName;

	

   public Hero(String heroName,String heroCharName)
   {
       super(heroName,heroCharName);
   }



	public void setNumOfHero(int numOfHero)
	{
          this.numOfHero=numOfHero;
	}

	public int getNumOfHero()
	{
		return numOfHero;
	}


}