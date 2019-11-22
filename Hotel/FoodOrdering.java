import java.util.Scanner;
public class FoodOrdering
{
	Scanner scanner;
	Hotel hotel;
	Admin admin;
	void booking()
	{
		
		/*hotel.setProduct();*/
		adminUser();
		/*setHotel();*/
		/*hotel.getProduct();*/
	}
	void adminUser()
	{	
		hotel = new Hotel();
	    scanner = new Scanner(System.in);
		System.out.println("1 . Admin");
		System.out.println("2 . User");
		int adminUser = scanner.nextInt();
		if(adminUser==1)
		{
			crud();
		}
		else if(adminUser==2)
		{

		}
	}
	void crud()
	{
		scanner = new Scanner(System.in);
		admin = new Admin();
	    System.out.println("1 . Add");
		System.out.println("2 . Update");
		System.out.println("3 . Delete");
		System.out.println("4 . Read");
		int num = scanner.nextInt();

		if (num==1)
		{
			num = 0;
			admin.add();
		}
		else if (num==2)
		{
			num = 0;
			admin.update();
		}
		else if(num==4)
		{
			admin.read();
		}
	}
	void setHotel()
	{
		System.out.println("Enter The hotel Name ");
		hotel.setName(scanner.next());
		System.out.println("Enter the Place");
		hotel.setPlace(scanner.next());
		getHotel();
	}
	void getHotel()
	{
		 System.out.println("Hotel Name : "+hotel.getName());
		 System.out.println("Hotel Place : "+hotel.getPlace());
	}
}