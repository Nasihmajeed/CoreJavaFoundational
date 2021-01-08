package com.LxiSoft.HotelDetails;
import java.util.*;

public class User 
{
    public void addMenuDetails()
    {
        int optt;
                do
                {
                    Scanner s = new Scanner(System.in);
                    System.out.println("\n Customer Activity");
                    System.out.println("-----------------");
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
                    System.out.println("\nBack to Customer Page? \n1.Yes \n0.No");
                    optt = s.nextInt();
                }
                while(optt!=0);
           
    }
}
