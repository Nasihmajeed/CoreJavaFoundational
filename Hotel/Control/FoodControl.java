package com.lxisoft.hotelproject;
import com.lxisoft.hotelproject.*;
import java.util.ArrayList; 
public class FoodControl
{	
	private int id;
	private String foodType;
	private int foodPrice;	
	private  int foodQuantity;
	Biriyani biriyani;
	Dosa dosa;
	Shake shake;	
	public void addFood()
	{
		try
		{
			System.out.println("\nWhich type of food you want to add");
			int d=1;	
			while(d<=5)
			{		
				System.out.println("\n 1.Biriyani \n 2.Dosa \n 3.Shake \n");
				int item=sc.nextInt();		
				switch(item)
				{
					case 1: addBiriyani(); break;
					case 2: addDosa(); break;
					case 3: addShake(); break;			
					default:				
				}d++;		
				System.out.println("Do you want to continue 1.No 2.Yes");
				int y=sc.nextInt();            			
				if (y==1)
				{
					break;
				}
				else
				{
					continue;
				}			
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Error in input value");
		}			
	}	
	public void addBiriyani()
	{
		System.out.println("Which type biriyani you want to add");
		Food biriyani=new Biriyani();
		//System.out.println(biriyani);
		biriyani.setName(sc.next());
		System.out.println("food price");
		biriyani.setPrice(sc.nextInt());	
		System.out.println("Biriyani ID");
		biriyani.setId(sc.nextInt());	
		food.add(biriyani);
		fr.addwriter(food);
		fr.readFile();
				
	}
	public void addDosa()
	{
		System.out.println("Which type dosa you want to add");				
		Food dosa=new Dosa();
		dosa.setName(sc.next());
		System.out.println("food price");
		dosa.setPrice(sc.nextInt());
	 	System.out.println("Dosa ID");
		dosa.setId(sc.nextInt());						
		food.add(dosa);
		fr.addwriter(food);
 		fr.readFile();
	}
	public void addShake()
	{
		System.out.println("Which type shake you want to add");
		Food shake=new Shake();
		shake.setName(sc.next());
		System.out.println("food price");
		shake.setPrice(sc.nextInt());				
		System.out.println("Shake ID");
		shake.setId(sc.nextInt());			
		food.add(shake);
		fr.addwriter(food);
		fr.readFile();
		
	}    
	
}
 