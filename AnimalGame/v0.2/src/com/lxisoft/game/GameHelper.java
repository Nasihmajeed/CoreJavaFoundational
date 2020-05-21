package com.lxisoft.game ;

import java.util.* ;

public class GameHelper
{
	public static int generateRandomNumber(int x) // <---- Function to generate a random integer from 0 to (x-1)
	{
		Random r = new Random();
		int n = r.nextInt(x);
		return n;
	}
}