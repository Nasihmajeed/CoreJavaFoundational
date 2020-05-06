package com.lxisoft.hotel;
import com.lxisoft.hotel.*;
import java.util.*;
public class Food
{
	public String foodName;
	public int foodRate;
	public int foodQuantity;

	Scanner sc = new Scanner(System.in);
	public void createFood()
	{
		System.out.println("\tFood Name:");
		System.out.print("\t");foodName = sc.next();
		System.out.println("\tRate:");
		System.out.print("\t");foodRate = sc.nextInt();
		System.out.println("\tQuantity:");
		System.out.print("\t");foodQuantity = sc.nextInt();
	}


	public void displayFoodDetails()
	{
		System.out.println("\t"+foodName+"\t"+foodQuantity+"\t"+foodRate);
	}
}