package com.lxisoft.carproject;

import java.util.Scanner;

public class Door
{
	String position;
	String price;

	public void readDoorDetails()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter door position");
		position=scanner.nextLine();
		System.out.println("Enter door price");
		price=scanner.nextLine();
		


	}


	public void printDoorDetails()
	{
		System.out.println("The door position is "+position);
		System.out.println("The door position is "+price);
	}
}