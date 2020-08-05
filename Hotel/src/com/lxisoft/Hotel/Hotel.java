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
       
        System.out.println("How many food items did you want to add: ");
        int index = scanner.nextInt();
        for(int i=1;i<=index;i++)
        {
        menu.add(new Food());
        System.out.println("Enter the name of the food: ");
        menu.get(i).setName(scanner.next());
        System.out.println("Enter the rate of the food: ");
        menu.get(i).setRate(scanner.nextInt());
        }
        System.out.println("\n");
        
        for(int j=0;j<menu.size();j++)
         {
           System.out.println(menu.get(j).getName()+" "+menu.get(j).getRate());
         }  
    }

    public void deleteFood()
    {
    	System.out.println("Enter the index to delete: ");
    	int index = scanner.nextInt(); 
    	menu.remove(index);
    	System.out.println("\n");
    	for(int i=0;i<menu.size();i++)
         {
           System.out.println(menu.get(i).getName()+" "+menu.get(i).getRate());
         }  
    }

    public void updateFood()
    {
    	System.out.println("Enter the index to update: ");
    	int index = scanner.nextInt();
    	System.out.println("Enter the food name to update: ");
        menu.get(index).setName(scanner.next());
    	System.out.println("Enter the food rate to update: ");
    	menu.get(index).setRate(scanner.nextInt());
    	System.out.println("\n");
    	System.out.println(menu.get(index).getName()+" "+menu.get(index).getRate());
    }
    
    public void displayFood()
    {
    	System.out.println("\n");
    	for(int i=0;i<menu.size();i++)
         {
           System.out.println(menu.get(i).getName()+" "+menu.get(i).getRate());
         }  
    }

    public void printAdmin()
	{
		int c=0;
		do
		{
		System.out.println("\n 1.Add Food \n 2.Delete Food \n 3.Update \n 4.Display All");
		System.out.println("\n Enter your choice:");
		int ch = scanner.nextInt();
        switch(ch)
        {
        	case 1:addFood();
        	       break;

        	case 2:deleteFood();
        	       break;

        	case 3:updateFood();
        	       break; 

        	case 4:displayFood();
        	       break;     

        	default:System.out.println("Invalid choice");
        }

        System.out.println("\nDo you want to continue (yes = press 1 | no = press 0): ");
        c = scanner.nextInt();
        }
        while(c==1);

   }


}