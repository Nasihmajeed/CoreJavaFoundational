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
				viewItem();
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
		login();
	}

	public void viewItem()
	{
		ArrayList<Item>product=stock.itemDetail();
		int j=1;
		for (int i=0;i<product.size();i++) 
		{
			System.out.println("product"+j+" : "+product.get(i).getItemName());
			j++;
		}
		System.out.println("Select number pick Product");
		int num=scr.nextInt();
		System.out.println("\n");
		System.out.println(product.get(num-1).getItemName());
		System.out.println("--------------");
		System.out.println(product.get(num-1).getCatogery());
		System.out.println(product.get(num-1).getFeature());

		System.out.println("Cart : 1 or Buy : 2");
		int select=scr.nextInt();
		switch(select)
		{
			case 1:
					cartItem(product.get(num-1));

					break;
			case 2:
					buyItem(product.get(num-1));
					break;
		}
		
		
	}
	public void cartItem(Item product)
	{
		Cart cart=new Cart();
		cart.cartItem(product);
		
	}
	public void buyItem(Item product)
	{
		BillCounter billcounter=new BillCounter();


		billcounter.buyItem(product);
	}
}
