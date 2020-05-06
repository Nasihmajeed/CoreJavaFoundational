package com.lxisoft.game;
public class EnergyLevel
{
	private int energyOfOne;
	private int energyOfTwo;
	public void setEnergyParamOfOne(int x)
	{
		this.energyOfOne = x;
	}
	public void setEnergyParamOfTwo(int y)
	{
		this.energyOfTwo = y;
	}
	public int getEnergyParamOfOne()
	{
		 return energyOfOne;
	}
	public int getEnergyParamOfTwo()
	{
		return energyOfTwo;
	}
}