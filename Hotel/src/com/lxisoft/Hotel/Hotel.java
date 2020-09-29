package com.lxisoft.Hotel;
import com.lxisoft.Hotel.Food;
import java.util.Scanner;
public class Hotel
{
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
	public void hotelMenu()
	{
		System.out.println("               MENU OF MARC MARQUEZ               ");
        System.out.print("\n");
        System.out.print("\n");
		Food[] f = new Food[10];
		for(i=0;i<10;i++)
		{
			f[i]= new Food();
		}
		f[0].name=("NAME: Stuffed Paratha ");
		f[0].price=  40  ;
		f[1].name=("NAME: Paalak Panner ");
		f[1].price= 120  ;
		f[2].name=("NAME: Chicken Biriyani ");
		f[2].price= 140  ;
		f[3].name=("NAME: Panner Butter Masala ");
		f[3].price= 130  ;
		f[4].name=("NAME: Masala Dosa ");
		f[4].price= 45  ;
		for(i=0;i<10;i++)
		{
			f[i].printDetails();
		}
	}
}


