package com.LxiSoft.Game;
public class Snake extends Board

 {
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