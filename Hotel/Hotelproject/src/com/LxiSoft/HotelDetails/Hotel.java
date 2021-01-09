package com.LxiSoft.HotelDetails;
import java.util.*;

public class Hotel 
{
    String hotelName;
    String place;
    String hotelType;
    Scanner s = new Scanner(System.in);

    // Login login = new Login();

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

        int back;
        Admin admin = new Admin();
        User user = new User();
        
        do
        {
            Scanner s = new Scanner(System.in);
            System.out.println("\n Log In");
            System.out.println("-------------");
            System.out.println("1.Admin \n2.Customer");
            int option = s.nextInt();
            if(option==1)
            {
                admin.addMenuDetails();
            }
            else if(option==2)
            {
                user.viewMenuDetails();
            }
            else
            {
                System.out.println("Invalid Option");
            }
            System.out.println("\nBack to main page ?\n1.Yes\n0.No");
            back = s.nextInt();
        }
        while(back!=0);
    }
}