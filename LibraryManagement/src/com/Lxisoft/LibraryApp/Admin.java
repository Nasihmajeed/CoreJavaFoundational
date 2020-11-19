package com.Lxisoft.LibraryApp;
import com.Lxisoft.LibraryApp.*;
import java.util.*;

public class Admin
{
	Scanner scanner =new Scanner (System.in);
	Book book = new Book();
	//File file = new File();
	ArrayList<Book> b =new ArrayList<Book>();

	public void menu()
	{
		int choice=0;
    do
    {
      System.out.println("\n________________________");
        System.out.println("\n\n1. AddBooks  \n\n2. DeleteBooks \n\n3. UpdateBooks \n\n4. ViewBooks \n\nPress 0 for Exit \n");
        choice=scanner.nextInt();
        if(choice==1)
        {
      	  this.addBooks(); 
        }
        if(choice==2)
        {
             
          this.deleteBooks();
         
        }
        if(choice==3)
        {
             
           this.updateBooks();
         
        }
        if(choice==4)
        {
             
           this.bookDetails();
         
        }
        if(choice==5)
        {
             
          // file.createFile(b);
         
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
		b.get(0).setAuthor("\t\tVaikkam Muhammed Basheer");
		b.get(0).setCode(101);
		b.get(0).setPublishers("Mathrubhumi publications");
		b.get(0).setGenere("Novels");

		b.add(new Book());
		b.get(1).setName("Baalykaala Sakhi ");
		b.get(1).setAuthor("\t\tVaikkam Muhammed Basheer");
		b.get(1).setCode(102);
		b.get(1).setPublishers("Mathrubhumi publications");
		b.get(1).setGenere("Novels");

		b.add(new Book());
		b.get(2).setName("Aadu jeevitham");
		b.get(2).setAuthor("\t\tBenyamin");
		b.get(2).setCode(103);
		b.get(2).setPublishers("Green Books");
		b.get(2).setGenere("Novels");


		b.add(new Book());
		b.get(3).setName("Randaamoozham");
		b.get(3).setAuthor(" \t\tM.T. Vasudhevan Nair ");
		b.get(3).setCode(104);
		b.get(3).setPublishers("Current Books");
		b.get(3).setGenere("Novels");

		b.add(new Book());
		b.get(4).setName("Kunnolamundallo ...");
		b.get(4).setAuthor("\tDeepa Nishanth");
		b.get(4).setCode(105);
		b.get(4).setPublishers("DC Books");
		b.get(4).setGenere("Novels");

		b.add(new Book());
		b.get(5).setName("A Brief History of Time");
		b.get(5).setAuthor("    Stephan Hawkings");
		b.get(5).setCode(201);
		b.get(5).setPublishers("Bantam Books");
		b.get(5).setGenere("Science");

		b.add(new Book());
		b.get(6).setName("On The Origin Of Species");
		b.get(6).setAuthor("   Charles darvin");
		b.get(6).setCode(202);
		b.get(6).setPublishers("Not Available");
		b.get(6).setGenere("Science");

		b.add(new Book());
		b.get(7).setName("The Selfish Gene");
		b.get(7).setAuthor("\t\tRichard Dawkins");
		b.get(7).setCode(203);
		b.get(7).setPublishers("Oxford University Press");
		b.get(7).setGenere("Science");
		this.viewBooks();
	}
	public void addBooks()
	{
	System.out.println (" \n Enter Number of books to be added: ");
	int n=scanner.nextInt();
    scanner.nextLine();
     for (int i=b.size(); i<=n; i++)
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
		System.out.println("\n Enter the Genere: ");
		String gen=scanner.nextLine();
		b.get(i).setGenere(gen);
        
     }
     this.viewBooks();
	}
	public void viewBooks()
	{
		System.out.println(" ------------------------------------------------------------------------------");
		System.out.println(" | \t Name  \t\t\t Author \t\t\t Code         |");
		System.out.println(" |                                                                            |");
		System.out.println(" ------------------------------------------------------------------------------");
		for (int i=0; i<b.size(); i++)
		{
			

			System.out.println(" | "+i+" "+b.get(i).getName()+""+ b.get(i).getAuthor()+"\t\t"+b.get(i).getCode());
		}
	}
	public void deleteBooks()
	{
		System.out.println("\n Enter the Index Number of Book: ");
		int a =scanner.nextInt();
		b.remove(a-1);
		System.out.println("Books after deletion is ");
		 	for(int i=0;i<b.size();i++)
		 	{
            this.viewBooks(); 
            }
		
	}
	public void updateBooks()
	{
		System.out.println("\n Enter the Index Number of Book: ");
		int c =scanner.nextInt();
		for (int i=c; i<=b.size(); i++)
		{
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
	}

	public void searchbyGenere()
	{
		System.out.println("Enter the Genere");
		String x=scanner.nextLine();
		for (int i=0; i<=b.size(); i++)
		{
			
			System.out.println("hg");
			String y=b.get(i).getGenere();
			if(y == x)
			{
			System.out.println(b.get(i).getName());
			}
			else
			{
				System.out.println(x+"Book is Not Available");
			}
		}

	}

}

	
