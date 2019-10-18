package com.lxisoft.carracing;
import java.util.Scanner;
import com.lxisoft.carracing.*;

public class Race
{
	String raceLocation;
	Car[] car= new Car[10];
	static int raceNo=1;
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
			car[i].engine.cc=sc.nextInt();
			System.out.println("Enter the fuel type 0 for petrol and 1 for diesel");
			car[i].engine.fuel=sc.nextInt();
			System.out.println("Enter the tyre 0-mrf  1-appolo  2-nippon  3-ceat");
			car[i].tyre.brand=sc.nextInt();
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
			car[i].engine.cc=sc.nextInt();
			System.out.println("Enter the fuel type 0 for petrol and 1 for diesel");
			car[i].engine.fuel=sc.nextInt();
			System.out.println("Enter the tyre 0-mrf  1-appolo  2-nippon  3-ceat");
			car[i].tyre.brand=sc.nextInt();
		}
	}

	public void totalCars()
	{
		System.out.println("\t\t\t--------Total cars of "+raceLocation+" are -----------");
		for(int i=0;i<4;i++)
		{
			System.out.println((i+1)+"th car's- name-"+car[i].carName+"\t||cc-"+car[i].engine.cc+"\t||fuel type-"+car[i].engine.fuel+"\t||tyre brand-"+car[i].tyre.brand+"\t||basicSpeed-"+car[i].basicSpeed);
		}
	}

	public void raceStart()
	{
		int mode,dValue=0,count;
		float tValue=0;
		double[] retValue=new double[4];
		char c;
		System.out.println("\n\t\t  ---RACE STARTS---");
		for(int j=0;true;j++)
		{	
			count=0;
			System.out.println("\n\t\t\tRACE-"+(raceNo++));
			System.out.println("enter the game mode 0-timemode  1-distancemode");	
			mode=sc.nextInt();
			if(mode==0)
			{
				System.out.println("enter the time in sec.msec format");
				tValue=sc.nextFloat();
				for(int i=0;i<4;i++)
				{
					retValue[count]=car[i].start(tValue);
					count++;
				} 
				rankingTime(retValue);
			}
			else if(mode==1)
			{
				System.out.println("enter the distance in metres");
				dValue=sc.nextInt();
				for(int k=0;k<4;k++)
				{
					retValue[count]=car[k].start(dValue);
					count++;
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

	public void rankingDist(double[] retValue)
	{
		int j,i;
		Car temp=new Car();
		double tempRet;
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				if(retValue[i]<retValue[j])
				{	
					tempRet=retValue[i];
					retValue[i]=retValue[j];
					retValue[j]=tempRet;
					temp=car[i];
					car[i]=car[j];
					car[j]=temp;
				}
			}
		}
		rankList(retValue,0);
	}

	public void rankingTime(double[] retValue)
	{
		int j,i;
		Car temp=new Car();
		double tempRet;
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				if(retValue[i]>retValue[j])
				{	
					tempRet=retValue[i];
					retValue[i]=retValue[j];
					retValue[j]=tempRet;
					temp=car[i];
					car[i]=car[j];
					car[j]=temp;
				}
			}
		}
		rankList(retValue,1);
	}

	public void rankList(double[] retValue,int m)
	{
		System.out.println("\n===============the rank list========================");
		for(int i=0;i<4;i++)
		{
			System.out.print("Rannk-"+(i+1)+" carname-"+car[i].carName);//+"\t||cc-"+car[i].engine.cc+"\t||fuel type-"+car[i].engine.fuel+"\t||tyre brand-"+car[i].tyre.brand+"\t||basicSpeed-"+car[i].basicSpeed);
			if(m==0)
				System.out.print("\tMIN time-"+retValue[i]+"S\n");
			else if(m==1)
				System.out.print("\tMAX distance-"+retValue[i]+"M\n");
		}
	}

}
