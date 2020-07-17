package com.LxiSoft.Hotel;
import java.util.Scanner;
import com.LxiSoft.Admin.Admin;
public class Order
{
         Scanner scnr = new Scanner(System.in);
        Menu menu=new Menu();
         public void getOrder()
         {
    
 
    System.out.println("GIVE YOUR indexNO. of ORDER PLEASE");
    n=scnr.nextInt();

  //  if (n>0)
   // {
    ArrayList<Item>billPrint=new ArrayList<Item>();
    billPrint.add(new Item());
     billPrint.get(n).getName();
   billPrint.get(n).getPrize();
      System.out.println(billPrint);  

 // }
}
 public void printOrder()
  {


   System.out.println("-----------------------------------------------");
        /*System.out.println("-Your Orders are:\n"+billPrint.get(i));
        System.out.println("-----------------------------------------------");
        System.out.println("Your total bill="+sum);
        System.out.println("Thank you");
  */
}
        }
    