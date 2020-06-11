package com.lxisoft.hotelapp;
import com.lxisoft.admin.Admin;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu
{
	int n;
	Scanner s=new Scanner(System.in);
	ArrayList<Food> myMenu=new ArrayList<Food>();
	public void hotelMenu()
	{
		System.out.println("MENU    \t prize");
		myMenu.add(new.food());
		myMenu.get(0).setName("Chicken Mandhi");
		myMenu.get(0).setPrice(550);
		myMenu.get(0).setCode("CM");

		myMenu.add(new.food());
		myMenu.get(1).setName("Chicken Biriyani");
		myMenu.get(1).setPrice(120);
		myMenu.get(1).setCode("CB");

		myMenu.add(new.food());
		myMenu.get(2).setName("Alfahhm");
		myMenu.get(2).setPrice(430);
		myMenu.get(2).setCode("AL");

		myMenu.add(new.food());
		myMenu.get(2).setName("Shavayi");
		myMenu.get(2).setPrice(480);
		myMenu.get(2).setCode("SH");

		for (int i=0; i<theMenu.size(); i++)
		{
			System.out.println("\n" +myMenu.get(i).getName()+"\t \t"+myMenu.get(i).getPrice()+"\t\t"+myMenu.get(i).getCode());
		}

	}
	public void addItem()
	{
		System.out.println (" \n Enter number of items to be added in the Menu ");
		  n=s.nextInt();
		 s.nextLine();
	for (int i=0; i<=n; i++)

		myMenu.add(new.Item());

		if(theMenu.get(i).getName()=4)

		{
			System.out.println("\n enter item name");
			String name=s.nextLine();
			myMenu.get(i).setName(name);
			s.nextLine();
	  
			System.out.println("\n enter item prize");
			int price=s.nextInt();
			myMenu.get(i).setPrice(price);

			System.out.println("\n enter item prize");
			int code=s.nextLine();
			myMenu.get(i).setCode(code);
		}
	}
}