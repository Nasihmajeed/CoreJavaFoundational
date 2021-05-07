package com.lxisoft.snakeAndLadder;
class Snake
{
	public int getSnake(int pos)
	{	System.out.println("Player caught by snake");
		pos=pos-7;
		return pos;
	}
}