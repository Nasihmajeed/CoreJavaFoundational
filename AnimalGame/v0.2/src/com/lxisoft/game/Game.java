
package com.lxisoft.game ;

import java.util.* ;
import com.lxisoft.ui_elements.* ;
import com.lxisoft.forest.* ;
import com.lxisoft.animals.* ;

public class Game
{
	private Scanner in = new Scanner(System.in) ;
	private Forest forest = new Forest() ;

	public char displayStartGamePrompt()
	{
		ConsoleElements.clearScreen() ;

		DisplayElements.showMainMenu() ;

		System.out.print("\n\n Press 'Y' to Start. : ") ;
		char startGame = in.next().charAt(0) ;
		in.nextLine() ;

		return startGame ;
	}

	public void initialiseGame(char startGame)
	{
		while (startGame == 'y' || startGame == 'Y')
		{
			int numberOfAnimals = getNumberOfAnimals() ;
			this.generateAnimals(numberOfAnimals) ;
			forest.displayExistingAnimals() ;
		}
	}

	public int getNumberOfAnimals()
	{
		System.out.print("\n\n Input no of animals to be spawned : ") ;
		int numberOfAnimals = in.nextInt() ;
		in.nextLine() ;

		return numberOfAnimals ;
	}

	public void generateAnimals(int numberOfAnimals)
	{
		ArrayList<Animal> animalList = forest.getAnimalList() ;

		for(int i=0;i<numberOfAnimals;i++)
		{
			int n = GameHelper.generateRandomNumber(8) ;

			switch(n)
			{
				case 0 :
					animalList.add(new Bear()) ;
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
				case 6 :
					animalList.add(new Zebra()) ;
					break ;
				case 7 :
					animalList.add(new Elephant()) ;
					break ;		
				default :
					System.out.print("\n Something is wrong with the number generator.") ;			
			}
		}
		
		forest.setAnimalList(animalList) ;
	}
}