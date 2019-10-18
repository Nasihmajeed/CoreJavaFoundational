package com.lxisoft.carrise;
import com.lxisoft.carrise.*;
public class Engine extends Car
{
	private int engineCC;
	private int power;
	private String fuelType;

    public void setEngineCC(int engineCC)
	{
		this.engineCC=engineCC;
	}
	public int getEngineCC()
	{
		return engineCC;
	}

	public void setpower(int power)
	{
		this.power=power;
	}
	public int getpower()
	{
		return power;
	}

	public void setfuelType(String fuelType)
	{
		this.fuelType=fuelType;
	}
	public String getfuelType()
	{
		return fuelType;
	}


}