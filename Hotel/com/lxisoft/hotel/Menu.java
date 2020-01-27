package com.lxisoft.hotel;
import com.lxisoft.user.*;
import com.lxisoft.hotel.*;
import java.util.*;
public class Menu
{
public Food[] food=new Food[20];
public int choise;
static Scanner input =new Scanner(System.in);
public void createMenu()
	{
		System.out.println("How many Food items u want to add ");
		choise=input.nextInt();
		
		for(int i=0;i<choise;i++)
		{
			food[i]=new Food();
			food[i].createFood();
		}
	}

public void editMenu()
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
			 displayMenu();
			 System.out.println("Which item you Want to delete ");
			 int id=input.nextInt();
			 food[id]=null;
			 break;
			 case 3:
			 System.out.println("Which item you want to Edit ");
			 id=input.nextInt();
			 //food[id]=null;
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