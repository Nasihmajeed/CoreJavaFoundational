package com.lxisoft.website;
import  com.lxisoft.users.*;
import java.util.*;
public class Shop
{
	Scanner in = new Scanner(System.in);
	public OnlineBooking  ob = new OnlineBooking();
	public ServiceBooking sb = new ServiceBooking();

	ArrayList<Customer> customers = new ArrayList<Customer>();
	ArrayList<Item> items = new ArrayList<Item>();
	ArrayList<Staff> staffs = new ArrayList<Staff>();

	public void printMainMenu()
	{
		ob.initializeItems(items);
		String yesNo;
		int choice;
		System.out.println("\t------------------------------");
		System.out.println("\t\t ## Water Purifier Website ## ");
		System.out.println("\t------------------------------\n\n");

		System.out.println(" \n Select An Option : \n\t 1: Online Purchase \n\t 2. Service Booking\n\t 3. Exit");
		choice = in.nextInt();
		in.nextLine();
		switch(choice)
		{
			case 1 :Clear.cls();
					System.out.println("\t\t ## Water Purifier Website => Online Purchase  ## ");
					System.out.println("\t------------------------------------------------------------\n\n");
					ob.inputCustomerDetails(customers,items);
					System.out.println(" Do you Placed(yes/no) : ");
					yesNo=in.nextLine();
					if(yesNo.equals("yes"))
					{
						Clear.cls();
						System.out.println("Order Placed \n");
						ob.printBill(customers);
					}
					
					printMainMenu();
					break;
			case 2 :Clear.cls();
					System.out.println("\t\t ## Water Purifier Website => Service Booking  ## ");
					System.out.println("\t------------------------------------------------------------\n\n");
					sb.inputCustomerDetails(customers,items,staffs);
					printMainMenu();
					break;



			case 3 : break;


		}


	}

}