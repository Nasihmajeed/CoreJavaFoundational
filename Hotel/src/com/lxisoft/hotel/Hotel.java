package com.lxisoft.hotel;
import com.lxisoft.adminuser.Admin;
import com.lxisoft.adminuser.User;
import java.util.Scanner;
public class Hotel
{
	private String name,place;
	Scanner scanner;
	public Hotel(String name,String place)
	{
	 this.name = name;
	 this.place = place;
	}
	public void booking()
	{
		scanner = new Scanner(System.in);
		FoodList foodList = new FoodList();
		foodList.setFoodItem(foodList.foodItemList);
		login(foodList);
	}
	public void login(FoodList foodList)
	{	
		scanner = new Scanner(System.in);
		Admin admin = new Admin();
		boolean adminUser = false;
		do
		{
			adminUser = false;
			System.out.println("1 . Admin");
			System.out.println("2 . User");
			int num = scanner.nextInt();
			if(num==1)
			{
				int setPassword = 123;
				boolean isTrue = false;
				do
				{
					isTrue = false;
					System.out.println("!!Enter Password!!");
					int password = scanner.nextInt();
					if(setPassword==password)
					{
						System.out.println("$$$ Successfully Login $$$");
						admin.crud(foodList);
						adminUser = true;
					}
					else
					{
						isTrue = true;
						System.out.println("Wrong Password");
					}
				}while(isTrue);			
			}
			else if(num==2)
			{
				creatingBill(foodList);
			}
	    }while(adminUser);
	}
	public void creatingBill(FoodList foodList)
	{
		scanner = new Scanner(System.in);
		User user = new User();
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
				user.printBill(foodList,productIndex,quantity,name,place);
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
}