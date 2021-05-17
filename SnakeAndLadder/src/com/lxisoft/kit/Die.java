package com.lxisoft.kit;

import java.util.*;
import java.util.Random;

public class Die
{
	int num;
	Random r=new Random();
	
	public int getDieNum()
	{
		num=r.nextInt(6)+1;
		return num;
	}
}