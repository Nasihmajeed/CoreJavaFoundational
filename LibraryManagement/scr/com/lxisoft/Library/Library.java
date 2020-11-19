package com.lxisoft.Library;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Library
{
	ArrayList<Books>  book = new ArrayList<Books>();
    Scanner scanner = new Scanner(System.in);

 public void libraryDetails()
   {
      System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
      System.out.println("\n"); 
      System.out.println("                                                  WELCOME TO THE MM93 LIBRARY                                                        ");
      System.out.println("\n");
      System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      System.out.print("----------------------------------------------------------------------------------------------------------------------------------");
      System.out.print("\n");
      System.out.print("-                                                         MM93 LIBRARY                                                           -");
      System.out.print("\n");
      System.out.print("-                                                  --------------------------                                                    -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-       NAME OF THE LIBRARY  : MM93                                                                                              -");
      System.out.print("\n");
      System.out.print("-       OWNER  : ADDICTES                                                                                                        -");
      System.out.print("\n");
      System.out.print("-       PLACE : PALAKKAD                                                                                                         -");
      System.out.print("\n");
      System.out.print("-       ADDRESS : MM93 LIBRARY                                                                                                   -");
      System.out.print("\n");
      System.out.print("-                 (po) MUNDUR , PARALI                                                                                           -");
      System.out.print("\n");
      System.out.print("-                 PALAKKAD , KERALA                                                                                              -");
      System.out.print("\n");
      System.out.print("-                 PINCODE : 6786004                                                                                              -");
      System.out.print("\n");
      System.out.print("-       CONTACT NUM : 1009080706                                                                                                 -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("----------------------------------------------------------------------------------------------------------------------------------");
      System.out.print("\n"); 
      System.out.print(" ");
    }
    public void libraryBookDetails()
    {

    	book.add(new Charlottes());
		book.get(0).setBookName("Charlottes");
		book.get(0).setAuthorName("ROBO");
		book.get(0).setPublisher("ADDICTES COMPANY");
		book.get(0).setId(1);
		book.get(0).setPrice(140);

		book.add(new HarryPotter());
		book.get(1).setBookName("HarryPotter");
		book.get(1).setAuthorName("RAONE"); 
		book.get(1).setPublisher("GONE COMPANY");
		book.get(1).setId(2);
		book.get(1).setPrice(120);
		for(int i=0;i<book.size();i++)
		{
			System.out.print("\n");
			System.out.print((i+1)+" BOOK NAME : "+book.get(i).getBookName()+"\n"+" "+" AUTHOR NAME : "+book.get(i).getAuthorName()+"\n"+" "+" PUBLISHER NAME : "+book.get(i).getPublisher()+"\n"+" "+" BOOK ID NUMBER : "+book.get(i).getId()+"\n"+" "+" PRICE OF THE BOOK : "+book.get(i).getPrice()+"\n");
			System.out.print("\n");
		}
    }
    public void indexOfLibrary()
    { 
        System.out.print("\n");   	
    	System.out.print("                    INDEX AND SEARCH ENGIN OF LIBRARY                    ");
    	System.out.print("\n"); 
    	System.out.print("-------------------------------------------------------------------------");
    	System.out.print("\n"); 
    	System.out.print("\n"); 
    	System.out.print("\n"); 
    	System.out.print(" 1. BOOK DETAILS \n 2. ABOUT BOOKS \n 3. ADD BOOKS \n 4. SEARCH AND UPDATE THE BOOKS PRICE \n 5. FILE READER ");
    	System.out.print("\n"); 
    	int choice = scanner.nextInt();
    	if(choice==1)
    	{
    		System.out.print("\n"); 
    		this.libraryBookDetails();
    		System.out.print("\n"); 
    		this.indexOfLibrary();
    	}
    	else if(choice==2)
    	{
    		System.out.print(" ABOUT BOOK DETAILS ");
    		System.out.print("\n");
    		System.out.print("--------------------");
    		System.out.print("\n");
    		System.out.print("\n");
    		 Charlottes cha = new  Charlottes();
    		 cha.detailsOftheBook();
    		 System.out.print("\n");
    		 System.out.print("\n");
    		 HarryPotter hp = new HarryPotter();
    		 hp.detailsOftheBooks();
    		 System.out.print("\n");
    		 System.out.print("\n");
    		 this.indexOfLibrary();

    	}
    	else if(choice==3)
    	{
    		System.out.print("\n"); 
           this.adminAddBooks();
           System.out.print("\n"); 
           this.indexOfLibrary();
    	}
    	else if(choice==4)
    	{
    		System.out.print("\n"); 
    		this.searchBookandUpadtePrice();
    		System.out.print("\n"); 
    		this.indexOfLibrary();
    	}
    	else if(choice==5)
    	{
           System.out.print("\n"); 
    	   this.creatFileofBooks();
           System.out.print("\n"); 
           this.indexOfLibrary();
    	}
    	else
    	{
    		System.out.print(" invalid choice ");
    	}
    }
   public void adminAddBooks()
	{  
	    System.out.println(" IF YOU WANT TO ADD BOOK PRESS 0 ");
	    int c = scanner.nextInt();
	    System.out.print("\n"); 
    	System.out.println(" ----------------------------------------------------------------------------- ");
    	System.out.print("\n"); 
    	if(c==0)
       {
    		System.out.print(" HOW MANY BOOK YOU WANT ADD: ");
		    int index = scanner.nextInt();
		    index = index + book.size();
		 for(int i=book.size();i<index;i++)
		 {
			book.add(new Books());
			System.out.print("\n Enter the Name of the BOOK : Name :");
			book.get(i).setBookName(scanner.next());
			System.out.print("\n Enter the AuthorName of the BOOK : Name :");
			book.get(i).setAuthorName(scanner.next());
			System.out.print("\n Enter the PublisherName of the BOOK : Name :");
			book.get(i).setPublisher(scanner.next());
            System.out.print("\n Enter the Id Number of the Book :  ");
			book.get(i).setId(scanner.nextInt());
			System.out.print("\n Enter the Price of the Book :  ");
			book.get(i).setPrice(scanner.nextInt());
			System.out.print("\n"); 
		 }
		    System.out.print("\n");
		    getAddedBooks();
		}
	}
 public void getAddedBooks()
	{
		System.out.print("\n            EDITED LIBRARY DETAILS           ");
		System.out.print("\n");
		for(int i=0;i<book.size();i++)
		{
			if(book.get(i) instanceof Books)
			{
				System.out.print((i+1)+" BOOK NAME : "+book.get(i).getBookName()+"\n"+" "+" AUTHOR NAME : "+book.get(i).getAuthorName()+"\n"+" "+" PUBLISHER NAME : "+book.get(i).getPublisher()+"\n"+" "+" BOOK ID NUMBER : "+book.get(i).getId()+"\n"+" "+" PRICE OF THE BOOK : "+book.get(i).getPrice()+"\n");
			    System.out.print("\n");
			}
		}
	}
 public void searchBookandUpadtePrice()
	{
		System.out.println("           SEARCH OPTION           ");
		System.out.println(" --------------------------------- ");
   		System.out.println("ENTER THE NAME OF THE BOOK YOU WANT TO SEARCH :");
        String bookName = scanner.next();
        System.out.print(bookName);
        for(int i=0;i<book.size();i++)
        {
        	if(bookName.equals(book.get(i).getBookName()))
        	{
        		System.out.println("THE LOCATION OF THE BOOK IS :"+(i+1));
        		System.out.print("\n");
        		System.out.println("           UPDATE OPTION          ");
        		System.out.println(" --------------------------------- ");
        		System.out.println(" IF YOU WANT TO UPDATE PRESS 1 IF NOT THEN PRESS 0 ");
                int k = scanner.nextInt();
        		if(k==1)
        		{
        			System.out.println(" ENTER THE PRICE OF THE BOOK :");
        			int price = scanner.nextInt();
        			book.get(i).setPrice(price);
        		 for(int j=0;j<book.size();j++)
	             {
	    	        System.out.print("\n"+(j+1)+" "+book.get(j).getBookName()+"\n"+"$"+book.get(j).getPrice());
	    	        System.out.print("\n");
                    System.out.println(" -----------------------##############----------------------- ");
                    System.out.print("\n"); 
	             }
        		}
        	}
        }
        System.out.print("\n");
	}

	 public void creatFileofBooks()
    {
      try
      {
       File file = new File("D:\\javaworks\\CoreJavaFoundational\\LibraryManagement\\scr\\com\\lxisoft\\File\\file.txt");
       FileWriter filewriter = new FileWriter(file);
       BufferedWriter writer = new BufferedWriter(filewriter);
       writer.write("\n BOOK NAME : CHARLOTTES \n AUTHOR NAME : ROBO \n PUBLISHER : ADDICTES COMPANY \n ID : 1 \n PRICE : 140 \n ------------------------------------------------------------ ");
       writer.write("\n BOOK NAME : HARRYPOTTER \n AUTHOR NAME : RAONE \n PUBLISHER : GONE COMPANY \n ID : 2 \n PRICE : 120 \n ------------------------------------------------------------ ");   
       writer.flush();
       writer.close();
      } 
      catch(IOException e)
      {
        e.printStackTrace();
      }
      this.readFileofBooks();
    }
    public void readFileofBooks()
    {
        try
        {
            Scanner scanner = new Scanner(System.in);
            BufferedReader buffer = new BufferedReader(new FileReader("D:\\javaworks\\CoreJavaFoundational\\LibraryManagement\\scr\\com\\lxisoft\\File\\file.txt"));
            String a = scanner.next();
            while((a=buffer.readLine()) != null)
            {
                System.out.print("\n"+a+"\n");
            } 
            buffer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
      
}