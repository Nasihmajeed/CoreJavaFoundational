package com.lxisoft.forest;
import java.util.*;
public class Giraffe extends Animal,Herbivores
{
	public boolean luckFactor()
	{
		Random random = new Random();
		boolean flag = random.nextBoolean();
		return flag;
	}
}