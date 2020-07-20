package com.LxiSoft.Hotel;
import java.util.ArrayList;
import java.util.Scanner;
import com.LxiSoft.Admin.Admin;
public class Order
{
         Scanner scnr = new Scanner(System.in);
        Menu menu=new Menu();

         public void getOrder(ArrayList<Item> theMenu)
         {
         ArrayList<Item>billPrint=new ArrayList<Item>();


 System.out.println("How many items do you wish to have");
 int number=scnr.nextInt();

 for (int i=0; i<number; i++)
{   
System.out.println("GIVE YOUR indexNO. of ORDER PLEASE");
  //  System.out.println("Enter 0 to exit");
    int n=scnr.nextInt();
if (n>0)
{  
  
  billPrint.add(new Item());
   billPrint.get(i).setName(theMenu.get(n-1).getName());
 billPrint.get(i).setPrize(theMenu.get(n-1).getPrize());
}
  }
}
 public void printOrder()
  {


   System.out.println("-----------your order are------------------------------------");
        //System.out.println("-YourbillPrint are:\n"+billPrint.get(i));
        /*System.out.println("-----------------------------------------------");
        System.out.println("Your total bill="+sum);
       
              for(int i=0;i<billPrint.size();i++)
      {
            System.out.println("\n"+billPrint.get(i).getName()+"\t \t"+billPrint.get(i).getPrize());  
            }

  */
}
        }
    