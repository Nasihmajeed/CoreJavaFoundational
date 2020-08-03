package com.lxisoft.Hotel;
import java.util.ArrayList;
import java.util.Scanner;
public class Hotel
{
	ArrayList<Food> menu = new ArrayList<Food>();
	Scanner scanner = new Scanner(System.in);

	public void printName()
	{
		System.out.println("\n HOTEL NMR");
		System.out.println("Veg and Non-Veg");
		System.out.println(" Palakkad");
		System.out.println("\n MENU");
		System.out.println("\n");
	}

	public void setFood()
	{
	 menu.add(new Food());	
     menu.get(0).setName("Tea");
     menu.get(0).setRate(10);
     menu.add(new Food());	
     menu.get(1).setName("Coffee");
     menu.get(1).setRate(15);
     menu.add(new Food());
     menu.get(2).setName("Dosa");
     menu.get(2).setRate(45);
     menu.add(new Food());
     menu.get(3).setName("Meals");
     menu.get(3).setRate(60);
     menu.add(new Food());
     menu.get(4).setName("Biriyani");
     menu.get(4).setRate(100);
     for(int i=0;i<menu.size();i++)
     {
     System.out.println(menu.get(i).getName()+" "+menu.get(i).getRate());
     }  
    }

    public void addFood()
    {
        Food food = new Food(); 
        menu.add(new Food());
        System.out.println("Enter the name of the food: ");
        menu.get(5).setName(scanner.next());        	     
        System.out.println("Enter the rate of the food: ");
        menu.get(5).setRate(scanner.nextInt());
        System.out.println("\n"); 
        
        for(int i=0;i<menu.size();i++)
         {
           System.out.println(menu.get(i).getName()+" "+menu.get(i).getRate());
         }  
    }

    public void printAdmin()
	{
		System.out.println("\n 1.Add Food \n 2.Delete Food \n 3.Update \n 4.Display All");
		System.out.println("\n Enter your choice:");
		int ch = scanner.nextInt();
        switch(ch)
        {
        	case 1:addFood();
        	       break;

       }
   }


}