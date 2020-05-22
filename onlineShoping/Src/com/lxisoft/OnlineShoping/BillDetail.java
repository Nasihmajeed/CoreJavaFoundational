package com.lxisoft.OnlineShoping;
import com.lxisoft.OnlineShoping.DisplayPage;
import com.lxisoft.OnlineShoping.Item;
import com.lxisoft.OnlineShoping.FileOperation;
import com.lxisoft.OnlineShoping.BuyDetail;
import com.lxisoft.OnlineShoping.PaymentDetail;
import java.lang.Math;
import java.util.Scanner;
import java.util.*;
public class BillDetail extends Detail implements PaymentDetail
{
	int productID;
	ArrayList<Item> purchasedItems=new ArrayList<Item>();
	Item item;
	FileOperation fo=new FileOperation();
	BuyDetail bd;
	Scanner scr=new Scanner(System.in);
	public void buyProduct(Item product,User user)
	{
		
		fo.purchasedItemDetail(product,user);
	}
	public void buyDetails(Item product,User user)
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
	public void vewBuyDetail(User user)throws Exception 
	{
		

		ArrayList<BuyDetail> purchasedItem= fo.viewBuyDetail(user,bd);

		System.out.println("Customer : "+purchasedItem.get(0).getCustomer());
		int j=1;
		for (int i=0;i<purchasedItem.size();i++) 
		{
			
				System.out.println("Customer : "+purchasedItem.get(i).getCustomer());
				System.out.println("product "+j+" : "+purchasedItem.get(i).getPurchasedItem());
				System.out.println("Catogery : "+purchasedItem.get(i).getCatogery());
				System.out.println("Price : "+purchasedItem.get(i).getPrice());
			j++;
		}
		
	}
	public void cashOnDelivery()
	{
		System.out.println("Done it will be deliver");
	}
	public void payOnline()
	{
		System.out.println("select Bank : ");
		System.out.println("south indian bank : 1 , indian bank: 2 , canara bank : 3 ");
		int slct=scr.nextInt();

		switch(slct)
		{
			case 1:
					System.out.println("South INDIAN Bank");
			case 2:
					System.out.println("INDIAN Bank");
			case 3:
					System.out.println("Canara Bank");
		}

		System.out.println("Bank Id : ");
		String id=scr.next();

		System.out.println("Bank pasword : ");
		String password=scr.next();
	}
}