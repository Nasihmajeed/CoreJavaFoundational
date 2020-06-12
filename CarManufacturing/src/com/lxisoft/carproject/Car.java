package com.lxisoft.carproject;

import java.util.Scanner;

public class Car
{
	Door[] doors;
	Wheel[] wheels;
	Steering steering;

	private String carName;
	public void setCarName(String a){
					
		this.carName=a;
	}

	public String getCarName(){
					
		return carName;
	}

	private String ownerName;
	public void setOwnerName(String a){
					
		this.ownerName=a;
	}

	public String getOwnerName(){
					
		return ownerName;
	}

	public void carDetails()
	{
		

		doors=new Door[4];

		wheels=new Wheel[4];


		for(int i=0;i<=3;i++)
		{
			doors[i]=new Door();
		
		}

		for(int i=0;i<=3;i++)
		{
			wheels[i]=new Wheel();
		
		}

		steering=new Steering();
		

		


		for(int i=0;i<=3;i++)
		{
		doors[i].readDoorDetails();
		
		}

		for(int j=0;j<=3;j++)
		{

		wheels[j].readWheelDetails();
		}

		steering.readSteeringDetails();
		
	}

		public void printCarDetails()
		
		{
			System.out.println("The car name is"+carName);
			System.out.println("The owner name is"+ownerName);

			for(int i=0;i<=3;i++)
			{
				doors[i].printDoorDetails();
			}

			for(int i=0;i<=3;i++)
			{

			wheels[i].printWheelDetails();
			}

			steering.printSteeringDetails();
			


		}



}