package com.lxisoft.OnlineShoping;
import com.lxisoft.OnlineShoping.Item;
import com.lxisoft.OnlineShoping.Cart;
import com.lxisoft.OnlineShoping.FileOperation;
import java.util.*;
import com.lxisoft.OnlineShoping.DisplayPage;
import com.lxisoft.OnlineShoping.CartDetail;
public class Cart
{
	ArrayList<Item>cartProduct=new ArrayList<Item>();
	FileOperation fo=new FileOperation();
	DisplayPage dp;
	CartDetail cd;

	User userDetail;
	Item product;
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