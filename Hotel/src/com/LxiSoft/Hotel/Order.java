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
                System.out.println("How many items do you wish to have");
                int number=scnr.nextInt();
                
                int sum=0;
                int grantSum=0;
                  ArrayList<Item> billPrint = new ArrayList<Item>();

                    for(int i=0;i<number;i++)
			{

                        System.out.println("Enter the index number of  items which you want");
                        int n=scnr.nextInt();

                        

                        sum=theMenu.get(n-1).getPrize();
                        	     	System.out.println("\t MENU    \t prize");
                       System.out.println("\n      " +theMenu.get(n-1).getName() +"      "+sum);
                       billPrint.add(new Item());

                       billPrint.get(i).setPrize(sum);

                       grantSum=grantSum+billPrint.get(i).getPrize();
                       System.out.println("\n \n Your total bill is "+grantSum);
}
}
}
