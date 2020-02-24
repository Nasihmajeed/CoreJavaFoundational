package com.lxisoft.forest;
import java.util.*;
public class Wolf extends Animal implements Carnivores
{
	public void eat()
	{
		System.out.println("Wolf Eats Flesh");
	}
	public void run()
	{
		System.out.println("Wolf Runs Fast");	
	}
}