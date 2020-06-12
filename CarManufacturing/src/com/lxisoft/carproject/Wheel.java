package com.lxisoft.carproject;

import java.util.Scanner;

public class Wheel
{
	String wheelPrice;
	String wheelPosition;

	public void readWheelDetails()
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the position of the wheel");
		wheelPosition=scanner.nextLine();

		System.out.println("Enter the price of the wheel");
		wheelPrice=scanner.nextLine();
	}	

	public void printWheelDetails()
	{
		System.out.println("The wheel position of wheel is"+wheelPosition);
		System.out.println("The wheel price is"+wheelPrice);
		
	}
}