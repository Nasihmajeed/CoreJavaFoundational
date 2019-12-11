package com.lxisoft.test;
import java.util.*; 
import java.io.*; 
import com.lxisoft.hotelproject.*;
public class TDD
{
	public static void main(String[] arg)
	{						
		Hotel hotel=new Hotel();
		hotel.food=new ArrayList<Food>();	
		hotel.stock=new ArrayList<Stock>();
		System.out.println("\t\t\t......A2z......\t\t\t");
		try
		{
			int d=1;	
			while(d<=6)
			{
				Scanner sc=new Scanner(System.in);	
				System.out.println("\n\tMENU  \n1.Add Food \n2.Add Stock \n3.Print Bill \n4.Display Food \n5.Display Stock \n ");
				int menu=sc.nextInt();			
				switch (menu)
				{
					case 1: hotel.addFood(); break;				
					case 2: hotel.addStock(hotel.food); break;
					case 3: hotel.printBill(); break;
					case 4: hotel.display(); break;			
					case 5: hotel.displayStock(); break;			
				}
			}d++;
		}
		catch(Exception e)
		{
			System.out.println("Exception"+e);
		}	
	}	
}

				










