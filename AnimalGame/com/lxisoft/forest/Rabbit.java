package com.lxisoft.forest;
import java.util.*;
public class Rabbit  extends Animal implements Herbivores
{
	public void eat()
	{
		System.out.println("Rabbit Eats Grass");
	}
	public void run()
	{
		System.out.println("Rabbit runs fast");
	}	
}