package com.lxisoft.hotel;
public class Chickennoodles extends Food implements Nonveg
{
	String chickennoodles;
	int price;
	public void type()
	{
		chickennoodles="Chicken Noodles";
		price=70;
		System.out.println(chickennoodles+" -- "+price" ₹");
	}
} 