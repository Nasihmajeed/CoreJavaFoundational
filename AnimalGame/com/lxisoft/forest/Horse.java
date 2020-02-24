package com.lxisoft.forest;
import java.util.*;
public class Horse  extends Animal implements Herbivores
{
	public void eat()
	{
		System.out.println("Horse Eats Grass");
	}
	public void run()
	{
		System.out.println("Horse runs fast");
	}	
}