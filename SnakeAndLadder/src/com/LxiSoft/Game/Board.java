package com.LxiSoft.Game;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Board
 {
  
  ArrayList<Board>cells =new ArrayList<Board>(100);
 	Dice diceRoll = new Dice();
 Scanner scnr=new Scanner(System.in);
   ArrayList<Snake>snakes = new ArrayList<Snake>();
   ArrayList<Ladder>ladders = new ArrayList<Ladder>();

  public void startGame()
  {
  		

	   String sGame = "y"; 
        System.out.println("Do you want to play? Y or N     >  "); 
        sGame = scnr.nextLine ();
        System.out.println ("\n\n\n\n\n\n");
        
       if (sGame.equals ("y") || sGame.equals ("Y"))
        {
            diceRoll.diceConditions(); 
        }
        System.out.println ("\n\n\t\t\t\t\t\t");
    
   }
  

  private void iterateBoard()
{
  
 for(int i=0;i<cells.size(101);i++)
  {
    
   
   }
   
}

  public void setSnakePositions()
  {
    snakes.get(0).setHead(39);
    snakes.get(0).setTail(3);
    snakes.get(1).setHead(35);
    snakes.get(1).setTail(5);
    snakes.get(2).setHead(50);
    snakes.get(2).setTail(34);
    snakes.get(3).setHead(89);
    snakes.get(3).setTail(68);
    snakes.get(4).setHead(97);
    snakes.get(4).setTail(86);
    snakes.get(5).setHead(99);
    snakes.get(5).setTail(26);
 }
  public void setLadderPositions()
  {
    ladders.get(0).setStart(2);
    ladders.get(0).setEnd(23);
    ladders.get(1).setStart(7);
    ladders.get(1).setEnd(29);
    ladders.get(2).setStart(22);
    ladders.get(2).setEnd(41);
    ladders.get(3).setStart(28);
    ladders.get(3).setEnd(77);
    ladders.get(4).setStart(30);
    ladders.get(4).setEnd(32);
    ladders.get(5).setStart(70);
    ladders.get(5).setEnd(90);
    ladders.get(6).setStart(87);
    ladders.get(6).setEnd(93);
  }
}
