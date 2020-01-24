import java.util.Scanner;
public class Hotel
{
String name;
Manager manager;
User user;
static Scanner input =new Scanner(System.in);
void CreateHotel()
	{
		System.out.println("Enter The Name of Hotel= ");
		name=input.next();

		DisplayHotel();
	}


void DisplayHotel()
	{
		int choise;
		
	do
	{
		System.out.println("\nHOTEL "+this.name.toUpperCase());
		System.out.println("\n\nPress 1 for User Menu \n\nManager Press 2\n\nPress 0 for Exit \n");
		choise=input.nextInt();
		if(choise==2)
		{
			manager=new Manager();
			manager.createManager();
		}
		else if(choise==1)
		{
			user=new User();
			user.createUser();
		}
		else if(choise==0)
		{
			System.out.println(" Exited");
		}
		else
		{
			System.out.println(" WrOnG ChOiSe");
		}
	}
		while(choise!=0); 

	}
}