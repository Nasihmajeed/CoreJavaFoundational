package com.lxisoft.Hotel;
import java.util.ArrayList;
import java.util.Scanner;
public class Hotel
{
	ArrayList<Food> menu = new ArrayList<Food>();
	ArrayList<Order> order = new ArrayList<Order>();
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

   public void orderFood()
    {
    	int b = 0;
    	System.out.println("\nHow many food items did you want to order: ");
    	int a = scanner.nextInt();
    	
    	for(int i=0;i<a;i++)
    	{
    	   System.out.println("Please select your food ");
    	   b = scanner.nextInt();
    	   order.add(new Order());
    	   String name = menu.get(b-1).getName();
    	   order.get(i).setName(name);
    	   int rate = menu.get(b-1).getRate();
    	   order.get(i).setRate(rate);
    	}  
    	System.out.println("\nYour ordered food are"); 
    	   for(int j=0;j<order.size();j++)
    	   {
    	     System.out.println(j+1+" "+order.get(j).getName()+" "+order.get(j).getRate());   
    	   }  
        System.out.println("\n Your food is getting ready");   
    }

     public void bill()
    {
    	int total = 0;
    	System.out.println("\n HOTEL NMR");
		System.out.println("Veg and Non-Veg");
		System.out.println(" Palakkad");
        System.out.println("\n Bill");
        for(int j=0;j<order.size();j++)
    	   {
    	     System.out.println(j+1+" "+order.get(j).getName()+" "+order.get(j).getRate());
             total = total + order.get(j).getRate();
           }
             System.out.println("Total amount: "+total);  
             System.out.println("\n Thank You for coming");
             System.out.println("\n Have a nice day");
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
        	           orderFood();
        	           bill();
    			       break;

    			case 2:setFood();
    			       System.out.println(" "); 
    			       printAdmin();
    			       break;

    			default:System.out.println("Invalid choice");
    		}
    	
        System.out.println("\nDo you want to continue (yes = press 1 | no = press 0): ");
        s = scanner.nextInt();
        }
        while(s==1);
    	}
}