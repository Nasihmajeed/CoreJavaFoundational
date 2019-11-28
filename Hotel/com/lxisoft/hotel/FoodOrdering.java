package com.lxisoft.hotel;
import com.lxisoft.adminuser.Admin;
import com.lxisoft.adminuser.User;
import java.util.Scanner;
public class FoodOrdering
{

	Scanner scanner;
	Hotel hotel;
	Admin admin;
	public void booking()
	{
		scanner = new Scanner(System.in);
		hotel = new Hotel("Arya Bhavan","Ottapalam");
		hotel.setProduct(hotel.foodProduct);
		adminUser(hotel);
	}

	public void adminUser(Hotel hotel)
	{	
		scanner = new Scanner(System.in);
		int num;
		Admin admin = new Admin();
		User user = new User();
		System.out.println("1 . Admin");
		System.out.println("2 . User");
		num = scanner.nextInt();
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
					System.out.println("Hotel Name : "+hotel.name);
					System.out.println("Place : "+hotel.place);
					admin.crud(hotel);		
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
			user.bill(hotel);
		}
	}
}