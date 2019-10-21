package com.lxisoft.racing;
import com.lxisoft.racing.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.concurrent.TimeUnit;

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
				case 0: car[i].engine.cc=1000;break;
				case 1: car[i].engine.cc=1200;break;
				case 2: car[i].engine.cc=1300;break;
				case 3: car[i].engine.cc=1500;break;
			}
			fuelType=getRandom(2);
			switch(fuelType)
			{
				case 0: car[i].engine.fuel="petrol";break;
				case 1: car[i].engine.fuel="disel";break;
			}  
			for(int j=0; j<4; j++)
			{
				car[i].tyre[j]=new Tyre();
				tyreType=getRandom(3);
				switch(tyreType)
				{
					case 0: car[i].tyre[j].manufacture="mrf";break;
					case 1: car[i].tyre[j].manufacture="tvs";break;
					case 2: car[i].tyre[j].manufacture="neon";break;
				}
			}

			car[i].speed=60;
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
	public void startRace()
	{
		Scanner sc=new Scanner(System.in);
		int error=0;
		System.out.println("enter the race type \n 0 for Distance \n 1 for Time");
		do
		{	try
			{
				int type=sc.nextInt();
				error=0;
				switch(type)
				{
					case 0: setDistanceGame();break;
					case 1: setTimeGame();break;
					default : throw new NullPointerException();
				}
			}
			catch(NullPointerException e)
			{
				System.out.println(" enter the correct value");
				error=1;
			}
		}while(error==1);
	}
	public void setDistanceGame()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the race distance= ");
		int distance=sc.nextInt();
		float[] speed= new float [10];
		Car temp=null;
		for(int i=0; i<10; i++)
		{
			car[i].setStart();
			speed[i]=(float)car[i].getResult(distance);
			
		}
		System.out.println("\n \n");
		for (int i=0; i<10; i++)
		{
			System.out.println("the "+ car[i].driver +" finished "+ distance +" mtr  within "+ speed[i]+ "seconds");
		}
		setWinner();
	}
	public void setTimeGame()
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter the race Time=  minutes: ");
		int timeMinute=sc.nextInt();
		System.out.println("Seconds: ");
		int timeSecond=sc.nextInt();
		double[] distance=new double[10];
		for(int i=0; i<10; i++)
		{
			car[i].setStart();
			distance[i]=(int)car[i].getResult(timeSecond, timeMinute);
		}
		System.out.println("\n \n");
		for (int i=0; i<10; i++)
		{
			System.out.println("the "+ car[i].driver  +"  covered "+ distance[i]+ " meters from " + timeMinute+ " minutes  & "+timeSecond+ " seconds " );
		}
		setWinner();
	}

	public void setWinner()
	{
		Car temp=null;
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
		try
		{
			for(int i=0; i<10; i++)
			{
				System.out.print(i+1 +" rank ");
				car[i].setDriverName();
				TimeUnit.SECONDS.sleep(2);
			}
		}catch(Exception e)
		{
			System.out.println("Error occured");
		}
			System.out.println("\n \n");
			System.out.println(" the winner is "+ (car[0].driver) );
			System.out.println("----------------------------------------");
		anotherGame();
	}
	public void anotherGame()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Do u want another Race Y / N");
		String type=sc.next();
		switch(type)
		{
			case "y": startRace(); break;
			default: System.out.print("SEE U LATER.."); break;
		}



	}

	
}