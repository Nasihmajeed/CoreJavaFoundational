package com.lxisoft.hotel;
import com.lxisoft.hotel.*;
import java.util.*;
public class Food
{
	public String foodName;
	public int foodRate;

	Scanner sc = new Scanner(System.in);
	public void createFood()
	{
		System.out.println("\tFood Name:");
		System.out.print("\t");foodName = sc.next();
		System.out.println("\tRate:");
		System.out.print("\t");foodRate = sc.nextInt();
	}


	public void displayFoodDetails()
	{
		System.out.println("\t"+foodName+"\t"+foodRate);
	}
}