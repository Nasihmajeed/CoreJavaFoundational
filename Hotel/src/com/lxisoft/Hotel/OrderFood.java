package com.lxisoft.Hotel;
import java.util.Scanner;
public class OrderFood
{
	 String name;
    int price,i;
    int a,b=0,c=0;
    

  public void orderItem()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println(" HOW MANY FOOD ITEM DID YOU WANT TO HAVE : ");
		a=scanner.nextInt();
		for(i=0;i<a;i++)
		{
			System.out.println(" PLEASE ENTER YOU FOOD : ");
			b=scanner.nextInt();
			if(b<=10)
			{
				for(i=0;i<a;i++)
				{ 
					Hotel h = new Hotel();
					Food[] food = new Food[10];
					if(h.food[i].name==null)
					{
						String name  = h.food[i].name;
						food[i].hotelMenu2();
						int price = h.food[i].price;
						food[i].hotelMenu2();
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
		System.out.println(" For Re-order Press 0 / For Ordered Menu Press 1 : ");
		c=scanner.nextInt();
		while(c==0)
			System.out.println(" \n YOUR ORDERED FOOD ARE : ");
			for(i=0;i<a;i++)
			{
				System.out.println(name+"\n"+"$"+price);
			}
		System.out.println("           PLEASE WAIT FOR MOMMENT YOUR FOOD IS ON THE WAY           ");
	}
}