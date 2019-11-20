import java.util.Scanner;
public class FoodOrdering
{
	Scanner scanner;
	Hotel hotel;
	Admin admin;
	void booking()
	{
		scanner = new Scanner(System.in);
		hotel = new Hotel();
		adminUser();
		/*setHotel();*/
		/*hotel.setProduct();*/
	}
	void adminUser()
	{	
		admin = new Admin();
		int adminUser,num;
			System.out.println("1 . Admin");
			System.out.println("2 . User");
			adminUser = scanner.nextInt();
			if(adminUser ==1)
			{
				System.out.println("1 . Add");
				System.out.println("2 . Delete");
				System.out.println("3 . Edit");
				System.out.println("4 . Read");
				num = scanner.nextInt();

				if (num==1)
				{
					admin.add();
					/*hotel.setProduct();
					hotel.getProduct();*/
				}
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