package com.lxisoft.game;
import com.lxisoft.players.*;

public class Ladder
{
	public int getLadder(int position)
	{	
		position=position+13;
		
		System.out.println("Player has moved up through the Ladder to the position : "+position);
		
		return position;
	}
}