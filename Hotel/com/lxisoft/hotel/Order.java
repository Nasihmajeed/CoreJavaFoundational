package com.lxisoft.hotel;
import com.lxisoft.hotel.*;
import java.util.*;
public class Order
{
	public String orderId;
	public int totalBill;
	public int qty;
	public int itemId;
	Bill bill;
	//Hotel hotel = new Hotel();
	static Scanner sc = new Scanner(System.in);
	public void createOrder(FoodMenu foodmenu,Adress adress)
	{
		bill = new Bill();
		foodmenu.displayFoodMenu();

		
		

		System.out.println("Enter Id of Item to buy:");
		itemId = sc.nextInt();

		if(itemId <= foodmenu.foodStore.length)
		{
			System.out.println("Enter the quantity of item U needed ");
			 qty = sc.nextInt();
			totalBill = foodmenu.foodStore[itemId].foodRate*qty;
			System.out.println("Your Purchase on item "+foodmenu.foodStore[itemId].foodName+" was successfull... ");
			System.out.println("Amount to Pay = \n"+totalBill);

			//displayOrder(int qty,int totalBill,)
			bill.createBill(foodmenu,adress);
		}
		else
		{
			System.out.println("Enter Valid food Id");
		}
		
	}

	// public void displayOrder()
	// {

	// }
}