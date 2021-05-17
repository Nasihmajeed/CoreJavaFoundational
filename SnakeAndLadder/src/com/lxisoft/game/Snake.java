package com.lxisoft.game;
import com.lxisoft.players.*;

public class Snake
{

public int getSnake(int position)
	{	
	    System.out.println("Player was caught by the Snake at the Position : "+position);
		
		position=position-6;
		return position;
	}

}