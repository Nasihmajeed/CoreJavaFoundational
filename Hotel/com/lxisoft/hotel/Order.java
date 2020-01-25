package com.lxisoft.hotel;
import com.lxisoft.user.*;
import com.lxisoft.hotel.*;
import java.util.*;
public class Order
public User user;
{
public int quantity;
void creatOrder()
{			user=new User();
			System.out.println("\nEnter the Quantity of "+menu.food[order].name+" = ");
			user.quantity=input.nextInt();
			int totl= user.quantity*menu.food[order].rate;
			System.out.println("\nYour Oredr of "+menu.food[order].name+" Was Sucess full");
			System.out.println("\nTotal Amount ="+user.quantity+" * "+menu.food[order].rate+" = "+totl+".Rs");
		}
}