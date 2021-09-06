package com.lxisoft.game;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Cell//method for moving coins through board
 {
 	private int position;
  private String coin;
 	private boolean space; 	
  public void setPosition(int position)
  {
  	this.position=position;
  }

  public int getPosition()
  {
  	return position;
  }

  public void setCoinPlace(String coin)
  {
  	this.coin=coin;
  }

  public String getCoinPlace()
  {
  	return coin;
  }

  public void setSpace(Boolean space)
  {
    this.space=space;
  }
public boolean getSpace()
{
  return space;
}
}