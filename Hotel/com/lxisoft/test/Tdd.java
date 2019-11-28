package com.lxisoft.test;
import com.lxisoft.hotel.Hotel;
public class Tdd
{
	public static void main (String[] arg)
	{
		Hotel hotel = new Hotel("Nila Resturant","Ottapalam");
		hotel.booking(hotel);
	}
}