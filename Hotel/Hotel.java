import java.util.*;
public class Hotel
{
	int ch;
	String hotelName=" A2B ";
	int ac=0,uc=0;
	String str="open";
	Admin ad = new Admin();
	
	void checkPerson()
	{
		Scanner in = new Scanner(System.in);
		do
		{
			System.out.println("Select an option \n 1. Admin \n 2. User \n");
			ch=in.nextInt();
			switch(ch)
			{
				case 1: ad.checkAdmin(ac);
						ac=ac+1;
						break;
				case 2: ad.passToUser(uc,ac);
						uc=uc+1;
						break;
				default: System.out.println("Invalid Choice"); 
						 break;
			}
			System.out.println("GO Back to Main Menu(yes/no)");
			in.nextLine();
			str=in.nextLine();
		}while((str.equals("yes")));
		
	}
	
	void printDetails()
	{
		System.out.println("\n\t"+hotelName+"\n");
		
		
	}
}