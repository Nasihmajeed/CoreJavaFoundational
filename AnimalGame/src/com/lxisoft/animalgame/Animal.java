package com.lxisoft.animalgame;
public class Animal
{
	boolean isTrue = true;
	public int strength;
	public int hungerLevel;
	public static int testVariable = 50;
	public int xAxis = (int) (Math.random()*testVariable);
	public int yAxis = (int) (Math.random()*testVariable);
	private String name;

	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}