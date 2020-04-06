package com.lxisoft.Person;
import com.lxisoft.Hotel.*;
import com.lxisoft.Person.*;



import java.util.*;
public class Admin
{
	Drinks d= new Drinks();
	OrderDetails[] od = new OrderDetails[10];
	Menu menu = new Menu();
	User usr = new User();
	int var=0;
	public int totalAmount=0;
	
	public void passToUser(int uc,int ac)
	{
		
		if((uc==0)&&(ac==0))
		{
			menu.setFood();
		}
		if(uc==0)
		{
			for(int i=0;i<10;i++)
			{
				od[i]= new OrderDetails();
			}
		}
			
		usr.userDetails();
		menu.printMenu(0);
		menu.ordering(menu.ind);
		od[var].name=usr.userName;
		od[var].total=menu.ord.total;
		setTotalAmount(od[var].total);
		od[var].ratings=usr.rating();
		usr.printUser();
		var=var+1;
		
	}
	public void checkAdmin(int ac)
	{
		Scanner in = new Scanner(System.in);
		String pass="a2b",password="asd";
		while(!(password.equals("0")))
		{
			System.out.println("Please type your password \n");
			password=in.nextLine();
			if(password.equals(pass))
			{
				System.out.println("\nWelcome Admin");
				adminActions(ac);
				break;
				
			}
			else
			{
				System.out.println("!!Invalid Password!! (Type quit to quit)");
				password=in.nextLine();
				if(password.equals("quit"))
					break;
			}
		}
	}
	
	public void adminActions(int ac)
	{
		int c;
		Scanner in=new Scanner(System.in);
		System.out.println(" 1.Add Food Item \n 2. Edit Food Item \n 3. Delete Food Item \n 4. Total Gain\n 5.Search");
		System.out.println("\nEnter your choice ");
		c=in.nextInt();
		
		switch(c)
		{
			case 1:System.out.println("Add Food Item");
					addItem(ac);
					break;
			
			case 2:System.out.println("Edit an Food Item");
				   editItem(ac);
				   break;
			case 3:System.out.println("Delete an Food Item");
				   deleteItem(ac);
				   break;
			case 4:System.out.println("Total Gain = "+totalAmount);
				   printStatus();
				   break;
			case 5 :System.out.println("\nEnter the item Name");
					String nameToSearch;in.nextLine();
					nameToSearch=in.nextLine();
					searchItem(nameToSearch,ac);
					break;

			default:System.out.println("ERROR");
					break;

		}
	}
	
	public void addItem(int adminCount)
	{
		String iName,ch;
		int price,quantity;
		
		Scanner in = new Scanner(System.in);
		if (adminCount==0)
			menu.setFood();
		menu.printMenu(1);
		for(int i=0;i<menu.item.length;i++)
		{
			
			if(menu.item[i].itemName==null)
			{
				System.out.println("Do you need to add more food items (yes/no)");
				ch=in.nextLine();
				if(ch.equals("yes"))
				{
					System.out.println("Enter the item Name");
					iName = in.nextLine();
					System.out.println("Enter the item Price");
					price = in.nextInt();
					System.out.println("Enter the item Quantity");
					quantity = in.nextInt();
					in.nextLine();
					menu.item[i].setItem(iName,price,quantity);
					menu.ind=i;
					menu.printMenu(1);
				}
				else
					
					break;
			}
		}
		
	}
	
	public void editItem(int ac)
	{
		Scanner in = new Scanner(System.in);
		int iNum;
		if(ac==0)
			menu.setFood();
		menu.printMenu(1);
		System.out.println("Enter The Item Number You Need To Edit");
		iNum = in.nextInt();
		in.nextLine();
		for(int i=0;i<menu.item.length;i++)
		{
			if((i+1)==iNum)
			{
				System.out.println("Enter the item Name");
				menu.item[i].itemName = in.nextLine();
				System.out.println("Enter the item Price");
				menu.item[i].itemPrice = in.nextInt();
				System.out.println("Enter the item Quantity");
				menu.item[i].totalAvailable = in.nextInt();
				in.nextLine();
				menu.printMenu(1);
			}
		}
		
	}
	
	public void deleteItem(int ac)
	{
		String str;	
		Scanner in = new Scanner(System.in);
		int iNum,r=100;
		if(ac==0)
			menu.setFood();
		menu.printMenu(1);
		System.out.println("Enter The Item Number You Need To Delete");
		iNum = in.nextInt();
		in.nextLine();
		
		for(int i=0;(menu.item[i+1].itemName)!=null;i++)
		{
			if((i+1)==iNum)
			{
				System.out.println("Do you sure(yes/no)");
				str=in.nextLine();
				if(str.equals("yes"))
				{
					for(int j=(iNum-1);(menu.item[j+1].itemName)!=null;j++)
					{
						menu.item[j].itemName=menu.item[j+1].itemName;
						menu.item[j].itemPrice=menu.item[j+1].itemPrice;
						r=j;
					}
					
					menu.item[r+1].itemName=null;
					menu.printMenu(1);
					break;
				
				}
				
			}
		}
	
	}
	
	public void setTotalAmount(int total)
	{
		this.totalAmount=this.totalAmount+total;
	}
	public void printStatus()
	{
		Scanner in = new Scanner(System.in);
		String ch;
		System.out.println(" More Details (yes/no)");
		ch=in.nextLine();
		if(ch.equals("yes"))
		{
			for(int i=0;od[i].name!=null;i++)
			{
				System.out.println("\nCustomer Name : "+od[i].name + "\n \tBill Amount = " + od[i].total);
				System.out.print("\tCustomer Rating : ");
				for(int j=0;j<od[i].ratings;j++)
					System.out.print("* ");
				System.out.print(" ( "+od[i].ratings+" out of 5 )");
				System.out.println("\n---------------------------------------------------------");
			}
		}
	
	}
	
	public void searchItem(String str,int adminCount)
	{
		int ch,j;
		String ip;
		if(adminCount==0)
			menu.setFood();
		Scanner in = new Scanner(System.in);
		for(int i=0;menu.item[i].itemName!=null;i++)
		{
			if(str.equals(menu.item[i].itemName))
			{
				System.out.println(" => 1. Delete item " + menu.item[i].itemName);
				System.out.println(" => 2. Edit item " + menu.item[i].itemName);
				System.out.println("Choose an option");
				ch=in.nextInt();
				in.nextLine();
				switch(ch)
				{
					case 1 :System.out.println(" => Delete item : " + menu.item[i].itemName);
							System.out.println("Do you sure (yes/no)");
							ip=in.nextLine();
							if(ip.equals("yes"))
							{
								for(j=i;(menu.item[j+1].itemName)!=null;j++)
								{
									menu.item[j].itemName=menu.item[j+1].itemName;
									menu.item[j].itemPrice=menu.item[j+1].itemPrice;
								}
								
								menu.item[j].itemName=null;
								menu.printMenu(1);
								break;
							
							}
							break;
							
					case 2: System.out.println(" => Edit item : " + menu.item[i].itemName);
							System.out.println("Do you sure want to edit (yes/no)");
							ip=in.nextLine();
							if(ip.equals("yes"))
							{
								System.out.println("Enter the item Name");
								menu.item[i].itemName = in.nextLine();
								System.out.println("Enter the item Price");
								menu.item[i].itemPrice = in.nextInt();
								System.out.println("Enter the item Quantity");
								menu.item[i].totalAvailable = in.nextInt();
								in.nextLine();
								menu.printMenu(1);
							}
							break;
								
							
							
							
				}
			}
		}
	}
}