package com.lxisoft.carproject;
import com.lxisoft.carproject.*;
public abstract class Cars
{ 
	String participantName,tyreBrand,fuelType,carType;
	double  velocity,speed=60,result;
	

	public void participantDetails()
	{
	System.out.println(" "+participantName+"\t"+carType+"\t"+fuelType+"\t"+tyreBrand+"\t"+speed);
	}

	public double getTyreWeightage(Cars[] cardetails)
	{
		double tyreWeightage=0;
		for(int i=0;i<cardetails.length;i++)
		{
			if(cardetails[i].tyreBrand=="MRF")
				tyreWeightage=2.5;
			else
				tyreWeightage=1.5;
		}
		return tyreWeightage;
	}

	public double getFuelWeightage(Cars[] cardetails)
	{
		double fuelWeightage=0;
		for(int i=0;i<cardetails.length;i++)
		{
			if(cardetails[i].fuelType=="diesel")
				fuelWeightage=2.5;
			else
				fuelWeightage=1.5;
		}
		return fuelWeightage;
	}
	public Cars[] getSpeed(Cars[] cardetails)
	{

		double fuelW,tyreW=0;
		fuelW=getFuelWeightage(cardetails);
		tyreW=getTyreWeightage(cardetails);
		for(int i=0;i<cardetails.length;i++)
			{
				if(cardetails[i] instanceof Luxuary)
				{
					if(fuelW>2 || tyreW>2)
					{
						cardetails[i].speed=200;
					}
				}
			}
		return cardetails;

	}


}