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
		hotel.setProduct(hotel.foodProduct);
		adminUser(hotel);
	}

	void adminUser(Hotel hotel)
	{	
		scanner = new Scanner(System.in);
		int num;
		Admin admin = new Admin();
		User user = new User();
		System.out.println("1 . Admin");
		System.out.println("2 . User");
		num = scanner.nextInt();
		if(num==1)
		{
			int setPassword = 123;
			boolean isTrue = false;
			do
			{
				isTrue = false;
				System.out.println("!!Enter Password!!");
				int password = scanner.nextInt();
				if(setPassword==password)
				{
					System.out.println("$$$ Successfully Login $$$");
					setHotel();
					admin.crud(hotel);		
				}
				else
				{
					isTrue = true;
					System.out.println("Wrong Password");
				}
				
			}while(isTrue);
			
		}
		else if(num==2)
		{
			user.bill(hotel);
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