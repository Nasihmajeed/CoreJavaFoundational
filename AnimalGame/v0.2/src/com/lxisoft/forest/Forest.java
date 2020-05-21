
package com.lxisoft.forest ;

public class forest
{
	private Arraylist<Animal> animalList = new ArrayList() ;

	public Arraylist<Animal> getAnimalList()
	{
		return animalList ;
	}
	public void setAnimalList(Arraylist<Animal> aL)
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