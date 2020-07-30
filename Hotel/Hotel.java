import java.util.Scanner;
public class Hotel
{
	Food food = new Food();
	User user = new User();

	Scanner scanner = new Scanner(System.in);

	public void printName()
	{
		System.out.println("\n HOTEL NMR");
		System.out.println("Veg and Non-Veg");
		System.out.println(" Palakkad");
		System.out.println("\n MENU");
	}

	public void foodList()
	{
		
		System.out.println("\nchicken biriyani");
		System.out.println("rate: 100 ");
		System.out.println("porotta");
		System.out.println("rate: 10");
		System.out.println("curry");
		System.out.println("rate: 40");
	}

	public void setUser()
	{
	  for(int i=0;i<2;i++)
	  {	
      System.out.println("\nenter the food items: ");
      user.food[i] = scanner.next();
      }
	}

	public void getUser()
	{
		int i = 0;
		System.out.println("\nYour ordered food are \n"+user.food[i]);
		System.out.println("\nThank You");
	}

	public void getHotel()
	{
		food.setBill();
		food.getBill();
	}


}