package com.LxiSoft.Hotel;
import java.util.ArrayList;
import java.util.Scanner;
import com.LxiSoft.Admin.Admin;
public class Order
{
         Scanner scnr = new Scanner(System.in);
        Menu menu=new Menu();
            ArrayList<Item>billPrint=new ArrayList<Item>();

         public void getOrder()
         {
    
 
    System.out.println("GIVE YOUR indexNO. of ORDER PLEASE");
    System.out.println("Enter 0 to exit")
    int n=scnr.nextInt();
    if (n>0)
    {
    	for(i=n-1;)
    }

  
  
    billPrint.add(new Item());
     billPrint.get(n).getName();
   billPrint.get(n).getPrize();

 // }
}
 public void printOrder(ArrayList billPrint)
  {


   System.out.println("-----------------------------------------------");
        //System.out.println("-Your Orders are:\n"+billPrint.get(i));
        /*System.out.println("-----------------------------------------------");
        System.out.println("Your total bill="+sum);
       
              for(int i=0;i<billPrint.size();i++)
      {
            System.out.println("\n"+billPrint.get(i).getName()+"\t \t"+billPrint.get(i).getPrize());  
            }

  */
}
        }
    