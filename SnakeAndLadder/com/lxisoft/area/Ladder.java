package com.lxisoft.area;
import java.util.*;

 class Ladder implements Control
 {
 		private int start,end;

 	public void behaviour() 
 	{		
		System.out.println("I am put up your position");
	}

	public void setStart(int start)
  {
  	this.start=start;
  }

  public int getStart()
  {
  	return start;
  }

  public void setEnd(int end)
  {
  	this.end=end;
  }

  public int getend()
  {
  	return end;
  }

 
}