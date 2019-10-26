package com.lxisoft.carRacing.race.car;
public class Engine
{
	private String type;
	private int cc;
	public Engine(String type,int cc)
	{
		this.type=type;
		this.cc=cc;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	public String getType()
	{
		return type;
	}
	public void setCc(int cc)
	{
		this.cc=cc;
	}
	public int getCc()
	{
		return cc;
	}
}