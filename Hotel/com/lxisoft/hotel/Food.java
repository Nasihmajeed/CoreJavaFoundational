package com.lxisoft.hotel;

import java.util.Scanner;
public class Food
{
public String name;
public int rate;
static Scanner input =new Scanner(System.in);
public void createFood()
	{
		System.out.println("Food = ");
		name=input.next();
		System.out.println("Rate = ");
		rate=input.nextInt();
	}


public void displayFood()
	{
		System.out.println("\t"+this.name+"\t:\t"+this.rate);
	}
}