package com.lxisoft.game;

import java.util.*;
import java.util.Random;

public class Die
{
	 int numberOnDie;
	 Random r= new Random();
	
public int getNumberOnDie()
{
	numberOnDie = r.nextInt(6)+1;
	return numberOnDie;
}

}