package com.lxisoft.onlineshoping;
import com.lxisoft.onlineshoping.Item;
import com.lxisoft.onlineshoping.Cart;
import com.lxisoft.onlineshoping.Customer;
import com.lxisoft.repository.Fileoperation;
import java.util.*;
import com.lxisoft.onlineshoping.Displaypage;
import com.lxisoft.onlineshoping.Carted_item;
public class Cart
{
	private List<Item>cartProduct=new ArrayList<Item>();
	private Fileoperation fileoperation=new Fileoperation();
	private Displaypage dp;
	private Carted_item cd;
	private Customer customerDetail;
	private Item product;
	final void cartItem(Item product,Customer customer,int id)throws Exception
	{
		dp=new Displaypage();
		fileoperation.cartProduct(product,customer,id);
		customerDetail=customer;
		this.product=product;
	}
	final void viewCartItem(Customer customer)throws Exception 
	{
		System.out.println("\n");
		Map cartItem= fileoperation.viewCartProduct(customer,cd);
		System.out.println("   CART products");
		System.out.println(" =================");
		System.out.println("Customer : "+customer.getName());
		for (int i=0;i<cartItem.size();i++) 
		{

				System.out.println("Item : "+cartItem.get(customer.getName()));	
				System.out.println("   Successfully Carted Item ");
				
			System.out.println("\n");
		}
		
	}
	
}