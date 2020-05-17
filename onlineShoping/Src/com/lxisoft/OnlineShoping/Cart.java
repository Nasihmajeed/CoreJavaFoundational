package com.lxisoft.OnlineShoping;
import com.lxisoft.OnlineShoping.Item;
import com.lxisoft.OnlineShoping.Cart;
import com.lxisoft.OnlineShoping.FileOperation;
import java.util.*;
public class Cart
{
	ArrayList<Item>cartProduct=new ArrayList<Item>();
	FileOperation fo=new FileOperation();
	final void cartItem(Item product,String name)
	{
		fo.cartProduct(product,name);
		
	}
}