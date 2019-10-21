package com.lxisoft.carproject;
import com.lxisoft.carproject.*;
public class Engine
{
	private int engineCC;
	private String fuelType;
	private int power;

	public void setEngineCC(int engineCC)
	{
		this.engineCC=engineCC;	
	}
	public int getEngineCC()
	{
		return engineCC;
	}
	public void setFuelType(String fuelType)
	{
		this.fuelType=fuelType;
	}
	public String getFuelType()
	{
		return fuelType;
	}
	public void setPower(int power)
	{
		this.power=power;
	}
	public int getPower()
	{
		return power;
	}
}