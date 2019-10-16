package com.lxisoft.carproject;
public class Car9 extends Cars implements Luxuary
{
	public void participantDetails()
	{
		System.out.println(" "+participantName+" "+carType+" "+fuelType+" "+speed);	

	}
	public double startRace(Cars[] car,long distance)
	{
		double time=0;
		double fuelWeightage= getFuelWeightage(car);
		double tyreWeightage=getTyreWeightage(car);
		car=getSpeed(car);
		System.out.println("speed"+this.speed);
		this.velocity=this.speed*(tyreWeightage/4)*fuelWeightage;
		System.out.println("velocity of car "+velocity);
		time=distance/velocity;
		System.out.println("time taken "+velocity);
		return time;

	}
	public double startRace(Cars[] car,double time)
	{
		double distance=0;
		double fuelWeightage= getFuelWeightage(car);
		double tyreWeightage=getTyreWeightage(car);
		car=getSpeed(car);
		System.out.println("speed"+this.speed);
		this.velocity=this.speed*(tyreWeightage/4)*fuelWeightage;
		System.out.println("velocity of car "+velocity);
		distance=time/velocity;
		System.out.println("time taken "+velocity);
		return distance;
	
	}
}