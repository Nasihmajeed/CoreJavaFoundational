package com.LxiSoft.Hotel;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import com.LxiSoft.Admin.Admin;
public class Menu
{	
	int n;
  Scanner scnr = new Scanner(System.in);
ArrayList<Item> theMenu = new ArrayList<Item>();
     public void myMenu()
     {
     	theMenu.add(new Item());
     	theMenu.get(0).setName("Tea");
     	theMenu.get(0).setPrize(10);
     	theMenu.add(new Item());
     	theMenu.get(1).setName("Coffee");
     	theMenu.get(1).setPrize(15);
     	theMenu.add(new Item());
     	theMenu.get(2).setName("Lime");
     	theMenu.get(2).setPrize(20);
     	theMenu.add(new Item());
     	theMenu.get(3).setName("Juice");
     	theMenu.get(3).setPrize(30);
     	
     }

     public void printMenu()
     {
     	System.out.println("\t MENU    \t prize");
     	for (int i=0; i<theMenu.size(); i++)
     	{	
     		System.out.println("\n"+(i+1)+"\t"+theMenu.get(i).getName()+"\t \t"+theMenu.get(i).getPrize());
     	}
     }
       	

      public void addItem()
      {
	      

      /*	System.out.println (" \n Enter number of items to be added ");
	      n=scnr.nextInt();
         scnr.nextLine();*/
       //  int size=theMenu.size();

       //for (int i=theMenu.size(); i<=(n+3); i++)
    //{
         // if(theMenu.size().getname()==null)
          //{

    		theMenu.add(new Item());

    	 System.out.println("\n enter item name");
			String name=scnr.nextLine();
      scnr.nextLine();

       System.out.println("\n enter item prize");
      int prize=scnr.nextInt();
      

       theMenu.get(4).setName(name);
       theMenu.get(4).setPrize(prize);

         
      //  }
     }
     //}
  public void deleteItem()
   { 

   
  	
  	System.out.println("Enter index no. of item to be deleted");


   	int n=scnr.nextInt()  ;
    theMenu.remove(n-1);
    } 


    public void updateMenu()
    {
     
       System.out.println("Enter index number of item to b update: ");
       int n=scnr.nextInt();
       System.out.println("Enter  item name to update");
       String name=scnr.nextLine();
       theMenu.get(n-1).setName(name);
        scnr.nextLine();
         System.out.println("Enter updated item prize");
           int prize=scnr.nextInt();
       theMenu.get(n-1).setPrize(prize);

    }


  public void getOrder()
         {
                System.out.println("GIVE YOUR ORDER PLEASE");
                System.out.println("PRESS 0 TO QUIT");
                boolean quit= false;
                int sum=0;
                String order="\n ";
                
                do
             {

            int n=scnr.nextInt();
                switch(n)
                {
                    case n:
                    System.out.println(theMenu.get(i).getName());
                    sum=sum+theMenu.get(i).getPrize();
                    order=order.concat(theMenu.get(i).getName());
                    break;

                    case 0:
                    quit=true;
                    default:
                    System.out.println("Wrong input");

                }  
            
           }while(!quit);
             System.out.println("-----------------------------------------------");
        System.out.println("-Your Orders are:\n-"+order);
        System.out.println("-----------------------------------------------");
        System.out.println("Your total bill="+sum);
        System.out.println("Thank you");
    
        }
     }
      


		

