package com.lxisoft.hotel;
import com.lxisoft.user.*;
import java.util.*;
public class Hotel
{
	String  hotelName;
	Admin admin;
	User[] user;
	Adress adress;
	FoodMenu foodmenu;
	public int noOfUser;
	static Scanner sc = new Scanner(System.in);
	public void createHotel()
	{
		adress = new Adress();
		System.out.println("\t*****HOTEL*****\t");
		System.out.println("\t________________\t");

		
		System.out.print("\t Hotel Name:\t");
		hotelName = sc.next();
		System.out.print("\t Hotel Address:\t");
		String adr = sc.nextLine();
		adr = sc.nextLine();
		adress.setAdress(adr);

		displayHotel();

	}


	public void displayHotel()
	{
		foodmenu = new FoodMenu();
		admin = new Admin();
		user = new User[10];
		System.out.println("\n\t\t HOTEL "+hotelName.toUpperCase()+"\t");
		System.out.println("\t ___________________________\n\t");
		System.out.print("\t ADDRESS : ");
		System.out.println(adress.getAdress()+"\n");
		int choice;
		do
		{
			
			System.out.println("\t1.Admin\n\t2.User\n\tEnter Ur Choice:");
			System.out.print("\t");choice= sc.nextInt();

			if(choice == 1)
			{

				admin.createAdmin(foodmenu,user,noOfUser);
			}
			else if(choice==2)
			{
				user[noOfUser] = new User();
				user[noOfUser].createUser(foodmenu,noOfUser);
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