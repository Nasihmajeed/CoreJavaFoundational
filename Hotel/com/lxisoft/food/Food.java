package com.lxisoft.food;
import java.util.*;
public class Food
{
	String foodName;
	int foodRate;


	public void addFood()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Food Name:");
		foodName = sc.nextLine();
		System.out.println("Rate:");
		foodRate = sc.nextInt();
	}
	public void deleteFood()
	{
		
	}
	public void displayFoodDetails()
	{
		
		System.out.println("Food Name:"+foodName);
		System.out.println("Rate:"+foodRate);

	}

}