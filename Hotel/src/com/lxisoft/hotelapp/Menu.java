package com.lxisoft.hotelapp;
import com.lxisoft.admin.Admin;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu
{
	int n;
	Scanner s=new Scanner(System.in);
	ArrayList<String> myMenu=new ArrayList<String>();
	public void hotelMenu()
	{
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("MENU   \t\t\t\t price \t\t\t Code");
		myMenu.add(new Food());
		myMenu.get(0).setName("Chicken Mandhi\t");
		myMenu.get(0).setPrice(550);
		myMenu.get(0).setCode("\tCM");

		myMenu.add(new Food());
		myMenu.get(1).setName("Chicken Biriyani");
		myMenu.get(1).setPrice(120);
		myMenu.get(1).setCode("\tCB");

		myMenu.add(new Food());
		myMenu.get(2).setName("Alfahhm\t\t");
		myMenu.get(2).setPrice(430);
		myMenu.get(2).setCode("\tAL");

		myMenu.add(new Food());
		myMenu.get(3).setName("Shavayi\t\t");
		myMenu.get(3).setPrice(480);
		myMenu.get(3).setCode("\tSH");

		for (int i=0; i<myMenu.size(); i++)
		{
			System.out.println("\n" +myMenu.get(i).getName()+"\t \t"+myMenu.get(i).getPrice()+"\t\t"+myMenu.get(i).getCode());
		}

	}
	public void addItem()
	{
		System.out.println (" \n Enter number of items to be added in the Menu ");
		  n=s.nextInt();
		 s.nextLine();

	
}