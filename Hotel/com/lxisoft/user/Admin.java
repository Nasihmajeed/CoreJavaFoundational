package com.lxisoft.user;
import com.lxisoft.hotel.*;
import java.util.*;
public class Admin
{
	
	Food[] foodStore ;
	Food food;
	static Scanner sc = new Scanner(System.in);
	private String adminName,adminPassword;

	public void setAdminName(String str)
	{
		this.adminName = str;
	}
	public String getAdminName()
	{
		return adminName;
	}
	public void setPassword(String str)
	{
		this.adminPassword= str;
	}
	public String getPassword()
	{
		return adminPassword;
	}

	public void createAdmin()
	{
		System.out.print("\tEnter Admin Name:");
		System.out.print("\t");String name = sc.nextLine();
		setAdminName(name);
		System.out.print("\tEnter Admin Password:");
		System.out.print("\t");String pass = sc.nextLine();
		System.out.print("\tConfirm Admin Password:");
		System.out.print("\t");String confPass = sc.nextLine();
		if(confPass == pass)
		{
			setPassword(pass);
			System.out.println("Admin Created");

		}
		else
		{
			System.out.println("PassWords did not Match!!!");			
		}
		
	}

	public void addFood()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How many items are addding to the Food Store:");
		int count = sc.nextInt();
		foodStore = new Food[count];
		for(int i=0;i<count;i++)
		{
		foodStore[i] = new Food();
		System.out.println("\t*****Food "+(i+1)+"*****");
		System.out.println("\t__________________");
		System.out.println("\tEnter Food Name:");
		String foodname  = sc.nextLine();
		System.out.print("\t");sc.nextLine();
		foodStore[i].setFoodName(foodname);
		System.out.println("\tEnter Rate:");
		System.out.print("\t");int foodrate = sc.nextInt();
		foodStore[i].setFoodRate(foodrate);
		}
	}



}
