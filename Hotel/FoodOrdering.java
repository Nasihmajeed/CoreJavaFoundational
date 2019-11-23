import java.util.Scanner;
public class FoodOrdering
{
	Scanner scanner;
	Hotel hotel;
	Admin admin;
	void booking()
	{
		scanner = new Scanner(System.in);
		adminUser(sample());
		/*setHotel();*/
		/*hotel.getProduct();*/
	}
	Hotel sample()
	{
		Hotel hotelSample;
		hotel = new Hotel();
		hotelSample = hotel.setProduct();
		return hotelSample;
	}
	void adminUser(Hotel hotel)
	{	
		System.out.println("1 . Admin");
		System.out.println("2 . User");
		int adminUser = scanner.nextInt();
		if(adminUser==1)
		{
			crud(hotel);
		}
		else if(adminUser==2)
		{

		}
	}
	void crud(Hotel hotel)
	{
		scanner = new Scanner(System.in);
		admin = new Admin();
	    System.out.println("1 . Add");
		System.out.println("2 . Update");
		System.out.println("3 . Delete");
		System.out.println("4 . Read");
		int num = scanner.nextInt();
		switch(num)
		{
			case 1:
			admin.add(hotel);
			break;
			case 2:
			num = 0;
			admin.update(hotel);
			break;
			case 3:
			admin.delete(hotel);
			break;
			case 4:
			admin.read(hotel);
			break;
			default :
			System.out.println("Sorry!!!! Select Options From Above ");
			break;
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