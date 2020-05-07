package com.lxisoft.carrise;
import java.util.Scanner;
import com.lxisoft.carrise.*;
public class Racee
{
	Car car;
	Car[] rCar;
	int distance;
	double rTime;
	public void startRace()
	{
		System.out.println("   CAR RACE START  ");
		System.out.println("*********************");
		Scanner sc=new Scanner(System.in);
		rCar=new Car[10];

		System.out.println(" Luxury Car Details");
		System.out.println("--------------------");

		for(int i=0;i<5;i++)
		{
			rCar[i]=new LuxuryCar();
			System.out.println("Enter Car Name");
			rCar[i].carName=sc.next();
            rCar[i].tyreDetails();
            rCar[i].engineDetails();
		}
		System.out.println("\n");
		System.out.println(" Normal Car Details");
		System.out.println("---------------------");
		for(int i=5;i<10;i++)
		{
			rCar[i]=new Car();
			System.out.println("Enter Car Name:");
			rCar[i].carName=sc.next();
			
			 rCar[i].tyreDetails();
            rCar[i].engineDetails();
			
		}
		start();
	}
	
	public void start()
	{
		distance=1000;
		double[] time=new double[10];
		for(int i=0;i<10;i++)
		{
			time[i]=rCar[i].start(distance);
		}
		rank(time);
	}
	
	public void rank(double[] time)
	{
		System.out.println("\nRankList");
		System.out.println("--------------");
		double temp=0;
		Car tempp=null;
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(time[j]>time[i])
				{
					temp=time[i];
					time[i]=time[j];
					time[j]=temp;
                      
                    tempp=rCar[i];
					rCar[i]=rCar[j];
					rCar[j]=tempp;
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

