package com.lxisoft.Hotel;
import java.util.ArrayList;
import java.util.Scanner;
public class Hotel
{
	ArrayList<Item> menuList = new ArrayList<Item>();
	ArrayList<OrderFood> orderFood = new ArrayList<OrderFood>();
	ArrayList<OrderDrink> orderDrink = new ArrayList<OrderDrink>();
	Scanner scanner = new Scanner(System.in);

	public void printName()
	{
		System.out.println("\n HOTEL NMR");
		System.out.println("Veg and Non-Veg");
		System.out.println(" Palakkad");
	}

	public void setMenu()
	{	

     System.out.println("\nMenu");
     menuList.add(new Drinks());
     menuList.get(0).setName("Tea");
     menuList.get(0).setRate(10);
     menuList.add(new Drinks());
     menuList.get(1).setName("Coffee");
     menuList.get(1).setRate(15);
     menuList.add(new Drinks());
     menuList.get(2).setName("LimeJuice");
     menuList.get(2).setRate(12);
	 menuList.add(new Food());	
     menuList.get(3).setName("Appam");
     menuList.get(3).setRate(10);
     menuList.add(new Food());	
     menuList.get(4).setName("EggCurry");
     menuList.get(4).setRate(35);
     menuList.add(new Food());
     menuList.get(5).setName("Dosa");
     menuList.get(5).setRate(45);
     menuList.add(new Food());
     menuList.get(6).setName("Meals");
     menuList.get(6).setRate(60);
     menuList.add(new Food());
     menuList.get(7).setName("Biriyani");
     menuList.get(7).setRate(140);

     for(int i=0;i<menuList.size();i++)
     {
        System.out.println(i+1+" "+menuList.get(i).getName()+" "+menuList.get(i).getRate());
     }

    }
     
    public void getDrinks()
    {
    	System.out.println("\nDrinks");
    	for(int i=0;i<menuList.size();i++)
          {
            System.out.println(i+1+" "+menuList.get(i).getName()+" "+menuList.get(i).getRate());
          }
    } 

    public void getFood()
    {
    	System.out.println("\nMain Course");
    	for(int i=0;i<menuList.size();i++)
          {
            System.out.println(i+1+" "+menuList.get(i).getName()+" "+menuList.get(i).getRate());
          }
    } 
    
    public void addItem()
    {
    	int c = 0;
    	System.out.println("Which item did you want to add (Food = press 0 | Drink = press 1): ");
        c = scanner.nextInt();
        if(c == 0)
        { 
        System.out.println("How many food items did you want to add: ");
        int index = scanner.nextInt();
        index = index+menuList.size();
        for(int i=menuList.size();i<=index-1;i++)
        {
        menuList.add(new Food());
        System.out.println("Enter the name of the food: ");
        menuList.get(i).setName(scanner.next());
        System.out.println("Enter the rate of the food: ");
        menuList.get(i).setRate(scanner.nextInt());
        }
    }
    else
    {
     System.out.println("How many drinks items did you want to add: ");
        int index = scanner.nextInt();
        index = index+menuList.size();
        for(int i=menuList.size();i<=index-1;i++)
        {
        menuList.add(new Drinks());
        System.out.println("Enter the name of the drink: ");
        menuList.get(i).setName(scanner.next());
        System.out.println("Enter the rate of the drink: ");
        menuList.get(i).setRate(scanner.nextInt());
        }	
    }
        System.out.println("\n");
        
        for(int j=0;j<menuList.size();j++)
         {
           System.out.println(j+1+" "+menuList.get(j).getName()+" "+menuList.get(j).getRate());
         }  
    }

    public void deleteItem()
    {
    	int c = 0;
    	int s = 0;
    	System.out.println("Which item did you want to delete (Food = press 0 | Drink = press 1): ");
        s = scanner.nextInt();
        if(s == 0)
        {
    	do
    	{
    	System.out.println("Enter the number to delete: ");
    	int i = scanner.nextInt(); 
    	if(i <= menuList.size())
    	{
    	menuList.remove(i-1);
    	System.out.println("\n");
    	getFood();
    }
    else
    {
    	System.out.println("Please select valid option");
    	System.out.println("\n");
    }	

  System.out.println("please press 1 to re enter | press 0 to exit : ");
  c = scanner.nextInt();
  }
  while(c == 1);
}

    else
     {
    	do
    	{ 
    	System.out.println("Enter the number to delete: ");
    	int i = scanner.nextInt(); 
    	if(i <= menuList.size())
    	{
    	menuList.remove(i-1);
    	System.out.println("\n");
    	getDrinks();
    }
    else
    {
    	System.out.println("Please select valid option");
    	System.out.println("\n");    	
    }
     System.out.println("please press 1 to re enter | press 0 to exit : ");
  c = scanner.nextInt();
  }
  while(c == 1);
 }
}

    public void updateItem()
    {
    	int c = 0;
    	do
    	{
    	System.out.println("Enter the number to update: ");
    	int i = scanner.nextInt();
    	if(i <= menuList.size())
    	{
    	System.out.println("Enter the drink name to update: ");
        menuList.get(i-1).setName(scanner.next());
    	System.out.println("Enter the drink rate to update: ");
    	menuList.get(i-1).setRate(scanner.nextInt());
    	System.out.println("\n");
    	getDrinks();
    }
    else
    {
    	System.out.println("Please select valid option");
    	System.out.println("\n");
    }
     System.out.println("please press 1 to re enter | press 0 to exit : ");
     c = scanner.nextInt();
     }
     while(c == 1);
}
    
     public void updateFood()
    {
    	int c = 0;
    	do
    	{
    	System.out.println("Enter the number to update: ");
    	int i = scanner.nextInt();
    	if(i <= menuList.size())
    	{
    	System.out.println("Enter the food name to update: ");
        menuList.get(i-1).setName(scanner.next());
    	System.out.println("Enter the food rate to update: ");
    	menuList.get(i-1).setRate(scanner.nextInt());
    	System.out.println("\n");
    	getFood();
    }
    else
    {
    	System.out.println("Please select valid option");
    	System.out.println("\n");
    }
     System.out.println("please press 1 to re enter | press 0 to exit : ");
     c = scanner.nextInt();
     }
     while(c == 1); 
 }

    public void displayItem()
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
    	int c = 0;
    	do
    	{
    	System.out.println("\nHow many food items did you want to order: ");
    	int a = scanner.nextInt();
    	
    	for(int i=0;i<a;i++)
    	{
    	   System.out.println("Please select your food ");
    	   b = scanner.nextInt();
    	   if(b <= menuList.size())
    	   {
    	   orderFood.add(new OrderFood());
    	   for(int j=0;j<orderFood.size();j++)
    	   {
    	   	if(orderFood.get(j).getName() == null)
             {  
    	   String name = menuList.get(b-1).getName();
    	   orderFood.get(j).setName(name);
    	   int rate = menuList.get(b-1).getRate();
    	   orderFood.get(j).setRate(rate);
       } 
      }   
    }
       else
       {
       	System.out.println("Please select valid option");
       	System.out.println("\n");
       	break;
       }
   }
       System.out.println("For re-order press 1 | For ordered menu press 0 : ");
       c = scanner.nextInt();
       }
       while(c == 1); 

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
    	int c = 0;
    	do
    	{
    	System.out.println("\nHow many drinks did you want to order: ");
    	int a = scanner.nextInt();

    	for(int i=0;i<a;i++)
    	{
    	   System.out.println("Please select your drink ");
    	   b = scanner.nextInt();
    	   if(b <= menuList.size())
    	   {
    	   orderDrink.add(new OrderDrink());
    	   for(int j=0;j<orderDrink.size();j++)
    	   {
    	   if(orderDrink.get(j).getName() == null)
    	   {
    	   String name = menuList.get(b-1).getName();
    	   orderDrink.get(j).setName(name);
    	   int rate = menuList.get(b-1).getRate();
           orderDrink.get(j).setRate(rate);
    	}
      }
    }
        else
        {
        	System.out.println("Please select valid option");
        	System.out.println("\n");
        	break;
        }
    }
    System.out.println("For re-order press 1 | For ordered menu press 0 : ");
    c = scanner.nextInt();
    }
    while(c == 1);

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
    
    public void editItem()
	{
		int c = 0;
		do
		{
		System.out.println("\n 1.Add Item \n 2.Delete Item \n 3.Update \n 4.Display All");
		System.out.println("\n Enter your choice:");
		int ch = scanner.nextInt();
        switch(ch)
        {
        	case 1:addItem();
        	       break;

        	case 2:deleteItem();
        	       break;

        	case 3:updateItem();
        	       break; 

        	case 4:displayItem();
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
    			       editItem();
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

  	/*public void mainEdit()
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
    	}*/
                
}