package com.LxiSoft.Game;
import java.util.*;
import java.util.Scanner;
public class Dice 
{	
	 Random randomNo = new Random();
	int value;

	public void diceConditions()
	{
this.gameStart();
	} 


  public void gameStart()
   {
    int starter = randomNo.nextInt(6);
 	
 	if(starter==1)
 	{
 		System.out.println("Entered to the game");
	}
		else if(starter==0)
		{
			System.out.println("You Rolled 0 : Cannot enter to the game");
		}
			else if(starter==2)
		{
			System.out.println("You Rolled 2 : Cannot enter to the game");
		}
			else if(starter==3)
		{
			System.out.println("You Rolled 3 : Cannot enter to the game");
		}
		else if(starter==4)
		{
			System.out.println("You Rolled 4 : Cannot enter to the game");
		}
		else if(starter==5)
		{
			System.out.println("You Rolled 5 : Cannot enter to the game");
		}
		else if(starter==6)
		{
			System.out.println("You Rolled 6: Cannot enter to the game");
		}
		while (starter==1)
		{
			System.out.println("u hav entered to game");
		}

   }
}