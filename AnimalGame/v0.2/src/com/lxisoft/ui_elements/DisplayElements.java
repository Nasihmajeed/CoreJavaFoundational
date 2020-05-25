
package com.lxisoft.ui_elements ;

import java.util.* ;
import com.lxisoft.forest.Animal ;
import com.lxisoft.game.GameHelper ;

public class DisplayElements
{
	
	public static void showProgressBar()
	{
		 char[] animationChars = new char[]{'|', '/', '-', '\\'};

        for (int i = 0; i <= 50; i++) 
        {
            System.out.print("\t\t\t\t\t LOADING GAME : " + (i+2) + "% " + animationChars[i % 4] + "\r");

            ConsoleElements.delayPrintTime(100) ;
        }
	
        System.out.print("\t\t\t\t\t LOADING GAME: DONE! \n\t +~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+") ;
	}

	public static void showMainMenu()
	{
		ConsoleElements.clearScreen() ;

		System.out.print("\t +~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+ \n\t |\t\t\t    ANIMAL UNKNOWN'S BATTLEGROUNDS\t\t\t  |\n\t +~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n\n") ;

		printTitleImage() ;
		System.out.println("\n") ;
		printGameTitle2() ;

		System.out.print("\n\t +~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+ \n") ;

	    ConsoleElements.delayPrintTime(700) ;
		System.out.print(" \n\n\t\t  POPULATING THE FOREST WITH WILD ANIMALS... \n") ;
		ConsoleElements.delayPrintTime(800) ;
        System.out.print(" \n\n\t\t  RANDOMIZING ALL EVENTS... \n\n\t\t\t\t\t\t\t\t\t\t v0.2\n\t +~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+  \n  ") ;
		ConsoleElements.delayPrintTime(700) ;

		showProgressBar() ;
	}

	public static void displayAnimalStats(Animal a1,Animal a2)
	{
	
		System.out.format("\n\n\t\t\t%-22s%s%4d%3s%4d%4s%4d%4s",a1.getName(),"[",a1.getHealth(),"HP",a1.getStrength(),"STR",a1.getEnergy(),"EN ]") ;
		
		System.out.print("\n\n\t\t\t\t\tCONFRONTS\n") ;
		
		System.out.format("\n\t\t\t%-22s%s%4d%3s%4d%4s%4d%4s\n",a2.getName(),"[",a2.getHealth(),"HP",a2.getStrength(),"STR",a2.getEnergy(),"EN ]\n") ;
	}

	public static void displayFinalAnimalStats(Animal a1,Animal a2)
	{
	
		System.out.format("\n\n\t\t\t%-22s%s%4d%3s%4d%4s%4d%4s",a1.getName(),"[",a1.getHealth(),"HP",a1.getStrength(),"STR",a1.getEnergy(),"EN ]") ;
		
		System.out.format("\n\t\t\t%-22s%s%4d%3s%4d%4s%4d%4s",a2.getName(),"[",a2.getHealth(),"HP",a2.getStrength(),"STR",a2.getEnergy(),"EN ]\n") ;
	}

	public static void displayAnimalListInTableForm(ArrayList<Animal> animalList)
	{
		System.out.print("\n +~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+ \n |\t\t\t\t\tANIMALS IN THE FOREST\t\t\t\t\t |\n +~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+") ;
		System.out.print("\n |\t\tNAME\t\t|    HEALTH\t|\tSTRENGTH\t|\tVITAL STATUS\t |") ;
		System.out.print("\n +~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+") ;

		for(Animal animal : animalList)
		{
			System.out.format("\n\t%-22s %10d %20d %25s",animal.getName(),animal.getHealth(),animal.getStrength(),GameHelper.convertIsAliveToString(animal.getIsAlive())) ;
		}
		System.out.print("\n +~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+") ;
	}

	public static void displayFightMessage(Animal animal1,Animal animal2) 
	{
		System.out.print("\n\n\t\t\t "+ animal1.getName() + " FIERCELY ATTACKS " + animal2.getName()+"\n") ;
	}

	public static void printKillMessage(Animal animal1,Animal animal2)
	{
		System.out.print("\n\n\n\t\t\t*** "+ animal1.getName() + " KILLS " + animal2.getName()+" ***\n") ;
	}

	public static void printGameTitle()
	{
		System.out.println("\t\t    *****          ***     ***       *********             *****") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t    *****          ***     ***       **********          *********") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t    *****          ***     ***       ***********        **********") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t   *** ***         ***     ***       ***     ***        ***    ****") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t   *** ***         ***     ***       ***     ***       ***      **") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t   *** ***         ***     ***       **********        ***") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t  ***   ***        ***     ***       *********         ***   ******") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t  *********        ***     ***       **********        ***   ******") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t  *********        ***     ***       ***     ***       ***   ******") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t ***********       ****   ****       ***     ***        ***     ***") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t ***     ***  ***   *********   ***  ***********  ***   ***********") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t ***     ***  ***   *********   ***  **********   ***    *********") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t***       *** ***     *****     ***  *********    ***      *****") ;
		ConsoleElements.delayPrintTime(130) ;
	}

	public static void printTitleImage()
	{
		System.out.println("\t\t\t\t         /\\") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t\t\t        /  \\.--./\\") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t\t\t       /    \\  /  \\") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t\t\t      /      \\/    \\        .--.") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t\t\t     /     |\\_/|    \\       |   | .---.") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t\t\t    /     / o o\\     \\      |   | |   | .---.") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t\t\t   /      /(   )\\     \\     |   `-'   |_|   |") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t\t\t  /       / \\#/ \\      \\    |         ._____'") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t\t\t          |     |           `---.     |") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t\t\t          | | | |                |    |") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t\t\t        (~\\ | | /~)              |    |") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t\t\t       __\\_|| ||_/__             |    |") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t\t\t  ___///_//_| |_\\\\__\\\\\\__________|____|") ;
	}

	public static void printGameTitle2()
	{
		System.out.println("\t\t\t\t   ***      **   **    ******       ****  ") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t\t\t  ** **     **   **    **   **     **  ** ") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t\t\t **   **    **   **    **   **    **      ") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t\t\t **   **    **   **    **   **    **      ") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t\t\t **   **    **   **    ******     **  *** ") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t\t\t *******    **   **    **   **    **   ** ") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t\t\t **   **    **   **    **   **    **   ** ") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t\t\t **   ** ** **   ** ** **   ** **  **  ** ") ;
		ConsoleElements.delayPrintTime(130) ;
		System.out.println("\t\t\t\t **   ** **  *****  ** ******  **   ****  ") ;
		ConsoleElements.delayPrintTime(130) ;
	}

	


} 