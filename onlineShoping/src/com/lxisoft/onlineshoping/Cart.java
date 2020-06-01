package com.lxisoft.onlineshoping;
import com.lxisoft.onlineshoping.Item;
import com.lxisoft.onlineshoping.Cart;
import com.lxisoft.onlineshoping.Customer;
import com.lxisoft.onlineshoping.CartedItem;
import com.lxisoft.repository.FileRepository;
import java.util.*;

public class Cart
{
	private FileRepository fileRepository;
	private CartedItem carteditem;
	final void cartItem(Item item,Customer customer,int id)throws Exception
	{
		
		fileRepository=new FileRepository();
		fileRepository.cartProduct(item,customer,id);
		System.out.println("   Product Carted");
		System.out.println(" =================");
	}
	final void viewCartItem(Customer customer)throws Exception 
	{ 
		fileRepository=new FileRepository();
		System.out.println("\n");
		List<CartedItem> carteditems= fileRepository.viewCartProduct(customer,carteditem);
		System.out.println("   CART products");
		System.out.println(" =================");
		System.out.println("Customer : "+customer.getName());
		for (int i=0;i<carteditems.size();i++) 
		{
			if (carteditems.get(i).getCustomer().equals(customer.getName())) 
			{
				System.out.println("Item : "+carteditems.get(i).getCartItem());
			}
					
		}
		
	}
	
}