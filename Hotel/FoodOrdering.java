import java.util.Scanner;
public class FoodOrdering
{
	Scanner scanner;
	Hotel hotel;
	void booking()
	{
		scanner = new Scanner(System.in);
		hotel = new Hotel();
		adminUser();
		setHotel();
		/*hotel.setProduct();*/
	}
	void adminUser()
	{	
		int adminUser;
			System.out.println("1 . Admin");
			System.out.println("2 . User");
			adminUser = scanner.nextInt();
			if(adminUser ==1)
			{
				
			}
			else if(adminUser ==2)
			{

			}
			else
			{

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