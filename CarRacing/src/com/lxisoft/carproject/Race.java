package com.lxisoft.carproject;
import com.lxisoft.carproject.*; 
import java.util.*;
import java.lang.Math;
public class Race
{
	double distance;
	long time;
	Car[] car;



	public void setCarDetails()
	{
		Scanner sc=new Scanner(System.in);
		car=new Car[10];
		car[0]=new Luxuarycar();
		car[1]=new Car();
		car[2]=new Luxuarycar();
		car[3]=new Car();
		car[4]=new Luxuarycar();
		car[5]=new Car();
		car[6]=new Luxuarycar();
		car[7]=new Car();
		car[8]=new Luxuarycar();
		car[9]=new Car();

		car[0].participantName="car1";
		car[1].participantName="car2";
		car[2].participantName="car3";
		car[3].participantName="car4";
		car[4].participantName="car5";
		car[5].participantName="car6";
		car[6].participantName="car7";
		car[7].participantName="car8";
		car[8].participantName="car9";
		car[9].participantName="car10";
		for(int i=0;i<car.length;i++)
		{
			car[i].speed=60;
			for(int j=0;j<car[i].tyres.length;j++)
			{
				car[i].tyres[j]=new Tyre();
			}
			
			int fuelType=getRandom(2);
			switch(fuelType)
			{
			
				case 0: car[i].engine.fuelType="petrol";break;
				case 1: car[i].engine.fuelType="disel";break;
			}
			int tyreBrand=getRandom(2);
			switch(tyreBrand)
			{
				case 0: 
						for(int j=0;j<car[i].tyres.length;j++)
						car[i].tyres[j].tyreBrand="MRF";
						break;

				case 1: 
						for(int j=0;j<car[i].tyres.length;j++)
						car[i].tyres[j].tyreBrand="CEAT";
						break;
			}
			int cc=getRandom(3);
			switch(cc)
			{
				case 0:car[i].engine.engineCC=1000;break;
				case 1:car[i].engine.engineCC=1500;break;
				case 2:car[i].engine.engineCC=1800;break;
			}
		


		}
		

	}
	public void startRace()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<car.length;i++)
		{
			
			System.out.print((i+1)+" ");
			car[i].participantDetails();
		
		}
			System.out.println("Enter your choice");
			System.out.println(" 1.Race by distance");
			System.out.println(" 2.Race by Time");
			int choice=sc.nextInt();
			switch(choice)
			{	
				case 1:System.out.println("Enter the Distance in meters");
					   distance=sc.nextDouble();
					   double []result=new double[car.length];
					   for(int i=0;i<car.length;i++)
					   {
					  	
						 result[i]=(int)car[i].getResult(distance);
						   	    					   	    
					   }
					   	distance_Result(result);
					   break;
				case 2:System.out.println("Enter the time in minute");
						time=sc.nextLong();
						double []result_M=new double[car.length];
						 for(int i=0;i<car.length;i++)
  					    {

						   	result_M[i]=(int)(car[i]).getResult(time);
						   		
				    	}
					   time_Result(result_M);
					  break;

						
			}

	}

		public void time_Result(double []result_M)
		{
			
			Car temp=null;
			double temp2=0;
			Car[] rank=new Car[car.length];
			for(int i=0;i<rank.length;i++)
				{	
					rank=car;
					for(int j=0;j<rank.length;j++)
					{
						if(rank[i].speed>rank[j].speed)
						{
							temp=rank[i];
							rank[i]=rank[j];
							rank[j]=temp;
						}

						if(result_M[i]>result_M[j])
						{
							temp2=result_M[i];
							result_M[i]=result_M[j];
							result_M[j]=temp2;
						}

					}	
				}
			System.out.println("Ranklist");
			System.out.println("-----------");	
			System.out.println("Rank \t Name  \tspeed \t Distance "  );	
			for(int i=0; i<rank.length; i++)
			System.out.println(" " +(i+1) + "\t"+rank[i].participantName +"\t"+rank[i].speed+"\t "+result_M[i]);			 


	}
		public void distance_Result(double []result)
		{
			
			Car temp=null;
			double temp2=0;
			Car[] rank=new Car[car.length];
			
				
				for(int i=0;i<rank.length;i++)
				{	
					rank=car;
					
					for(int j=0;j<rank.length;j++)
					{
						if(rank[i].speed>rank[j].speed)
						{
							temp=rank[i];
							rank[i]=rank[j];
							rank[j]=temp;
						}
						if(result[i]<result[j])
						{
							temp2=result[i];
							result[i]=result[j];
							result[j]=temp2;
						}

					}	
				

				
				}
			System.out.println("Ranklist");
			System.out.println("-----------");	
			System.out.println("Rank \t Name \t speed \t Time"  );	
			for(int i=0; i<rank.length; i++)
			System.out.println(" " +(i+1) + "\t "+rank[i].participantName +" \t  "+rank[i].speed+"\t "+result[i]);
		
		}
		public int getRandom(int limit)
		{
			int random =(int)(limit* Math.random());
			return random;
		}


	
}