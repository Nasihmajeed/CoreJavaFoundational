package com.lxisoft.onlineshoping;
import java.util.*;
import com.lxisoft.onlineshoping.Item;
import com.lxisoft.repository.Fileoperation;
import com.lxisoft.onlineshoping.Customer;
import com.lxisoft.authentication.Login;
import com.lxisoft.authentication.Signup;
import com.lxisoft.onlineshoping.Sale;
import com.lxisoft.onlineshoping.Stock;
import com.lxisoft.onlineshoping.Cart;
import com.lxisoft.onlineshoping.Billdetail;
import com.lxisoft.payment.Cash_on_delivery;
import com.lxisoft.payment.Paymentmanager;
import com.lxisoft.payment.Pay_online;
import java.lang.Math;
import java.util.Scanner;
public class Displaypage
{
	private	Scanner scr=new Scanner(System.in);
	private Customer customer;
	private Stock stock=new Stock();
	private Login userLogin=new Login();
	private Signup userSignup=new Signup();
	private Fileoperation fileoperation=new Fileoperation();
	private List<Item>products=new ArrayList<Item>();
	private Cart cart=new Cart();
	private Billdetail billDetail;
	private Sale sale=new Sale();
	public void login()throws Exception 
	{
		List<Customer> customers=fileoperation.readCustomerDetails(customer);
		
		
		System.out.println("       Yellow.coM");
		System.out.println("      ============");
		userLogin.setUserLogin();
		List<String> logDet=userLogin.getUserLogin();
		
		int ur=0;
		for(int i=0;i<customers.size();i++)
		{
			
			if (logDet.get(0).equals(customers.get(i).getName()) && logDet.get(1).equals(customers.get(i).getPassword())) 
			{
				Item item=new Item();
				stock.setItemDetail(item);
				System.out.println("       Login done");
				products=stock.getItemDetail();
				this.viewItem(customers.get(i),products);
				ur=i;
				break;

			}
						
		}
		if(!logDet.get(0).equals(customers.get(ur).getName()))
		{
				System.out.println("       Login faild");
				userSignup.userSignup();
		}
		
	}
	public void signup()throws Exception 
	{
		userSignup.userSignup();
		this.login();
	}

	public void viewItem(Customer customer,List<Item> products)throws Exception 
	{
		
		//System.out.println("Customer : "+ customer.getName());
		int j=1;
		Collections.sort(products);  
		for (int i=0;i<products.size();i++) 
		{
			System.out.println("       products"+j+" : "+products.get(i).getItemName()+"\n       Price ₹ : "+products.get(i).getPrice());
			j++;
		}
		System.out.println("\n");
		System.out.println("Select Item : 1  View Cart Items : 2  View purchasedItems : 3   Exit : 4  ");
		int select=scr.nextInt();
		System.out.println("\n");
		switch(select)
		{
			case 1:
					selectItem(products,customer);
					viewItem(customer,products);
					break;
			case 2:
					cart.viewCartItem(customer);
					viewItem(customer,products);
					break;
			case 3:
					sale.vewPurchasedDetail(customer);
					viewItem(customer,products);
					break;
			case 4:
					System.out.println("==== Thank you ====");
					break;

			/*case 5:
					cart.checkCart(customer);
					break;*/
			
		}
		
	}
	public void selectItem(List<Item>products,Customer customer)throws Exception
	{
		billDetail=new Billdetail();
		
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
		System.out.println("\n");
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
				System.out.println("\n");
				s=k;
			}
		}
		int id=1;
		System.out.println("\n");
		System.out.println("Cart : 1  Buy : 2 ");
		int select=scr.nextInt();
		System.out.println("\n");
		switch(select)
		{
			case 1:
					cartItem(products.get(num-1),customer,id);
					viewItem(customer,products);
					id++;
					break;
			case 2:

					System.out.println("Payment option CashOnDelivery : 1  PayOnline : 2 ");
					int slct=scr.nextInt();
					System.out.println("\n");
					switch(slct)
					{
						case 1:
									Paymentmanager cash_on_delivery = new Cash_on_delivery();
									cash_on_delivery. payCash();
								
									break;
						case 2:
									Paymentmanager pay_online = new Pay_online();
									pay_online. payCash();
									break;
							

					}
					
					buyItem(products.get(num-1),customer);
					viewItem(customer,products);
					
					break;
		}
		
		
	}
	public void cartItem(Item products,Customer customer,int id)throws Exception
	{ 
		
		cart.cartItem(products,customer,id);
		
	}
	public void buyItem(Item products,Customer customer)throws Exception 
	{
		
		billDetail=new Billdetail();
		sale.buyProduct(products,customer);
		billDetail.purchasedBillDetail(products,customer);
		
	}
}
