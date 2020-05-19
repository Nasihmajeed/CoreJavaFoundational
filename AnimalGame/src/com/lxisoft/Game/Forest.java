package com.lxisoft.Game ;

import com.lxisoft.Console.* ;
import com.lxisoft.Animals.* ;
import com.lxisoft.Interfaces.* ;
import java.util.* ;

public class Forest
{

	public ArrayList<Animal> animalList = new ArrayList<Animal>() ;
	
	public void setAnimals()
	{
		for(int i=0 ; i<10 ; i++)
		{
			int n = rNo(6) ;
			createRandomAnimalObject(n) ;
		}
	}

	public void createRandomAnimalObject(int n)
	{
		switch(n)
		{
			case 0 :
				animalList.add(new Buffalo()) ;
				break ;
			case 1 :
				animalList.add(new Lion()) ;
				break ;
			case 2 :
				animalList.add(new Tiger()) ;
				break ;
			case 3 :
				animalList.add(new Wolf()) ;
				break ;
			case 4 :
				animalList.add(new Rabbit()) ;
				break ;
			case 5 :
				animalList.add(new Deer()) ;
				break ;
			
			default :
				System.out.print("\n Invalid No") ;			
		}
	}

	public int rNo(int x) // <---- Function to generate a random integer from 0 to (x-1)
	{
		Random r = new Random();
		int n = r.nextInt(x);
		return n;
	}

	public void viewCreatedAnimals()
	{
	
		int i=0 ;

		System.out.print("\n\n --------------------------- \n\t ANIMALS \n ---------------------------\n" ) ;

		for(Animal a : animalList)
		{
			i++ ;
			System.out.print("\n   [" + i + "] " + a.getAnimalName()) ;
		}

		System.out.print("\n\n---------------------------") ;

	}

	public void animalsRoam()
	{
		
		int a1,a2,bType,status,numOfAnimals = animalList.size() ;

		boolean allPrey = checkIfAllPrey() ;
		
		System.out.print("\n\n---------------------------\n") ;

		while(!animalList.isEmpty() && !allPrey && (animalList.size()!=1))
		{
			a1 = rNo(numOfAnimals) ; // Index of a random animal from the list.
			a2 = rNo(numOfAnimals) ;

				if(a1!=a2)
				{
					System.out.println("\n " + animalList.get(a1).getAnimalName() + "\n STRENGTH : " + animalList.get(a1).getAnimalStrength() + "\n\n MEETS \n\n " + animalList.get(a2).getAnimalName() + "\n STRENGTH : " + animalList.get(a2).getAnimalStrength());

					bType = checkBattleType(a1,a2) ;

						switch(bType)
						{
							case 0 :
								preyVsPrey() ;
								break ;

							case 1 :
								status = predatorVsPrey(a1,a2) ;
								matchResult(status,a1,a2) ;
								break ;

							case 2 :
								status = predatorVsPredator(a1,a2) ;
								matchResult(status,a1,a2) ;
								break ;

							default :
								System.out.print("Invalid Types") ;
						}
				}

				C.delay(600) ;

			numOfAnimals = animalList.size() ;

			allPrey = checkIfAllPrey() ;
			if(animalList.size()==1)
				System.out.print("\n\n A Winner arises! \n\n The Last animal standing is a " + animalList.get(0).getAnimalName()) ;
		}

		if(allPrey)
		{
			System.out.print("\n\n All predators killed themselves. Remaining animals : ") ;
			viewCreatedAnimals() ;
		}
		else
		{
			if(animalList.size()==0)
				System.out.print("\n\n All animals fought to the death") ;
		
		}
	}

	public int checkBattleType(int a1,int a2)
	{
		String animalType1,animalType2 ;

		if ( animalList.get(a1) instanceof Prey )
			animalType1="Prey";
		else 
			animalType1="Predator";

		if ( animalList.get(a2) instanceof Prey )
			animalType2="Prey";
		else 
			animalType2="Predator";

		if (animalType1 == "Prey" && animalType2 == "Prey")
		{
			return 0 ;
		}
		else if((animalType1 == "Predator" && animalType2 == "Prey") || (animalType2 == "Predator" && animalType1 == "Prey"))
		{
			return 1 ;
		}
		else
		{
			return 2 ;
		}
	}

	public void preyVsPrey()
	{
		System.out.print("\n Both Animals are Preys. \n\n They don't fight each other. They move on peacefully.\n\n---------------------------\n") ;
	}

	public int predatorVsPrey(int a1,int a2)
	{
		int status = compareStrength(a1,a2) ;
		return status ;

	}

	public int predatorVsPredator(int a1,int a2)
	{
		int status = compareStrength(a1,a2) ;
		return status ;
	}

	public int compareStrength(int a1, int a2)
	{
		int s1 = animalList.get(a1).getAnimalStrength() ;
		int s2 = animalList.get(a2).getAnimalStrength() ;
		int reducedStrength ;

			if(s1>s2)
			{
				reducedStrength = animalList.get(a1).getAnimalStrength() - rNo(100) ;
				animalList.get(a1).setAnimalStrength(reducedStrength) ;
				return 0 ;
			}
			else if(s2>s1)
			{
				reducedStrength = animalList.get(a2).getAnimalStrength() - rNo(100) ;
				animalList.get(a2).setAnimalStrength(reducedStrength) ;
				return 1 ;
			}
			else
			{
				return 2 ;
			}
	}
	
	public 	void matchResult(int status,int a1,int a2)
	{
		switch(status)
		{
			case 0 :
				System.out.print("\n " + animalList.get(a1).getAnimalName() +" killed "+animalList.get(a2).getAnimalName());	
				System.out.print("\n\n---------------------------\n\n");
				animalList.remove(a2);
				break ;

			case 1 :
				System.out.print("\n " + animalList.get(a2).getAnimalName() +" killed "+animalList.get(a1).getAnimalName());	
				System.out.print("\n\n---------------------------\n\n");
				animalList.remove(a1);
				break ;
			
			case 2 :
				System.out.println("\n\n Both animals were equally strong. \n They fought to the death.\n---------------------------\n\n");
				animalList.remove(a1);
				animalList.remove(a2);
				break ;

			default :
				System.out.print("\n\n Invalid Inputs!") ;

		}
	}

	public boolean checkIfAllPrey()
	{
		boolean allPrey = true ;
		int i=0 ;
		for(Animal a : animalList)
		{
			if(a instanceof Predator)
				allPrey = false ;
		}

		return allPrey ;
	}

}