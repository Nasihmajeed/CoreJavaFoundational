package com.LxiSoft.Game;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
import java.lang.*;
import java.util.ArrayList;

public class Game
{	

	static Scanner input =new Scanner(System.in);
	ArrayList<Player> players = new ArrayList<Player>();
	PlayBoard playBoard = new PlayBoard();
	Ladder ladder;
	Snake snake;
	Dice dice;
	Designs design=new Designs();


 public void playGame(ArrayList<Snake>snakes,ArrayList<Ladder>ladders,ArrayList<Cell>cells)
	{
		this.creatPlayers();
		this.playerDetails(players);	
		this.startGame(snakes,ladders,cells);
		

	}

public void creatPlayers()
	{
		design.gameBoard();
		boolean flag=false;
		int i=0;
		System.out.print("\nHow Many Players You Want to add :");
		int choise=input.nextInt();

		do
		{
			System.out.print("\nEnter the Name Of "+ (i+1) +" Player : ");
			String name=input.next();
			System.out.print("\nEnter the Coin Symbol Of "+ (i+1) +" Player : ");
			String coin=input.next();
			
		  	players.add(new Player());
		  	players.get(i).setPlayerName(name);
		  	players.get(i).setCoin(coin);
		  	players.get(i).setPlayerPosition(0);
		  	players.get(i).setPlayerStatus(false);//make True if come to 100th position
		 	i++;
		 

		}while(i<choise);
	}



public void playerDetails(ArrayList<Player> players)
	{
		System.out.println("\n\nPlayers Names :");
		for (int i = 0; i < players.size(); i++)
		{
			System.out.println(" Player Name = " + players.get(i).getPlayerName() + ", Coin = " +players.get(i).getCoin()+ ' ');
		}
	}

public void startGame(ArrayList<Snake>snakes,ArrayList<Ladder>ladders,ArrayList<Cell>cells)
	{
		int temp=1;
		boolean flag=false;
	  do
	  {
	   	for(int i=0;i<players.size();i++)
		{	do
			{	
				playBoard.setPlayersPosition(players,cells);
				this.playerDetails(players);	
				playBoard.showPlayBoard(cells,snakes,ladders);	
		 		System.out.println("\n\n\n Turn is :"+players.get(i).getPlayerName());
		 		System.out.println("Press 0 to roll the Dice");
				temp=input.nextInt();
		 		if(temp==0)
		  			{
					 if(players.get(i).getPlayerPosition()==0)//if player not entered to the game
					 { 
					 	this.firstMove(players.get(i)); 
					 }
					 else
					 {
					  this.playerMove(players.get(i),snakes,ladders); 
					 }	

		  			}
		  		System.out.println("_____________________________\n");		
		  		System.out.print("Press [ENTER] to continue...");
       }
			while(temp>0);
		}

		flag=finalWinner();	
	  }while(flag==false);	
	  playBoard.showPlayBoard(cells,snakes,ladders);
	}


public void checkforSnakeLadder(Player player,ArrayList<Snake>snakes,ArrayList<Ladder>ladders)
	{
		int flag=0;
		int position=0;
		int temp=player.getPlayerPosition();
		for(int i=0;i<snakes.size();i++)
		{
			if(snakes.get(i).getHead()==temp)
			{	flag=flag+1;
				position=snakes.get(i).getTail();
			}
		}

		for(int i=0;i<ladders.size();i++)
		{
			if(ladders.get(i).getStart()==temp)
			{	flag=flag+2;
				position=ladders.get(i).getEnd();
			}
		}

		playBoard.changePosition(player,flag,position);
	}



public void firstMove(Player player)
	{
		dice=new Dice();
		int value=dice.roll();
		System.out.println("\n\nYou Got = "+value);		
		if(value==1)
		{
			System.out.println(" Congratulations "+player.getPlayerName()+" You Are In The Game");
			player.setPlayerPosition(1);
		}
	  System.out.println("Current Position is = "+player.getPlayerPosition());		
	}			

public void playerMove(Player player,ArrayList<Snake>snakes,ArrayList<Ladder>ladders)
	{
		dice=new Dice();
		int value=dice.roll();
		System.out.println("\n\nYou Got "+value);
		int temp=value+player.getPlayerPosition();

		player.setPlayerPosition(temp);
		this.checkforSnakeLadder(player,snakes,ladders);
		this.setWinner(player,value);
		System.out.println(player.getPlayerName()+"'s  Current Position is = "+player.getPlayerPosition());
	}

public boolean finalWinner()
	{
		boolean flag=false;
		int index=0;
		for (int i=0;i<players.size();i++)
		{
			if(players.get(i).getPlayerStatus()== true)
			{	flag=true;
				index=index+i;	}	
		}

	  if(flag==true)
	  {
	  	System.out.println("\n\n\tWinner  Of The Game \n");
		System.out.println("*******************************************\n");
	  	System.out.println(players.get(index).getPlayerName()+" Winned in this Game");
	  	}
	 return flag; 	
	}


public void setWinner(Player player,int value)
	{
		int temp=player.getPlayerPosition();
		int position=(temp-value);
		int distance=(1000-position);
		if(distance<value)
 		{	System.out.println("\n* You Need To Get Less Than Or "+distance);
			player.setPlayerPosition(position);	 }

		else
		{	player.setPlayerPosition(temp);	 }

		if(temp==1000)
		{	player.setPlayerStatus(true);    }
		
	}


}