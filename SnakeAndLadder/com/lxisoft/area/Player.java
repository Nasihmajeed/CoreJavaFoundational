package co.lxisoft.area;
import java.util.*;

public abstract class Player
{
	private String name;
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


}