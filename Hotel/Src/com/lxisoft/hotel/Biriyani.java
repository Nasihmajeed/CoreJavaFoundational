package com.lxisoft.hotel;
public class Biriyani extends Food implements Nonveg,Veg

{
	String biriyani;
	int price;

	public void setdetails()
	{
		biriyani="Biriyani";

		price=90;
		int no=1;
		System.out.println(no +":"+biriyani+" -- "+price+" ₹");
	}
	public void nonveg()
	{
		System.out.println("Special hydrabad Chiken Biriyani");
	}
	public void vegitarien()
	{
		System.out.println("Special vegitable Biriyani");
	}
} 