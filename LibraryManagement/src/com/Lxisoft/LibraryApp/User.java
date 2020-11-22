package com.Lxisoft.LibraryApp;
import com.Lxisoft.LibraryApp.*;
import java.util.*;

public class User
{
	Scanner scanner = new Scanner(System.in);
	Book book =new Book();
    Books bk = new Books();
  
public void menu(ArrayList<Book> books)
{  
 int choice=0;
    do
    {
      System.out.println("\n________________________");
        System.out.println("\n\n1. View All Books  \n\n2. View Books By genere \n\n3. Search Books \n\n Press 0 for Exit \n");
        choice=scanner.nextInt();
        if(choice==1)
        {
      	bk.viewBooks(books);
          	   
        }
        if(choice==2)
        {
             
        bk.searchbyGenere(books);
        
        }
         if(choice==3)
        {
             
        bk.searchBook(books); 
                
        }


        else if(choice==0)
        {
            System.out.println(" ");
        }
    }
    while(choice>0);
      
	}
}
 