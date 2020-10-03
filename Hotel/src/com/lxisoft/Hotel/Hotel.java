package com.lxisoft.Hotel;
import com.lxisoft.Hotel.Food;
import java.util.ArrayList;
import java.util.Scanner;
public class Hotel
{
    ArrayList<Food> food = new ArrayList<Food>();
    ArrayList<OrderFood> order = new ArrayList<OrderFood>();
    Scanner scanner = new Scanner(System.in);
	public String name;
	public int i,price,a,b=0,c=0,j,total=0,total1=0,total2=0,index;

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
		
        food.add(new Food());
		food.get(0).setName(" Stuffed Paratha ");
		food.get(0).setPrice(  40  );
		food.add(new Food());
		food.get(1).setName(" Paalak Panner ");
		food.get(1).setPrice( 120  );
		food.add(new Food());
		food.get(2).setName(" Chicken Biriyani ");
		food.get(2).setPrice( 140  );
		food.add(new Food());
		food.get(3).setName(" Panner Butter Masala ");
		food.get(3).setPrice( 130  );
		food.add(new Food());
		food.get(4).setName(" Masala Dosa ");
		food.get(4).setPrice( 45  );
		 for(i=0;i<food.size();i++)
	    {
	    	System.out.print("\n"+(i+1)+" "+food.get(i).getName()+"\n"+"$"+food.get(i).getPrice());
	    	System.out.print("\n");
            System.out.println(" -----------------------##############----------------------- ");
            System.out.print("\n"); 

	    }  
	}
	public void getAddedFood()
	{
		System.out.print("\n           EDITED MENU OF MAR MARQUEZ           ");
		System.out.print("\n");
		for(i=0;i<food.size();i++)
		{
			if(food.get(i) instanceof Food)
			{
				System.out.print((i+1)+" "+food.get(i).getName()+"\n"+"$"+food.get(i).getPrice());
			    System.out.print("\n");
                System.out.println(" -----------------------##############----------------------- ");
                System.out.print("\n"); 
			}
		}

	}
	public void admin()
	{
		Scanner scanner = new Scanner(System.in);
	    System.out.println(" IF YOU WANT TO ADD FOOD PRESS HOW MANY FOOD ITEM DID YOU WANT OR ELSE PRESS 0 ");
    	System.out.println(" ----------------------------------------------------------------------------- ");
		System.out.print(" HOW MANY FOOD YOU WANT ADD: ");
		index = scanner.nextInt();
		index = index + food.size();
		for(i=food.size();i<index;i++)
		{
			food.add(new Food());
			System.out.print("\n Enter the Name of the Food : Name :");
			food.get(i).setName(scanner.next());
			System.out.print("\n Enter the Price of the Food :  ");
			food.get(i).setPrice(scanner.nextInt());
		}
		System.out.print("\n");
		getAddedFood();
	}

	public void orderFood()
	{
		System.out.println(" HOW MANY FOOD ITEM DID YOU WANT TO HAVE : ");
		a=scanner.nextInt();
		for(i=0;i<a;i++)
		{
			System.out.println(" PLEASE ENTER YOU FOOD : ");
			b=scanner.nextInt();
			if(b <= food.size())
			{
				order.add(new OrderFood());
				for(j=0;j<order.size();j++)
				{ 
					if(order.get(j).getName() == null)
					{
						String name  = food.get(b-1).getName();
						order.get(j).setName(name);
						int price = food.get(b-1).getPrice();
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
			System.out.println(" \n YOUR ORDERED FOOD ARE : ");
			for(j=0;j<order.size();j++)
			{
				System.out.println("\n"+(j+1)+" "+order.get(j).getName()+"\n"+"$"+order.get(j).getPrice());
			}
		System.out.println("           PLEASE WAIT FOR MOMMENT YOUR FOOD IS ON THE WAY           ");
		System.out.println("---------------------------------------------------------------------");
		System.out.print("\n");
           
	}
	public void bill()
	{
       	System.out.println("                HOTEL MARC MARQUEZ               ");
       	System.out.println(" ---------------------BILL---------------------- ");
    	System.out.println(" --------------------******--------------------- ");

		System.out.println(" MARC MARQEZ \n NEAR KELAKKAM BUSSTAND \n KELAKKAM (po) ,KANNUR \n PINCODE :670674");

		System.out.println(" CONTACT NUMBER :   160004");

    	
    	for(i=0;i<order.size();i++)
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


	
