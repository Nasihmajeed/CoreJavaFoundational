package com.Lxisoft.Game;
import java.util.*;
import java.util.Scanner;

public class Dice
{
	Random diceRolling = new Random();
	int value;
	Scanner scnr=new Scanner(System.in);

	public void diceRoll()
	{
		int starter = diceRolling.nextInt(6);
 
 		while (starter!=1)
 		{
  			System.out.println("you have rolled" +starter+".");
			String start = "y"; 
  			System.out.println("TRY AGAIN TO GET ONE ? Y or N     >  "); 
  			start = scnr.nextLine ();
  			if (start.equals ("y") || start.equals ("Y"))
   		{
   			starter = diceRolling.nextInt(6);
 	  	}
  	}
  	System.out.println("You have rolled 1");
 	System.out.println("");
 	this.gameRun();
	}

	public void gameRun()	
	{
 		System.out.println("Game Starts Now!!");
  	}
}
