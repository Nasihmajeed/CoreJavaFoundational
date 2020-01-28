package com.lxisoft.hotel;
import com.lxisoft.user.*;
import java.util.*;
public class Hotel
{
	String  hotelName;
	Admin admin;
	User user;
	Adress adress;
	FoodMenu foodmenu;

	static Scanner sc = new Scanner(System.in);
	public void createHotel()
	{
		adress = new Adress();
		System.out.println("\t Hotel Name:\n\t");
		hotelName = sc.next();
		System.out.println("\t Hotel Address:\n\t");
		String adr = sc.nextLine();
		adr = sc.nextLine();
		adress.setAdress(adr);

		displayHotel();

	}


	public void displayHotel()
	{
		foodmenu = new FoodMenu();
		admin = new Admin();
		user = new User();
		System.out.println("\t HOTEL "+hotelName.toUpperCase()+"\n\t");
		System.out.println("\t _____________________\n\t");
		System.out.print("\t ADDRESS:\n\t");
		System.out.print(adress.getAdress()+"\n");
		int choice;
		do
		{
			
			System.out.print("1.Admin\n2.User\nEnter Ur Choice:\t");
			choice= sc.nextInt();

			if(choice == 1)
			{

				admin.createAdmin(foodmenu,user);
			}
			else if(choice==2)
			{
				user.createUser(foodmenu,adress);
			}
			else if(choice==0)
			{
				System.exit(0);
			}
			else
			{
				System.out.print("Enter Valid Choice\n");
			}

		}while(choice!=0);



	}

}