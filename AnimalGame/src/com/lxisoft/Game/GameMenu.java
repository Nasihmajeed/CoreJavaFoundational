package com.lxisoft.Game ;

import com.lxisoft.Console.* ;
import java.util.* ;

public class GameMenu
{

	Forest fr = new Forest() ;
	Scanner in = new Scanner(System.in) ;

	public void mainMenu()
	{
		C.cls() ;

		System.out.print("\n --------------------------- \n\tLION'S DEN \n ---------------------------\n") ;

	        C.delay(700) ;
			System.out.print("\n   Populating the forest... \n") ;
			C.delay(800) ;
            System.out.print(" \n   Randomizing events... \n\n ---------------------------\n\n  ") ;
			C.delay(700) ;

		progressBar() ;

	}

	public void progressBar()
	{
		 char[] animationChars = new char[]{'|', '/', '-', '\\'};

        for (int i = 0; i <= 50; i++) 
        {
            System.out.print(" Loading Game : " + (i+2) + "% " + animationChars[i % 4] + "\r");

            C.delay(100) ;
        }
	
        System.out.print(" Loading Game: Done! \n\n ---------------------------\n\n Press 'Y' to Start. : ");

        startGame() ;
        
	}

	public void startGame()
	{
		char choice = in.next().charAt(0) ;
		in.nextLine() ;

			if ( choice == 'y' || choice == 'Y' )
			{
				fr.setAnimals() ;
				fr.viewCreatedAnimals() ;
				C.delay(2500) ;
				fr.animalsRoam() ;
			}
			else
			{
				System.out.print("\n Quitting Game.") ;
			}
	}

	
}