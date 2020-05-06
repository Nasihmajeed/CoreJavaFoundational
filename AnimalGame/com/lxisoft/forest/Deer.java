package com.lxisoft.forest;
import java.util.*;
public class Deer  extends Animal implements Herbivores
{
	public void eat()
	{
		System.out.println("Deer Eats Grass");
	}
	public void run()
	{
		System.out.println("Deer runs fast");
	}	
}