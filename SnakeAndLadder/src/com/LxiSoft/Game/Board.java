package com.LxiSoft.Game;
import java.util.*;
import java.util.Scanner;
public class Board
 {
 	Dice diceRoll = new Dice();
 Scanner scnr=new Scanner(System.in);
  public void startGame()
  {
  		

	   String sGame = "y"; 
        System.out.println("Do you want to play? Y or N     >  "); 
        sGame = scnr.nextLine ();
        System.out.println ("\n\n\n\n\n\n");
        
        while (sGame.equals ("y") || sGame.equals ("Y"))
        {
            diceRoll.diceConditions(); 
        }
        System.out.println ("\n\n\n\n\t\t\t\t\t\tSEE YA!!");
   }
  }