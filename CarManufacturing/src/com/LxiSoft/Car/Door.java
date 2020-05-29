package com.LxiSoft.Car;
import java.util.Scanner;
public class Door
{
	public static String door;
	public void doorDetails()
	{
		Scanner scnr=new Scanner(System.in);

	  System.out.println("\t Avilable door types Are \n 1: Scissor door \n 2: Butter fly door");
		int choice;
		System.out.println("Enter your door type");
		choice=scnr.nextInt();

		
		switch (choice)
		{
			case 1:
			door=(" Scissor door ");
			break;

			case 2:
			door=("Butter fly door");
			break;

			default:
			door=("No door available");
			break;
		
	}}
	public void printDoor()
	{
				System.out.print("  which has"+door);

	}
}