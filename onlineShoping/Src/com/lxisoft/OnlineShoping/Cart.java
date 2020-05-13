package com.lxisoft.OnlineShoping;
import com.lxisoft.OnlineShoping.Item;
import com.lxisoft.OnlineShoping.Cart;
import java.util.*;
public class Cart
{
	ArrayList<Item>cartProduct=new ArrayList<Item>();
	final ArrayList<Item> cartItem(Item product)
	{
		cartProduct.add(product);
		
		return cartProduct;
	}
}