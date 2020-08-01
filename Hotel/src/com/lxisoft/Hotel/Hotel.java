package com.lxisoft.Hotel;
import java.util.ArrayList;
public class Hotel
{
	ArrayList<Food> menu = new ArrayList<Food>();

	public void printName()
	{
		System.out.println("\n HOTEL NMR");
		System.out.println("Veg and Non-Veg");
		System.out.println(" Palakkad");
		System.out.println("\n MENU");
	}

	public void setFood()
	{
	 menu.add(new Food());	
     menu.get(0).setName("Tea");
     menu.get(0).setRate(10);
     menu.add(new Food());	
     menu.get(1).setName("Coffee");
     menu.get(1).setRate(15);
     for(int i=0;i<menu.size();i++)
     {
     System.out.println(menu.get(i).getName()+" "+menu.get(i).getRate());
     }  
    } 


}








    