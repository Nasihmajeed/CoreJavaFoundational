
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
	
		DisplayElements.showMainMenu() ;

		System.out.print("\n\n\t Press 'Y' to Start. : ") ;
		char startGame = in.next().charAt(0) ;
		in.nextLine() ;

		return startGame ;
	}

	public void initialiseGame(char startGame)
	{
		if (startGame == 'y' || startGame == 'Y')
		{
			int numberOfAnimals = getNumberOfAnimals() ;
			this.generateAnimals(numberOfAnimals) ;
			forest.displayExistingAnimals() ;

			forest.meetAnimals() ;
		}
		else
		{
			System.out.print("\n\n\t\t\t THANK YOU FOR PLAYING.\n") ;
		}
	}

	public void finaliseGame()
	{

			DisplayElements.displayAnimalListInTableForm(forest.getAnimalList()) ;		

			GameHelper.checkWinner(forest.getAnimalList()) ;

			forest.getAnimalList().clear() ;

			System.out.print("\n\n\t\t\t PLAY AGAIN? (Y/N) : ") ;
			char playAgain = in.next().charAt(0) ;
			in.nextLine() ;

			if(playAgain == 'y' || playAgain == 'Y')
				displayStartGamePrompt() ;
			else
				System.out.print("\n\n\t\t\t THANK YOU FOR PLAYING.") ;
	}

	public int getNumberOfAnimals()
	{
		System.out.print("\n\n\t\t NUMBER OF ANIMALS TO BE SPAWNED : ") ;
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