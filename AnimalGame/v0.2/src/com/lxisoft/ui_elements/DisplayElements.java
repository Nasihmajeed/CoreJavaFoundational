
package com.lxisoft.ui_elements ;

public class DisplayElements
{
	
	public static void showProgressBar()
	{
		 char[] animationChars = new char[]{'|', '/', '-', '\\'};

        for (int i = 0; i <= 50; i++) 
        {
            System.out.print(" Loading Game : " + (i+2) + "% " + animationChars[i % 4] + "\r");

            ConsoleElements.delayPrintTime(100) ;
        }
	
        System.out.print(" Loading Game: Done! \n --------------------------------------------- ") ;
	}

	public static void showMainMenu()
	{
		ConsoleElements.clearScreen() ;

		System.out.print("\n --------------------------------------------- \n\tAnimal Unknown's Battle Grounds\n ---------------------------------------------\n") ;

	        ConsoleElements.delayPrintTime(700) ;
			System.out.print(" \n   Populating the forest... \n") ;
			ConsoleElements.delayPrintTime(800) ;
            System.out.print(" \n   Randomizing events... \n\n --------------------------------------------- \n  ") ;
			ConsoleElements.delayPrintTime(700) ;

		showProgressBar() ;
	}


} 