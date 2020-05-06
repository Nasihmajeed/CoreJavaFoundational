package com.lxisoft.hotel;
import com.lxisoft.hotel.*;
import com.lxisoft.user.*;
import java.util.*;
public class Order
{
	public String orderId;
	public int totalBill;
	public int bill;
	public int qty;
	public int itemId;
	public int itemNo;
	public int totalQuantity;
	int[] num = new int[20];
	int[] price = new int[20];
	int[] amount = new int[20];

	String[] temp = new String[20];
	int cnt;
	int n;
	static Scanner sc = new Scanner(System.in);
	public void createOrder(FoodMenu foodmenu,int noOfUser,Food food,Order[] order)
	{
		

		//foodmenu.displayFoodMenu();

		System.out.println("\t*****User "+(noOfUser+1)+"******");
			
		System.out.println("How many items do U want to Buy");
		itemNo = sc.nextInt();	
		n = noOfUser;
		for(int i=0;i<itemNo;i++)
		{
			// System.out.println(cnt);
			System.out.print("\tEnter Id of Item to buy:");
			itemId = sc.nextInt();

			if(itemId <= foodmenu.foodStore.length  )
			{

			System.out.print("\tEnter the quantity of item U needed :\t");
			qty = sc.nextInt();
			
			num[i] = qty;
			//System.out.println(num[cnt++]);
			temp[i] = foodmenu.foodStore[itemId].foodName;
			//System.out.println(num[cnt++]);
			price[i] = foodmenu.foodStore[itemId].foodRate; 

			foodmenu.foodStore[itemId].foodQuantity = foodmenu.foodStore[itemId].foodQuantity-qty;
			totalQuantity = totalQuantity + foodmenu.foodStore[itemId].foodQuantity;
			bill = foodmenu.foodStore[itemId].foodRate*qty;
			amount[i] = bill;
			
			// cnt++;

			totalBill = totalBill + bill; 
			totalQuantity = totalQuantity+qty;
			//System.out.println(totalQuantity);
			System.out.println("\tuser "+ noOfUser+" Purchase on item "+foodmenu.foodStore[itemId].foodName+" was successfull... ");
			System.out.println("\tAmount  = "+bill +" Rs");
			System.out.println("\tTotal Amount to Pay  ="+totalBill +" Rs");

			}
			else if(itemId > foodmenu.foodStore.length)
			{
			System.out.println("Enter Valid food Id");
			}
			else if(foodmenu.foodStore[itemId].foodQuantity <=0)
			{
			System.out.println("Not Enough Food");
			}

			// else if(n==noOfUser)
			// {
			// 	break;
			// }
		}
	}
		

	public void displayOrder(FoodMenu foodmenu,int noOfUser)
	{

		if(noOfUser != 0 )
		{

			for(int j = 0;j<noOfUser;j++)
			{
			System.out.println("\n\t*****Order Detaills*****");
			System.out.println("\t______________________");
		
			System.out.println("\tOrder Id :"+ orderId());
			for(int i=0;i<itemNo;i++)
			{
				System.out.println("\tItem Name :"+temp[i]);
				System.out.println("\tRate :"+price[i]);
				System.out.println("\tQuantity :"+num[i]);
				System.out.println("\tAmount :"+amount[i]);
	
			}
			totalQuantity = totalQuantity+foodmenu.foodStore[itemId].foodQuantity;
			}

			
	
		}	
		else if(noOfUser == 0)
		{
			System.out.println("Order list Empty");

		}	
	}

	int  orderId()
	{
		Random random = new Random();
		int rand = random.nextInt(01234567);
		return rand;
	}
		
}