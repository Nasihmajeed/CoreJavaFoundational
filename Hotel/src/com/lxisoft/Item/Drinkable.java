package com.lxisoft.Item ;

public class Drinkable extends Item
{
	private String type ;
	private int age,alcStr ;

	public String getType()
	{
		return type ;
	}

	public void setType(String t)
	{
		type = t ;
	}

	public int getAlcStr()
	{
		return alcStr ;
	}

	public void setBlend(int a)
	{
		alcStr = a ;
	}

	public int getAge()
	{
		return age ;
	}

	public void setAge(int a)
	{
		age = a ;
	}

}