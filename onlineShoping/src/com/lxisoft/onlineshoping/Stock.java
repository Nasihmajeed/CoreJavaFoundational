package com.lxisoft.onlineshoping;
import com.lxisoft.onlineshoping.Item;
import java.util.*;
import com.lxisoft.repository.Fileoperation;
public class Stock
{
	private ArrayList<Item> items=new ArrayList<Item>();
	
	private Fileoperation fileoperation=new Fileoperation();
	public void setItemDetail(Item item)throws Exception 
	{

		this.items=fileoperation.readProductDetails(item);
		
	}
	public ArrayList<Item> getItemDetail()throws Exception 
	{
		return this.items;
	}
	
}