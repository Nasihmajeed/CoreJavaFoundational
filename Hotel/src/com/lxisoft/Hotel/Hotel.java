package com.lxisoft.Hotel;
import java.util.ArrayList;
import java.util.Scanner;
public class Hotel
{
	ArrayList<Food> menu = new ArrayList<Food>();
	ArrayList<OrderFood> orderFood = new ArrayList<OrderFood>();
	ArrayList<OrderDrink> orderDrink = new ArrayList<OrderDrink>();
	ArrayList<Drinks> drinks = new ArrayList<Drinks>();
	Scanner scanner = new Scanner(System.in);

	public void printName()
	{
		System.out.println("\n HOTEL NMR");
		System.out.println("Veg and Non-Veg");
		System.out.println(" Palakkad");
	}

	public void setFood()
	{	
	 System.out.println("\nMain Course");
	 menu.add(new Food());	
     menu.get(0).setName("Appam");
     menu.get(0).setRate(10);
     menu.add(new Food());	
     menu.get(1).setName("EggCurry");
     menu.get(1).setRate(35);
     menu.add(new Food());
     menu.get(2).setName("Dosa");
     menu.get(2).setRate(45);
     menu.add(new Food());
     menu.get(3).setName("Meals");
     menu.get(3).setRate(60);
     menu.add(new Food());
     menu.get(4).setName("Biriyani");
     menu.get(4).setRate(140);

     for(int i=0;i<menu.size();i++)
     {
        System.out.println(i+1+" "+menu.get(i).getName()+" "+menu.get(i).getRate());
     }

    }
    
    public void setDrinks()
    {
    	System.out.println("\nDrinks");
        drinks.add(new Drinks());
        drinks.get(0).setName("Tea");
        drinks.get(0).setRate(10);
        drinks.add(new Drinks());
        drinks.get(1).setName("Coffee");
        drinks.get(1).setRate(15);
        drinks.add(new Drinks());
        drinks.get(2).setName("LimeJuice");
        drinks.get(2).setRate(12);

        for(int i=0;i<drinks.size();i++)
        {
           System.out.println(i+1+" "+drinks.get(i).getName()+" "+drinks.get(i).getRate());
        }
    }
     
    public void setMenu()
    {
    	setDrinks();
    	setFood();
    }

    public void getDrinks()
    {
    	System.out.println("\nDrinks");
    	for(int i=0;i<drinks.size();i++)
          {
            System.out.println(i+1+" "+drinks.get(i).getName()+" "+drinks.get(i).getRate());
          }
    } 

    public void getFood()
    {
    	System.out.println("\nMain Course");
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

    public void addDrink()
    {
        System.out.println("How many drinks items did you want to add: ");
        int index = scanner.nextInt();
        index = index+drinks.size();
        for(int i=drinks.size();i<=index-1;i++)
        {
        drinks.add(new Drinks());
        System.out.println("Enter the name of the drink: ");
        drinks.get(i).setName(scanner.next());
        System.out.println("Enter the rate of the drink: ");
        drinks.get(i).setRate(scanner.nextInt());
        }
        System.out.println("\n");
        
        
        for(int j=0;j<drinks.size();j++)
         {
           System.out.println(j+1+" "+drinks.get(j).getName()+" "+drinks.get(j).getRate());
         }  
    }

    public void deleteFood()
    {
    	System.out.println("Enter the number to delete: ");
    	int i = scanner.nextInt(); 
    	menu.remove(i-1);
    	System.out.println("\n");
    	getFood();
    }

    public void deleteDrink()
    {
    	System.out.println("Enter the number to delete: ");
    	int i = scanner.nextInt(); 
    	drinks.remove(i-1);
    	System.out.println("\n");
    	getDrinks();
    }

    public void updateDrink()
    {
    	System.out.println("Enter the number to update: ");
    	int i = scanner.nextInt();
    	System.out.println("Enter the drink name to update: ");
        drinks.get(i-1).setName(scanner.next());
    	System.out.println("Enter the drink rate to update: ");
    	drinks.get(i-1).setRate(scanner.nextInt());
    	System.out.println("\n");
    	getDrinks();
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
    	getFood();
    }

    public void displayFood()
    {
    	System.out.println("\n");
    	getFood();
    }

     public void displayDrink()
    {
    	System.out.println("\n");
    	getDrinks();
    }

   public void orderFoods()
    {
    	int b = 0;
    	System.out.println("\nHow many food items did you want to order: ");
    	int a = scanner.nextInt();
    	
    	for(int i=0;i<a;i++)
    	{
    	   System.out.println("Please select your food ");
    	   b = scanner.nextInt();
    	   orderFood.add(new OrderFood());
    	   String name = menu.get(b-1).getName();
    	   orderFood.get(i).setName(name);
    	   int rate = menu.get(b-1).getRate();
    	   orderFood.get(i).setRate(rate);
    	}  
    	System.out.println("\nYour ordered food are");
    	   for(int j=0;j<orderFood.size();j++)
    	   {
    	     System.out.println(j+1+" "+orderFood.get(j).getName()+" "+orderFood.get(j).getRate());   
    	   }  
        System.out.println("\n Your food is getting ready");
    }

     public void orderDrinks()
    {
    	int b = 0;
    	System.out.println("\nHow many drinks did you want to order: ");
    	int a = scanner.nextInt();

    	for(int i=0;i<a;i++)
    	{
    	   System.out.println("Please select your drink ");
    	   b = scanner.nextInt();
    	   orderDrink.add(new OrderDrink());
    	   if(orderDrink.get(i).getname == null)
    	   {
    	   String name = drinks.get(b-1).getName();
    	   orderDrink.get(i).setName(name);
    	   int rate = drinks.get(b-1).getRate();
           orderDrink.get(i).setRate(rate);
    	}
    }
    	System.out.println("\nYour ordered drinks are"); 
    	   for(int j=0;j<orderDrink.size();j++)
    	   {
    	     System.out.println(j+1+" "+orderDrink.get(j).getName()+" "+orderDrink.get(j).getRate());   
    	   }  
        System.out.println("\n Your drink is getting ready");   
    }

     public void bill()
    {
    	int total = 0;
    	int total1 = 0;
    	int total2 = 0;
    	System.out.println("\n HOTEL NMR");
		System.out.println("Veg and Non-Veg");
		System.out.println(" Palakkad");
        System.out.println("\n Bill");
       
        for(int i=0;i<orderDrink.size();i++)
    	   {
    	     System.out.println(i+1+" "+orderDrink.get(i).getName()+" "+orderDrink.get(i).getRate());
             total = total + orderDrink.get(i).getRate();
           }

        for(int j=0;j<orderFood.size();j++)
    	   {
    	     System.out.println(j+1+" "+orderFood.get(j).getName()+" "+orderFood.get(j).getRate());
             total1 = total1 + orderFood.get(j).getRate();
           }
            total2 = total + total1;
            System.out.println("Total amount: "+total2);
            System.out.println("\n Thank You for coming");
            System.out.println("\n Have a nice day");
    }
    
    public void editFood()
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
   
    public void editDrink()
	{
		int c=0;
		do
		{
		System.out.println("\n 1.Add Drink \n 2.Delete Drink \n 3.Update \n 4.Display All");
		System.out.println("\n Enter your choice:");
		int ch = scanner.nextInt();
        switch(ch)
        {
        	case 1:addDrink();
        	       break;

        	case 2:deleteDrink();
        	       break;

        	case 3:updateDrink();
        	       break;

        	case 4:displayDrink();
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
    			case 1:option();
        	           bill();
    			       break;

    			case 2:getDrinks();
    			       getFood();
    			       System.out.println(" "); 
    			       mainEdit();
    			       break;

    			default:System.out.println("Invalid choice");
    		}
    	
        System.out.println("\nDo you want to continue (yes = press 1 | no = press 0): ");
        s = scanner.nextInt();
        }
        while(s==1);
    	}

    public void option()
    {
    	int s=0;
    	do
    	{
    	System.out.println("\n 1.Drinks \n 2.Main Course");
    	System.out.println("Please select your option:");
    	int ch = scanner.nextInt();
    	switch(ch)
    	{
    		case 1:orderDrinks();
    		       break;

    		case 2:orderFoods();
    		       break;

    		default:System.out.println("Invalid choice");
    	}
    	
        System.out.println("\nDo you want to continue (yes = press 1 | no = press 0): ");
        s = scanner.nextInt();
        }
        while(s==1);
    	}

  	public void mainEdit()
        {
    	int s=0;
    	do
    	{
    	System.out.println("\n 1.Drinks Section \n 2.Food Section");
    	System.out.println("Please select your option:");
    	int ch = scanner.nextInt();
    	switch(ch)
    	{
    		case 1:editDrink();
    		       break;

    		case 2:editFood();
    		       break;

    		default:System.out.println("Invalid choice");
    	}
    	
        System.out.println("\nDo you want to continue (yes = press 1 | no = press 0): ");
        s = scanner.nextInt();
        }
        while(s==1);
    	}
                
}