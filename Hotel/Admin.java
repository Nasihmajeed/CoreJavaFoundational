import java.util.*;
public class Admin
{
	OrderDetails[] od = new OrderDetails[10];
	Menu menu = new Menu();
	User usr = new User();
	String iName,ch;
	int price,p=1;
	int var=0;
	int totalAmount=0;
	public void passToUser(int uc,int ac)
	{
		
		if((uc==0)&&(ac==0))
		{
			
			menu.setFood();
			for(int i=0;i<10;i++)
			{
				od[i]= new OrderDetails();
			}
		}
		usr.userDetails();
		menu.printMenu();
		menu.ordering(menu.ind);
		od[var].name=usr.userName;
		od[var].total=menu.ord.total;
		setTotalAmount(od[var].total);
		System.out.println("Thank you "+usr.userName);
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
	
	void adminActions(int ac)
	{
		int c;
		Scanner in=new Scanner(System.in);
		System.out.println("1.Add Food Item \n 2. Edit Food Item \n 3. Delete Food Item \n 4. Total Gain");
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

			default:System.out.println("ERROR");
					break;

		}
	}
	
	void addItem(int ac)
	{
		Scanner in = new Scanner(System.in);
		if (ac==0)
			menu.setFood();
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
					in.nextLine();
					menu.item[i].setItem(iName,price);
					menu.ind=i;
					menu.printMenu();
				}
				else
					
					break;
			}
		}
		
	}
	
	void editItem(int ac)
	{
		Scanner in = new Scanner(System.in);
		int iNum;
		if(ac==0)
			menu.setFood();
		menu.printMenu();
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
				in.nextLine();
				menu.printMenu();
			}
		}
		
	}
	
	void deleteItem(int ac)
	{
		String str;	
		Scanner in = new Scanner(System.in);
		int iNum,r=100;
		if(ac==0)
			menu.setFood();
		menu.printMenu();
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
					menu.printMenu();
					break;
				
				}
				
			}
		}
	
	}
	
	void setTotalAmount(int total)
	{
		this.totalAmount=this.totalAmount+total;
	}
	void printStatus()
	{
		Scanner in = new Scanner(System.in);
		String ch;
		System.out.println("Do you need to add more food items (yes/no)");
		ch=in.nextLine();
		if(ch.equals("yes"))
		{
			for(int i=0;od[i].name!=null;i++)
			{
				System.out.println("\nCustomer Name : "+od[i].name + "\n \t Bill Amount = " + od[i].total);
				System.out.println("---------------------------------------------------------");
			}
		}
	
	}
}