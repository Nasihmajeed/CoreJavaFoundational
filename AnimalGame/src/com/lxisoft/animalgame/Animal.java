package com.lxisoft.animalgame;
public class Animal
{
	boolean isTrue = true;
	public int strength;
	private String name;

	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public int setRange(int range1,int range2)
	{
		int x = (int)(Math.random()*((range1-range2)+1))+range2;
        return x;
	}
}