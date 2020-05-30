package com.lxisoft.carproject;

import java.util.Scanner;

public class Steering
{
	public static final String radius="20 cm";
	
	Integer steeringPrice;

	public void readSteeringDetails()
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the price of steering");
		steeringPrice=scanner.nextInt();
	}

	public void printSteeringDetails()
	{
		System.out.println("The radius of steering is"+radius);	
		System.out.println("The price of steering is"+steeringPrice);	
	
	}
}