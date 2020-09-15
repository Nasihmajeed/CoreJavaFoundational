package com.Lxisoft.Game;

import java.util.*;


public class Game
{
	Dice dice = new Dice();
 	Scanner scnr=new Scanner(System.in);

	public void gameStart()
	{
		String start = "y"; 
        System.out.println("Lets Start game Y / N"); 
        start = scnr.nextLine ();
        System.out.println ("\n\n\n");
        
        while (start.equals ("y") || start.equals ("Y"))
        {
            dice.diceRoll(); 
        }
        System.out.println ("\n\n\t\tLets Start");
   }	
}