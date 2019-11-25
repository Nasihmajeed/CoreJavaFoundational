import java.util.Scanner;
public class Sample
{
	void test()
	{
		Hotel hotel = new Hotel();
		hotel.menu();
		details();
		login(hotel);
	}
	void details()
	{
		System.out.println("\tWelcome to **CafeIn**");
		System.out.println("\tPlace: Thodupuzha");
		System.out.println("\t***************");

	}
	void login(Hotel hotel)
	{
		Scanner scan=new Scanner(System.in);
		Admin admin = new Admin();
		int u;
		 System.out.println("Select the user");
		 System.out.println("1.Admin \n2.User");
		 u=scan.nextInt();
		  switch(u)
		  {
		  	case 1:System.out.println("Admin");
		  			admin.adminCheck();
		  			admin.adminChoice(hotel);
		  			break;
		  	case 2:System.out.println("User");
		  				/*user.users();*/
		  				break;
		  	default:System.out.println("Error");

		  }
	}
}