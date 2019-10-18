package com.lxisoft.carrise;
import com.lxisoft.carrise.*;
public class LuxuryCar extends Car implements Luxury
{
	public void lCarDetails(Car car)
	{
		car.power=15;
		System.out.println("power: "+car.power);
	}
	public int start(Car car,int distance)
	{
		int time=(distance)/(car.practicalVelocity);
		System.out.println("\nCar name:"+car.carName+" Time:"+time);
		return time;
	}
	public void start(Car car)
	{
		int rTime=10;
		int distance=(rTime)*(car.practicalVelocity);
		System.out.println("\nCar Name:"+car.carName+" distance:"+distance);
	}
}