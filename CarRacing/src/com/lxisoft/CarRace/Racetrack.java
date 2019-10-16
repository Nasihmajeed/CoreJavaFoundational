package com.lxisoft.CarRace;
import java.util.Scanner;
import com.lxisoft.CarRace.*;

public class Racetrack
{
	Car[] cars;
	// method for insertion of cars
   public Car[] register()
   {
	   int s;
	   cars= new Car[10];
	   
	   cars[0]= new Ferrari("Ferrari",60,"ceat",0,"diesel");
	   cars[1]= new Mustang("Mustang",60,"mrf",0,"Petrol");
	   cars[2]= new BMW("BMW",60,"rubb",0,"petrol");
	   cars[3]= new Mercedez("Mercedez",60,"abhi",0,"diesel");
	   cars[4]= new Lamborgini("lamborgini",60,"ceat",0,"petrol");
	   cars[5]= new Kwid("Kwid",60,"mrf",0,"diesel");
	   cars[6]= new Wagnr("Wagnr",60,"rubb",0,"petrol");
       cars[7]= new Rix("rix",60,"ceat",0,"diesel");
       cars[8]= new Maruti("Maruti",60,"abhi",0,"diesel");
       cars[9]= new Jeep("Jeep",60,"mrf",0,"petrol");	   
	   
	    for(s=0;s<cars.length;s++)
		{
			System.out.print(s+1+"-----");
			cars[s].display();
		} 
	   return cars;
	   
   }
     // method for reset the specifications of cars
   public void reset()
   {
	  for(int i=0;i<cars.length;i++)
	  {
		  if(cars[i] instanceof Sportcar)
		  {
			  cars[i].power=2;
		  }
		  if(cars[i] instanceof Normalcar)
		  {
			  cars[i].power=3;
		  }
	  }
	    resettyre() ;  
   }
     
   // method for calculate practical velocity
   
   public void resettyre()
   {
	 
	 for(int i=0;i<cars.length;i++)
	 {
		 if(cars[i].tyre == "ceat" || cars[i].tyre == "mrf")
		 {
		   cars[i].basic_speed=60*cars[i].power*2;
		 }
		 if(cars[i].tyre == "rubb" || cars[i].tyre == "abhi")
		 {
		   cars[i].basic_speed=60*cars[i].power*3;
		 }
	 }
     	resetfuel(); 
   }
   public void resetfuel()
   {
	    for(int i=0;i<cars.length;i++)
	 {
		 if(cars[i].fuel == "petrol")
		 {
		   cars[i].basic_speed=cars[i].basic_speed*2;
		 }
		 if(cars[i].fuel == "diesel")
		 {
		   cars[i].basic_speed=cars[i].basic_speed*3;
		 }
	 }
   }
   //method for print Ranklist
   
   public void ranklist()
   {
	   int i,j ;
	 Car temp= new Car();
	 for(i=0;i<cars.length;i++)
	 {
		 for(j=0;j<cars.length;j++)
		 {
			 if(cars[i].basic_speed>cars[j].basic_speed)
			 {
				temp=cars[i];
				cars[i]=cars[j];
				cars[j]=temp;
			 }
		 }
	 }
	 System.out.println(" \t \t ----the Winner is---"+cars[0].name+"\n");
	 
	 System.out.println(" \t \t ----RANK LIST---"+"\n");
	 for(i=0;i<cars.length;i++)
	 {
		 System.out.println((i+1)+" name--"+cars[i].name+"   speed--"+cars[i].basic_speed);
	 }
	 
   }
   
}