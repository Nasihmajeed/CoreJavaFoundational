package com.lxisoft.game;
import java.util.*;

public class Dice 
{	
	int value;
 
 	public int roll() 
 	{	Random objGenerator = new Random();	
		value = objGenerator.nextInt(5+1)+1;
		return value; 
	}
 
}