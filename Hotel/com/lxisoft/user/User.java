package com.lxisoft.user;
import com.lxisoft.user.*;
import com.lxisoft.hotel.*;
import java.util.Scanner;
public class User
{
public String name;
public int order;
//public int quantity;
//Menu menu;
static Scanner input =new Scanner(System.in);
public void createUser(Menu menu)
	{
		//menu=new Menu();
		System.out.println("name Of customer= ");
		name=input.next();
		menu.displayMenu();
		System.out.println("\nEnter the order Choise = ");
		order=input.nextInt();
		if(order<menu.food.length)
		{

			// System.out.println("\nEnter the Quantity of "+menu.food[order].name+" = ");
			// quantity=input.nextInt();
			// int totl= quantity*menu.food[order].rate;
			// System.out.println("\nYour Oredr of "+menu.food[order].name+" Was Sucess full");
			// System.out.println("\nTotal Amount ="+(quantity+" * "+menu.food[order].rate)+" = "+totl+".Rs");
		}

	}

void displayUser(Menu menu)
	{
		System.out.println("\nUser = "+this.name);
		System.out.println("\n Oredr of "+menu.food[order].name);
		int totl= quantity*menu.food[order].rate;
		System.out.println("\nTotal Amount ="+(quantity+" * "+menu.food[order].rate)+" = "+totl+".Rs");

	}
 }