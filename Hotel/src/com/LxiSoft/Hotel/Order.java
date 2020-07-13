package com.LxiSoft.Hotel;
import java.util.Scanner;
import com.LxiSoft.Admin.Admin;
public class Order
{
         Scanner scnr = new Scanner(System.in);
        Menu menu=new Menu()
        {

          public void getOrder()
         {
          int total=0;
 Arraylist<theMenu>billPrint = new Arraylist<theMenu>();
   setTheMenu();
  {
    for(int i=0;i<20;i++)
    {
      theMenu()=new Item();
    }
  }
  }
  
  public void setTotal(int index)
  {
    this.total=0;
    for(int i=0;i<index;i++)
    {
      theMenu().setPrize();
      this.total=this.total+(theMenu().getItemTotAmount());
    }
  }
  
  public void printOrderDetails(int index)
  {
    
    System.out.println("---------------------Bill---------------------");
    System.out.println("\tItem Name \t Price\t\t Quantity");
    System.out.println("----------------------------------------------");
    for(int i=0;i<index;i++)
    {
      
      theMenu().printMenu();
    }
    System.out.println("----------------------------------------------");
    System.out.println("TOTAL = "+this.total);
  }
  
  
        }
    }