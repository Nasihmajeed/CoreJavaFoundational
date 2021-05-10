package com.lxisoft.game;
import com.lxisoft.players.*;




public class Snake
{
	public int getSnake(int pos)
	{	System.out.println("Player caught by snake");
		pos=pos-7;
		return pos;
	}
}