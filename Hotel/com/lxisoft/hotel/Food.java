package com.lxisoft.hotel;
import java.util.*;
public class Food
{
	public int id;
	public String foodName;
	public int foodRate;
	public int foodqty;

	static Scanner sc = new Scanner(System.in);
	Food[] foodStore; 
	public void createFood()
	{

		System.out.println("Enter How many food are adding to the store");
		int count = sc.nextInt();
		for(int i=0;i<count;i++)
		{
			foodStore = new Food[count];
			foodStore[i] = new Food();
			foodStore[i].id = generateFoodId();
			System.out.println(generateFoodId());
			System.out.println("Enter Food Name:");
			foodStore[i].foodName = sc.next();
			System.out.println("Enter Food Rate:");
			foodStore[i].foodRate = sc.nextInt();

		}
	}

	public void displayFood()
	{
		System.out.println("\t"+foodName+"\t"+foodRate);
	}



	public int generateFoodId()
	{
		int randomNo=0;
		final String alphabet = "0123456789ABCDE";
		final int length = alphabet.length();
		Random random = new Random();
		for(int i=0;i<5;i++)
		{
			randomNo = alphabet.charAt(random.nextInt(length));

		}
		return randomNo;
	}



}