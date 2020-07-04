package com.lxisoft.hotelapp;
import com.lxisoft.Admin.Admin;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu
{
	
	Scanner s= new Scanner(System.in);
	ArrayList<Food> foodMenu = new ArrayList<Food>();
	public void createMenu()
	{
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("MENU   \t\t\t\t price \t\t\t Code");
		foodMenu.add(new Food());
		foodMenu.get(0).setName("Chicken Mandhi\t");
		foodMenu.get(0).setPrice(550);
		foodMenu.get(0).setCode("\tCM");

		foodMenu.add(new Food());
		foodMenu.get(1).setName("Chicken Biriyani");
		foodMenu.get(1).setPrice(120);
		foodMenu.get(1).setCode("\tCB");

		foodMenu.add(new Food());
		foodMenu.get(2).setName("Alfahhm\t\t");
		foodMenu.get(2).setPrice(430);
		foodMenu.get(2).setCode("\tAL");

		foodMenu.add(new Food());
		foodMenu.get(3).setName("Shavayi\t\t");
		foodMenu.get(3).setPrice(480);
		foodMenu.get(3).setCode("\tSH");

		for (int i=0; i<foodMenu.size(); i++)
		{
			System.out.println("\n" +foodMenu.get(i).getName()+"\t \t"+foodMenu.get(i).getPrice()+"\t\t"+foodMenu.get(i).getCode());
		}
}
		public void addFood()
		{
		
			System.out.println (" \n Enter number Foods to be added ");
			int n=s.nextInt();
    		s.nextLine();
			
			for (int i=foodMenu.size(); i<foodMenu.size()+n; i++)
			{
    			foodMenu.add(new Food());

    			System.out.println("\n Enter name of FOOD You want to add");
				String name=s.nextLine();
    			s.nextLine();

       			System.out.println("\n Enter the price of FOOD");
       			int prize=s.nextInt();
      

       			foodMenu.get(i).setName(name);
       			foodMenu.get(i).setPrice(prize);
       			

       		}
       			for (int i=0; i<foodMenu.size(); i++)
				{
					System.out.println("\n" +foodMenu.get(i).getName()+"\t \t"+foodMenu.get(i).getPrice()+"\t\t");
				}
       		
		}
		public void deleteFood()
		{
			System.out.println("Enter the number of item to be deleted");
		   	int n=scnr.nextInt()  ;
    		foodMenu.remove(n-1);
		}
}
