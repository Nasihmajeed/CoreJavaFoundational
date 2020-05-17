package com.lxisoft.OnlineShoping;
import java.util.*;
import com.lxisoft.OnlineShoping.Item;
import com.lxisoft.OnlineShoping.FileOperation;
import com.lxisoft.OnlineShoping.User;
import com.lxisoft.OnlineShoping.Stock;
import com.lxisoft.OnlineShoping.Cart;
import com.lxisoft.OnlineShoping.BillCounter;
import java.util.Scanner;
public class DisplayPage
{
	Scanner scr=new Scanner(System.in);
	User user;
	Stock stock=new Stock();
	Login userLogin=new Login();
	FileOperation fo=new FileOperation();
	ArrayList<Item>products=new ArrayList<Item>();
	public void login()throws Exception 
	{
		ArrayList<User> usrers=fo.readUserDetails(user);
		ArrayList<String>log=new ArrayList<String>();
		ArrayList<String> logDet=userLogin.getUserLogin();
		System.out.println("       Yellow.coM");
		System.out.println("      ------------");
		userLogin.setUserLogin();
		System.out.println(" Name : "+logDet.get(0));
		int ur=0;
		for(int i=0;i<usrers.size();i++)
		{
			//System.out.println("       Name : "+usrers.get(i).getName());
			if (logDet.get(0).equals(usrers.get(i).getName())) 
			{
				System.out.println("       Login done");
				this.viewItem(usrers.get(i).getName());
				ur=i;

			}
			/*else 
			{
				System.out.println("       Login faild");
				userLogin.setUserSignup();
			}*/
			
			
		}
		if(!logDet.get(0).equals(usrers.get(ur).getName()))
		{
				System.out.println("       Login faild");
				userLogin.setUserSignup();
		}
		
	}
	public void signup()throws Exception 
	{
		userLogin.setUserSignup();
		this.login();
	}

	public void viewItem(String name)throws Exception 
	{
		products=stock.itemDetail();
		int j=1;
		for (int i=0;i<products.size();i++) 
		{
			System.out.println("       products"+j+" : "+products.get(i).getItemName());
			j++;
		}
		selectItem(products,name);
	}
	public void selectItem(ArrayList<Item>products,String name)
	{
		System.out.println("          Select number pick Product");
		int num=scr.nextInt();
		System.out.println("\n");
		System.out.println("       "+products.get(num-1).getItemName());
		System.out.println("          --------------");
		System.out.println(       products.get(num-1).getCatogery());
		System.out.println(       products.get(num-1).getFeature());
		System.out.println("       Price ₹ : "+products.get(num-1).getPrice());
		int s=0;
		for (int k=0;k<products.size();k++) 
		{
			if(products.get(num-1).getCatogery().equals(products.get(k).getCatogery()) && !products.get(num-1).getItemName().equals(products.get(k).getItemName()))
			{
				System.out.println("\n");
				System.out.println("Relative Products");
				System.out.println("------------------");
				System.out.println(products.get(k).getItemName());
				System.out.println(products.get(k).getCatogery());
				int discount=products.get(k).getPrice()-products.get(k).getPrice()*20/100;
				System.out.println("Price ₹"+products.get(k).getPrice()+"  20% Discount : ₹ "+discount);
				s=k;
			}
		}
		//System.out.println();
		System.out.println("Cart : 1  Buy : 2 ");
		int select=scr.nextInt();
		switch(select)
		{
			case 1:
					cartItem(products.get(num-1),name);

					break;
			case 2:
					buyItem(products.get(num-1));
					break;
			
		}
		
		
	}
	public void cartItem(Item products,String name)
	{
		Cart cart=new Cart();
		cart.cartItem(products,name);
		
	}
	public void buyItem(Item products)
	{
		BillCounter billcounter=new BillCounter();


		billcounter.buyItem(products);
	}
}
