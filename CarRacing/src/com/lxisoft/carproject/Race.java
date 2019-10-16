package com.lxisoft.carproject;
import com.lxisoft.carproject.*;
import java.util.*;
public class Race
{
	double distance;
	double time;
	Cars[] car;
	boolean carStatus=true;


	public void setCarDetails()
	{
		car=new Cars[10];
		car[0]=new Car1();
		car[1]=new Car2();
		car[2]=new Car3();
		car[3]=new Car4();
		car[4]=new Car5();
		car[5]=new Car6();
		car[6]=new Car7();
		car[7]=new Car8();
		car[8]=new Car9();
		car[9]=new Car10();

		car[0].participantName="car1";
		car[0].carType="Luxury";
		car[0].tyreBrand="MRF";
		car[0].fuelType="diesel";
		car[0].speed=90;

		car[1].participantName="car2";
		car[1].carType="Normal";
		car[1].tyreBrand="NGT";
		car[1].fuelType="petrol";
		car[1].speed=60;

		car[2].participantName="car3";
		car[2].carType="Luxury";
		car[2].tyreBrand="MRF";
		car[2].fuelType="diesel";
		car[2].speed=120;

		car[3].participantName="car4";
		car[3].carType="Normal";
		car[3].tyreBrand="NGT";
		car[3].fuelType="petrol";
		car[3].speed=70 ;

		car[4].participantName="car5";
		car[4].carType="Luxury";
		car[4].tyreBrand="MRF";
		car[4].fuelType="diesel";
		car[4].speed=100 ;

		car[5].participantName="car6";
		car[5].carType="Normal";
		car[5].tyreBrand="MRF";
		car[5].fuelType="petrol";
		car[5].speed=80;

		car[6].participantName="car7";
		car[6].carType="Luxury";
		car[6].tyreBrand="NGT";
		car[6].fuelType="petrol";
		car[6].speed=75;

		car[7].participantName="car8";
		car[7].carType="Normal";
		car[7].tyreBrand="NGT";
		car[7].fuelType="petrol";
		car[7].speed=70;

		car[8].participantName="car9";
		car[8].carType="Luxury";
		car[8].tyreBrand="MRF";
		car[8].fuelType="diesel";
		car[8].speed=140;

		car[9].participantName="car10";
		car[9].carType="Normal";
		car[9].tyreBrand="MRF";
		car[9].fuelType="petrol";
		car[9].speed=100;

	}
	public void show()
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
				case 1:System.out.println("Enter the Distance");
					   distance=sc.nextLong();
					   for(int i=0;i<car.length;i++)
					   {
					  
						   	if (car[i] instanceof Luxuary)
						   	{
						   		 time=((Luxuary)(car[i])).startRace(car,distance);
						   		 
						   		 dResult(car,time);
						   		
						   		
						   	}
						   	else
						   	{
						   	     time=((Normal)(car[i])).startRace(car,distance);
						   	    
						   	     	dResult(car,time);
						   	     	
						   	    
						   	}
					   }
					   break;
				case 2:System.out.println("Enter the time");
						time=sc.nextInt();
						 for(int i=0;i<car.length;i++)
					   {
						   	if (car[i] instanceof Luxuary)
						   	{
						   		distance=((Luxuary)(car[i])).startRace(car,time);
						   		tResult(car,distance);
						   	}
						   	else
						   	{
						   		distance=((Normal)(car[i])).startRace(car,time);
						   		tResult(car,distance);
						   	}
					   }
					  break;

						
			}

	}

		public void tResult(Cars[] cardetails,double time)
		{
			
			Cars temp=null;
			Cars[] rank=new Cars[cardetails.length];
			// for(int k=0;k<cardetails.length;k++)
			// {
				
				for(int i=0;i<rank.length;i++)
				{	
					cardetails[i].result=time;
					rank=cardetails;
					for(int j=0;j<rank.length;j++)
					{
						if(rank[i].result>rank[j].result)
						{
							temp=rank[i];
							rank[i]=rank[j];
							rank[j]=temp;
						}
					
					}	
				

				
				
			
			System.out.println("Rank Details");
			System.out.println("rank: " +(i+1) + "  Name "+rank[i].participantName);
		
		  }


	}
		public void dResult(Cars[] cardetails,double distance)
		{
			
			Cars temp=null;
			Cars[] rank=new Cars[cardetails.length];
			// for(int k=0;k<cardetails.length;k++)
			// {
				
				for(int i=0;i<rank.length;i++)
				{	cardetails[i].result=distance;
					rank=cardetails;
					
					for(int j=0;j<rank.length;j++)
					{
						if(rank[i].result>rank[j].result)
						{
							temp=rank[i];
							rank[i]=rank[j];
							rank[j]=temp;
						}
					
					}	
				

				
				//}
			
			
			System.out.println("rank: " +(i+1) + "  Name "+rank[i].participantName);
		
		  }


	}
}