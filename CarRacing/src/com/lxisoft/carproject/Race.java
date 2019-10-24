package com.lxisoft.carproject;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import com.lxisoft.carproject.*;
public class Race
{
	Car[] cars;
	int raceDistance;
	float raceTime;
	Scanner s=new Scanner(System.in);
	public void createCars()
	{
		
		System.out.println("------CAR RACING-------");
		System.out.println("\nenter details of luxuary car\n--------------------");
		cars=new Car[10];
		int a=1,b=6,e,f;
		for(int i=0;i<5;i++)
		{
			
			Car car=new LuxuaryCar();
			car.engine=new Engine();
			car.tyres=new Tyre[4];
			System.out.println("\nenter the name of car-"+a);
			car.name=s.next();
			car.tyreDetails();
			System.out.println("\nenter engine type of car-"+a);
			System.out.println("(1-(1.2cc&petrol) 2-(1.3cc&diesel))");
			e=s.nextInt();
			car.engineDetails(e);
			car.practicalSpeed=car.raceSpeed();
			cars[i]=car;
			a++;
		}
		System.out.println("\nenter details of normal car\n------------------");
		for(int i=5;i<10;i++)
		{
			Car car=new Car();
			car.engine=new Engine();
			car.tyres=new Tyre[4];
			System.out.println("\nenter the name of car-"+b);
			car.name=s.next();
			car.tyreDetails();
			System.out.println("\nenter engine type of car-"+b);
			System.out.println("(1-(1.2cc&petrol) 2-(1.3cc&diesel))");
			e=s.nextInt();
			car.engineDetails(e);
			car.practicalSpeed=car.raceSpeed();
			cars[i]=car;
			b++;
		}
		carDetails();
		startRace();
	}
	public void carDetails()
	{
		System.out.println("\n\t\t------RACE CAR DETAILS-------\n");
		for(int i=0;i<10;i++)
		{
			System.out.println("car-"+cars[i].name+"\t\tnormal speed-"+cars[i].normalSpeed+"\t\tpractical speed-"+cars[i].practicalSpeed);
			System.out.println("\tenginecc--"+cars[i].engine.getEngineCC()+"\t\tfuel--"+cars[i].engine.getFuelType());
			for(int j=0;j<4;j++)
			{
				System.out.println("\t tyre-"+(j+1)+"-"+cars[i].tyres[j].getBrand()+"\t\tefficiency-"+cars[i].tyres[j].getEfficiency());
			}
		}
		System.out.print("\n\t\tRace Strats");
		for(int i=0;i<8;i++)
		{
			System.out.print("!!");
			try
			{
				TimeUnit.MILLISECONDS.sleep(100);
			}
			catch(InterruptedException e)
			{
				System.out.println("Exception "+e);
			}
		}
	}
	public void startRace()
	{
		int raceChoice;
		int raceNumber=1;
		do
		{
			System.out.println("\n\n\t\t<------RACE--"+(raceNumber++)+"------>");
			this.raceDistance=100000;
			float[] time=new float[10];
			float[] distance=new float[10];
			System.out.println("enter your choice (1-race by distance or 2-race by time)");
			int choice=s.nextInt();
			for(int i=0;i<10;i++)
			{
				switch(choice)
				{
					case 1: distance[i]=((Car)cars[i]).startRace(cars[i]); break;
					case 2: time[i]=((Car)cars[i]).startRace(cars[i],raceDistance); break;
					default: System.out.println(" not a valid choice "); break;
				}
			}
			switch(choice)
			{
				case 1: rankListDistance(distance); break;
				case 2: rankListTime(time); break;
			}
			System.out.println("do you want another car race?(1-yes or 2-no)");
			raceChoice=s.nextInt();
		}while(raceChoice==1);
	}
	public void rankListTime(float[] time)
	{
		System.out.println("\n ------rank list time-------");
		float temp;
		Car tempCar=new Car();
		for(int k=0;k<10;k++)
		{
			for(int i=0;i<10;i++)
			{
				if(time[i]>time[k])
				{
					temp=time[k];
					time[k]=time[i];
					time[i]=temp;
					tempCar=cars[k];
					cars[k]=cars[i];
					cars[i]=tempCar;
				}
			}
		}
		int r=1;
		for(int k=0;k<10;k++)
		{
			System.out.println("\nRank->"+(r++)+" \t  car name-"+cars[k].name+"\ttime--"+time[k]);
		}
	}
	public void rankListDistance(float[] distance)
	{
		System.out.println("\n ------rank list distance-------");
		float temp;
		Car tempCar=new Car();
		for(int k=0;k<10;k++)
		{
			for(int i=0;i<10;i++)
			{
				if(distance[k]>distance[i])
				{
					temp=distance[k];
					distance[k]=distance[i];
					distance[i]=temp;
					tempCar=cars[k];
					cars[k]=cars[i];
					cars[i]=tempCar;
				}
			}
		}
		int r=1;
		for(int k=0;k<10;k++)
		{
			System.out.println("\nRank->"+(r++)+" \t  car name-"+cars[k].name+"\tdistance--"+distance[k]);
		}
	}
}