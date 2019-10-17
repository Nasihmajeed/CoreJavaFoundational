package com.lxisoft.carracing;
import java.util.Scanner;
import com.lxisoft.carracing.*;

public class Race
{
	String raceLocation;
	Car[] car= new Car[10];
	Scanner sc=new Scanner(System.in);

	public void raceingSpot()																
	{
		System.out.println("Enter the racing spot ");
		raceLocation=sc.next();
	}

	public void nonLuxuriousCars()															
	{
		System.out.println("--------Enter the details of five non luxurious cars---------");
		for(int i=0;i<2;i++)
		{
			car[i]=new Car();
			System.out.println("Enter the "+(i+1)+ "th car's- name and cc");
			car[i].carName=sc.next();
			car[i].cc=sc.nextInt();
			System.out.println("Enter the fuel type 0 for petrol and 1 for diesel");
			car[i].fuel=sc.nextInt();
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
			System.out.println("Enter the fuel type 0 for petrol and 1 for diesel");
			car[i].fuel=sc.nextInt();
			System.out.println("Enter the tyre 0-mrf  1-appolo  2-nippon  3-ceat");
			car[i].tyre=sc.nextInt();
		}
		System.out.println("\t--------Total cars of "+raceLocation+" are -----------");
	}

	public void totalCars()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println((i+1)+"th car's- name-"+car[i].carName+"\t||cc-"+car[i].cc+"\t||fuel type-"+car[i].fuel+"\t||tyre brand-"+car[i].tyre+"\t||basicSpeed-"+car[i].basicSpeed);
		}
	}

	public void raceStart()
	{
		int mode,dValue=0,tCount=0,dCount=0;
		float tValue=0;
		double[] retDist=new double[4];
		double[] retTime=new double[4];
		char c;
		for(int j=0;true;j++)
		{
			System.out.println("enter the game mode 0-timemode  1-distancemode");	
			mode=sc.nextInt();
			if(mode==0)
			{
				System.out.println("enter the time in sec.msec format");
				tValue=sc.nextFloat();
				for(int i=0;i<4;i++)
				{
					retDist[dCount]=car[i].start(tValue);
					System.out.println("vdist "+retDist[dCount]);
					dCount++;
				} 
				rankingTime(retDist);
			}
			else if(mode==1)
			{
				System.out.println("enter the distance in kms ");
				dValue=sc.nextInt();
				for(int k=0;k<4;k++)
				{
					retTime[tCount]=car[k].start(dValue);
					System.out.println("v time "+retTime[tCount]);
					tCount++;
				} 
				rankingDist(retTime);
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

	public void rankingDist(double[] retDist)
	{
		int j,i;
		Car temp=new Car();
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				if(retDist[i]<retDist[j])
				{	
					temp=car[i];
					car[i]=car[j];
					car[j]=temp;
				}
			}
		}
		System.out.println("\t\t\t===============the rank list========================");
		totalCars();
	}

	public void rankingTime(double[] retTime)
	{
		int j,i;
		Car temp=new Car();
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				if(retTime[i]>retTime[j])
				{	
					temp=car[i];
					car[i]=car[j];
					car[j]=temp;
				}
			}
		}
		System.out.println("\t\t\t===============the rank list========================");
		totalCars();
	}

}
