package com.lxisoft.kit;

import java.util.Random;


public class Dice
{
	
	int number=0;
    Random r=new Random();	
	
	public int rollDice()
	{
		number=r.nextInt(7);
		return (number==0 ; 1 ; number);
	}
	
}