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
	public void createOrder(FoodMenu foodmenu,int noOfUser)
	{
		

		foodmenu.displayFoodMenu();

		System.out.println("\t*****User "+(noOfUser+1)+"******");
		System.out.print("\tEnter Id of Item to buy:");
		itemId = sc.nextInt();

		if(itemId <= foodmenu.foodStore.length)
		{
			System.out.print("\tEnter the quantity of item U needed :\t");
			qty = sc.nextInt();
		
			totalBill = foodmenu.foodStore[itemId].foodRate*qty;
			
			System.out.println("\tuser "+ noOfUser+" Purchase on item "+foodmenu.foodStore[itemId].foodName+" was successfull... ");
			System.out.println("\tAmount to Pay  ="+totalBill+" Rs");

			

		}
		else if(itemId > foodmenu.foodStore.length)
		{
			System.out.println("Enter Valid food Id");
		}
		
	}

	public void displayOrder(FoodMenu foodmenu,int noOfUser)
	{
		System.out.println("\n\t*****Order Detaills*****");
		System.out.println("\t______________________");

		System.out.println("\tOrder Id :"+ orderId());
		System.out.println("\tItem Name :"+foodmenu.foodStore[itemId].foodName);
		System.out.println("\tRate :"+foodmenu.foodStore[itemId].foodRate);
		System.out.println("\tQuantity :"+qty);

		
		System.out.println("\t______________________");
		System.out.print("\tAmount To Pay :");System.out.println(totalBill);
				
	}

	int  orderId()
	{
		Random random = new Random();
		int rand = random.nextInt(01234567);
		return rand;
	}
}