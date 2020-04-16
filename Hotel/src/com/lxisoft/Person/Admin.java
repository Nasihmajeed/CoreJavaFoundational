package com.lxisoft.Person;
import com.lxisoft.Hotel.*;
import com.lxisoft.Person.*;



import java.util.*;
public class Admin
{
	boolean staffInitialize=false;
	int staffIndex;
	Drinks d= new Drinks();
	OrderDetails[] od = new OrderDetails[10];
	public Menu menu = new Menu();
	User usr = new User();
	Staff[] staff = new Staff[10];
	public int totalAmount=0;

	
	public void passToUser(int userCount,int adminCount)
	{
		
		if((userCount==0)&&(adminCount==0))
		{
			menu.setFood();
		}
		if(userCount==0)
		{
			for(int i=0;i<10;i++)
			{
				od[i]= new OrderDetails();
			}
		}
			
		usr.userDetails();
		usr.userAction(menu,od);		
		
	}
	public void checkAdmin(int adminCount)
	{

		// check the password 
		Scanner in = new Scanner(System.in);
		String pass="a2b",password="asd";
		while(!(password.equals("0")))
		{
			System.out.println(" PASSWORD PLEASE \n");
			password=in.nextLine();
			if(password.equals(pass))
			{
				Clear.cls();
				System.out.println("\nWelcome Admin");
				adminActions(adminCount);
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
	
	public void adminActions(int adminCount)
	{
		// prints out the admin operation
		int c;
		Scanner in=new Scanner(System.in);
	System.out.println("\t\t     ADMIN MENU");
		System.out.println("\t -----------------------------------------");
		System.out.println("\n\n =:> 1. ADD FOOD ITEM \n\n =:> 2. EDIT FOOD ITEM \n\n =:> 3. DELETE FOOD ITEM \n\n =:> 4. TOTAL GAIN\n\n =:> 5. SEARCH \n\n =:> 6. STAFF DETAILS\n\n =:> 7. GO BACK ");
		System.out.println("\n =:> Enter your choice --> ");
		c=in.nextInt();
		switch(c)
		{
			case 1:Clear.cls();System.out.println("\t\t ADD FOOD ITEM");
				   System.out.println("\t -----------------------------------------");
					addItem(adminCount);
					adminCount++;
					System.out.println(adminCount);
					adminActions(adminCount++);
					break;
			
			case 2:Clear.cls();System.out.println("\t\tEDIT AN FOOD ITEM");
				   System.out.println("\t -----------------------------------------");
				   editItem(adminCount);
				   adminActions(adminCount++);
				   break;
			case 3:Clear.cls();Clear.cls();System.out.println("\t\tDELETE AN FOOD ITEM");
				   System.out.println("\t -----------------------------------------");
				   deleteItem(adminCount);
				   adminActions(adminCount++);
				   break;
			case 4:Clear.cls();
				   System.out.println("\t\t TOTAL INCOME DETAILS");
				   System.out.println("\t -----------------------------------------");
				   System.out.println(" --> TOTAL GAIN = "+usr.totalAmount);
				   printStatus();
				   adminActions(adminCount++);
				   break;
			case 5 :Clear.cls();
					System.out.println("\t\tSEARCH ITEM");
					System.out.println("\t -----------------------------------------");
					System.out.println("\nEnter the item Name");
					String nameToSearch;in.nextLine();
					nameToSearch=in.nextLine();
					searchItem(nameToSearch,adminCount);
					adminActions(adminCount++);
					break;
			case 6 :Clear.cls();System.out.println("\tPRINTING STAFF DETAILS");
					System.out.println("\t -----------------------------------------");
					initializeStaff(adminCount);
					adminActions(adminCount);
					break;
			case 7 :Clear.cls();break;

			default:Clear.cls();System.out.println(" --> ***ERROR*** <--");
					break;

		}
	}
	
	public void addItem(int adminCount)
	{
		// Add a new item
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
				System.out.println(" =:> DO YOU NEED TO ADD MORE FOOD ITEMS (yes/no)");
				ch=in.nextLine();
				if(ch.equals("yes"))
				{
					System.out.println(" =:> ENTER THE ITEM NAME");
					iName = in.nextLine();
					System.out.println(" =:> ENTER THE ITEM PRICE");
					price = in.nextInt();
					System.out.println(" =:> ENTER THE ITEM QUANTITY");
					quantity = in.nextInt();
					in.nextLine();
					menu.item[i].setItem(iName,price,quantity);
					menu.ind=i;
					Clear.cls();
					menu.printMenu(1);
				}
				else
					
					break;
			}
		}
		
	}
	
	public void editItem(int adminCount)
	{
		//Edit an existingitem
		Scanner in = new Scanner(System.in);
		int iNum;
		if(adminCount==0)
			menu.setFood();
		menu.printMenu(1);
		System.out.println(" =:> ENTER THE ITEM NUMBER YOU NEED TO EDIT");
		iNum = in.nextInt();
		in.nextLine();
		Clear.cls();
		for(int i=0;i<menu.item.length;i++)
		{
			if((i+1)==iNum)
			{
				System.out.println(" =:> ENTER THE ITEM NAME");
				menu.item[i].itemName = in.nextLine();
				System.out.println(" =:> ENTER THE ITEM PRICE");
				menu.item[i].itemPrice = in.nextInt();
				System.out.println(" =:> ENTER THE ITEM QUANTITY");
				menu.item[i].totalAvailable = in.nextInt();
				in.nextLine();
				Clear.cls();
				menu.printMenu(1);
			}
		}
		
	}
	
	public void deleteItem(int adminCount)
	{
		// Delete an exsisting item
		String str;	
		Scanner in = new Scanner(System.in);
		int iNum,r=100;
		if(adminCount==0)
			menu.setFood();
		menu.printMenu(1);
		System.out.println(" =:> ENTER THE ITEM NUMBER YOU NEED TO DELETE");
		iNum = in.nextInt();
		in.nextLine();
		
		for(int i=0;(menu.item[i+1].itemName)!=null;i++)
		{
			if((i+1)==iNum)
			{
				System.out.println(" =:> Do you sure(yes/no)");
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
					Clear.cls();
					menu.printMenu(1);
					break;
				
				}
				
			}
		}
	
	}
	
	public void printStatus()
	{
		// print the total customer details
		Scanner in = new Scanner(System.in);
		String ch;
		System.out.println(" =:> MORE DETAILS (yes/no)");
		ch=in.nextLine();
		if(ch.equals("yes"))
		{
			for(int i=0;od[i].name!=null;i++)
			{
				System.out.println("\n  =:> CUSTOMER NAME : "+od[i].name + "\n \t  =:> BILL AMOUNT = " + od[i].total);
				System.out.print("\t-->CUSTOMER RATING : ");
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
		int flag=1;
		String ip;
		if(adminCount==0)
			menu.setFood();
		Scanner in = new Scanner(System.in);
		for(int i=0;menu.item[i].itemName!=null;i++)
		{
			if(str.equals(menu.item[i].itemName))
			{
				Clear.cls();
				flag=0;
				System.out.println(" => 1. DELETE ITEM " + menu.item[i].itemName);
				System.out.println(" => 2. EDIT ITEM " + menu.item[i].itemName);
				System.out.println("Choose an option");
				ch=in.nextInt();
				in.nextLine();
				switch(ch)
				{
					case 1 :Clear.cls();System.out.println(" => DELETE ITEM : " + menu.item[i].itemName);
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
							
					case 2: Clear.cls();System.out.println(" => EDIT ITEM : " + menu.item[i].itemName);
							System.out.println("DO YOU SURE WANT TO EDIT (yes/no)");
							ip=in.nextLine();
							if(ip.equals("yes"))
							{
								System.out.println(" =:> Enter the item Name");
								menu.item[i].itemName = in.nextLine();
								System.out.println(" =:> Enter the item Price");
								menu.item[i].itemPrice = in.nextInt();
								System.out.println(" =:> Enter the item Quantity");
								menu.item[i].totalAvailable = in.nextInt();
								in.nextLine();
								menu.printMenu(1);
							}
							break;
								
							
							
							
				}
			}
		}
		if(flag==1)
		{
			System.out.println("Sorry Check the item name");
			Clear.cls();
			adminActions(adminCount);
		}
			
	}
	public void initializeStaff(int adminCount)
	{
		Scanner in = new Scanner(System.in);
		
		int a;
		int opt;
		
		if(adminCount==0)
			menu.setFood();

		if(!(staffInitialize))
			{
				staffIndex=0;
				for(int i=0;i<10;i++)
				{
					staff[i]=new Staff();
				}
				
				staff[0].setStaff("Pranav","Kitchen");
				staff[1].setStaff("Manu","Cleaning");
				staff[2].setStaff("vishnu","Counter");
				staff[3].setStaff("Binu","Kitchen");
				staff[4].setStaff("Sudeep","Counter");
				staffIndex=5;	
				staffInitialize=true;
			}		
		Clear.cls();
		System.out.println("\n=:> 1. Diplay All Staff \n=:> 2. Display Staff in each section\n=:> 3. Add Staff \n 4. Search Staff \n=:> 5. Go Back");
		a=in.nextInt();
		switch(a)
		{
			case 1 : Clear.cls();
					System.out.println("\tDisplaying all staff Details");
					System.out.println("------------------------------------------");
					System.out.println("Staff Number - Staff Name - Staff section");
					System.out.println("------------------------------------------");
					 for(int j=0;j<staff.length;j++)				
					 	staff[j].printStaff(j);
					 System.out.println("------------------------------------------");
					 break;
			case 2 :Clear.cls();
					System.out.println("=> 1. Kitchen \n=> 2. Counter \n=> 3. Cleaning ");
					opt=in.nextInt();
					switch(opt)
					{
						case 1:Clear.cls();
							   System.out.println("\t-----------------------------------");
							   System.out.println("\t\tKitchen Duty");
							   System.out.println("\t-----------------------------------");
							   break;
						case 2:Clear.cls();
							   System.out.println("\t-----------------------------------");
							   System.out.println("\t\tCounter Duty");
							   System.out.println("\t-----------------------------------");
							   break;
      					case 3:Clear.cls();
							   System.out.println("\t-----------------------------------");
							   System.out.println("\t\tCleaning Duty");
							   System.out.println("\t-----------------------------------");
							   break;
					}


					for(int j=0;j<staff.length;j++)				
					 	staff[j].staffSectionwise(opt);
					 System.out.println("\t-----------------------------------\n");
					break;
			case 3 : addStaff(staffIndex++);
					 break;
			case 4: break;
			case 5 : adminActions(adminCount);
					 break;
			default:System.out.println("Sorry error");
					 

		}
	}
	public void addStaff(int index)
	{
		Scanner in = new Scanner(System.in);
		String sName,sJob,str;
		System.out.println("\n\n------------------------------------------");
		System.out.println("Staff Number - Staff Name - Staff section");
		System.out.println("------------------------------------------");
		for(int i=0;i<staff.length;i++)
			{
				staff[i].printStaff(i);
			}
		System.out.println("------------------------------------------\n\n");
		System.out.println("Do you need to add more staff(yes/no)");
		str=in.nextLine();
		System.out.println(index);
		if(str.equals("yes"))
		{
			System.out.println("\n\nStaff Name : \n \t");
			sName=in.nextLine();
			System.out.println("\n\nJob Section : \n \t");
			sJob=in.nextLine();
			staff[index].setStaff(sName,sJob);
			index++;
			System.out.println("Staff Number - Staff Name - Staff section");
			System.out.println("------------------------------------------");
			for(int i=0;i<staff.length;i++)
			{
				staff[i].printStaff(i);
			}
			System.out.println("------------------------------------------\n\n");

		}
	}
}