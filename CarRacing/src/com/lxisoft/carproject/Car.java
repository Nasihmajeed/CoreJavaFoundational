package com.lxisoft.carproject;
import com.lxisoft.carproject.*;
public class Car
{ 
	String participantName;
	double speed;
	public Tyre []tyres=new Tyre[4];

	public Engine engine=new Engine();
	

	public void participantDetails()
	{
	System.out.println(" "+participantName+"\t"+engine.fuelType+"\t"+speed+"\t "+engine.engineCC);
	}

	public double getTyreWeightage()
	{
		double tyreWeightage=0,weightage=0;
		
			for(int j=0;j<tyres.length;j++)
			{
				if(tyres[j].tyreBrand=="MRF")
					weightage=1.5;
				else
					weightage=1;
			}
		
		tyreWeightage=(weightage+weightage+weightage+weightage)/4;
		return tyreWeightage;
	}

	public double getFuelWeightage()
	{
		double fuelWeightage=0;
		
			if(engine.fuelType=="diesel")
				fuelWeightage=1.5;
			else
				fuelWeightage=1;
	
		return fuelWeightage;
	}
	public double getEngineCC()
	{
		double engineWeightage=0;
		
			if(engine.engineCC==1800)
			   engineWeightage=1.3;
			else if(engine.engineCC==1500)
				engineWeightage=1.2;
			else
				engineWeightage=1;
		return engineWeightage;
	}
		
	public double getResult(double distance)
	{
		double time=0,fact=1;
		double fuelWeightage= getFuelWeightage();
		double tyreWeightage=getTyreWeightage();
		double engineWeightage=getEngineCC();
		if(this instanceof Luxuary) fact=((Luxuary)(this)).luxuaryWeightage;
		speed=this.speed*(tyreWeightage)*fuelWeightage*engineWeightage*fact;
		time=(distance/speed)*60;
		return time;

	}
	public double getResult(long time)
	{
		double distance=0,fact=1;
		double fuelWeightage= getFuelWeightage();
		double tyreWeightage=getTyreWeightage();
		double engineWeightage=getEngineCC();
		if(this instanceof Luxuary) fact=((Luxuary)(this)).luxuaryWeightage;
		speed=this.speed*(tyreWeightage)*fuelWeightage*engineWeightage*fact;
		distance=time*speed;
		return distance;
	
	}
	



}