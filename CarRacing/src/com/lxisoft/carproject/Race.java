package com.lxisoft.carproject;
import java.util.Scanner;
import com.lxisoft.carproject.*;
public class Race
{
	Car car;
	Car[] raceCar;
	int distance;
	int raceTime;
	public void readyToRace()
	{
		System.out.println("-----car racing------");
		setCarDetails();
	}
	public void setCarDetails()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("\ncar details\n---------");
		raceCar=new Car[10];
		int a=1,b=6;
		for(int i=0;i<5;i++)
		{
			Car car=new LuxuaryCar();
			car.tyre1=new Tyre();
			System.out.println("\nenter the name of car-"+a);
			car.name=s.next();
			System.out.println("enter engine cc of car");
			car.engineCC=s.nextInt();
			System.out.println("enter fuel type of car---(1 for diesel & 2 for petrol)");
			car.fuelType=s.nextInt();
			if(car.fuelType==1)
			{
				car.fuelWeightage=2;
			}
			else
				car.fuelWeightage=1;
			System.out.println("\tnormal speed of car--"+car.normalSpeed);
			System.out.println("\ttyre brand--"+car.tyre1.brand);
			((LuxuaryCar)car).luxuaryCarDetails(car);
			raceCar[i]=car;
			car.practicalSpeed=raceSpeed(raceCar,i);
			a++;
		}
		for(int i=5;i<10;i++)
		{
			Car car=new NormalCar();
			car.tyre1=new Tyre();
			System.out.println("\nenter the name of car-"+b);
			car.name=s.next();
			System.out.println("enter engine cc of car");
			car.engineCC=s.nextInt();
			System.out.println("enter fuel type of car---(1 for diesel & 2 for petrol)");
			car.fuelType=s.nextInt();
			if(car.fuelType==1)
			{
				car.fuelWeightage=2;
			}
			else
				car.fuelWeightage=1;
			System.out.println("\tnormal speed of car--"+car.normalSpeed);
			System.out.println("\ttyre brand--"+car.tyre1.brand);
			((NormalCar)car).normalCarDetails(car);
			raceCar[i]=car;
			car.practicalSpeed=raceSpeed(raceCar,i);
			b++;
		}
		startRace();
	}
	public int raceSpeed(Car[] raceCar,int i)
	{
		int practicalSpeed=(raceCar[i].normalSpeed)*(raceCar[i].engineCC)*(raceCar[i].power)*(raceCar[i].fuelWeightage);
		System.out.println("\tpracticalSpeed--"+practicalSpeed);
		return practicalSpeed;
	}
	public void startRace()
	{
		this.distance=100000;
		int[] time=new int[10];
		for(int i=0;i<10;i++)
		{
			if(raceCar[i] instanceof LuxuaryCar)
			{
				time[i]=((LuxuaryCar)raceCar[i]).startRace(raceCar[i],distance);
				((LuxuaryCar)raceCar[i]).startRace(raceCar[i]);
			}
			if(raceCar[i] instanceof NormalCar)
			{
				time[i]=((NormalCar)raceCar[i]).startRace(raceCar[i],distance);
			}
		}
		rankList(time);
	}
	public void rankList(int[] time)
	{
		System.out.println("\n ------rank list-------");
		int temp=0;
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
			System.out.println("\nRank->"+(r++)+"  car name-"+raceCar[k].name+" time--"+time[k]);

		}
	}
}