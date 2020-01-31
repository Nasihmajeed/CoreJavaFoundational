package com.lxisoft.hotel;
import com.lxisoft.user.*;
import com.lxisoft.hotel.*;
import java.util.*;
public class Order
{
public int quantity;
public int choise,temp,totl;
static Scanner input =new Scanner(System.in);
public void creatOrder(Menu menu)
{		
	
			System.out.println("\nEnter the item = ");
			int choise=input.nextInt();
			temp=choise;
			if(choise<=menu.food.length)
			{
			System.out.println("\nEnter the Quantity of "+menu.food[choise].name+" = ");
			quantity=input.nextInt();
			menu.food[choise].qnty=(menu.food[choise].qnty-quantity);
			totl= quantity*menu.food[choise].rate;
			System.out.println("\nYour Oredr of "+menu.food[choise].name+" Was Sucess full");
			System.out.println("\nTotal Amount ="+quantity+" * "+menu.food[choise].rate+" = "+totl+".Rs");

			}
		

}

public void displayOrder(Menu menu,String name)
{

		System.out.println("\n   Oredr of "+menu.food[temp].name);
		int totl= quantity*menu.food[temp].rate;
		System.out.println("\nTotal Amount ="+(quantity+" * "+menu.food[temp].rate)+" = "+totl+".Rs");


}


}