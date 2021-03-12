
import java.util.Scanner;
public class Sample
{
	public void test()
	{
		Hotel hotel = new Hotel("SILVER STAR","CHERPULASSERY");
		hotel.menu();
		details(hotel);
		login(hotel);
	}
	void details(Hotel hotel)
	{
		System.out.println("\t*****WELCOME TO"+hotel.name+"*****");
		System.out.println("\t\t"+hotel.place);
		

	}
	void login(Hotel hotel)
	{
		Scanner scan=new Scanner(System.in);
		Admin admin = new Admin();
		User user=new User();
		int u;
		 System.out.println("Select the user");
		 System.out.println("1.Admin \n2.User");
		 u=scan.nextInt();
		  switch(u)
		  {
		  	case 1:System.out.println("Admin");
		  			admin.adminCheck(hotel);
		  			break;
		  	case 2:System.out.println("User");
		  				user.users();
		  				user.foodOrdering(hotel);
		  				break;
		  	default:System.out.println("Error");

		  	

		  }
	}
}