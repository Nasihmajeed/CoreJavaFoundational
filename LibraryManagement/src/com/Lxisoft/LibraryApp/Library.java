package com.Lxisoft.LibraryApp;
import com.Lxisoft.LibraryApp.*;
import java.util.*;
import java.io.*;
public class Library
{
	User user = new User();
	Admin admin = new Admin();
  ArrayList <Book> books = new ArrayList<Book>();
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
   		
   		this.mainMenu();
	}
	    public void mainMenu()
{  
		Scanner scanner = new Scanner(System.in);
 		int choice=0;

    do
    {
      System.out.println("\n________________________");
        System.out.println("\n\n1. Admin  \n\n2. User \n\n Press 0 for Exit \n");
        choice=scanner.nextInt();
        if(choice==1)
        {
      	  admin.menu(books);   
        }
        if(choice==2)
        {
             
           user.menu(books);         
        }
        else if(choice==0)
        {
            System.out.println(" ");
        }
    }
    while(choice>0);
      
	}


 }