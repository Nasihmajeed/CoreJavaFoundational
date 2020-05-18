package com.lxisoft.OnlineShoping;
import com.lxisoft.OnlineShoping.Item;
import com.lxisoft.OnlineShoping.Cart;
import com.lxisoft.OnlineShoping.FileOperation;
import java.util.*;
import com.lxisoft.OnlineShoping.DisplayPage;
public class Cart
{
	ArrayList<Item>cartProduct=new ArrayList<Item>();
	FileOperation fo=new FileOperation();
	DisplayPage dp;
	//String name;
	final void cartItem(Item product,User user)throws Exception
	{
		dp=new DisplayPage();
		fo.cartProduct(product,user);
		//dp.viewItem();
	}
	final void viewCartItem(Item product)
	{
		String[] cartItem= fo.viewCartProduct(product);
		for (int i=0;i<cartItem.length;i++) 
		{
			if(cartItem[0].equals(user.getName()))
			{
				System.out.println()
			}
		}
		
	}
}