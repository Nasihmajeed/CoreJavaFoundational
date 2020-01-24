package com.lxisoft.user;
import com.lxisoft.food.*;
import java.util.*;
public class Buyer
{
	public String buyerName;
	public String buyingItem;
	Food[] cart;
	Food food;
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

	public void orderFood()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter How many items are addding to the cart");
		int count = sc.nextInt();
		for(int i=0;i<count;i++)
		{
		cart[i] = new Food();
		System.out.print("Enter Food Name:\t");
		cart[i].setFoodName(sc.nextLine());
		System.out.print("Enter Quantity:\t");
		cart[i].setQuantity(sc.nextInt());
		}
	}



	
}