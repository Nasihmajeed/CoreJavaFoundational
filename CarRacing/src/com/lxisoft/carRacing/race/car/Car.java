package com.lxisoft.carRacing.race.car;
public abstract class Car 
{
	private String name;
	private String engine;
	private int cc;
	private double time;

	public abstract void print();
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setEngine(String engine)
	{
		this.engine=engine;
	}
	public String getEngine()
	{
		return engine;
	}

	public void setCc(int cc)
	{
		this.cc=cc;
	}
	public int getCc()
	{
		return cc;
	}

	public void setTime(double time)
	{
		this.time=time;
	}
	public double getTime()
	{
		return time;
	}
}