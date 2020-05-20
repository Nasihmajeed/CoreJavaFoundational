package com.lxisoft.area;
import com.lxisoft.game.*;
import java.util.*;
import java.io.*;
import com.lxisoft.area.*;
public class PlayBoard
{
   static Scanner input =new Scanner(System.in);
   
   ArrayList<Snake>snakes = new ArrayList<Snake>();
   ArrayList<Ladder>ladders = new ArrayList<Ladder>();
   Game game;

public void createBoard()
	{
		creatSnakeAndLadder();
		game=new Game();
		game.startGame(snakes,ladders);

	}


	public void creatSnakeAndLadder()
	{
	for(int i=0;i<7;i++)
	{	
	snakes.add(new Snake());
	ladders.add(new Ladder());		
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
		snakes.get(6).setHead(70);
		snakes.get(6).setTail(33);
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
		ladders.get(6).setStart(32);
		ladders.get(6).setEnd(54);
	}
}
