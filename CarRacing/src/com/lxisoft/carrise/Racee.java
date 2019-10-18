package com.lxisoft.carrise;
import java.util.Scanner;
import com.lxisoft.carrise.*;
public class Racee
{
	Car car;
	Car[] rCar;
	int distance;
	int rTime;
	public void startRace()
	{
		System.out.println("   CAR RACE START  ");
		System.out.println("*********************");
		CarDetails();
	}
	public void CarDetails()
	{
		Scanner sc=new Scanner(System.in);
		rCar=new Car[10];
		System.out.println(" Luxury Car Details");
		System.out.println("--------------------");
		for(int i=0;i<5;i++)
		{
			Car car=new LuxuryCar();
			System.out.println("Enter Car Name");
			car.carName=sc.next();
			System.out.println("Enter engine cc:");
			car.engineCC=sc.nextInt();
			System.out.println("Enter fuel type: ");
			car.fuelType=sc.next();
			System.out.println("Basic speed: "+car.basicSpeed);
			//System.out.println("Tyre brand:(1-JK,2-CEAT,3-MRF,4-APOLLO)");

			((LuxuryCar)car).lCarDetails(car);
			rCar[i]=car;
			car.practicalVelocity=raceSpeed(rCar,i);
		}
		System.out.println("\n");
		System.out.println(" Normal Car Details");
		System.out.println("---------------------");
		for(int i=5;i<10;i++)
		{
			Car car=new Car();
			System.out.println("Enter Car Name:");
			car.carName=sc.next();
			System.out.println("Enter engine cc:");
			car.engineCC=sc.nextInt();
			System.out.println("Enter fuel type: ");
			car.fuelType=sc.next();
			System.out.println("Basic speed: "+car.basicSpeed);
			nCarDetails(car);
			rCar[i]=car;
			car.practicalVelocity=raceSpeed(rCar,i);
		}
		start();
	}
	public void nCarDetails(Car car)
	{
		car.power=10;
		System.out.println("car power: "+car.power);
	}
	
	public int raceSpeed(Car[] rCar,int i)
	{
		int practicalVelocity=(rCar[i].basicSpeed)*(rCar[i].engineCC)*(rCar[i].power);
		// System.out.println("Speedd="+rCar[i].basicSpeed);
		// System.out.println("engineeCC="+rCar[i].engineCC);
		// System.out.println("powerr="+rCar[i].power);
		System.out.println("practicalVelocity: "+practicalVelocity);
		System.out.println("\n");
		return practicalVelocity;
	}
	public void start()
	{
		this.distance=1000;
		int[] time=new int[10];
		for(int i=0;i<10;i++)
		{
			if(rCar[i] instanceof LuxuryCar)
			{
				time[i]=((LuxuryCar)rCar[i]).start(rCar[i],distance);
				((LuxuryCar)rCar[i]).start(rCar[i]);
			}
			if(rCar[i] instanceof Car)
			{
				time[i]=start(rCar[i],distance);
			}
		}
		rank(time);
	}
	public int start(Car car,int distance)
	{
		int time=(distance)/(car.practicalVelocity);
		System.out.println("\ncar name:"+car.carName+" time:"+time);
		return time;
	}
	public void rank(int[] time)
	{
		System.out.println("\nRankList");
		System.out.println("--------------");
		int temp=0;
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(time[j]>time[i])
				{
					temp=time[i];
					time[i]=time[j];
					time[j]=temp;
				}
			}
		}
		int r=1;
		for(int i=0;i<10;i++)
		{
			System.out.println("\nRank:"+(r++)+"  car name:"+rCar[i].carName+" time:"+time[i]);
		}
	}
}

