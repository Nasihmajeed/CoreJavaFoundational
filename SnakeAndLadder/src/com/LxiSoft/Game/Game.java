package com.LxiSoft.Game;
import java.util.Scanner;
import java.util.ArrayList;
public class Game
{
	 Scanner scnr=new Scanner(System.in);
	ArrayList<Player> players = new ArrayList<Player>();
	Designs design=new Designs();
	Board board=new Board();
	public void methods()
	{

	  	  System.out.println("  \t              ---------------------------------------------------");
      	System.out.println("      \t          ---------------------------------------------------");
     	  System.out.println("   \t             --------------------SNAKE & LADDER ------------------");
      	System.out.println("     \t           ---------------------------------------------------");
       	System.out.println("     \t           ---------------------------------------------------\n\n");

		design.gameBoard();
		this.createPlayer();
		this.playerDetails();
		board.startGame();
	}
	public void createPlayer()
	{
	
		int i=0;
		System.out.print("\nHow Many Playes You Want to add :");
		int choise=scnr.nextInt();
		do
		{
	
			System.out.print("\nEnter the Name Of "+ (i+1) +" Player : ");
			String name=scnr.next();
			
		  	players.add(new Player());
		  	players.get(i).setPlayerName(name);
		  	i++;
		  }
		  while(i<choise);
	}

public void playerDetails()
	{
		
		System.out.println("\n\nPlayers Names :"); 
       for (int i=0; i<players.size(); i++)
     	{	
     		System.out.println("\n   "+(i+1)+"   "+players.get(i).getPlayerName());
     	} 
	}
}