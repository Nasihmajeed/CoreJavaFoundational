package com.lxisoft.hotel;
public class Vegmeals extends Food implements Veg
{
	String vegmeals;
	int price;
	public void type()
	{
		vegmeals="Full Vegmeals";
		price=70;
		int no=2;
		System.out.println(no+":"+vegmeals+" -- "+price+" ₹");
	}
	public void vegitarien()
	{
		System.out.println("Pure vegmeals");
	}
} 