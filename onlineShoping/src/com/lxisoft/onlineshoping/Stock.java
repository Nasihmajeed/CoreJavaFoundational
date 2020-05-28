package com.lxisoft.onlineshoping;
import com.lxisoft.onlineshoping.Item;
import java.util.*;
import com.lxisoft.repository.Fileoperation;
public class Stock
{
	private List<Item> items=new ArrayList<Item>();
	
	private Fileoperation fileoperation=new Fileoperation();
	public void setItemDetail(Item item)throws Exception 
	{

		this.items=fileoperation.readProductDetails(item);
		
	}
	public List<Item> getItemDetail()throws Exception 
	{
		return this.items;
	}
	
}