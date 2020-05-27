
package com.lxisoft.forest ;

import java.util.* ;
import com.lxisoft.game.GameHelper ;
import com.lxisoft.ui_elements.* ;

public class Forest
{
	private ArrayList<Animal> animalList = new ArrayList<Animal>() ;
	private Animal[][] forestArea = new Animal[10][10] ;

	public ArrayList<Animal> getAnimalList()
	{
		return animalList ;
	}
	public void setAnimalList(ArrayList<Animal> aL)
	{
		animalList = aL ;
	}

	public Animal[][] getForestArea()
	{
		return forestArea ;
	}
	private void setForestArea(Animal[][] fArea)
	{
		forestArea = fArea ;
	}

	public void displayExistingAnimals()
	{
		DisplayElements.displayAnimalListInTableForm(animalList) ;
	}

	public void checkIfAnimalsAreNearby()
	{
		int x,y ;

		for(Animal animal:animalList)
		{
			x = animal.animalLocation.getLocationRow() ;
			y = animal.animalLocation.getLocationColoumn() ;

				if(animal.getIsAlive())
				{	
					for(int nearbyRow=x-1 ; nearbyRow<=x+1 ; nearbyRow++)
					{
						for(int nearbyColoumn=y-1 ; nearbyColoumn<=y+1 ; nearbyColoumn++)
						{

							if(nearbyRow==x && nearbyColoumn==y)
							{
								continue ;
							}
							else if(forestArea[nearbyRow][nearbyColoumn]!=null)
							{
								if(forestArea[nearbyRow][nearbyColoumn].getIsAlive())
								{
									meetAnimals(animal,forestArea[nearbyRow][nearbyColoumn]) ;
								}
							}
						}
					}
				}
		}
	}

	public void meetAnimals(Animal animal1,Animal animal2)
	{

		boolean bothAnimalsNotPrey ;
				
		DisplayElements.displayAnimalStats(animal1,animal2) ;

		bothAnimalsNotPrey = GameHelper.checkIfBothPrey(animal1,animal2) ;

		if(bothAnimalsNotPrey)
		{	
			ConsoleElements.delayPrintTime(1000) ;

			GameHelper.compareStrengthofBothAnimalsAndFight(animal1,animal2) ;
			System.out.print("\n\n\t\t\t\t FINAL ANIMAL STATS\n") ;
			DisplayElements.displayFinalAnimalStats(animal1,animal2) ;
			System.out.print("\n +~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+") ;
		}		 
	}

	public void moveAnimals()
	{
		forestArea= new Animal[10][10] ;
		GameHelper.placeAnimalsInRandomLocations(animalList,forestArea) ;
	}
}