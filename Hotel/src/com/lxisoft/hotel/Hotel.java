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

        for(int i=0;i<=5;i++);
        {

        System.out.println("    1.  Admin");
        System.out.println("    2.  Menu");
        System.out.println("    3.  Quit");

      
        System.out.println("Enter your choice");
          int choice=scanner.nextInt();
          switch(choice){
            case 1:
            admin.adminFunctions();
            break;
            case 2:
            admin.menu.printMenuDetails();
            break;
            case 3:
            System.out.println("WRONG OUTPUT");
              }
            }





       /* menu.printMenuDetails();
        menu.addDynamically();
        
        menu.getOrderDetails();
        menu.removeDynamically();
        menu.modifyNameDynamically();
        menu.modifyPriceDynamically();*/

      

        
    }

  }