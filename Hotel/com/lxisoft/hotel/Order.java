package com.lxisoft.hotel;
import com.lxisoft.user.*;
import com.lxisoft.hotel.*;
import java.util.*;
public class Order
{
public int quantity;
public int choise,temp;
static Scanner input =new Scanner(System.in);
public void creatOrder(Menu menu)
{				//System.out.println(""+menu.food.length);
			System.out.println("\nEnter the choise Choise = ");
			int choise=input.nextInt();
			temp=choise;
			if(choise<=menu.food.length)
			{
			System.out.println("\nEnter the Quantity of "+menu.food[choise].name+" = ");
			quantity=input.nextInt();
			int totl= quantity*menu.food[choise].rate;
			System.out.println("\nYour Oredr of "+menu.food[choise].name+" Was Sucess full");
			System.out.println("\nTotal Amount ="+quantity+" * "+menu.food[choise].rate+" = "+totl+".Rs");

			}

}

public void displayOrder(Menu menu,String name)
{
		System.out.println("\n      User = "+name);
		System.out.println("\n   Oredr of "+menu.food[temp].name);
		int totl= quantity*menu.food[temp].rate;
		System.out.println("\nTotal Amount ="+(quantity+" * "+menu.food[temp].rate)+" = "+totl+".Rs");


}


}