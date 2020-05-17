package com.lxisoft.OnlineShoping;
import com.lxisoft.OnlineShoping.Item;
import java.util.*;
import com.lxisoft.OnlineShoping.FileOperation;
public class Stock
{
	ArrayList<Item> product=new ArrayList<Item>();
	Item item;
	FileOperation fileOperation=new FileOperation();
	final ArrayList<Item> itemDetail()throws Exception 
	{

		product=fileOperation.readProductDetails(item);
		
		return product;
	}
}