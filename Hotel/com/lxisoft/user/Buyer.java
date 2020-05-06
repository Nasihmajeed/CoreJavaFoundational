package com.lxisoft.user;
import com.lxisoft.hotel.*;
import java.util.*;
public class Buyer
{
	public String buyerName;
	public String buyingItem;
	Food[] cart;
	Food food;
	Admin admin = new Admin();
	public void	setBuyerName(String str)
	{
		this.buyerName = str;
	}
	public String getBuyerName()
	{
		return buyerName;
	}
	public void	setBuyingItem(String str)
	{
		this.buyingItem = str;
	}
	public String getBuyingItem()
	{
		return buyingItem;
	}

	public void viewFoodMenu()
	{
		System.out.println("\t***** FOOD MENU ***** ");
		for(int i=0;i<admin.foodStore.length;i++)
		{
			admin.foodStore[i].getFoodName();
			admin.foodStore[i].getFoodRate();	
		}
		
	}
	// public void orderFood()
	// {
	// 	Scanner sc = new Scanner(System.in);
	// 	System.out.print("Enter How many items are addding to the cart:\t");
	// 	int count = sc.nextInt();
	// 	cart = new Food[count];
	// 	for(int i=0;i<count;i++)
	// 	{
	// 	cart[i] = new Food();
	// 	System.out.println("*****Food "+(i+1)+"*****");
	// 	System.out.println("________________________");
	// 	System.out.println("Enter Food Name:\t");
	// 	String name = sc.nextLine();
	// 	name = sc.nextLine();
	// 	cart[i].setFoodName(name);
	// 	System.out.println("Enter Quantity:\t");
	// 	int qty = sc.nextInt();
	// 	cart[i].setQuantity(qty);
	// 	}
	// }




}
