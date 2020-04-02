import java.util.*;
public class Admin
{
	Menu menu = new Menu();
	User usr = new User();
	String iName,ch;
	int price,p=1;
	public void passToUser(int uc,int ac)
	{
		if((uc==0)&&(ac==0))
			menu.setFood();
		usr.userDetails();
		menu.printMenu();
		menu.ordering(menu.ind);
		System.out.println("Thank you "+usr.userName);
		
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
		System.out.println("1.Add Food Item \n 2. Edit Food Item");
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
	
	
	
	
}