package com.lxisoft.Hotel;
import java.util.Scanner;
public class OrderFood
{
	 String name;
    int price,i;

  public void orderItem()
	int a,b=0,c=0;
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
					if(Hotel.food[i].name==null)
					{
						String name  = Hotel.food[i].name;
						Hotel.food[i].name;
						int price = Hotel.food[i].price;
						Hotel.food[i].price;
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
				System.out.print(Hotel.food[i].name+Hotel.food[i].price);
			}
		System.out.println("           PLEASE WAIT FOR MOMMENT YOUR FOOD IS ON THE WAY           ");
	}
}