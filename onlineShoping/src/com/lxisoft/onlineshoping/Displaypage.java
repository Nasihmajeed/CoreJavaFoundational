package com.lxisoft.onlineshoping;
import java.util.*;
import java.lang.Math;
import java.util.Scanner;
import com.lxisoft.onlineshoping.Item;
import com.lxisoft.onlineshoping.Sale;
import com.lxisoft.onlineshoping.Stock;
import com.lxisoft.onlineshoping.Cart;
import com.lxisoft.onlineshoping.Customer;
import com.lxisoft.onlineshoping.Billdetail;
import com.lxisoft.repository.FileRepository;
import com.lxisoft.authentication.Login;
import com.lxisoft.authentication.Signup;
import com.lxisoft.payment.CashOnDelivery;
import com.lxisoft.payment.Paymentmanager;
import com.lxisoft.payment.PayOnline;
public class Displaypage
{
	private Customer customer;
	private Stock stock;
	private Login userLogin;
	private Signup userSignup;
	private FileRepository fileRepository;
	private List<Item>items;
	private Cart cart;
	private Billdetail billDetail;
	private Sale sale;
	public void login()throws Exception 
	{	
		userLogin=new Login();
		items=new ArrayList<Item>();
		fileRepository=new FileRepository();
		stock=new Stock();
		Scanner scr=new Scanner(System.in);	
		List<Customer> customers1=fileRepository.readCustomerDetails(customer);
		Map customers2=fileRepository.readLoginDetails(customer);
		System.out.println("       Yellow.coM");
		System.out.println("      ============");
		userLogin.setUserLogin();
		List<String> logDet=userLogin.getUserLogin();
		int ur=0;
		for(int i=0;i<customers1.size();i++)
		{	
			if (logDet.get(0).equals(customers1.get(i).getName()) && logDet.get(1).equals(customers2.get(logDet.get(0)))) 
			{
				Item item=new Item();
				stock.setItemDetail(item);
				System.out.println("       -------Login done-------");
				items=stock.getItemDetail();
				this.viewItem(customers1.get(i),items);
				break;
			}
				ur=i;		
		}
		if(!logDet.get(0).equals(customers1.get(ur).getName()))
		{
				userSignup=new Signup();
				System.out.println("       -------Login faild-------");
				userSignup.userSignup();
		}
	}
	public void signup()throws Exception 
	{
		userSignup=new Signup();
		userSignup.userSignup();
		this.login();
	}
	public void viewItem(Customer customer,List<Item> items)throws Exception 
	{
		cart=new Cart();
		sale=new Sale();
		Scanner scr=new Scanner(System.in);
		int j=1;
		Collections.sort(items);  
		System.out.println("\n");
		System.out.println("       Items");
		System.out.println("       ============");
		for (int i=0;i<items.size();i++) 
		{
			System.out.println("       items"+j+" : "+items.get(i).getItemName()+"\n       Price ₹ : "+items.get(i).getPrice());
			j++;
		}
		System.out.println("\n");
		System.out.println("Select Item : 1 || View Cart Items : 2 || View purchasedItems : 3 || Exit : 4  ");
		int select=scr.nextInt();
		System.out.println("\n");
		switch(select)
		{
			case 1:
					selectItem(items,customer);
					viewItem(customer,items);
					break;
			case 2:
					cart.viewCartItem(customer);
					viewItem(customer,items);
					break;
			case 3:
					sale.vewPurchasedDetail(customer);
					viewItem(customer,items);
					break;
			case 4:
					System.out.println("==== Thank you ====");
					break;
			
		}
	}
	public void selectItem(List<Item>items,Customer customer)throws Exception
	{
		Scanner scr=new Scanner(System.in);
		billDetail=new Billdetail();
		System.out.println("          Select number pick Product");
		System.out.println("      	------------------------------");
		int num=scr.nextInt();
		System.out.println("\n");
		System.out.println("       "+items.get(num-1).getItemName());
		System.out.println("      --------------");
		System.out.println(       items.get(num-1).getCatogery());
		System.out.println(       items.get(num-1).getFeature());
		System.out.println("       Price ₹ : "+items.get(num-1).getPrice());
		System.out.println("\n");
		int s=0;
		for (int k=0;k<items.size();k++) 
		{
			if(items.get(num-1).getCatogery().equals(items.get(k).getCatogery()) && !items.get(num-1).getItemName().equals(items.get(k).getItemName()))
			{
				System.out.println("\n");
				System.out.println("Relative Items");
				System.out.println("------------------");
				System.out.println(items.get(k).getItemName());
				System.out.println(items.get(k).getCatogery());
				int discount=items.get(k).getPrice()-items.get(k).getPrice()*20/100;
				System.out.println("Price ₹"+items.get(k).getPrice()+"  20% Discount : ₹ "+discount);
				System.out.println("\n");
				s=k;
			}
		}
		int id=1;
		System.out.println("\n");
		System.out.println("       Cart : 1  Buy : 2 ");
		System.out.println("       ==================");
		int select=scr.nextInt();
		System.out.println("\n");
		switch(select)
		{
			case 1:
					cartItem(items.get(num-1),customer,id);
					viewItem(customer,items);
					id++;
					break;
			case 2:
					System.out.println("Payment option CashOnDelivery : 1  PayOnline : 2 ");
					int slct=scr.nextInt();
					System.out.println("\n");
					switch(slct)
					{
						case 1:
									Paymentmanager cashOnDelivery = new CashOnDelivery();
									cashOnDelivery. payCash();
								
									break;
						case 2:
									Paymentmanager payOnline = new PayOnline();
									payOnline. payCash();
									break;
					}
					buyItem(items.get(num-1),customer);
					viewItem(customer,items);
					break;
		}
	}
	public void cartItem(Item items,Customer customer,int id)throws Exception
	{ 
		cart=new Cart();
		Scanner scr=new Scanner(System.in);
		cart.cartItem(items,customer,id);	
	}
	public void buyItem(Item items,Customer customer)throws Exception 
	{
		sale=new Sale();
		billDetail=new Billdetail();
		sale.buyProduct(items,customer);
		billDetail.purchasedBillDetail(items,customer);	
	}
}
