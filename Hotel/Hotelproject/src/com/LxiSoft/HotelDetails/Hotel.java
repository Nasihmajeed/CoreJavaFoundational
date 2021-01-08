package com.LxiSoft.HotelDetails;
import java.util.*;

public class Hotel 
{
    String hotelName;
    String place;
    String hotelType;
    Scanner s = new Scanner(System.in);

    Login login = new Login();

    public void addHotelDetails()
    {
        System.out.println("Hotel Name : ");
         hotelName = s.nextLine();
        System.out.println("Place : ");
         place = s.next();
        System.out.println("Type : ");
         hotelType = s.next();

    }

    public void printHotelDetails()
    {
        System.out.println(">----------------------------<");
        System.out.println(">-------Hotel  Details-------<");
        System.out.println("Hotel Name  : " + hotelName);
        System.out.println("Place       : " + place);
        System.out.println("Type        : " + hotelType);
        System.out.println(">----------------------------<");

        login.addLoginDetails();
    }
}