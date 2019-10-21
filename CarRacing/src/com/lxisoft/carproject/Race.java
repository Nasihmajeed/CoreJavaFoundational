package com.lxisoft.carproject;
import java.util.Scanner;
import com.lxisoft.carproject.*;
public class Race
{
	Car[] cars;
	int distances;
	int raceTime;

	public void createCars()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("-----CAR RACING------");
		System.out.println("\ncar details\n---------");
		cars=new Car[10];
		int a=1,b=6,e,f;
		for(int i=0;i<5;i++)
		{
			Car car=new LuxuaryCar();
			car.engine=new Engine();
			car.tyres=new Tyre[4];
			System.out.println("\nenter the name of car-"+a);
			car.name=s.next();
			System.out.println("\tnormal speed of car--"+car.normalSpeed);
			car.tyreDetails();
			System.out.println("\nenter engine type of car-"+a);
			System.out.println("\n(1-(1.2cc&petrol) 2-(1.3cc&diesel))");
			e=s.nextInt();
			car.engineDetails(e);
			car.practicalSpeed=car.raceSpeed();
			cars[i]=car;
			
			a++;
		}
		for(int i=5;i<10;i++)
		{
			Car car=new Car();
			car.engine=new Engine();
			car.tyres=new Tyre[4];
			System.out.println("\nenter the name of car-"+b);
			car.name=s.next();
			System.out.println("\tnormal speed of car--"+car.normalSpeed);
			car.tyreDetails();
			System.out.println("\nenter engine type of car-"+b);
			System.out.println("\n(1-(1.2cc&petrol) 2-(1.3cc&diesel))");
			e=s.nextInt();
			car.engineDetails(e);
			car.practicalSpeed=car.raceSpeed();
			cars[i]=car;
			
			b++;
		}
		startRace();
	}
	public void startRace()
	{
		this.distances=100000;
		float[] time=new float[10];
		float[] distance=new float[10];
		for(int i=0;i<10;i++)
		{
			if(cars[i] instanceof LuxuaryCar)
			{
				time[i]=((LuxuaryCar)cars[i]).startRace(cars[i],distances);
				distance[i]=((LuxuaryCar)cars[i]).startRace(cars[i]);
			}
			else
			{
				time[i]=((Car)cars[i]).startRace(cars[i],distances);
				distance[i]=((Car)cars[i]).startRace(cars[i]);
			}
		}
		rankListTime(time);
		rankListDistance(distance);
	}
	public void rankListTime(float[] time)
	{
		System.out.println("\n ------rank list time-------");
		float temp;
		for(int k=0;k<10;k++)
		{
			for(int i=0;i<10;i++)
			{
				if(time[i]>time[k])
				{
					temp=time[k];
					time[k]=time[i];
					time[i]=temp;
				}
			}
		}
		int r=1;
		for(int k=0;k<10;k++)
		{
			System.out.println("\nRank->"+(r++)+"\t  car name-"+cars[k].name+"\ttime--"+time[k]);
			System.out.print("");

		}
	}
	public void rankListDistance(float[] distance)
	{
		System.out.println("\n ------rank list distance-------");
		float temp;
		for(int k=0;k<10;k++)
		{
			for(int i=0;i<10;i++)
			{
				if(distance[k]>distance[i])
				{
					temp=distance[k];
					distance[k]=distance[i];
					distance[i]=temp;
				}
			}
		}
		int r=1;
		for(int k=0;k<10;k++)
		{
			System.out.println("\nRank->"+(r++)+"\t  car name-"+cars[k].name+"\tdistance--"+distance[k]);
			System.out.print("");

		}

	}


}