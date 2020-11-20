package com.Lxisoft.LibraryApp;
import com.Lxisoft.LibraryApp.*;
import java.util.*;
import java.io.*;

public class Admin
{
	Scanner scanner =new Scanner (System.in);
	Book book = new Book();
	//File file = new File();
	ArrayList<Book> b =new ArrayList<Book>();
	Library library = new Library();
	public void menu()
	{
		int choice=0;
    	
    do
    {
      System.out.println("\n________________________");
        System.out.println("\n\n1. AddBooks  \n\n2. DeleteBooks \n\n3. UpdateBooks \n\n4. ViewBooks \n\n5. Eport to Files\n\n Press 0 for Exit \n");
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
             
           
           this.viewBooks();
        }
        if(choice==5)
        {
             
        this.createFile();
         
        }
        else if(choice==0)
        {
            System.out.println(" ");
        }
    }
    while(choice>0);
      
	}

	
	/*public void bookDetails()
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
		
	}*/
	public void addBooks()
	{
	System.out.println (" \n Enter Number of books to be added: ");
	int n=scanner.nextInt();
    scanner.nextLine();
     for (int i=0; i<=b.size(); i++)
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
	{//this.bookDetails();
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
		//this.bookDetails();
		b.remove(a);
		System.out.println("Books after deletion is ");
		this.viewBooks(); 
            
		
	}
	public void updateBooks()
	{
		System.out.println("\n Enter the Index Number of Book: ");
		int c =scanner.nextInt();
		
		System.out.println("\n Enter the name of Book: ");
		String editname=scanner.nextLine();
        b.get(c).setName(editname);
        System.out.println("\n Enter the name of Author: ");
		String editauthor=scanner.nextLine();
		b.get(c).setAuthor(editauthor);
		System.out.println("\n Enter the Library Code: ");
		int editcode=scanner.nextInt();
		b.get(c).setCode(editcode);
		System.out.println("\n Enter the name of Publisher: ");
		String publisher=scanner.nextLine();
		b.get(c).setPublishers(publisher);
		//
		System.out.println("Sucsfully updated");
		
	//this.viewBooks();
	}

	public void searchbyGenere()
	{
		System.out.println("Enter the Genere");
		String x=scanner.nextLine();
		//this.bookDetails();
		for (int i=0; i<b.size(); i++)
		{
			
			
			
			if(b.get(i).getGenere() .equals(x) )
			{
			System.out.println(b.get(i).getName());
			}


		}

	}

	public void searchBook()
	{
		System.out.println("Enter The bOOk Name");
		String y=scanner.nextLine();
		//this.bookDetails();
		for (int i=0; i<b.size(); i++)
		{
			if(b.get(i).getGenere() .equals(y) )
			{
			System.out.println(b.get(i).getName());
			}


		}

	}
	public void createFile() 
 	{
 		//this.bookDetails();
	try{
            FileWriter writeData = new FileWriter("Library_Data.txt");
            Writer writeStream = new BufferedWriter(writeData);
            int sz=b.size();
            for(int i=0; i<sz; i++)
            {
            	writeStream.write(" | "+i+" "+b.get(i).getName()+"\t"+ b.get(i).getAuthor()+"\t\t"+b.get(i).getCode()+"\t"+b.get(i).getGenere()+"\t");
            }
            writeStream.flush();
            writeStream.close();
            System.out.println("Sucessfully Exported");

        }catch (IOException e) 
        {
            e.printStackTrace();
        }


    }


}



	