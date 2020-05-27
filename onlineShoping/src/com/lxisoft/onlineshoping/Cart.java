package com.lxisoft.onlineshoping;
import com.lxisoft.onlineshoping.Item;
import com.lxisoft.onlineshoping.Cart;
import com.lxisoft.onlineshoping.FileOperation;
import java.util.*;
import com.lxisoft.onlineshoping.DisplayPage;
import com.lxisoft.onlineshoping.CartDetail;
public class Cart
{
	private ArrayList<Item>cartProduct=new ArrayList<Item>();
	private FileOperation fo=new FileOperation();
	private DisplayPage dp;
	private CartDetail cd;

	private User userDetail;
	private Item product;
	final void cartItem(Item product,User user)throws Exception
	{
		dp=new DisplayPage();
		fo.cartProduct(product,user);
		userDetail=user;
		this.product=product;
	}
	final void viewCartItem(User user)throws Exception 
	{
		System.out.println("\n");
		ArrayList<CartDetail> cartItem= fo.viewCartProduct(user,cd);
		System.out.println("   CART products");
		System.out.println(" =================");
		
		for (int i=0;i<cartItem.size();i++) 
		{
			if (user.getName().equals(cartItem.get(i).getCustomer())) 
			{
				System.out.println("Customer : "+cartItem.get(i).getCustomer());
				System.out.println("Item : "+cartItem.get(i).getCartItem());	
			}
				
			System.out.println("\n");
		}
		
	}
}