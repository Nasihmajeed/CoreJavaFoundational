package com.Lxisoft.LibraryApp;
import com.Lxisoft.LibraryApp.*;
import java.util.*;

public class Admin
{
	Scanner scanner =new Scanner (System.in);
	Book book = new Book();
	ArrayList<Book> b =new ArrayList<Book>();

	public void menu()
	{
		int choice=0;
    do
    {
      System.out.println("\n________________________");
        System.out.println("\n\n1. AddBooks  \n\n2. DeleteBooks \n\n3. UpdateBooks \n\n Press 0 for Exit \n");
        choice=scanner.nextInt();
        if(choice==1)
        {
      	  this.addBooks(); 
        }
        if(choice==2)
        {
             
           //this.deleteBooks();
         
        }
        if(choice==3)
        {
             
           //this.updateBooks();
         
        }
        else if(choice==0)
        {
            System.out.println(" ");
        }
    }
    while(choice>0);
      
	}

	
	public void bookDetails()
	{
		
		b.add(new Book());
		b.get(0).setName("Pathummayude Aadu ");
		b.get(0).setAuthor("Vaikkam Muhammed Basheer");
		b.get(0).setCode(001);
		b.get(0).setPublishers("Mathrubhumi publications");

		b.add(new Book());
		b.get(0).setName("Baalykaala Sakhi ");
		b.get(0).setAuthor("Vaikkam Muhammed Basheer");
		b.get(0).setCode(002);
		b.get(0).setPublishers("Mathrubhumi publications");

		b.add(new Book());
		b.get(0).setName(" ");
		b.get(0).setAuthor("");
		b.get(0).setCode(003);
		b.get(0).setPublishers("");

		b.add(new Book());
		b.get(0).setName(" ");
		b.get(0).setAuthor("");
		b.get(0).setCode(425);
		b.get(0).setPublishers("");

		b.add(new Book());
		b.get(0).setName(" ");
		b.get(0).setAuthor("");
		b.get(0).setCode(425);
		b.get(0).setPublishers("");


	}
	public void addBooks()
	{
	System.out.println (" \n Enter Number of books to be added: ");
	int n=scanner.nextInt();
    scanner.nextLine();
     for (int i=0; i<=n; i++)
     {
     	b.add(new Book());
		System.out.println("\nEnter " +i+  " Book details");

		System.out.println("\n Enter the name of Book: ");
		String name=scanner.nextLine();
        b.get(i).setName(name);
        System.out.println("\n Enter the name of Author: ");
		String author=scanner.nextLine();
		b.get(i).setAuthor(author);
		System.out.println("\n Enter the Library Code: ");
		int code=scanner.nextInt();
		b.get(i).setCode(code);
		System.out.println("\n Enter the name of Publisher: ");
		String pub=scanner.nextLine();
		b.get(i).setPublishers(pub);
        
     }
     this.viewBooks();
	}
	public void viewBooks()
	{
		for (int i=0; i<b.size(); i++)
		{
			System.out.println(b.get(i));
		}
	}
	public void deleteBooks()
	{
		for (int i=0; i<b.size(); i++)
		{
		b.remove(b.get(i));
	}
}

	
}