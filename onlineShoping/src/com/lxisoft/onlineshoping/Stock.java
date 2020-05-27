package com.lxisoft.onlineshoping;
import com.lxisoft.onlineshoping.Item;
import java.util.*;
import com.lxisoft.onlineshoping.FileOperation;
public class Stock
{
	private ArrayList<Item> items=new ArrayList<Item>();
	
	private FileOperation fileOperation=new FileOperation();
	final ArrayList<Item> setItemDetail()throws Exception 
	{

		items=fileOperation.readProductDetails();
		
		return items;
	}
	
}