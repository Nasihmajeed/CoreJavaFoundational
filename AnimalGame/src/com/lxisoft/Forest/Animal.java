package com.lxisoft.Forest;
public class Animal
{
	private String name;
	private int strength;
	private boolean alive;

	

	public void setName(String n)
	{
		name = n;
	}

	public String getName()
	{
		return name;
	}

	public void setStrength(int s)
	{
		strength = s;
	}

	public int getStrength()
	{
		return strength;
	}

	public void setAlive(boolean b)
	{
		alive = b;
	}

    public boolean getAlive()
    {
    	return alive;
    }

}