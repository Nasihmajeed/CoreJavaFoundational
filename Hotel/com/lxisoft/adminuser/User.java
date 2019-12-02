package com.lxisoft.adminuser;
import com.lxisoft.hotel.Hotel;
import com.lxisoft.hotel.FoodList;
import java.util.Scanner;
public class User
{
	Scanner scanner;
	public void bill(FoodList foodList)
	{
		scanner = new Scanner(System.in);
		boolean numberExist = false;
		int[] productIndex = new int[10];
		int[] quantity = new int[10];
		System.out.println("********Menu********");
		foodList.getFoodItem();
		Boolean isTrue = false;
		do
		{
			isTrue = false;
			System.out.println("Press ==> 1.Add Food to Cart 2.Print Bill ");
			int num = scanner.nextInt();
			
			switch(num)
			{
			case 1:
				System.out.println("==> Select Food");
				int productNumber = scanner.nextInt();
				selectProduct(productIndex,productNumber,quantity);
				isTrue = true;
				break;
			case 2:
				print(foodList,productIndex,quantity);
				break;
			default :
				System.out.println("==> Select the Above Option");
				isTrue = true;
				break;
			}

		}while(isTrue);
		
	}
	public int[] selectProduct(int[] productIndex,int productNumber,int[] quantity)
	{
		int n=1,k=1;
		if(checkIfExists(productIndex,productNumber,quantity)==-1)
		{
			for(int i=0;i<10;i++)
			{
				if(productIndex[i]==0)
				{
					productIndex[i]=productNumber;
					quantity[i]=k;
					break;
				}
				n++;
			}
		}
		return productIndex;
	}
	public int checkIfExists(int[] productIndex,int productNumber,int[] quantity)
	{
		int index = -1;
		for(int i=0;i<10;i++)
		{
			if(productIndex[i]==productNumber)
			{
				index = 1;
				quantity[i]++;
				break;
			}
		}
		return index;
	}
	public void print(FoodList foodList,int[] productIndex,int[] quantity)
	{
		scanner = new Scanner(System.in);
		int totalAmount = 0;
		for(int i=0;i<10;i++)
		{
			if(productIndex[i]!=0)
			{
				totalAmount = totalAmount + (foodList.foodItemList[productIndex[i]-1].getPrice()*quantity[i]);
			}
		}
		/*timerLoading();*/
		/*System.out.println("");*/
		System.out.println("\t\t******BILL******");
		/*System.out.println("Hotel Name : "+hotel.name);
		System.out.println("Place : "+hotel.place);*/
		System.out.printf("%-20.30s  %-20.30s %-20.30s%n","Food Items","Quantity","Price");
		for(int i=0;i<10;i++)
		{
			if(productIndex[i]!=0)
			{
			System.out.printf("%-20.30s  %-20.30s %-20.30s%n",foodList.foodItemList[productIndex[i]-1].getName(),quantity[i],foodList.foodItemList[productIndex[i]-1].getPrice()+" Rs");
		    }
		}
		System.out.println("Total Amount\t\t\t\t   "+totalAmount+" Rs");
	}
}