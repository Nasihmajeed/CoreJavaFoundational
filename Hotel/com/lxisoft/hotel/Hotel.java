package com.lxisoft.hotel;
import com.lxisoft.user.*;
import java.util.*;
public class Hotel
{
	public String  hotelName = "Calista";;
	public String  adr = "Palakkad Sreekrishnapuram 67833";
	public int noOfUser;

	public Admin admin;
	public User[] user;
	public Food food;
	public FoodMenu foodmenu;
	public Order[] order;

	static Scanner sc = new Scanner(System.in);

	
	
	
	public void createHotel()
	{
		
		displayHotel();
		menu();
		

	}


	public void displayHotel()
	{
		
		System.out.println("\n\t\t HOTEL "+hotelName.toUpperCase()+"\t");
		System.out.println("\t ___________________________\n\t");
		System.out.print("\t ADDRESS : ");
		System.out.println(adr.toUpperCase());




	}

	public void menu()
	{
		
		admin = new Admin();
		user = new User[10];
		food = new Food();
		order = new Order[10];
		foodmenu =  new FoodMenu();
		foodmenu.createMenu();
		
		int choice;
		
		do
		{
			
			System.out.println("\t1.Admin\n\t2.User\n\tEnter Ur Choice:");
			System.out.print("\t");choice= sc.nextInt();

			if(choice == 1)
			{
				displayHotel();
				admin.createAdmin(foodmenu,user,noOfUser,order);
			}
			else if(choice==2)
			{
				displayHotel();
				System.out.println("\n");
				System.out.println("\t*****HOTEL MENU*****");
				System.out.println("\t________________________");
				foodmenu.displayFoodMenu();
				user[noOfUser] = new User();
				user[noOfUser].createUser(foodmenu,noOfUser,food,order);
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
		