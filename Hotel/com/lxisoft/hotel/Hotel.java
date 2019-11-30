package com.lxisoft.hotel;
import com.lxisoft.adminuser.Admin;
import com.lxisoft.adminuser.User;
import com.lxisoft.hotel.FoodItem;
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
	public void booking(Hotel hotel)
	{
		scanner = new Scanner(System.in);
		FoodList foodList = new FoodList();
		foodList.setFoodItem(foodList.foodItem);
		adminUser(foodList,hotel);
	}

	public void adminUser(FoodList foodList,Hotel hotel)
	{	
		scanner = new Scanner(System.in);
		Admin admin = new Admin();
		User user = new User();
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
					admin.crud(foodList,hotel);
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
			user.bill(foodList,hotel);
		}
	}
}