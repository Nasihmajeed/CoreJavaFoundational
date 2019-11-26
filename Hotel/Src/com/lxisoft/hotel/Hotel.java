package com.lxisoft.hotel;
import java.util.Scanner;
import com.lxisoft.hotel.Veg;
import com.lxisoft.hotel.Nonveg;
import java.util.*;
import java.io.*;
public class Hotel
{
	Food[] food=new Food[10];
	

	public void setdetails()
	{

		System.out.println("     -----HOTEL PAN-----");
		Food biriyani=new Biriyani();
		biriyani.count=4;
		food[1]=biriyani;

		
		Food vegmeals=new Vegmeals();
		vegmeals.count=4;
		food[2]=vegmeals;
		
		Menu menu=new Menu();
		menu.printdetails();
		Scanner scr=new Scanner(System.in);
		System.out.println("Do you want to order food");
		char ltr=scr.next(). charAt(0);
		if("y".charAt(0) == ltr)
		{
			try
			{
				System.out.println("Select your item :");
				int num=scr.nextInt();
				
				switch (num)
				{
									
					case 1:			
								biriyani.type();
								if(biriyani instanceof Food)
					    		{
					    			Biriyani b=(Biriyani) biriyani;
					    			b.nonveg();

					    		}
					    		biriyani.count=biriyani.count-1;
								
						break;
					case 2:	
							
								vegmeals.type();
								if(vegmeals instanceof Food)
					    		{
					    			Vegmeals v=(Vegmeals) vegmeals;
					    			v.vegitarien();	
					    		}
					    		vegmeals.count=vegmeals.count-1;
						break;				
							
				}

							throw new NullPointerException();

			}
			catch(NullPointerException e)
			{
				System.out.println("Invalid item number");
			}
		}
	}
}