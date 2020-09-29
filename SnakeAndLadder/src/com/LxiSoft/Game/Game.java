package com.LxiSoft.Game;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Game
{
	ArrayList<Player> players = new ArrayList<Player>();
	Scanner scnr=new Scanner(System.in);
	Designs d = new Designs();
	Board b=new Board();
	//Dice die=new Dice();
	Rules r=new Rules();
	public void startGame()
{
	d.gameBoard();
	d.gameRule();
	String sGame = "y"; 
        System.out.println("Do you want to play? Y or N     >  "); 
        sGame = scnr.nextLine ();
        System.out.println ("\n\n\n");
        
       if (sGame.equals ("y") || sGame.equals ("Y"))
        {
            //diceRoll.diceConditions(); 
            b.printSnakeAndLadder();
            this.playerDetails();
            //die.gameStart();
        	r.snakesAndladders(be);
        }
        System.out.println ("\n\t\t");
    
   }

  public void creatPlayers()
	{
		int i=0;
		System.out.print("\n How Many Playes You Want to add :");
		int choise=scnr.nextInt();

		do
		{
			System.out.print("\nEnter the Name Of "+ (i+1) +" Player : ");
			String name=scnr.next();
		  	players.add(new Player());
		  	players.get(i).setPlayerName(name);
		  	i++;
		  }while(i<choise);
	}


public void playerDetails()
	{
		this.creatPlayers();
		
		System.out.println("\n\nPlayers Names :"); 
        for (Player player : players) 
        { 
            System.out.println("*"+player); 
        }  
	}
}