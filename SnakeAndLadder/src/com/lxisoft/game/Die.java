package com.lxisoft.game;

import java.util.*;
public class Die
{
	 Random rand = new Random();
	int numberOnDie;


	public int getNumberOnDie()
	{
		numberOnDie = rand.nextInt(7);
	return numberOnDie;
	}


	

}