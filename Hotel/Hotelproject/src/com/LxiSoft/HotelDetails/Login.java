package com.LxiSoft.HotelDetails;
import java.util.*;
public class Login 
{
    public void addLoginDetails()
    {
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
                user.addMenuDetails();
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
