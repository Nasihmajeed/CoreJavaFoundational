package com.LxiSoft.Test;
import com.LxiSoft.HotelDetails.Hotel;

public class Tdd
{
	
	public static void main(String[] args)
	{
		System.out.println("\n\n");
        System.out.println(">----------------------------<");
		System.out.println(">----- Enter the Details-----<");

	    Hotel hotel = new Hotel();
	    hotel.addHotelDetails();
		hotel.printHotelDetails();
    } 
}