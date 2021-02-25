package com.LxiSoft.SnakeAndLadder;
import com.LxiSoft.SnakeAndLadder.*;
import java.util.*;
public class Dice
{
	Random random;
	public Dice()
	{
		random = new Random();
	}
	public int roll(){
		return random.nextInt(6)+1;
	}
}