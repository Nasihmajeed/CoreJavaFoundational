package com.lxisoft.hotel;
import java.util.Scanner;
public class Hotel{


        Admin admin=new Admin();
        
        

    
    
    
    public void setHotelDetails(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("*******************************************************************");
        System.out.println("                                                                                                 ");
        System.out.println("                                                                                                 ");
        System.out.println("                                                                                                 ");
        System.out.println("                                                                                                 ");
        System.out.println("                        HOTEL NOORJAHAN                                                          ");
        System.out.println("                        VEG AND NON VEG                                                          ");
        System.out.println("                           PALAKKAD                                                              ");
        System.out.println("                                                                                                 ");
        System.out.println("                                                                                                 ");
        System.out.println("                                                                                                 ");
        System.out.println("                                                                                                 ");
        System.out.println("                                                                                                 ");
        System.out.println("                                                                                                 ");
        System.out.println("                                                                                                 ");
        System.out.println("                                                                                                 ");
        System.out.println("                                                                                                 ");
        System.out.println("*******************************************************************");

     //   menu.printMenuDetails();

     int choice=0;
    do
    {
        System.out.println("    1.  Admin");
        System.out.println("    2.  Menu");
        System.out.println("    0.  Quit");

      
        System.out.println("Enter your choice");
          choice=scanner.nextInt();
          if(choice==1)
        {
             admin.adminFunctions(); 
        }
        if(choice==2)
        {
             
           admin.menu.printMenuDetails();
           admin.menu.getOrderDetails();
         
        }
        else if(choice==0)
        {
            System.out.println(" ");
        }
    }
    while(choice>0);
      
}

}