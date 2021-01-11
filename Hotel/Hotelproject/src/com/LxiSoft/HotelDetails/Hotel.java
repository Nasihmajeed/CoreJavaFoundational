package com.LxiSoft.HotelDetails;
import java.util.*;

public class Hotel 
{
    String hotelName;
    String place;
    String hotelType;

    Actions action = new Actions();
    Menu menu = new Menu();

    Scanner s = new Scanner(System.in);

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
        do
        {
            Scanner s = new Scanner(System.in);
            System.out.println("\n Log In");
            System.out.println("-------------");
            System.out.println("1.Admin \n2.Customer");
            int option = s.nextInt();
            if(option==1)
            {
                int opt;
                do
                {
                    System.out.println("\n Admin Activity");
                    System.out.println("----------------");
                    System.out.println("1.View Menu \n2.Add \n3.Edit \n4.Delete");
                    int choice = s.nextInt();
                    if(choice==1)
                    {
                        action.viewMenu();
                    }
                    else if(choice==2)
                    {
                        action.addMenu();
                    }
                    else if(choice==3)
                    {
                        action.editMenu();
                    }
                    else if(choice==4)
                    {
                        action.deleteMenu();
                    }
                    else 
                    {
                        System.out.println("Invalid option");
                    }
                    System.out.println("\nBack to Admin Page? \n1.Yes\n0.No");
                    opt = s.nextInt();
                }
                while(opt!=0);
            }    
            
            else if(option==2)
            {
                int optt;
                do
                {
                    System.out.println("\n Customer Activity");
                    System.out.println("-----------------");
                    System.out.println("1.Order \n2.Pay Bill");
                    int choose = s.nextInt();
                    
                    if(choose==1)
                    {
                        action.order();
                    }
                    else if(choose==2)
                    {
                        action.payBill();
                    }
                    else 
                    {
                        System.out.println("Invalid Option");
                    }
                    System.out.println("\nBack to Customer Page? \n1.Yes \n0.No");
                    optt = s.nextInt();
                }
                while(optt!=0);   
            }
            
            System.out.println("\nBack to main page ?\n1.Yes\n0.No");
            back = s.nextInt();
        }
        while(back!=0);
    }
}