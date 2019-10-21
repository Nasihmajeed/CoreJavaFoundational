package com.lxisoft.carproject;
import com.lxisoft.carproject.*;
public class LuxuaryCar extends Car implements Luxuary
{
	public float startRace(Car car,int distance)
	{
		float time=(distance)/(car.practicalSpeed);
		return time;
	}
	public float startRace(Car car)
	{
		int raceTime=50;
		float distance=(raceTime)*(car.practicalSpeed);
		return distance;
	}
}