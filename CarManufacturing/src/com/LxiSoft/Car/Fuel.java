package com.LxiSoft.Car;
import java.util.Scanner;

public class Fuel
{
		Scanner scnr=new Scanner(System.in);
	public static	String fuel;

	public void setFuel()
	{	
    System.out.println("\t select your FUEL verient  \n 1: Petrol \n 2: Diesel");
		int choice;
		System.out.println("enter your verient");
		choice=scnr.nextInt();

	
		switch (choice)
		{
			case 1:
			fuel=("Petrol");
			break;

			case 2:
			fuel=("Diesel");
			break;

			default:
			fuel=("No car available");
			break;
		}
	}
	public void printFuel()
	{
				System.out.print(" and is "+fuel);

	}

}