package com.lxisoft.hotel;
import com.lxisoft.hotel.*;
import com.lxisoft.user.*;
import java.util.*;
public class Order
{
	public String orderId;
	public int totalBill;
	public int qty;
	public int itemId;
	
	static Scanner sc = new Scanner(System.in);
	public void createOrder(FoodMenu foodmenu)
	{
		

		foodmenu.displayFoodMenu();

		System.out.println("Enter Id of Item to buy:");
		itemId = sc.nextInt();

		if(itemId <= foodmenu.foodStore.length)
		{
			System.out.println("Enter the quantity of item U needed ");
			qty = sc.nextInt();
			totalBill = foodmenu.foodStore[itemId].foodRate*qty;
			
			System.out.println("Your Purchase on item "+foodmenu.foodStore[itemId].foodName+" was successfull... ");
			System.out.println("Amount to Pay = "+totalBill);

			

		}
		else if(itemId > foodmenu.foodStore.length)
		{
			System.out.println("Enter Valid food Id");
		}
		
	}

	public void displayOrder(FoodMenu foodmenu)
	{
		System.out.println("*****Order Detaills*****");
		System.out.println("______________________");

		System.out.println("Order Id :"+ orderId());
		System.out.println("Item Name :"+foodmenu.foodStore[itemId].foodName);
		System.out.println("Rate :"+foodmenu.foodStore[itemId].foodRate);
		System.out.println("Quantity :"+qty);

		
		System.out.println("______________________");
		System.out.print("Amount To Pay :");System.out.println(totalBill);
				
	}

	int  orderId()
	{
		Random random = new Random();
		int rand = random.nextInt(01234567);
		return rand;
	}
}