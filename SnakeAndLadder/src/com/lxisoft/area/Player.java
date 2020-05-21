 package com.lxisoft.area;
import java.util.*;

public class Player
{
	private String name,coin;
	private int position;
	private boolean status;

  public void setPlayerName(String name)
  {
  	this.name=name;
  }

  public String getPlayerName()
  {
  	return name;
  }

  public void setPlayerPosition(int position)
  {
  	this.position=position;
  }

  public int getPlayerPosition()
  {
  	return position;
  }

  public void setPlayerStatus(boolean status)
  {
  	this.status=status;
  }

  public boolean getPlayerStatus()
  {
  	return status;
  }

public void setCoin(String coin)
  {
    this.coin=coin;
  }

  public String getCoin()
  {
    return coin;
  }

 public String toString() { 
        return "Player" + "Name=" + name + ", Coin =" + coin+ ' '; 
    } 

}