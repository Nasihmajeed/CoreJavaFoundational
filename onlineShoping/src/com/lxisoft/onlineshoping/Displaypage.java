package com.lxisoft.OnlineShoping;
import java.util.*;
import com.lxisoft.OnlineShoping.Item;
import com.lxisoft.repository.FileOperation;
import com.lxisoft.OnlineShoping.User;
import com.lxisoft.OnlineShoping.Stock;
import com.lxisoft.properties.Cart;
import com.lxisoft.OnlineShoping.BillDetail;
import java.lang.Math;
import java.util.Scanner;
public class DisplayPage
{
	Scanner scr=new Scanner(System.in);
	User user;
	Stock stock=new Stock();
	Login userLogin=new Login();
	FileOperation fo=new FileOperation();
	ArrayList<Item>products=new ArrayList<Item>();
	Cart cart=new Cart();
	BillDetail billDetail;
	public void login()throws Exception 
	{
		ArrayList<User> usrers=fo.readUserDetails(user);
		ArrayList<String>log=new ArrayList<String>();
		ArrayList<String> logDet=userLogin.getUserLogin();
		System.out.println("       Yellow.coM");
		System.out.println("      ============");
		userLogin.setUserLogin();
		System.out.println(" Name : "+logDet.get(0));
		int ur=0;
		for(int i=0;i<usrers.size();i++)
		{
			
			if (logDet.get(0).equals(usrers.get(i).getName())) 
			{
				System.out.println("       Login done");
				products=stock.itemDetail();
				this.viewItem(usrers.get(i),products);
				ur=i;

			}
						
		}
		if(!logDet.get(0).equals(usrers.get(ur).getName()))
		{
				System.out.println("       Login faild");
				userLogin.userSignup();
		}
		
	}
	public void signup()throws Exception 
	{
		userLogin.userSignup();
		this.login();
	}

	public void viewItem(User user,ArrayList<Item> products)throws Exception 
	{
		
		int j=1;
		Collections.sort(products);  
		for (int i=0;i<products.size();i++) 
		{
			System.out.println("       products"+j+" : "+products.get(i).getItemName()+"\n       Price ₹ : "+products.get(i).getPrice());
			j++;
		}
		System.out.println("Select Item : 1  View Cart : 2  View purchasedItem : 3   Exit : 4");
		int select=scr.nextInt();
		switch(select)
		{
			case 1:
					selectItem(products,user);
					viewItem(user,products);
					break;
			case 2:
					cart.viewCartItem(user);
					viewItem(user,products);
					break;
			case 3:
					billDetail.vewBuyDetail(user);
					viewItem(user,products);
					break;
			case 4:
					System.out.println("==== Thank you ====");
					break;
			
		}
		
	}
	public void selectItem(ArrayList<Item>products,User user)throws Exception
	{
		billDetail=new BillDetail();
		
		System.out.println("\n");
		System.out.println("          Select number pick Product");
		System.out.println("      	------------------------------");
		int num=scr.nextInt();
		System.out.println("\n");
		System.out.println("       "+products.get(num-1).getItemName());
		System.out.println("      --------------");
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
		
		System.out.println("\n");
		System.out.println("Cart : 1  Buy : 2 ");
		int select=scr.nextInt();
		switch(select)
		{
			case 1:
					cartItem(products.get(num-1),user);
					viewItem(user,products);
					break;
			case 2:

					System.out.println("Payment option CashOnDelivery : 1  PayOnline : 2 ");
					int slct=scr.nextInt();
					switch(slct)
					{
						case 1:
								if(billDetail instanceof PaymentDetail)
								{
									billDetail. cashOnDelivery();
								}

						case 2:
								if(billDetail instanceof PaymentDetail)
								{
									billDetail. payOnline();
								}

					}
					
					buyItem(products.get(num-1),user);
					viewItem(user,products);
					
					break;
		}
		
		
	}
	public void cartItem(Item products,User user)throws Exception
	{ 
		
		cart.cartItem(products,user);
		
	}
	public void buyItem(Item products,User user)throws Exception 
	{
		
		billDetail=new BillDetail();
		billDetail.buyProduct(products,user);
		billDetail.buyDetails(products,user);
		
	}
}
