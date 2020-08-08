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
     System.out.println(i+1+" "+menu.get(i).getName()+" "+menu.get(i).getRate());
     }
    }

    public void addFood()
    {
       
        System.out.println("How many food items did you want to add: ");
        int index = scanner.nextInt();
        index = index+menu.size();
        for(int i=menu.size();i<=index-1;i++)
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
           System.out.println(j+1+" "+menu.get(j).getName()+" "+menu.get(j).getRate());
         }  
    }

    public void deleteFood()
    {
    	System.out.println("Enter the number to delete: ");
    	int i = scanner.nextInt(); 
    	menu.remove(i-1);
    	System.out.println("\n");
    	for(i=0;i<menu.size();i++)
         {
           System.out.println(i+1+" "+menu.get(i).getName()+" "+menu.get(i).getRate());
         }  
    }

    public void updateFood()
    {
    	System.out.println("Enter the number to update: ");
    	int i = scanner.nextInt();
    	System.out.println("Enter the food name to update: ");
        menu.get(i-1).setName(scanner.next());
    	System.out.println("Enter the food rate to update: ");
    	menu.get(i-1).setRate(scanner.nextInt());
    	System.out.println("\n");
    	for(i=0;i<menu.size();i++)
    	{
    	System.out.println(i+1+" "+menu.get(i).getName()+" "+menu.get(i).getRate());
        }
    }
    
    public void displayFood()
    {
    	System.out.println("\n");
    	for(int i=0;i<menu.size();i++)
         {
           System.out.println(i+1+" "+menu.get(i).getName()+" "+menu.get(i).getRate());
         }  
    }

    public void order()
    {
    	System.out.println("\nHow many food items did you want order: ");
    	int a = scanner.nextInt();
    	for(int i=1;i<=a;i++)
    	{
    	   System.out.println("Please select your food ");
    	   int b = scanner.nextInt(); 
    	   System.out.println(menu.get(b-1).getName());   
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


    public void setBill()
    {
    	System.out.println("\n HOTEL NMR");
		System.out.println("Veg and Non-Veg");
		System.out.println(" Palakkad");

		
    }
    
    public void bill()
    {
    	int c=0;
    	do
    	{
    	  System.out.println("\n 1.Bill \n 2.Order more food");
    	  System.out.println("Enter your choice: ");
    	  int ch = scanner.nextInt();
    	  switch(ch)
    	  {
    	  	case 1:setBill();
    	  	       break;

    	  	case 2:System.out.println("\n MENU");
        	       setFood();
        	       order();
    			   break;

    	    default:System.out.println("Invalid choice");

    	  }
        System.out.println("\n Do you want to continue (yes = press 1 | no = press 0): ");
        c = scanner.nextInt();
        }
        while(c==1); 
    }

    public void user()
    {
    	int s=0;
    	do
    	{
    		System.out.println("\n 1.Order food  \n 2.Settings");
    		System.out.println("\nEnter your choice: ");
    		int ch = scanner.nextInt();
    		switch(ch)
    		{
    			case 1:System.out.println("\n MENU");
        	           setFood();
        	           order();
    			       break;

    			case 2:printAdmin();
    			       break;

    			default:System.out.println("Invalid choice");
    		}
    	
        System.out.println("\n Do you want to continue (yes = press 1 | no = press 0): ");
        s = scanner.nextInt();
        }
        while(s==1);
    	}
}