package com.lxisoft.onlineshoping;
import com.lxisoft.onlineshoping.Item;
import java.lang.Math;
import java.util.*;
public class Billdetail 
{
	public void purchasedBillDetail(Item item,Customer customer)
	{
		
		int date=(int)(Math.random()*30)+1;
		int month=(int)(Math.random()*11)+1;
		int time=(int)(Math.random()*11)+1;
		System.out.println("------ Estimate Deliver ------");
		System.out.println("\n");
		System.out.println("Product will Deliver : "+date+" / "+month+" / 2020\nTime : "+time+".00");
		System.out.println("Estimate address");
		System.out.println("Customer Name : "+customer.getName());
		System.out.println("address 	  : "+customer.getAddress());
		System.out.println("Product 	  : "+item.getItemName()+" , "+item.getCatogery());
		System.out.println("price 	  : "+item.getPrice());
	}
	
	
	
}