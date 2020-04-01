import java.util.*;
public class Hotel
{
	int ch;
	String hotelName=" A2B ";
	Menu menu = new Menu();
	Admin ad = new Admin();
	User usr = new User();
	void checkPerson()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Select an option \n 1. Admin \n 2. User \n");
		ch=in.nextInt();
		switch(ch)
		{
			case 1: ad.checkAdmin();
					break;
			case 2: usr.userDetails();
					break;
			default: System.out.println("Invalid Choice"); 
		             break;
		}
	}
	
	void printDetails()
	{
		System.out.println("\n\t"+hotelName+"\n");
		menu.setItem();
		
		
	}
}