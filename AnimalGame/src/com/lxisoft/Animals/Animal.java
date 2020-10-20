package com.lxisoft.Animals;
import com.lxisoft.Game.Forest;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public abstract class Animal
{
	public abstract void details();
	public void eat()
	{
		System.out.println("Eating behaviour");
	}
	public void name()
	{
		System.out.println("*********Animals and their Food habits*********");
	}
	private boolean life;
	private String name;
	private int strength;
	private int distance;
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setStrength(int a)
	{
		this.strength=a;
	}
	public int getStrength()
	{
		return strength;
	}
	public void setLife(boolean life)

	{
		this.life=life;
	}
	public boolean getLife()
	{
		return life;
	}
	public int getDistance()
	{
	return distance;
	}
	public void setDistance(int n)
	{
	this.distance=n;

	}
}	
	

