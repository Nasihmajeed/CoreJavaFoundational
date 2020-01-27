package com.lxisoft.hotel;
import com.lxisoft.hotel.*;
import java.util.*;
public class Food
{
	public String foodName;
	public int foodRate;

	Scanner sc = new Scanner(System.in);
	// public void setFoodName(String str)
	// {
	// 	this.foodName = str;
	// }
	// public String getFoodName()
	// {
	// 	return foodName;
	// }
	// public void setFoodRate(int n)
	// {
	// 	this.foodRate = n;
	// }
	// public int getFoodRate()
	// {
	// 	return foodRate;
	// }

	public void createFood()
	{
		System.out.println(" Food Name:");
		foodName = sc.next();
		System.out.println(" Rate:");
		foodRate = sc.nextInt();
	}


	public void displayFoodDetails()
	{
		System.out.println("\t"+foodName+"\t"+foodRate);
	}
}