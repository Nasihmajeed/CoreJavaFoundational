package com.lxisoft.hotel;
public class Biriyani extends Food implements Nonveg
{
	String biriyani;
	int price;

	public void type()
	{
		biriyani="Chicken Biriyani";

		price=90;
		int no=1;
		System.out.println(no +":"+biriyani+" -- "+price+" ₹");
	}
	public void nonveg()
	{
		System.out.println("Special hydrabad Biriyani");
	}
} 