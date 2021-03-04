
import java.util.Scanner;
import java.util.ArrayList;
public class Hotel
{
	ArrayList<Item> menuList = new ArrayList<Item>();
	ArrayList<OrderItem> order = new ArrayList<OrderItem>();
	Scanner scanner = new Scanner(System.in);

	public void printName()
	{
		System.out.println("\n---------SILVER STAR HOTEL---------");
		System.out.println("---------VEG & NON-VEG FAMILY RESTAURANT (A/C)---------");
		System.out.println("---------CHERPULASSERY---------");
    

	}

	public void setMenu()
	{	

     System.out.println("\nSILVER STAR SPECIAL MENU");
     menuList.add(new Drinks());
     menuList.get(0).setName("TEA");
     menuList.get(0).setRate(10);
     menuList.add(new Drinks());
     menuList.get(1).setName("COFFEE");
     menuList.get(1).setRate(15);
     menuList.add(new Drinks());
     menuList.get(2).setName("LEMONADE");
     menuList.get(2).setRate(25);
	 menuList.add(new Food());	
     menuList.get(3).setName("APPAM");
     menuList.get(3).setRate(10);
     menuList.add(new Food());	
     menuList.get(4).setName("EGG CURRY");
     menuList.get(4).setRate(35);
     menuList.add(new Food());
     menuList.get(5).setName("MASALA DOSA");
     menuList.get(5).setRate(45);
     menuList.add(new Food());
     menuList.get(6).setName("SOUTH INDIAN MEALS");
     menuList.get(6).setRate(80);
     menuList.add(new Food());
     menuList.get(7).setName("BIRIYANI");
     menuList.get(7).setRate(140);

     for(int i=0;i<menuList.size();i++)
     {
        System.out.println(i+1+" "+menuList.get(i).getName()+" "+menuList.get(i).getRate());
     }

    }

    public void getMenu()
    {
    	System.out.println("\n Menu");
      System.out.println("\n ----");
    	for(int i=0;i<menuList.size();i++)
          {
            System.out.println(i+1+" "+menuList.get(i).getName()+" "+menuList.get(i).getRate());
          }
    }
     
    public void getDrinks()
    {
    	
    	System.out.println("\nDRINKS");
      System.out.println("\n------");
    	int j=1;
    	for(int i=0;i<menuList.size();i++)
          {
          	if(menuList.get(i) instanceof Drinks)
          	{
              System.out.println(j+" "+menuList.get(i).getName()+" "+menuList.get(i).getRate());                  
              j++;
            }
          }
    }

    public void getFood()
    {
    	System.out.println("\nFOOD ITEMS");
      System.out.println("\n------------");

    	int j=1;
    	for(int i=0;i<menuList.size();i++)
          {
          	if(menuList.get(i) instanceof Food)
          	{
              System.out.println(j+" "+menuList.get(i).getName()+" "+menuList.get(i).getRate());
              j++;
            }
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
        System.out.println("\n");

        getFood();
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
        
        System.out.println("\n");
        
        getDrinks();
    }
}

    public void deleteItem()
    {
    	getMenu();
    	int c = 0;
    	do
    	{
    	System.out.println("Enter the number to delete: ");
    	int i = scanner.nextInt(); 
    	if(i <= menuList.size())
    	{
    	menuList.remove(i-1);
    	System.out.println("\n");
    	getMenu();
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

    public void updateItem()
    {
    	getMenu();
    	int c = 0;
    	do
    	{
    	System.out.println("Enter the number to update: ");
    	int i = scanner.nextInt();
    	if(i <= menuList.size())
    	{
    	System.out.println("Enter the item name to update: ");
        menuList.get(i-1).setName(scanner.next());
    	System.out.println("Enter the item rate to update: ");
    	menuList.get(i-1).setRate(scanner.nextInt());
    	System.out.println("\n");
    	getMenu();
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
    	getDrinks();
    	getFood();
    }

   public void orderItem()
    {
    	int b = 0,c = 0,d = 0; 
    	System.out.println("Which item did you want to order (Food = press 0 | Drink = press 1): ");
        d = scanner.nextInt();
        if(d == 0)
        {
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
    	        order.add(new OrderFood());
    	        for(int j=0;j<order.size();j++)
    	        {
    	   	     if(order.get(j).getName() == null)
                 {  
    	          String name = menuList.get(b-1).getName();
    	          order.get(j).setName(name);
    	          int rate = menuList.get(b-1).getRate();
    	          order.get(j).setRate(rate);
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
    	   for(int j=0;j<order.size();j++)
    	    {
    	      System.out.println(j+1+" "+order.get(j).getName()+" "+order.get(j).getRate());   
    	    }  
           System.out.println("\n Your food is getting ready");
       }

        else
         {
    	  int e = 0;
    	  int f = 0;
    	  do
    	  {
    	    System.out.println("\nHow many drinks did you want to order: ");
    	    int a = scanner.nextInt();

    	    for(int i=0;i<a;i++)
    	    {
    	      System.out.println("Please select your drink ");
    	      e = scanner.nextInt();
    	      if(e <= menuList.size())
    	      {
    	        order.add(new OrderDrink());
    	        for(int j=0;j<order.size();j++)
    	        {
    	         if(order.get(j).getName() == null)
    	         {
    	          String name = menuList.get(e-1).getName();
    	          order.get(j).setName(name);
    	          int rate = menuList.get(e-1).getRate();
                  order.get(j).setRate(rate);
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
          f = scanner.nextInt();
          }
          while(f == 1);

    	   System.out.println("\nYour ordered drinks are");
    	   for(int j=0;j<order.size();j++)
    	   {
    	     System.out.println(j+1+" "+order.get(j).getName()+" "+order.get(j).getRate());   
    	   }  
          System.out.println("\n Your drink is getting ready");   
        }
}

     public void bill()
    {
    	int total = 0;
    	int total1 = 0;
    	int total2 = 0;
    	System.out.println("\n********SILVER STAR HOTEL********");
		System.out.println("********VEG & NON-VEG FAMILY RESTAURANT (A/C)********");
		System.out.println("********CHERPULASSERY********");
		System.out.println("                              ");
		System.out.println("______________________________");
        

       
        for(int i=0;i<order.size();i++)
    	   {
    	     System.out.println(i+1+" "+order.get(i).getName()+" "+order.get(i).getRate());
             total = total + order.get(i).getRate();
           }

            total2 = total + total1;
            System.out.println("Total amount: "+total2);
            System.out.println("\n THANKS U FOR THE VISIT,PLEASE COME AGAIN.....");
            System.out.println("\n ");
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
    			case 1:getMenu();
    			       System.out.println(" "); 
    			       orderItem();
        	           bill();
    			       break;

    			case 2:getMenu();
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
}