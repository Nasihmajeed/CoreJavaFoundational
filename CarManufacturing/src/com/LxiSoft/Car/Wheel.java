package com.LxiSoft.Car;
import java.util.Scanner;
public class Wheel
{
	Scanner scnr=new Scanner(System.in);
public static String whel;
	public void setWheel()
	{	
    System.out.println("\t select your WHEEL type  \n 1: Alloy \n 2: Chromium");
		int choice;
		System.out.println("select");
		choice=scnr.nextInt();

		
		switch (choice)
		{
			case 1:
			whel=("Alloy Wheel");
			break;

			case 2:
			whel=("Chromium Wheel");
			break;

			default:
			whel=("No wheels available");
			break;
		}
	}
	public void printWhel()
	{
				System.out.print(" and has "+whel);

	}
}