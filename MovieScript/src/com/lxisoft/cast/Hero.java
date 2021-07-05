package com.lxisoft.cast;

public class Hero extends Actor
{
	private int numOfHero;

	private String heroName,heroCharName;

	
	public Hero()
	{
		
	}

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


/*

public boolean equals(Object o) {
if((o instanceof Dog) &&
(((Dog)o).name == name)) {
return true;
} else {
return false;
}
}
public int hashCode() {return name.length(); }
*/







}