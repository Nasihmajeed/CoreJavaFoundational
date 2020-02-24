package com.lxisoft.forest;
import java.util.*;
public class Zebra  extends Animal implements Herbivores
{
	public void eat()
	{
		System.out.println("Zebra Eats Grass");
	}
	public void run()
	{
		System.out.println("Zebra runs fast");
	}	
}