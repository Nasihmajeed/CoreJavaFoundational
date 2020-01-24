import java.util.Scanner;
public class Menu
{
Food[] food;
int choise;
static Scanner input =new Scanner(System.in);
void createMenu()
	{
		System.out.println("How many Food items u want to add ");
		choise=input.nextInt();
		food=new Food[choise];
		for(int i=0;i<choise;i++)
		{
			food[i]=new Food();
			food[i].createFood();
		}
	}

void editMenu()
	{
		System.out.println("\n Modify Menu\n1.Add\n2.Delete\n3.Edit\n ");	
		System.out.println("Enter the Choice= ");
		
		choise=input.nextInt();
		switch(choise)
		{
			 case 1:
			 System.out.println("Add ");
			 break;
			 case 2:
			 System.out.println("delete ");
			 break;
			 case 3:
			 System.out.println("edit ");
			 break;	
			 default:
			 System.out.println("Back");
			 break;
			
		}
	}


void displayMenu()
	{
		System.out.println("Id\tName of food  Rate\tRate");
		System.out.println("_________________________________");
		for(int i=0;i<choise;i++)
		{
			System.out.print(i);
			food[i].displayFood();
		}
	}

}