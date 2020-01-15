package com.lxisoft.hotel;
public class Pongal extends Food implements Veg
{
	String pongal;
	int price;
	public void type()
	{
		pongal="Pongal vada";
		price=45;
		System.out.println(pongal+" -- "+price" ₹");
	}
} 