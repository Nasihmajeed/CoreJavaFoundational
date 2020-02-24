package com.lxisoft.forest;
import java.util.*;
public class Bear extends Animal implements Carnivores 
{
	public void eat()
	{
		System.out.println("Bear Eats Flesh");
	}
	public void run()
	{
		System.out.println("Bear Runs Fast");	
	}
} 