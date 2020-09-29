package com.LxiSoft.Game;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Board
 {
  
 
   ArrayList <BoardElements> be = new ArrayList<BoardElements>(100);

public void initailArray()
{
  for(int i=0;i<101;i++)
 {
   be.add(new BoardElements());
 }
}

  public void makeSnakes()
    {
    be.get (39).setSnakeHead(39);  
    be.get(3).setSnakeTail(3);
    be.get(35).setSnakeHead(35);
    be.get(5).setSnakeTail(5);
    be.get(50).setSnakeHead(50);
    be.get(34).setSnakeTail(34);
    be.get(89).setSnakeHead(89);
    be.get(68).setSnakeTail(68);
    be.get(99).setSnakeHead(99);
    be.get(26).setSnakeTail(26);
  } 
  public void makeLadder()
  {
    be.get(2).setLadderStart(2);
    be.get(23).setLadderEnd(23);
    be.get(7).setLadderStart(7);
    be.get(29).setLadderEnd(29);
    be.get(28).setLadderStart(28);
    be.get(77).setLadderEnd(77);
    be.get(30).setLadderStart(30);
    be.get(32).setLadderEnd(32);
    be.get(87).setLadderStart(87);
    be.get(93).setLadderEnd(93);
  }
 
  public void printSnakeAndLadder()
  {
   
    this.initailArray();
    this.makeSnakes();
    this.makeLadder();
    System.out.println("\n The Board Details are ");
     System.out.println("SNakes  Head& Tail Positions Are- \n"+be.get(39).getSnakeHead()+"\t"+be.get(3).getSnakeTail()+"\n"+be.get(35).getSnakeHead()+"\t"+be.get(5).getSnakeTail()+"\n"+be.get(50).getSnakeHead()+"\t"+be.get(34).getSnakeTail()+"\n"+be.get(89).getSnakeHead()+"\t"+be.get(68).getSnakeTail()+"\n"+be.get(99).getSnakeHead()+"\t"+be.get(26).getSnakeTail());
   System.out.println("Ladder begin & End :-\n"+be.get(2).getLadderStart()+"\t"+be.get(23).getLadderEnd()+"\n"+be.get(7).getLadderStart()+"\t"+be.get(29).getLadderEnd()+"\n"+be.get(28).getLadderStart()+"\t"+be.get(77).getLadderEnd()+"\n"+be.get(30).getLadderStart()+"\t"+be.get(32).getLadderEnd()+"\n"+be.get(87).getLadderStart()+"\t"+be.get(93).getLadderEnd());

}
}