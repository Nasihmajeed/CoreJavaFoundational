package com.Lxisoft.LibraryApp;
import com.Lxisoft.LibraryApp.*;
import java.util.*;

public class User
{
	Scanner scanner = new Scanner(System.in);
	Admin admin = new Admin();
	ArrayList<Book> b;

public void menu()
{  
 int choice=0;
    do
    {
      System.out.println("\n________________________");
        System.out.println("\n\n1. View All Books  \n\n2. View Books By genere \n\n3. Search Books \n\n Press 0 for Exit \n");
        choice=scanner.nextInt();
        if(choice==1)
        {
      	  admin.viewBooks();
      	  admin.bookDetails();   
        }
        if(choice==2)
        {
             
           admin.searchbyGenere();         
        }
         if(choice==3)
        {
             
           admin.searchBook();         
        }


        else if(choice==0)
        {
            System.out.println(" ");
        }
    }
    while(choice>0);
      
	}
}