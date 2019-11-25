import java.util.*;
public class User
{
	String name;
	Hotel hotel;



	void users()
	{	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		name=scan.next();
		System.out.println("\t Welcome"+name);
	}

	void foodOrdering(Hotel hotel)
	{
		int c;
		do{
			Scanner scan=new Scanner(System.in);
			System.out.println("Select the fooditems");
			hotel.getMenu();
			int n=scan.nextInt();
			System.out.println(hotel.food[n-1].name);
			System.out.println(hotel.food[n-1].price);
			System.out.println("Do you want to select more 1.yes \n2.No");
			c=scan.nextInt();



			
		
		}while(c==1);
    }
}