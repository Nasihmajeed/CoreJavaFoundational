package com.LxiSoft.Game;
import java.util.*;
import java.util.Scanner;
public class Dice 
{	
	Scanner scnr=new Scanner(System.in);
	 Random randomNo = new Random();
	int value;

public void diceConditions()
{
this.gameStart();
} 

public void gameStart()
{
 int starter = randomNo.nextInt(6);
 
 while (starter!=1)
 {
  System.out.println("you have rolled" +starter+".");
	String sGame = "y"; 
  System.out.println("Do you want to play? Y or N     >  "); 
  sGame = scnr.nextLine ();
  if (sGame.equals ("y") || sGame.equals ("Y"))
   {
   	starter = randomNo.nextInt(6);
 	  }
  }
  	System.out.println("Yiu have rolled 1");
 	 this.gameRun();
}

public void gameRun()
{
 System.out.println("lets start");
  }
}