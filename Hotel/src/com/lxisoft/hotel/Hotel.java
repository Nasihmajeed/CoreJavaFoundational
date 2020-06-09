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

      

        
    }

    public void printHotelDetail()
{  
 int choice=0;
    do
    {
        System.out.println("\n________________________");
        System.out.println("\n\n1.Menu \n\n2.Order \n\n3 Admin \n\n4.Press 0 to Quit \n");
        Scanner scanner=new Scanner(System.in);
       choice=scanner.nextInt();
        if(choice==1)
        {
            menu.printMenuDetails();
           
        }
        if(choice==2)
        {
            order.getOrderDetails();
        }
       if(choice==3)
        {
          //admin method
          
        }
        else if(choice==0)
        {
            System.out.println(" ");
        }
    }
    while(choice>0);
      
}

}

    
