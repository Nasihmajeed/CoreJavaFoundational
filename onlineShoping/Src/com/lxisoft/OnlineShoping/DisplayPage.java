package com.lxisoft.OnlineShoping;
import java.util.*;
import com.lxisoft.OnlineShoping.Item;
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
	ArrayList<User> usrers=new ArrayList<User>();
	ArrayList<Item>products=new ArrayList<Item>();
	public void login()
	{
		ArrayList<String>log=new ArrayList<String>();
		ArrayList<String> logDet=userLogin.getUserLogin();
		usrers=userLogin.getUserSignup();
		userLogin.setUserLogin(log);
		for(int i=0;i<usrers.size();i++)
		{
			if (logDet.get(0).equals(usrers.get(i).getName())) 
			{
				System.out.println("Login done");
				this.viewItem();
			}
			else if (!logDet.get(0).equals(usrers.get(i).getName())) 
			{
				System.out.println("Login faild");
				userLogin.setUserSignup();
			}
			
		}
		
		
	}
	public void signup()
	{
		userLogin.setUserSignup();
		this.login();
	}

	public void viewItem()
	{
		products=stock.itemDetail();
		int j=1;
		for (int i=0;i<products.size();i++) 
		{
			System.out.println("products"+j+" : "+products.get(i).getItemName());
			j++;
		}
		System.out.println("Select number pick Product");
		int num=scr.nextInt();
		System.out.println("\n");
		System.out.println(products.get(num-1).getItemName());
		System.out.println("--------------");
		System.out.println(products.get(num-1).getCatogery());
		System.out.println(products.get(num-1).getFeature());

		System.out.println("Cart : 1 or Buy : 2");
		int select=scr.nextInt();
		switch(select)
		{
			case 1:
					cartItem(products.get(num-1));

					break;
			case 2:
					buyItem(products.get(num-1));
					break;
		}
		
		
	}
	public void cartItem(Item products)
	{
		Cart cart=new Cart();
		cart.cartItem(products);
		
	}
	public void buyItem(Item products)
	{
		BillCounter billcounter=new BillCounter();


		billcounter.buyItem(products);
	}
}
