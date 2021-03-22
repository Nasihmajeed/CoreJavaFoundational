import java.util.Scanner;
public class Hotel
{
public String name;
Manager manager;
User[] user=new User[20];
public int noOfuser;
public Menu menu;
static Scanner input =new Scanner(System.in);
public void CreateHotel()
	{
		//HotelDetails();
		DisplayHotel();
	}

public void HotelDetails()
	{
		System.out.println("------------------------------------------------------------");
		
		System.out.println("\n\n-------------------   HOTEL SILVER STAR   ------------------------");
		System.out.println("-------------------   FAMILY RESTAURANT(A/C)   -------------------");
		System.out.println("-------------------   CHERPULASSERY   ----------------------------");


		System.out.println("------------------------------------------------------------");
		
	}

public void DisplayHotel()
	{
		int choi;
		
		manager=new Manager();
		menu=new Menu();
		menu.createMenu();
		
	do
	{	
		//System.out.println("\n\tHOTEL "+this.name.toUpperCase());
		HotelDetails();
		System.out.println("\n________________________");
		System.out.println("\n\n1. USER MENU \n\n2. ADMIN \n\n Press 0 for Exit \n");
		choi=input.nextInt();
		if(choi==2)
		{
			
			manager.createManager(menu,user,noOfuser);
		}
		else if(choi==1)
		{
			user[noOfuser]=new User();
			user[noOfuser].createUser(menu);
			noOfuser++;
		}
		else if(choi==0)
		{
			System.out.println("EXITED");
		}
		else
		{
			System.out.println("WRONG CHOICE");
		}
		
		//cls();
	}
		while(choi!=0); 

	}
public static void cls()
{
	try
	{	
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
	}catch(Exception E)
		{
			System.out.println(E);
		}
}
} 