package com.Lxisoft.LibraryApp;
import com.Lxisoft.LibraryApp.*;
import java.util.*;

public class User
{
	Scanner scanner = new Scanner(System.in);
	Book book =new Book();
    //Books bk = new Books();
    Admin admin = new Admin();
    Novel novel = new Novel();
    Magazines magazine = new Magazines();
    Science science = new Science();

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
      	admin.viewBooks(books);
          	   
        }
        if(choice==2)
        {
             
        this.searchbyGenere(books);
        
        }
         if(choice==3)
        {
             
        this.searchBook(books); 
                
        }


        else if(choice==0)
        {
            System.out.println(" ");
        }
    }
    while(choice>0);
      
	}

      public void searchbyGenere(ArrayList<Book> books)
  {
    Scanner searchgenere = new Scanner(System.in);
    System.out.println("Enter the Genere");
    String x=searchgenere.nextLine();
    for (int i=0; i<books.size(); i++)
    { 
      if(books.get(i).getGenere() .equals("Novel") )
      {
      
      System.out.println(books.get(i).getName());
      
      novel.displayNovelDetails();
      }
      
      if(books.get(i).getGenere() .equals("magazine") )
      {
      System.out.println(books.get(i).getName());
      
      magazine.displayMagazineDetails();

      }

       if(books.get(i).getGenere() .equals("Science") )
      {
      System.out.println(books.get(i).getName());
      
      science.displayScienceDetails();
      }
      else
        System.out.println("");

    }

  }

  public void searchBook(ArrayList<Book> books)
  {
    Scanner searchbook = new Scanner(System.in);
    System.out.println("Enter The Book Name");
    String y=searchbook.nextLine();

    for (int i=0; i<books.size(); i++)
    {
      if(books.get(i).getName() .equals(y)   )
      {
      System.out.println("Book "+i);
      System.out.println("________________________\n");
      System.out.println("Name : "+books.get(i).getName()+"\nAuthor : "+ books.get(i).getAuthor()+"\nCode : "+books.get(i).getCode());
      System.out.println("________________________\n");
      }

    

  }
    
  }
}
 