package com.lxisoft.hotel;
import java.util.*;
public class Food
{

	public String foodName;
	public int foodRate;
	static Scanner sc = new Scanner(System.in);
	public void addFood()
	{
		System.out.println("Food Name:");
		foodName = sc.next();
		System.out.println("Rate:");
		foodRate = sc.nextInt();
	}


	public void displayFood()
	{
		System.out.println("\t"+foodName+"\t"+foodRate);
	}


}