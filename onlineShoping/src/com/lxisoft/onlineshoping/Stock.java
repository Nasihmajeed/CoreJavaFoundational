package com.lxisoft.onlineshoping;
import com.lxisoft.onlineshoping.Item;
import java.util.*;
import com.lxisoft.repository.FileRepository;
public class Stock
{
	private List<Item> items=new ArrayList<Item>();
	private FileRepository fileRepository;
	public void setItemDetail(Item item)throws Exception 
	{
		fileRepository=new FileRepository();
		this.items=fileRepository.readProductDetails(item);
		
	}
	public List<Item> getItemDetail()throws Exception 
	{
		return this.items;
	}
}