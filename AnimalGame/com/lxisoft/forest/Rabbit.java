package com.lxisoft.forest;
import java.util.*;
public class Rabbit extends Animal,Herbivores
{
	public boolean luckFactor()
	{
		Random random = new Random();
		boolean flag = random.nextBoolean();
		return flag;
	}
}