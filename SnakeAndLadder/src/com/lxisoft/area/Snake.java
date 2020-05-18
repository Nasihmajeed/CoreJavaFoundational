package com.lxisoft.area;
import java.util.*;

public class Snake  implements Control
 {
 	private int head,tail;

 	public void behaviour() 
 	{		
		System.out.println("I am put down your position");
	}
 	
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