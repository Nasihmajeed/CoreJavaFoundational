package com.lxisoft.carproject;
import com.lxisoft.carproject.*;
public class NormalCar extends Car implements Normal
{
	public void normalCarDetails(Car car)
	{
		car.power=100;
		System.out.println("\tcar power-"+car.power);
	}
	public int startRace(Car car,int distance)
	{
		int time=(distance)/(car.practicalSpeed);
		System.out.println("\ncar name-->"+car.name+" time--"+time);
		return time;
	}
}