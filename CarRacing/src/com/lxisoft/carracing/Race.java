package com.lxisoft.carracing;
import java.util.Scanner;
import com.lxisoft.carracing.*;

public class Race
{
	String raceLocation;
	Car[] car;
	Scanner sc=new Scanner(System.in);

	public void raceingSpot()																
	{
		System.out.println("Enter the racing spot ");
		raceLocation=sc.next();
	}

	public void nonLuxuriousCars()															
	{
		car=new Car[10];
		System.out.println("--------Enter the details of five non luxurious cars---------");
		for(int i=0;i<2;i++)
		{
			car[i]=new Car();
			System.out.println("Enter the "+(i+1)+ "th car's- name and cc");
			car[i].carName=sc.next();
			car[i].cc=sc.nextInt();
			System.out.println("Enter the fuel type p for petrol and d for diesel");
			car[i].fuel=sc.next().charAt(0);
			System.out.println("Enter the tyre 0-mrf  1-appolo  2-nippon  3-ceat");
			car[i].tyre=sc.nextInt();

		}
		luxuriousCars();
	}

	public void luxuriousCars()															
	{
		System.out.println("--------Enter the details of five luxurious cars---------");
		for(int i=2;i<4;i++)
		{
			car[i]=new LuxuryCar();
			System.out.println("Enter the "+(i+1)+ "th car's- name and cc");
			car[i].carName=sc.next();
			car[i].cc=sc.nextInt();
			System.out.println("Enter the fuel type p for petrol and d for diesel");
			car[i].fuel=sc.next().charAt(0);
			System.out.println("Enter the tyre 0-mrf  1-appolo  2-nippon  3-ceat");
			car[i].tyre=sc.nextInt();
		}
	}

	public void totalCars()
	{
		System.out.println("\t--------Total cars of "+raceLocation+" are ---------");
		for(int i=0;i<4;i++)
		{
			System.out.println((i+1)+"th car's- name--"+car[i].carName+"\tcc--"+car[i].cc+"\tfuel type--"+car[i].fuel+"\ttyre brand--"+car[i].tyre+"\tbasicSpeed--"+car[i].basicSpeed);
		}
	}

	public void raceStart()
	{
		int mode,dValue=0,count=0;
		float tValue=0;
		float[] retValue=new float[10];
		char c;
		for(int j=0;true;j++)
		{
			System.out.println("enter the game mode 0-timemode  1-distancemode");	
			mode=sc.nextInt();
			if(mode==0)
			{
				System.out.println("enter the time in hh.mm format");
				tValue=sc.nextFloat();
				for(int i=0;i<4;i++)
				{
					retValue[count]=car[i].start(tValue);
					System.out.println("vdist "+retValue[count]);
					count++;

				} 
				rankingTime(retValue);
			}
			else if(mode==1)
			{
				System.out.println("enter the distance in kms ");
				dValue=sc.nextInt();
				for(int i=0;i<4;i++)
				{
					retValue[count]=car[i].start(dValue);
					count++;
					System.out.println("vdist "+retValue[count]);

				} 
				rankingDist(retValue);
			}
			else
			{																									
				System.out.println("you entered a value no mentioned SORRY");
				break;
			}
			{
			System.out.println("Do you wish to conduct another race  y/n");										
			c=sc.next().charAt(0);
			if(c!='y')
				break;
			}
		}
	}

	public void rankingDist(float[] retValue)
	{
	Car temp=new Car();
	temp=null;
	for(int i=0;i<retValue.length;i++)
	{
		if(retValue[i]<retValue[i+1])
		{
			temp=car[i];
			car[i]=car[i+1];
			car[i+1]=temp;
		}
	}
	System.out.println("===============the rank list========================");
	totalCars();
	}

	public void rankingTime(float[] retValue)
	{
	Car temp=new Car();
	temp=null;
	for(int i=0;i<retValue.length;i++)
	{
		if(retValue[i]>retValue[i+1])
		{
			temp=car[i];
			car[i]=car[i+1];
			car[i+1]=temp;
		}
	}
	System.out.println("===============the rank list========================");
	totalCars();
	}

}
