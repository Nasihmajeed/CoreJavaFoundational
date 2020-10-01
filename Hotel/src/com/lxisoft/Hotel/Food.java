package com.lxisoft.Hotel;
import com.lxisoft.Hotel.OrderFood;
import java.util.Scanner;
public  class Food

{
	int i;
	String name;
	int price;
	public void hotelMenu2()
	{
	   Scanner scanner = new Scanner(System.in);
	   System.out.print(name+"\n"+"$"+price);
       System.out.print("\n");
       System.out.println(" -----------------------##############----------------------- ");
       System.out.print("\n"); 
	}
	public void order()
	{
		OrderFood[] order= new OrderFood[10];
	    for(i=0;i<10;i++)
	    {
	    order[i]=new OrderFood();
        order[i].orderItem(); 
	    } 
	}	
}
