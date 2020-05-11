package com.lxisoft.OnlineShoping;
import java.util.Scanner;
public class ImportProduct
{
	Item item=new Item();
	public void addProduct()
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter product Name : ");
		String proName=scr.next();
		item.setName(proName);

		System.out.println("Enter product catogery : ");
		String proCatogery=scr.next();
		item.setName(proCatogery);
		
	}
}
