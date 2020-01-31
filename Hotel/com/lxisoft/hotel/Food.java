package com.lxisoft.hotel;

import java.util.Scanner;
public class Food
{
public String name;
public int rate;
public int qnty;

static Scanner input =new Scanner(System.in);
public void createFood()
	{
		System.out.println("Food = ");
		name=input.next();
		System.out.println("Rate = ");
		rate=input.nextInt();
		System.out.println("Quantity = ");
		qnty=input.nextInt();
	}


public void displayFood()
	{
		System.out.println("\t"+this.name+"\t:\t"+this.rate+"\t:\t"+this.qnty);
	}
}