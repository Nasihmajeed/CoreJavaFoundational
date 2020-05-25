
package com.lxisoft.forest ;

import java.util.* ;
import com.lxisoft.game.GameHelper ;
import com.lxisoft.ui_elements.* ;

public class Forest
{
	private ArrayList<Animal> animalList = new ArrayList<Animal>() ;

	public ArrayList<Animal> getAnimalList()
	{
		return animalList ;
	}
	public void setAnimalList(ArrayList<Animal> aL)
	{
		animalList = aL ;
	}

	public void displayExistingAnimals()
	{
		DisplayElements.displayAnimalListInTableForm(animalList) ;
	}

	public void meetAnimals()
	{
		Animal animal1,animal2 ;
		boolean bothAnimalsNotPrey ;

		int numberOfAnimalsAlive = GameHelper.getNumberOfAnimalsAlive(animalList) ;
		
		while(numberOfAnimalsAlive>1)
		{

			animal1 = animalList.get(GameHelper.generateRandomNumber(animalList.size())) ;
			animal2 = animalList.get(GameHelper.generateRandomNumber(animalList.size())) ;

				if(animal1 == animal2 || !animal1.getIsAlive())
				{
					animal1 = animalList.get(GameHelper.generateRandomNumber(animalList.size())) ;
				}
				else if(!animal2.getIsAlive())
				{
					animal2 = animalList.get(GameHelper.generateRandomNumber(animalList.size())) ;
				}
				else if(GameHelper.checkIfAllAnimalsArePrey(animalList))
				{
					System.out.print("\n\n\t\t\t *** ALL PREDATORS ARE DEAD. THE REMAINING PREYS LIVE HAPPILY EVER AFTER. ***") ;
					return ;
				}
				else
				{
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

			numberOfAnimalsAlive = GameHelper.getNumberOfAnimalsAlive(animalList) ;

		} 

		GameHelper.checkWinner(animalList) ;

	}

}