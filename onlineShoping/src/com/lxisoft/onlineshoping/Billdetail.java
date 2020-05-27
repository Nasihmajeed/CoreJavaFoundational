package com.lxisoft.onlineshoping;
import com.lxisoft.onlineshoping.DisplayPage;
import com.lxisoft.onlineshoping.Item;
import com.lxisoft.onlineshoping.FileOperation;
import com.lxisoft.onlineshoping.BuyDetail;
import com.lxisoft.onlineshoping.PaymentDetail;
import java.lang.Math;
import java.util.Scanner;
import java.util.*;
public class BillDetail extends Detail implements PaymentMethod
{
	private int productID;
	private ArrayList<Item> purchasedItems=new ArrayList<Item>();
	private Scanner scr=new Scanner(System.in);
	public void purchasedBillDetail(Item product,User user)
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