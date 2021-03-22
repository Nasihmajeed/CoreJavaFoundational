import java.util.Scanner;
public class Menu
{
public Food[] food=new Food[20];
public int choise;
static Scanner input =new Scanner(System.in);
public void createMenu()
	{
		food[1]=new Food();
		food[1].name="TEA";
		food[1].rate=10;
		food[1].qnty=50;
		food[2]=new Food();
		food[2].name="COFFEE";
		food[2].rate=20;
		food[2].qnty=50;
		food[3]=new Food();
		food[3].name="DOSA";
		food[3].rate=10;
		food[3].qnty=100;
        
		
	}

public void editMenu()
	{
		System.out.println("\n Modify Menu\n1.Add\n2.Delete\n3.Edit\n ");	
		System.out.println("Enter the Choice= ");
		
		int change=input.nextInt();
		switch(change)
		{
			 case 1:
			 System.out.println("How many Food items u want to add ");
		choise=input.nextInt();
		
		for(int i=3;i<(choise+3);i++)
		{
			food[i]=new Food();
			food[i].createFood();
		}
			

			 break;
			 case 2:
			 displayMenu();
			 System.out.println("Which item you Want to delete ");
			 int id=input.nextInt();
			 food[id]=null;
			 break;
			 case 3:
			 displayMenu();
			 System.out.println("Which item you want to Edit ");
			 id=input.nextInt();
			 food[id].createFood();
			 System.out.println("Edited Sucessfully ");
			 break;	
			 default:
			 System.out.println("Back");
			 break;
			
		}
	}


public void displayMenu()
	{
		// if(choise==0)		
		// {
		// 	System.out.println("\n\t\tThere is no menu\n           Please contact Managerss");
		// }
		// else
		// {
		System.out.println("Id\tName of food  \tRate  \tQuantity");
		System.out.println("______________________________________________");
		for(int i=0;i<food.length;i++)
		{
			if(food[i]!=null&&food[i].qnty>0)

			{
			System.out.print(i);
			food[i].displayFood();
			}
		}
		//}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
	}
}