package com.lxisoft.adminuser;
/*import com.lxisoft.hotel.Hotel;*/
import com.lxisoft.hotel.FoodList;
import java.util.Scanner;
public class User
{
	Scanner scanner;
	
	public void printBill(FoodList foodList,int[] productIndex,int[] quantity)
	{
		int totalAmount = 0;
		for(int i=0;i<10;i++)
		{
			if(productIndex[i]!=0)
			{
				totalAmount = totalAmount + (foodList.foodItemList[productIndex[i]-1].getPrice()*quantity[i]);
			}
		}
		System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
		System.out.println("|\t\t     BILL                         |");
		System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
		System.out.printf("|%-20.30s  %-20.30s %-20.30s%n","Food Items","Quantity","Price |");
		System.out.println("+-------------------------------------------------+");
		for(int i=0;i<10;i++)
		{
			if(productIndex[i]!=0)
			{
			System.out.printf(" %-20.30s  %-20.30s %-20.30s%n",foodList.foodItemList[productIndex[i]-1].getName(),quantity[i],foodList.foodItemList[productIndex[i]-1].getPrice()+" Rs");
		    }
		}
		System.out.println("+=================================================+");
		System.out.println("|\t\t\tTotal Amount\t    "+totalAmount+" Rs|");
		System.out.println("+=================================================+");
	}
}