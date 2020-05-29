package com.lxisoft.users;
import java.util.*;
public class Customer
{
	public String name;
	public int serviceNumber;
	public int itemModel;
	public int price;
	public Customer(String n, int sNum, int model,int rs)
	{
		name=n;
		serviceNumber=sNum;
		itemModel=model;
		price = rs;
	}
	public void  printCustomer()
	{
		System.out.format("%15s %10d %15d %15d\n ",name,serviceNumber,itemModel,price);
	}
	
}