package com.lxisoft.forest;
import java.util.*;
public class Giraffe  extends Animal implements Herbivores
{
	public void eat()
	{
		System.out.println("Giraffe Eats Leafs");
	}
	public void run()
	{
		System.out.println("Giraffe runs Slowly");
	}	
}