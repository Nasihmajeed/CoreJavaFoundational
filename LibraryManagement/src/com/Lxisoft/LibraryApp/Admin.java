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
		//b.get(i).setAuthor("");
		//b.get(i).setCode("");
		//b.get(i).setPublishers("");
        this.viewBooks();
     }

	}
	public void viewBooks()
	{
		for (int i=0; i<=b.size(); i++)
		{
		System.out.println(b.get(i).getName());
		}
	}
	

	/*public void addBooks()
	{
	System.out.println (" \n Enter Number of books to be added: ");
	int n=scanner.nextInt();
    scanner.nextLine();
     for (int i=0; i<=n; i++)
     {
     std[i]=new Student();
        System.out.println("\n enter student " +i+  " details");

        System.out.println("\n enter name of the student: ");
		String name=s.nextLine();
        std[i].setName(name);
        
		System.out.println("Enter Class:");
		int clss=s.nextInt();
        std[i].setclss(clss);
        s.nextLine();

        System.out.println("Enter Division: ");
		String div=s.nextLine();
        std[i].setdiv(div);
        s.nextLine();

		System.out.println("Enter Roll no: ");
		int rNo=s.nextInt();
        std[i].setrNo(rNo);
        s.nextLine();	
	}*/
}