import java.util.Scanner;
public class FoodOrdering
{
	Scanner scanner;
	Hotel hotel;
	Admin admin;
	void booking()
	{
		
		adminUser();
		/*setHotel();*/
		/*hotel.getProduct();*/
	}
	void adminUser()
	{	
		scanner = new Scanner(System.in);
		hotel = new Hotel();
		admin = new Admin();
		hotel.setProduct();
			System.out.println("1 . Admin");
			System.out.println("2 . User");
			int adminUser = scanner.nextInt();
			if(adminUser==1)
			{
				admin.crud();
			}
			else if(adminUser==2)
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