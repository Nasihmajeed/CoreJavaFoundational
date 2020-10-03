package com.lxisoft.Forest;
public class Animal
{
	private String name;
	private int strength;
	private boolean alive;

	

	public void setName(String n)
	{
		this.name = n;
	}

	public String getName()
	{
		return name;
	}

	public void setStrength(int s)
	{
		this.strength = s;
	}

	public int getStrength()
	{
		return strength;
	}

	public void setAlive(boolean b)
	{
		this.alive = b;
	}

    public boolean getAlive()
    {
    	return alive;
    }

}