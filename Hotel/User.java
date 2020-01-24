import java.util.Scanner;
public class User
{
String name;
int order;
//Menu menu;
static Scanner input =new Scanner(System.in);
void createUser(Menu menu)
	{
		//menu=new Menu();
		System.out.println("name Of customer= ");
		name=input.next();
		menu.displayMenu();
		System.out.println("\nEnter the order Choise = ");
		order=input.nextInt();
	}

void displayUser()
	{

	}
}