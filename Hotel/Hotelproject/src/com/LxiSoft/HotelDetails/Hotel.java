package com.LxiSoft.HotelDetails;
// import com.LxiSoft.HotelDetails.Menu;
import java.util.*;

public class Hotel 
{
    String hotelName;
    String place;
    String hotelType;
    Scanner s = new Scanner(System.in);

    // Admin admin = new Admin();
    // User user = new User();

    public void addHotelDetails()
    {
        // Scanner s = new Scanner(System.in);
        
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
            System.out.println(" Log In");
            System.out.println("-------------");
            System.out.println("Log In \n1.Admin \n2.Customer");
            int option = s.nextInt();
            if(option==1)
            {
                int opt;
                do
                {
                    System.out.println(" Admin Page");
                    System.out.println("------------");
                    System.out.println("\n1.View Menu \n2.Add \n3.Edit \n4.Delete");
                    int choice = s.nextInt();
                    if(choice==1)
                    {
                    
                    }
                    else if(choice==2)
                    {
                   
                    }
                    else if(choice==3)
                    {
                    
                    }
                    else if(choice==4)
                    {
                    
                    }
                    else 
                    {
                        System.out.println("Invalid option");
                    }
                    System.out.println("Back to Admin Page? \n1.Yes\n0.No");
                    opt = s.nextInt();
                }
                while(opt!=0);
            }
            else if(option==2)
            {
                int optt;
                
            
                do
                {
                    System.out.println("\n Customer Page");
                    System.out.println("-------------");
                    System.out.println("1.Order \n2.Pay Bill");
                    int choose = s.nextInt();
                    if(choose==1)
                    {
                    
                   
                    }
                    else if(choose==2)
                    {
                    
                    }
                    else 
                    {
                        System.out.println("Invalid Option");
                    }
                    System.out.println("Back to User Page? \n1.Yes \n0.No");
                    optt = s.nextInt();
                }
                while(optt!=0);
           
            }
            else
            {
                System.out.println("Invalid Option");
            }
            System.out.println("Back to main page ?\n1.Yes\n0.No");
            back = s.nextInt();
        }
        while(back!=0);
    }
}