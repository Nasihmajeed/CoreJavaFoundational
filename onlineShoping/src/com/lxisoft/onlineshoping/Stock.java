package com.lxisoft.OnlineShoping;
import com.lxisoft.OnlineShoping.Item;
import java.util.*;
import com.lxisoft.OnlineShoping.FileOperation;
public class Stock
{
	ArrayList<Item> items=new ArrayList<Item>();
	
	FileOperation fileOperation=new FileOperation();
	final ArrayList<Item> itemDetail()throws Exception 
	{

		items=fileOperation.readProductDetails();
		
		return items;
	}
}