package com.lxisoft.user;
import com.lxisoft.user.*;
import com.lxisoft.hotel.*;
import java.util.Scanner;
public class User
{
public String name;
public Order[] order=new Order[20];
public	int item;

static Scanner input =new Scanner(System.in);
public void createUser(Menu menu)
	{

		
		menu.displayMenu();

		// if(menu.choise==0)
		// {
		// System.out.println(".......SORRY !!!!!! ");
		// }
		// else
		// {
				System.out.println("name Of customer= ");
				name=input.next();
				System.out.println("How many items You Want to buy = ");
				item=input.nextInt();
				int temp=item;
				// do
				// {
					for(int i=0;i<temp;i++)
					{
						order[i]=new Order();
						order[i].creatOrder(menu);

						//temp--;
					}
				//}while(temp>0);
		//}
	}

void displayUser(Menu menu)
	{
		System.out.println("\n   User = "+this.name.toUpperCase());
		for(int i=0;i<item;i++)
		{
		order[i].displayOrder(menu,name);
		int total=total+order[i].totl;
		
		}
		System.out.println("\n  Grand Total = "+total);		
	}
 }