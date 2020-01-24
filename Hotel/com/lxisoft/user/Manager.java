package com.lxisoft.user;
import com.lxisoft.food.*;
import java.util.*;
public class Manager
{

	Food[] foodStore ;
	Food food;
	static Scanner sc = new Scanner(System.in);
	private String managerName;
	
	public void setManagerName(String str)
	{
		this.managerName = str;
	}
	public String getManagerName()
	{
		return managerName;
	}
	


	public void addFood()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter How many items are addding to the cart");
		int count = sc.nextInt();
		for(int i=0;i<count;i++)
		{
		foodStore[i] = new Food();
		System.out.print("Enter Food Name:\t");
		foodStore[i].setFoodName( sc.nextLine());
		System.out.print("Enter Rate:\t");
		foodStore[i].setFoodRate(sc.nextInt());
		}
	}


	
}