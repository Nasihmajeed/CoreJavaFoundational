package com.lxisoft.hotel;
import com.lxisoft.adminuser.Admin;
import com.lxisoft.adminuser.User;
import java.util.Scanner;
public class Hotel
{
	public String name,place;
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
		User user = new User();
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
				user.bill(foodList);
			}
	    }while(adminUser);
	}
}