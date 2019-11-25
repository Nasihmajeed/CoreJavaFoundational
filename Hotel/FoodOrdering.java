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
		/*hotel.getProduct(hotel.foodProduct);*/
		adminUser(hotel);
		/*setHotel();*/
		/*hotel.getProduct();*/
	}
	/*Hotel sample()
	{
		
		return hotelSample;
	}*/
	void adminUser(Hotel hotel)
	{	
		int num; 
		User user = new User();
		System.out.println("1 . Admin");
		System.out.println("2 . User");
		num = scanner.nextInt();
		if(num==1)
		{
			crud(hotel);
		}
		else if(num==2)
		{
			user.bill(hotel);
		}
	}
	void crud(Hotel hotel)
	{
		scanner = new Scanner(System.in);
		int num;
		admin = new Admin();
	    System.out.println("1 . Add");
		System.out.println("2 . Update");
		System.out.println("3 . Delete");
		System.out.println("4 . Read");
		System.out.println("Press ==> 1.Add 2.Update 3.Delete 4.Read");
		num = scanner.nextInt();
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