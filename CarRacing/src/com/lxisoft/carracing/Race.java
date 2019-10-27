package com.lxisoft.carracing;
import java.lang.Math;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import com.lxisoft.carracing.*;

public class Race
{
	String raceLocation;
	Car[] car= new Car[10];
	static int raceNo=0;
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
			System.out.println("Enter the "+(i+1)+ "th car's name");
			car[i].carName=sc.next();
			carStatus(i);
		}
		luxuriousCars();
	}

	public void luxuriousCars()															
	{
		System.out.println("--------Enter the details of five luxurious cars---------");
		for(int i=2;i<4;i++)
		{
			car[i]=new LuxuryCar();
			System.out.println("Enter the "+(i+1)+ "th car's name");
			car[i].carName=sc.next();
			carStatus(i);
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
		float[] retValue=new float[4];
		char c;
		System.out.print("\n\t\t RACE STARTS");
		for(int z=0;z<6;z++)
		{
			System.out.print("!");
			try
			{
				TimeUnit.MILLISECONDS.sleep(100);
			}
			catch(InterruptedException e)
			{
				System.out.println("Exception occured:"+e);
			}
		}
		System.out.println("\n");
		for(int j=0;true;j++)
		{	
			count=0;
			System.out.println("\t\t  <---RACE-"+(++raceNo)+"--->");
			System.out.println("enter the game mode 0-timemode  1-distancemode");	
			mode=sc.nextInt();
			if(mode==0)
			{
				System.out.println("enter the time in sec.msec format");
				tValue=sc.nextFloat();
				for(int i=0;i<4;i++)
				{
					retValue[count]=(float)car[i].start(tValue);
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
					retValue[count]=(float)car[k].start(dValue);
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

	public void rankingDist(float[] retValue)
	{
		int j,i;
		Car temp=new Car();
		float tempRet;
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

	public void rankingTime(float[] retValue)
	{
		int j,i;
		Car temp=new Car();
		float tempRet;
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

	public void rankList(float[] retValue,int m)
	{
		System.out.println("\n=============== Rank list-"+raceNo+" =======================");
		for(int i=0;i<4;i++)
		{
			System.out.print("Rannk-"+(i+1)+"      carname-"+car[i].carName);
			if(m==0)
				System.out.print("\t    MIN time-"+retValue[i]+"S\n");
			else if(m==1)
				System.out.print("\t    MAX distance-"+retValue[i]+"M\n");
		}
	}

	public void carStatus(int i)
	{
		int r=random(4);
		car[i].tyre.brand=r;
		r=random(2);
		car[i].engine.fuel=r;
		r=random(4);
		switch(r)
		{
			case 0:car[i].engine.cc=1000;break;
			case 1:car[i].engine.cc=1300;break;
			case 2:car[i].engine.cc=1500;break;
			case 3:car[i].engine.cc=1750;break;
		}
		
	}

	public int random(int x)
	{
		return ((int) (Math.random() * x));
	}

}

// TimeUnit.SECONDS.sleep(10);