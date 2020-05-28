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
	private ArrayList<Item>cartProduct=new ArrayList<Item>();
	private Fileoperation fo=new Fileoperation();
	private Displaypage dp;
	private Carted_item cd;

	private Customer customerDetail;
	private Item product;
	final void cartItem(Item product,Customer customer)throws Exception
	{
		dp=new Displaypage();
		fo.cartProduct(product,customer);
		customerDetail=customer;
		this.product=product;
	}
	final void viewCartItem(Customer customer)throws Exception 
	{
		System.out.println("\n");
		ArrayList<Carted_item> cartItem= fo.viewCartProduct(customer,cd);
		System.out.println("   CART products");
		System.out.println(" =================");
		
		for (int i=0;i<cartItem.size();i++) 
		{
			if (customer.getName().equals(cartItem.get(i).getCustomer())) 
			{
				System.out.println("Customer : "+cartItem.get(i).getCustomer());
				System.out.println("Item : "+cartItem.get(i).getCartItem());	
				System.out.println("   Successfully Carted Item ");
			}
				
			System.out.println("\n");
		}
		
	}
}