
package com.lxisoft.forest ;

import java.util.* ;

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
		int i=0 ;

		System.out.print("\n\n --------------------------- \n\t ANIMALS \n ---------------------------\n" ) ;

		for(Animal animal : animalList)
		{
			i++ ;
			System.out.print("\n   [" + i + "] " + animal.getName()) ;
		}

		System.out.print("\n\n---------------------------") ;
	}

}