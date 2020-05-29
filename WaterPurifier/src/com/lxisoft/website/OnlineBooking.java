package com.lxisoft.website;
import  com.lxisoft.users.*;
import com.lxisoft.file.*;
import java.util.*;



public class OnlineBooking
{
	FileManager fm = new FileManager();
	public static int serviceNumber=1000;
	int ind=serviceNumber-1000;
	Scanner in = new Scanner(System.in);
	// ArrayList<Customer> customers = new ArrayList<Customer>();
	// ArrayList<Item> items = new ArrayList<Item>();
	public void inputCustomerDetails(ArrayList<Customer> customers,ArrayList<Item> items )
	{
		String name;
		int ph,userChoice,price=0;
		System.out.println(" Please Enter Your Name : ");
		name = in.nextLine();
		System.out.println(" Please Enter The pH needed  : ");
		ph = in.nextInt();
		if(ph<7)
			displayItem(items,0);
		else if(ph==7)
			displayItem(items,7);
		else 
			displayItem(items,14);
		System.out.println("Please Choose a Curresponding Model : ");
		System.out.print("\t\t => Purifier- ");
		userChoice=in.nextInt();
		in.nextLine();
		userChoice=userChoice+100;
		for(int i=0;i<10;i++)
		{
			if(items.get(i).modelNumber==userChoice)
			{
				price = items.get(i).price;
			}

		}
		customers.add(new Customer(name,serviceNumber,userChoice,price));
		fm.storeToFile(customers,ind);
		serviceNumber++;
	}
	public void initializeItems(ArrayList<Item> items)
	{
		items.add(new Item("Purifier-1",101,0,5000));
		items.add(new Item("Purifier-2",102,0,5200));
		items.add(new Item("Purifier-3",103,0,3800));
		items.add(new Item("Purifier-4",104,0,8000));
		items.add(new Item("Purifier-5",105,0,4999));
		items.add(new Item("Purifier-6",106,7,2000));
		items.add(new Item("Purifier-7",107,7,25000));
		items.add(new Item("Purifier-8",108,14,15000));
		items.add(new Item("Purifier-9",109,14,12000));
		items.add(new Item("Purifier-10",110,14,10999));

	}
	public void displayItem(ArrayList<Item> items, int val)
	{
		System.out.println("   Item Name \t\t   Model Number \t   Item Price ");
		System.out.println("----------------------------------------------------------------------------------");
		for(int i=0;i<10;i++)
		{
			int phValue=items.get(i).phrange;
			if(phValue==val)
				System.out.format("%15s %18d %18d  \n",items.get(i).name,items.get(i).modelNumber,items.get(i).price);
		}
		System.out.println("----------------------------------------------------------------------------------");
	}

	public void displayCustomer(ArrayList<Customer> customers)
	{
		System.out.println(" Customer Name \t Service Number \t Item Model \t  Total Amount  ");
		for(Customer c : customers)
		{
			c.printCustomer();
		}
	}
	public void printBill(ArrayList<Customer> customers) 
	{
		Clear.cls();
		int discount;
		int index= serviceNumber-1001;
		System.out.println("------------------------# BILL #----------------------------------");
		System.out.println("\n\t\tThank you : "+  customers.get(index).name);
		System.out.println("               ********************************  ");
		System.out.println("=>Orginal Amount = " + customers.get(index).price);
		discount=(int)(customers.get(index).price*.2);
		System.out.println("=>Discounted Amount = " + discount);
		customers.get(index).price=customers.get(index).price-discount;
		System.out.println("=>Final Amount = " + customers.get(index).price);
		System.out.println("=>Model Number = " + customers.get(index).itemModel);	
		System.out.println("=>Service Number = " + customers.get(index).serviceNumber);
		System.out.println("=>Thank you \n\t Contact 9500506070 for any details");

	}



}