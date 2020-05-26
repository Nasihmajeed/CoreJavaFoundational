package com.lxisoft.OnlineShoping;
import com.lxisoft.OnlineShoping.DisplayPage;
import com.lxisoft.OnlineShoping.Item;
import com.lxisoft.OnlineShoping.FileOperation;
import com.lxisoft.OnlineShoping.BuyDetail;
import com.lxisoft.OnlineShoping.PaymentDetail;
import java.lang.Math;
import java.util.Scanner;
import java.util.*;
public class BillDetail extends Detail implements PaymentMethod
{
	int productID;
	ArrayList<Item> purchasedItems=new ArrayList<Item>();
	Item item;
	
	
	Scanner scr=new Scanner(System.in);
	
	
	public void billDetail(Item product,User user)
	{
		int date=(int)(Math.random()*30)+1;
		int month=(int)(Math.random()*11)+1;
		int time=(int)(Math.random()*11)+1;
		System.out.println("------ Estimate Deliver ------");
		System.out.println("\n");
		System.out.println("Product will Deliver : "+date+" / "+month+" / 2020\nTime : "+time+".00");
		System.out.println("Estimate address");
		System.out.println("Customer Name : "+user.getName());
		System.out.println("address 	  : "+user.getAddress());
		System.out.println("Product 	  : "+product.getItemName()+" , "+product.getCatogery());
		System.out.println("price 	  : "+product.getPrice());
	}
	
	
	
}