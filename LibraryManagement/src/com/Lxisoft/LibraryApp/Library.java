package com.Lxisoft.LibraryApp;
import com.Lxisoft.LibraryApp.*;
import java.util.*;

public class Library
{
	Scanner scanner = new Scanner(System.in);
	Admin admin = new Admin();

	public void intro()
	{
		System.out.println("\n\t\t------------------------------------------\t");
   		System.out.println("\t\t-------------------------------------------\t");
   		System.out.println("\t\t--------------Public  Library -------------\t");
   		System.out.println("\t\t--------------- Pattambi ------------------\t");
   		System.out.println("\t\t--------------  Phone 0987654321-----------\t");
   		System.out.println("\t\t-------------------------------------------\t");
   		System.out.println("\t\t-------------------------------------------\t");
   		System.out.println("\t\t------- Scripted by -----------------------\t");
   		System.out.println("\t\t---------------- Faris --------------------\t");
   		System.out.println("\t\t-------------------------------------------\t");
   		
   		this.admin();
	}
	    public void admin()
{  
 int choice=0;
    do
    {
      System.out.println("\n________________________");
        System.out.println("\n\n1. Admin  \n\n2. Search \n\n3. Books \n\n Press 0 for Exit \n");
        choice=scanner.nextInt();
        if(choice==1)
        {
      	  admin.menu();   
        }
        if(choice==2)
        {
             
           //search.();
         
        }
        if(choice==3)
        {
             
           //books.();
         
        }
        else if(choice==0)
        {
            System.out.println(" ");
        }
    }
    while(choice>0);
      
	}
}
