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
			adminCount++;
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
		int c=0;
		Scanner in=new Scanner(System.in);
		if (adminCount==0)
			menu.setFood();
		System.out.println("\t\t     ADMIN MENU");
		System.out.println("\t -----------------------------------------");
		System.out.println("\n\n =:> 1. ADD FOOD ITEM \n\n =:> 2. EDIT FOOD ITEM \n\n =:> 3. DELETE FOOD ITEM \n\n =:> 4. TOTAL GAIN\n\n =:> 5. SEARCH \n\n =:> 6. STAFF DETAILS\n\n =:> 7. GO BACK ");
		System.out.println("\n =:> Enter your choice --> ");
		try
		{
			c=in.nextInt();
		}
		catch(Exception e)
			{
				System.err.println("Entered Number is not an option");

			}
		
		switch(c)
		{
			case 1: Clear.cls();
					System.out.println("\t\t ADD FOOD ITEM");
				    System.out.println("\t -----------------------------------------");
					addItem(adminCount);
					adminCount++;
					adminActions(adminCount);
					break;
			
			case 2:Clear.cls();System.out.println("\t\tEDIT AN FOOD ITEM");
				   System.out.println(adminCount);
				   System.out.println("\t -----------------------------------------");
				   menu.printMenu();
				   System.out.println(" =:> ENTER THE ITEM NUMBER YOU NEED TO EDIT");
				   int	iNum = in.nextInt();
				   in.nextLine();
				   editItem(adminCount,iNum);
				   adminCount++;
				   adminActions(adminCount);
				   break;

			case 3:Clear.cls();System.out.println("\t\tDELETE AN FOOD ITEM");
				   System.out.println("\t -----------------------------------------");
				   menu.printMenu();
				   System.out.println(" =:> ENTER THE ITEM NUMBER YOU NEED TO DELETE");
				   iNum = in.nextInt();
				   deleteItem(adminCount,iNum);
				   adminCount++;
				   adminActions(adminCount);
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
					adminCount++;
					adminActions(adminCount);
					break;

			case 6 :Clear.cls();System.out.println("\tPRINTING STAFF DETAILS");
					System.out.println("\t -----------------------------------------");
					initializeStaff(adminCount);
					adminActions(adminCount);
					break;

			case 7 :Clear.cls();break;

			default:System.out.println("...Retry...");
					break;

		}
	}
	
	public void addItem(int adminCount)
	{
		// Add a new item
		String ch;	
		Scanner in = new Scanner(System.in);
		menu.printMenu();
		for(int i=0;i<menu.item.length;i++)
		{
			if(menu.item[i].itemName==null)
			{
				if(yesOrNo("need to add item"))
				{
					menu.ind=(i+1);
					System.out.println("menu.ind = " +menu.ind);
					menu.item[i].itemAdd();
					Clear.cls();
					menu.printMenu();
				}
				else
					
					break;
			}
		}
		
	}
	
	public void editItem(int adminCount, int iNum)
	{
		//Edit an existingitem
		Scanner in = new Scanner(System.in);
		System.out.println(adminCount);
		Clear.cls();
		for(int i=0;i<menu.item.length;i++)
		{
			if((i+1)==iNum)
			{
				
				menu.item[i].itemAdd();
				Clear.cls();
				menu.updateFile();
				menu.printMenu();
			}
		}
		
	}
	
	public void deleteItem(int adminCount , int iNum)
	{
		// Delete an exsisting item
		String str;	
		Scanner in = new Scanner(System.in);
		int r=100;
		adminCount++;
		for(int i=0;(menu.item[i].itemName)!=null;i++)
		{
			if((i+1)==iNum)
			{
				r=iNum-1;
				if(yesOrNo("Need to delete item"))
				{
					for(int j=(iNum-1);(menu.item[j].itemName)!=null;j++)
					{
						menu.item[j].itemName=menu.item[j+1].itemName;
						menu.item[j].itemPrice=menu.item[j+1].itemPrice;
						r=j;
					}
					menu.item[r+1].itemName=null;
					Clear.cls();
					menu.updateFile();
					menu.printMenu();
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
				System.out.println("\n  =:> CUSTOMER NAME : "+od[i].name + "\n  =:> BILL AMOUNT = " + od[i].total);
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
		Scanner in = new Scanner(System.in);
		int ch,j,flag=1;
		String ip;

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
							if(yesOrNo(" "))
							{
								deleteItem(adminCount,(i+1));
							
							}
							break;
							
					case 2: Clear.cls();System.out.println(" => EDIT ITEM : " + menu.item[i].itemName);
							if(yesOrNo("( Edit item or not ) "))
							{
								editItem(adminCount,(i+1));
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
		int a=0,opt;
		staffSet(staffInitialize);
		Clear.cls();
		System.out.println("\n=:> 1. Diplay All Staff \n=:> 2. Display Staff in each section\n=:> 3. Add Staff \n=:> 4. Go Back");
		try
		{
			a=in.nextInt();	
		}
		catch(Exception e)
		{
			System.err.println("Entered Number is not an option");
		}
		
		switch(a)
		{
			case 1 : Clear.cls();
					System.out.println("\tDisplaying all staff Details");
					this.getStaffDetails();
					 System.out.println("------------------------------------------");
					 break;
			case 2 :Clear.cls();
					Staff.staffSectionwise(staff);
					break;
			case 3 : addStaff(staffIndex++);
					 break;
			case 4 : adminActions(adminCount);
					 break;
			default:System.out.println("Retry");
					 

		}
	}
	public void addStaff(int index)
	{
		Scanner in = new Scanner(System.in);
		String sName,sJob,str;
		int sNum;
		this.getStaffDetails();
		if(yesOrNo(" Need to add Staff or not"))
		{
			System.out.println("Staff Number: \n\t");
			sNum=((staff[index-1].staffNum)+1);
			System.out.println(sNum);
			staff[index].staffAdd(sNum);
			index++;
			this.getStaffDetails();

		}
	}
	public void getStaffDetails()
	{
		System.out.println("------------------------------------------");
		System.out.println("Staff Number - Staff Name - Staff section");
		System.out.println("------------------------------------------");
		for(int i=0;i<staff.length;i++)
			{
				staff[i].printStaff();
			}
		System.out.println("------------------------------------------\n");
	}

	void staffSet(boolean s)
	{
	if(!(staffInitialize))
			{
				staffIndex=0;
				for(int i=0;i<10;i++)
				{
					staff[i]=new Staff();
				}
				
				staff[0].setStaff(100,"Pranav","Kitchen");
				staff[1].setStaff(101,"Manu","Cleaning");
				staff[2].setStaff(102,"vishnu","Counter");
				staff[3].setStaff(103,"Binu","Kitchen");
				staff[4].setStaff(104,"Sudeep","Counter");
				staffIndex=5;	
				staffInitialize=true;
			}	

	}

	boolean yesOrNo(String a)
	{
		Scanner in = new Scanner(System.in);
		String ip;
		System.out.println("Do you sure "+a+" (yes/no)");
		ip=in.nextLine();
		if(ip.equals("yes"))
			return true;
		else
			return false;
	}
}



