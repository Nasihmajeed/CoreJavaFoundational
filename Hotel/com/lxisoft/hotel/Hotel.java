package com.lxisoft.hotel;
import com.lxisoft.user.*;
import java.util.*;
public class Hotel
{
	public String  hotelName = "Calista";;
	public String  adr = "Palakkad Sreekrishnapuram 67833";
	Admin admin;
	User[] user;
	public Adress adress  = new Adress();;
	Food food;
	FoodMenu foodmenu;
	public int noOfUser;
	static Scanner sc = new Scanner(System.in);

	
	
	
	public void createHotel()
	{
		System.out.println(adr);
		adress.setAdress(adr);
		displayHotel();
		
		System.out.println("\n");

		menu();

	}


	public void displayHotel()
	{
		
		System.out.println("\n\t\t HOTEL "+hotelName.toUpperCase()+"\t");
		System.out.println("\t ___________________________\n\t");
		System.out.print("\t ADDRESS : ");
		System.out.println(adress.getAdress());


	}

	public void menu()
	{
		foodmenu = new FoodMenu();
		admin = new Admin();
		user = new User[10];
		food = new Food();

		int choice;
		do
		{
			
			System.out.println("\t1.Admin\n\t2.User\n\tEnter Ur Choice:");
			System.out.print("\t");choice= sc.nextInt();

			if(choice == 1)
			{
				displayHotel();
				admin.createAdmin(foodmenu,user,noOfUser);
			}
			else if(choice==2)
			{
				displayHotel();
				System.out.println(" ");
				user[noOfUser] = new User();
				user[noOfUser].createUser(foodmenu,noOfUser,food);
				noOfUser++;
			}
			else if(choice==0)
			{
				System.exit(0);
			}
			else
			{
				System.out.println("\tEnter Valid Choice!!!!!!!!!!\n");
			}

		}while(choice!=0);

		
	}
}	
		