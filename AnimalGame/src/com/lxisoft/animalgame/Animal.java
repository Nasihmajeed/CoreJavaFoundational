package com.lxisoft.animalgame;
public class Animal
{
	boolean isTrue = true;
	public int strength;
	public int hungerLevel;
	public int xAxis = (int) (Math.random()*30);
	public int yAxis = (int) (Math.random()*30);
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