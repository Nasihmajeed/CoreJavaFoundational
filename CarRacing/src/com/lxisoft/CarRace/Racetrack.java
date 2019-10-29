package com.lxisoft.CarRace;
import java.util.Scanner;
import com.lxisoft.CarRace.*;

public class Racetrack
{
	Car[] cars =new Car[10];
	float distance=100000;

   public Car[] register()
   {
	 cars[0] = new Normalcar("kwid", new Engine("petrol",1.500));
	 cars[1] = new Normalcar("zen    ", new Engine("diesel",1.4000));
	 cars[2] = new Normalcar("swift", new Engine("diesel",1.4000));
	 cars[3] = new Sportcar("benz", new Engine("petrol",1.500));
	 cars[4] = new Sportcar("mustang", new Engine("diesel",1.2000));
	 cars[5] = new Sportcar("lamborgini", new Engine("petrol",1.500));
	 cars[6] = new Normalcar("wagnr", new Engine("petrol",1.500));
	 cars[7] = new Normalcar("bresta", new Engine("petrol",1.200));
	 cars[8] = new Sportcar("mercedez", new Engine("diesel",1.000));
	 cars[9] = new Sportcar("martin", new Engine("diesel",1.400));
     
	 return cars;
   }
   //method to print Cars for Racing

   public void onmark()
   {
   	for(int i=0;i<cars.length;i++)
   	{
   		cars[i].display();
   	}
   	 settyre();
   }
   // method for setting the tyre specifications
    
   public void settyre()
   {
   	System.out.println(" \t---- Setting the tyres for cars------");

     for(int i=0;i<cars.length;i++)
     {
     		cars[i].retyre();
     } 
      startrace();
   }

   // method for conducting the race
   public void startrace()
   { 
   	for(int i=0;i<cars.length;i++)
   		{
   			cars[i].racespeed();
   			cars[i].racedistance();
        }
   }
   //method for printing the ranklist

   public void rankspeed()
   {
   	   System.out.println(" \t \t*********************");
   	   int i,j ;
	   Car temp;
	 for(i=0;i<cars.length;i++)
	 {
		 for(j=0;j<cars.length;j++)
		 {
			 if(cars[i].practspeed>cars[j].practspeed)
			 {
				temp=cars[i];
				cars[i]=cars[j];
				cars[j]=temp;
			 }
		 }
	 }
	 System.out.println(" \t \t ----the Winner is---"+cars[0].name+"\n");
	 
	 System.out.println(" \t \t ----RANK LIST---"+"\n");
	 for(i=0;i<10;i++)
	 {
		 System.out.println((i+1)+" name--"+cars[i].name+"   speed--"+cars[i].practspeed);
	 }
   }

   public void rankdistance()
   {
   	  System.out.println(" \t \t*********************");
   	   int i,j ;
	   Car temp;
	 for(i=0;i<cars.length;i++)
	 {
		 for(j=0;j<cars.length;j++)
		 {
			 if(cars[i].distance>cars[j].distance)
			 {
				temp=cars[i];
				cars[i]=cars[j];
				cars[j]=temp;
			 }
		 }
	 }
	 System.out.println(" \t \t ----the Winner is---"+cars[0].name+"\n");
	 
	 System.out.println(" \t \t ----RANK LIST---"+"\n");
	 for(i=0;i<10;i++)
	 {
		 System.out.println((i+1)+" name--"+cars[i].name+"   distance--"+cars[i].distance);
	 }
   }

}