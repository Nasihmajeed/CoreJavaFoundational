package com.lxisoft.carproject;
import com.lxisoft.carproject.*;
public class LuxuaryCar extends Car implements Luxuary
{
	public void luxuaryCarDetails(Car car)
	{
		car.power=200;
		System.out.println("\tcar power--"+car.power);
	}
	public int startRace(Car car,int distance)
	{
		int time=(distance)/(car.practicalSpeed);
		System.out.println("\ncar name-->"+car.name+" time--"+time);
		return time;
	}
	public void startRace(Car car)
	{
		int raceTime=50;
		int distance=(raceTime)*(car.practicalSpeed);
		System.out.println("\ncar name-->"+car.name+"distance--"+distance);
	}
}