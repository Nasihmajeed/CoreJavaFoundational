package com.lxisoft.hotel;
import java.lang.Math;
import com.lxisoft.hotel.Biriyani;
import com.lxisoft.hotel.Vegmeals;
public class Menu
{
	String hotelname;
	int phoneno;
	Biriyani biriyani;
	Vegmeals vmeals;
	public int random()
	{	

		int date=(int)(Math.random()*30)+1;
		int month=(int)(Math.random()*12)+1;
		return date;
	}
	public void printdetails()
	{
		biriyani=new Biriyani();
		vmeals=new Vegmeals();
		int date=random();
		int month=random();
		System.out.println("\n");

		System.out.println("-Food menu-");
		biriyani.setdetails();
		vmeals.setdetails();

	}
}