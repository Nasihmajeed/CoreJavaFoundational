import java.util.*;
public class Menu
{
Food[] food=new Food[20];
int choise;
static Scanner input =new Scanner(System.in);
void createMenu()
	{
		System.out.println("How many Food items u want to add ");
		choise=input.nextInt();
		
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
		
		int change=input.nextInt();
		switch(change)
		{
			 case 1:
			 System.out.println("How many items u want to add ");
			 int item;
			 int temp;
			 item=input.nextInt();
			 	temp=item+choise;
			 	for(int i=choise;i<temp;i++)
					{
						food[i]=new Food();
						food[i].createFood();
					}

			 break;
			 case 2:
			 System.out.println("Which item you Want to delete ");
			 int id=input.nextInt();
			 food[id]=null;
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
		System.out.println("Id\tName of food  \tRate");
		System.out.println("_________________________________");
		for(int i=0;i<food.length;i++)
		{
			if(food[i]!=null)

			{
			System.out.print(i);
			food[i].displayFood();
			}
		}
	}

}