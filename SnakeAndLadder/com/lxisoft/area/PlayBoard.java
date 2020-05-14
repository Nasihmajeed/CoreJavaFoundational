package com.lxisoft.area;
import com.lxisoft.game.*;
import java.util.*;
import java.io.*;
import com.lxisoft.area.*;
public class PlayBoard
{
   static Scanner input =new Scanner(System.in);
   ArrayList<Player> players = new ArrayList<Player>();
   ArrayList<Snake>snakes = new ArrayList<Snake>();
   ArrayList<Ladder>ladders = new ArrayList<Ladder>();
   Game game;

public void createBoard()
	{
		creatPlayers();
		creatSnakeAndLadder();
		game=new Game();
		game.startGame(players,snakes,ladders);

	}

public void creatPlayers()
	{
		System.out.print("\nHow Many Playes You Want to add :");
		int choise=input.nextInt();

		for(int i=0;i<choise;i++)
		{
			System.out.print("\nEnter the Name Of "i+1" Player : ");
			String name=input.next();
			players.add(new Player);
			players.get(i).setPlayerName(name);
			players.get(i).getPlayerPosition(0);
		}
	}

	public void creatSnakeAndLadder()
	{
	for(int i=0;i<6;i++)
	{	
	snakes.add(new Snake);
	ladder.add(new Ladder);		
	}
	setSnakePositions();
	setLadderPositions();
	}

	public void setSnakePositions()
	{
		snakes.get(0).setHead(48);
		snakes.get(0).setTail(26);
		snakes.get(1).setHead(36);
		snakes.get(1).setTail(28);
		snakes.get(2).setHead(22);
		snakes.get(2).setTail(14);
		snakes.get(3).setHead(98);
		snakes.get(3).setTail(41);
		snakes.get(4).setHead(87);
		snakes.get(4).setTail(53);
		snakes.get(5).setHead(56);
		snakes.get(5).setTail(31);
	}

	public void setLadderPositions()
	{
		ladders.get(0).setStart(4);
		ladders.get(0).setEnd(21);
		ladders.get(1).setStart(13);
		ladders.get(1).setEnd(44);
		ladders.get(2).setStart(28);
		ladders.get(2).setEnd(35);
		ladders.get(3).setStart(42);
		ladders.get(3).setEnd(63);
		ladders.get(4).setStart(50);
		ladders.get(4).setEnd(67);
		ladders.get(5).setStart(74);
		ladders.get(5).setEnd(92);
	}
}
