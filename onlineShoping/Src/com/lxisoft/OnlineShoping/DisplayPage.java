package com.lxisoft.OnlineShoping;

import com.lxisoft.OnlineShoping.Item;
import com.lxisoft.OnlineShoping.User;
import java.util.Scanner;
public class DisplayPage
{
	Scanner scr=new Scanner(System.in);
	User user;
	public void login()
	{
		user =new User();
		System.out.println("User Name : ");
		String name=scr.next();
		user.setName(name);

		System.out.println("Password : ");
		String password=scr.next();
		user.setPassword(password);

	}

	public void viewItem()
	{
		Item item=new Item();
		System.out.println("product 1 : "+item.getItemName());
		
	}
	public void cartItem()
	{
		
	}
	public void buyItem()
	{

	}
}
