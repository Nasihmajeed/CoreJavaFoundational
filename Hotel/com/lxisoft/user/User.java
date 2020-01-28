package com.lxisoft.user;
import com.lxisoft.user.*;
import com.lxisoft.hotel.*;
import java.util.Scanner;
public class User
{
public String name;
public Order[] order=new Order[20];
	int item;
static Scanner input =new Scanner(System.in);
public void createUser(Menu menu)
	{

		System.out.println("name Of customer= ");
		name=input.next();
		menu.displayMenu();
		System.out.println("How many items You Want to buy = ");
		item=input.nextInt();
		do
		{
		for(int i=0;i<item;i++)
		{
		order[i]=new Order();
		order[i].creatOrder(menu);
		item--;
		}
		}while(item>0);

	}

void displayUser(Menu menu)
	{
		for(int i=0;i<item;i++)
		{
		order[i].displayOrder(menu,name);				
		}
	}

 }