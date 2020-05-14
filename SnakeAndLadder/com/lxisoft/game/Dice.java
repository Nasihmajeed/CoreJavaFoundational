package com.lxisoft.game;
import java.util.*;

public class Dice 
	
	Random objGenerator = new Random();
	int value;
  {
 	public void roll() 
 	{		
		value = objGenerator.nextInt(6);
		return value; 
	}
 
}