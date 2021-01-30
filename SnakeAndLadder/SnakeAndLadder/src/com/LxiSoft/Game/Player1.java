package com.LxiSoft.Game;
// import com.LxiSoft.Game.*;
// import java.util.*;

public class Player1 extends Players 
{
    public void setPlayer(String name)
    {
		this.player = name; 
	} 
    public String getPlayer()
    {
		return player;
	}
    public void setColor(String colr)
    {
		this.color = colr;
	}
	public String getColor(){
		return color;
	}
    public void setPosition(int post)
    {
		this.position = post;
	}
    public int getPosition()
    {
		return position;
	}
}
