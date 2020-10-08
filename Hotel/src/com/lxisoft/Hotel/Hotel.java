package com.lxisoft.Hotel;
import com.lxisoft.Hotel.Food;
import java.util.ArrayList;
import java.util.Scanner;
public class Hotel
{
    ArrayList<FoodandDrinksItem>  menu = new ArrayList<FoodandDrinksItem>();
    ArrayList<OrderItem> order = new ArrayList<OrderItem>();
    Scanner scanner = new Scanner(System.in);
	public String name;
	public int price,a,b=0,c=0,total=0,total1=0,total2=0,index;

	public void hotelDetails()
	{
		System.out.println("                HOTEL NAME IS MARC MARQUEZ               ");

		System.out.println(" MARC MARQEZ \n NEAR KELAKKAM BUSSTAND \n KELAKKAM (po) ,KANNUR \n PINCODE :670674");

    	System.out.println(" ABOUT : \n TOP CLASS FOOD \n TOP CLASS SERVICES \n KIND APPROACH TOWARD CUSTOMERS");

    	System.out.println(" CONTACT NUMBER :   160004");
    	System.out.println(" -----------------------##############----------------------- ");
	}
	public void setHotelMenu()
	{
		System.out.println("               MENU OF MARC MARQUEZ               ");
        System.out.print("\n");
        System.out.print("\n");
		
        menu.add(new Food());
		menu.get(0).setName("StuffedParatha");
		menu.get(0).setPrice(  40  );
		menu.add(new Food());
		menu.get(1).setName("PaalakPanner");
		menu.get(1).setPrice( 120  );
		menu.add(new Food());
		menu.get(2).setName("ChickenBiriyani");
		menu.get(2).setPrice( 140  );
		menu.add(new Food());
		menu.get(3).setName("PannerButterMasala");
		menu.get(3).setPrice( 130  );
		menu.add(new Food());
		menu.get(4).setName("MasalaDosa");
		menu.get(4).setPrice( 45  );
		menu.add(new Drinks());
		menu.get(5).setName("LimeJuice");
        menu.get(5).setPrice( 25  );
		menu.add(new Drinks());
        menu.get(6).setName("OrangeJuice");
		menu.get(6).setPrice( 35 );
		menu.add(new Drinks());
        menu.get(7).setName("AppleJuice");
		menu.get(7).setPrice( 35  );
		menu.add(new Drinks());
		menu.get(8).setName("MangoJuice");
		menu.get(8).setPrice( 35  );
		 for(int i=0;i<menu.size();i++)
	    {
	    	System.out.print("\n"+(i+1)+" "+menu.get(i).getName()+"\n"+"$"+menu.get(i).getPrice());
	    	System.out.print("\n");
            System.out.println(" -----------------------##############----------------------- ");
              System.out.print("\n"); 

	    }
	}
	public void getMenu()
	{
		 for(int i=0;i<menu.size();i++)
	    {
	    	System.out.print("\n"+(i+1)+" "+menu.get(i).getName()+"\n"+"$"+menu.get(i).getPrice());
	    	System.out.print("\n");
            System.out.println(" -----------------------##############----------------------- ");
              System.out.print("\n"); 
	    }

	}
	public void getAddedFood()
	{
		System.out.print("\n           EDITED MENU OF MAR MARQUEZ           ");
		System.out.print("\n");
		for(int i=0;i<menu.size();i++)
		{
			if(menu.get(i) instanceof Food)
			{
				System.out.print((i+1)+" "+menu.get(i).getName()+"\n"+"$"+menu.get(i).getPrice());
			    System.out.print("\n");
                System.out.println(" -----------------------##############----------------------- ");
                System.out.print("\n"); 
			}
		}
	}
	public void getAddedDrinks()
	{
		System.out.print("\n           EDITED MENU OF MAR MARQUEZ           ");
		System.out.print("\n");
		for(int i=0;i<menu.size();i++)
		{
			if(menu.get(i) instanceof Drinks)
			{
				System.out.print((i+1)+" "+menu.get(i).getName()+"\n"+"$"+menu.get(i).getPrice());
			    System.out.print("\n");
                System.out.println(" -----------------------##############----------------------- ");
                System.out.print("\n"); 
			}
		}
	}
	public void searchItems()
	{
		String name;
		int o=0,k=0;
		Scanner scanner = new Scanner(System.in); 
		System.out.println("           SEARCH OPTION           ");
		System.out.println(" --------------------------------- ");
   		System.out.println("ENTER THE NAME OF THE FOOD ITEM YOU WANT TO SEARCH :");
        name = scanner.next();
        for(int i=0;i<menu.size();i++)
        {
        	if(name.equals(menu.get(i).getName()))
        	{
        		o=i;
        		System.out.println("THE LOCATION OF THE FOOD IS :"+(i+1));
        		System.out.print("\n");
        		System.out.println("           UPDATE OPTION          ");
        		System.out.println(" --------------------------------- ");
        		System.out.println(" IF YOU WANT TO UPDATE PRESS 1 IF NOT THEN PRESS 0 ");
                k = scanner.nextInt();
        		if(k==1)
        		{
        			System.out.println(" ENTER THE PRICE OF THE FOOD :");
        			int price = scanner.nextInt();
        			menu.get(o).setPrice(price);
        		 for(int j=0;j<menu.size();j++)
	             {
	    	        System.out.print("\n"+(j+1)+" "+menu.get(j).getName()+"\n"+"$"+menu.get(j).getPrice());
	    	        System.out.print("\n");
                    System.out.println(" -----------------------##############----------------------- ");
                    System.out.print("\n"); 
	             }
        		}
        	}
        }
        System.out.print("\n");

	}

	public void admin()
	{  
	    System.out.println(" IF YOU WANT TO ADD FOOD PRESS 0 AND IF YOU WANT TO ADD DRINKS THEN PRESS 1 ");
	    c = scanner.nextInt();
    	System.out.println(" ----------------------------------------------------------------------------- ");
    	if(c==0)
       {
    		System.out.print(" HOW MANY FOOD YOU WANT ADD: ");
		    index = scanner.nextInt();
		    index = index + menu.size();
		 for(int i=menu.size();i<index;i++)
		 {
			menu.add(new Food());
			System.out.print("\n Enter the Name of the Food : Name :");
			menu.get(i).setName(scanner.next());
			System.out.print("\n Enter the Price of the Food :  ");
			menu.get(i).setPrice(scanner.nextInt());
		 }
		    System.out.print("\n");
		    getAddedFood();
		}
		 else
	   {
				System.out.print(" HOW MANY DRINKS YOU WANT ADD: ");
		    index = scanner.nextInt();
		    index = index + menu.size();
		 for(int i=menu.size();i<index;i++)
		 {
			menu.add(new Drinks());
			System.out.print("\n Enter the Name of the Drinks : Name :");
			menu.get(i).setName(scanner.next());
			System.out.print("\n Enter the Price of the Drinks :  ");
			menu.get(i).setPrice(scanner.nextInt());
		 }
		    System.out.print("\n");
		    getAddedDrinks();
		}	
	}

	public void orderItem()
	{
		 int e=0;
		 int d=0;
		 System.out.println(" WHAT YOU WANT TO ORDER, IF FOOD PRESS 0 AND IF DRINKS THEN PRESS 1 ");
		 e = scanner.nextInt();
	 if(e==0)
	 {
		 	System.out.println(" HOW MANY FOOD ITEM DID YOU WANT TO HAVE : ");
		    a=scanner.nextInt();
		  for(int i=0;i<a;i++)
		 {
			System.out.println(" PLEASE ENTER YOU FOOD : ");
			b=scanner.nextInt();
			if(b <= menu.size())
			{
				order.add(new OrderFood());
				for(int j=0;j<order.size();j++)
				{ 
					if(order.get(j).getName() == null)
					{
						String name  = menu.get(b-1).getName();
						order.get(j).setName(name);
						int price = menu.get(b-1).getPrice();
						order.get(j).setPrice(price);
					}
				}
			}
			else 
			{
			  System.out.println("  please select valid option");
			  System.out.println(" \n ");
			  break;
			}
		 }
			System.out.println(" \n YOUR ORDERED FOOD IS/ARE : ");
			for(int j=0;j<order.size();j++)
			{
				System.out.println("\n"+(j+1)+" "+order.get(j).getName()+"\n"+"$"+order.get(j).getPrice());
			}
		 System.out.println("           PLEASE WAIT FOR MOMMENT YOUR FOOD IS/ARE ON THE WAY           ");
		 System.out.println("---------------------------------------------------------------------");
		 System.out.print("\n");
	 }
	 else
	 {
	 	System.out.println(" HOW MANY DRINKS DID YOU WANT TO HAVE : ");
		    a=scanner.nextInt();
		  for(int i=0;i<a;i++)
		 {
			System.out.println(" PLEASE ENTER YOU DRINKS : ");
			d=scanner.nextInt();
			if(d <= menu.size())
			{
				order.add(new OrderDrinks());
				for(int j=0;j<order.size();j++)
				{ 
					if(order.get(j).getName() == null)
					{
						String name  = menu.get(d-1).getName();
						order.get(j).setName(name);
						int price = menu.get(d-1).getPrice();
						order.get(j).setPrice(price);
					}
				}
			}
			else 
			{
			  System.out.println("  please select valid option");
			  System.out.println(" \n ");
			  break;
			}
		 }
			System.out.println(" \n YOUR ORDERED DRINKS IS/ARE : ");
			for(int j=0;j<order.size();j++)
			{
				System.out.println("\n"+(j+1)+" "+order.get(j).getName()+"\n"+"$"+order.get(j).getPrice());
			}
		 System.out.println("           PLEASE WAIT FOR MOMMENT YOUR DRINKS IS/ARE ON THE WAY           ");
		 System.out.println("---------------------------------------------------------------------");
		 System.out.print("\n");
	 }      
	}
	public void bill()
	{
       	System.out.println("                HOTEL MARC MARQUEZ               ");
       	System.out.println(" ---------------------BILL---------------------- ");
    	System.out.println(" --------------------******--------------------- ");

		System.out.println(" MARC MARQEZ \n NEAR KELAKKAM BUSSTAND \n KELAKKAM (po) ,KANNUR \n PINCODE :670674");

		System.out.println(" CONTACT NUMBER :   160004");

    	
    	for(int i=0;i<order.size();i++)
    	{
    	System.out.println("\n"+(i+1)+" "+order.get(i).getName()+"\n"+"$"+order.get(i).getPrice());
    	total = total + order.get(i).getPrice();
    	}
    	total2 = total + total1;
    	System.out.println(" Total Bill is : "+total2);
    	System.out.print("\n");
    	System.out.print("              VIST AGAIN           ");
    	System.out.print("\n");
    	System.out.print("            HAVE A GREAT DAY           ");
    	System.out.print("\n");
    	System.out.print("          THANK YOU FOR COMING           ");
    	System.out.print("\n");
    	System.out.println(" ---------------------------------------------- ");
	}
}


	
