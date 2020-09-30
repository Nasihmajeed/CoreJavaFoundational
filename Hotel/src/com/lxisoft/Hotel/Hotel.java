package com.lxisoft.Hotel;
import com.lxisoft.Hotel.Food;
import java.util.Scanner;
public class Hotel
{

	Food[] food = new Food[10];
	public String name;
	public int i,price; 
	public void hotelDetails()
	{
		System.out.println("                HOTEL NAME IS MARC MARQUEZ               ");

		System.out.println(" MARC MARQEZ \n NEAR KELAKKAM BUSSTAND \n KELAKKAM (po) ,KANNUR \n PINCODE :670674");

    	System.out.println(" ABOUT : \n TOP CLASS FOOD \n TOP CLASS SERVICES \n KIND APPROACH TOWARD CUSTOMERS");

    	System.out.println(" CONTACT NUMBER :   160004");
    	System.out.println(" -----------------------##############----------------------- ");
	}
	public void hotelMenu1()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("               MENU OF MARC MARQUEZ               ");
        System.out.print("\n");
        System.out.print("\n");
		
		for(i=0;i<10;i++)
		{
			food[i]= new Food();
		}
		food[0].name=("NAME: Stuffed Paratha ");
		food[0].price=  40  ;
		food[1].name=("NAME: Paalak Panner ");
		food[1].price= 120  ;
		food[2].name=("NAME: Chicken Biriyani ");
		food[2].price= 140  ;
		food[3].name=("NAME: Panner Butter Masala ");
		food[3].price= 130  ;
		food[4].name=("NAME: Masala Dosa ");
		food[4].price= 45  ;
		 for(i=0;i<10;i++)
	    {
	    	food[i].hotelMenu2();
	    }
	}
}


	
