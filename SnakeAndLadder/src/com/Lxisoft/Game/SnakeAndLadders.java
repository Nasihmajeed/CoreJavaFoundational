package com.Lxisoft.Game;
import java.io.*;
import java.util.*;
import java.util.Random;

public class SnakeAndLadders
{
	public String snakes;
	public void snakes()
	{
		int snakesArray= new int[] {20,36,70,45,98,90,54};
	}
	public void laddrs()
	{
		int laddersArray = new int[] {10, 21, 40, 53, 78, 60};
	}
	private int head;
 	private int tail;

 	
  public void setHead(int head)
  {
  	this.head=head;
  }

  public int getHead()
  {
  	return head;
  }

  public void setTail(int tail)
  {
  	this.tail=tail;
  }

  public int getTail()
  {
  	return tail;
  }

}
}