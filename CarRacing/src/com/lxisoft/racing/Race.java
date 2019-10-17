package com.lxisoft.racing;
import com.lxisoft.racing.*;
import java.util.Scanner;
import java.lang.Math;

public final class Race
{
	Car[] car=new Car[10];
	public void setRace()
	{
		Scanner sc=new Scanner(System.in);
		int engineType=0;
		int fuelType=0;
		int tyreType=0;
		

		car[0]=new Car();
		car[1]=new Car();
		car[2]=new Car();
		car[3]=new Car();
		car[4]=new Car();
		car[5]=new LuxuryCar();
		car[6]=new LuxuryCar();
		car[7]=new LuxuryCar();
		car[8]=new LuxuryCar();
		car[9]=new LuxuryCar();
		
		
		for(int i=0; i<10; i++)
		{
			// System.out.println(i);
			car[i].number=i;
			System.out.println("enter driver name ");
			car[i].driver=sc.next();
			engineType=getRandom(4);
			switch(engineType)
			{
				case 0: car[i].engine=1000;break;
				case 1: car[i].engine=1200;break;
				case 2: car[i].engine=1300;break;
				case 3: car[i].engine=1500;break;
			}
			fuelType=getRandom(2);
			switch(fuelType)
			{
				case 0: car[i].fuel="petrol";break;
				case 1: car[i].fuel="disel";break;
			}
			tyreType=getRandom(3);
			switch(tyreType)
			{
				case 0: car[i].tyre="mrf";break;
				case 1: car[i].tyre="tvs";break;
				case 2: car[i].tyre="neon";break;
			}
			car[i].speed=60;
			car[i].setPV();
			car[i].setDetails();
		}
			
				
		for(int i=0; i<10; i++)
		{
			car[i].setDetails();
		}

	}
	public int getRandom(int limit)
	{
		int random =(int)(limit* Math.random());
		return random;
	}
	public void setStartRace()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the race distance= ");
		int distance=sc.nextInt();
		double[] speed= new double [10];
		Car temp=null;
		for(int i=0; i<10; i++)
		{
			speed[i]=car[i].getSpeed(distance);
			
		}
		System.out.println("\n \n");
		for (int i=0; i<10; i++)
		{
			System.out.println("the "+ (i+1) +" car finished "+ distance +" mtr  within "+ speed[i]+ "seconds");
		}

		for (int i=0; i<10; i++)
		{
			for(int j=0; j<10; j++)
			{
				if(car[i].speed>car[j].speed)
				{
					temp=car[j];
					car[j]=car[i];
					car[i]=temp;
				}
			}
		}
		System.out.println("\n \n");
		System.out.println(" Rankwise list: ");
		for(int i=0; i<10; i++)
		{
			System.out.print(i+1 +" rank ");
			car[i].setDriverName();


		}System.out.println("\n \n");
		System.out.println(" the winner is "+ (car[0].driver) );
		System.out.println("----------------------------------------");


	}
	
}