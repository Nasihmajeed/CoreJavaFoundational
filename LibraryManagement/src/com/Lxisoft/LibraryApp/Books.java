package com.Lxisoft.LibraryApp;
import com.Lxisoft.LibraryApp.*;
import java.util.*;
import java.io.*;
public class Books
 {
    
    Book book = new Book();
    Novel novel= new Novel();
    Magazines magazine= new Magazines();
    Science science = new Science();
    public void addBooks(ArrayList<Book> books)
    {
    Scanner addInput = new Scanner(System.in);
    System.out.println (" \n Enter Number of books to be added: ");
    int input=addInput.nextInt();
    addInput.nextLine();
    for (int i=0; i<=input; i++)
    {
    books.add(new Book());
    System.out.println("\nEnter " +i+  " Book details");

    System.out.println("\n Enter the name of Book: ");
    String name=addInput.nextLine();
    books.get(i).setName(name);

    System.out.println("\n Enter the name of Author: ");
    String author=addInput.nextLine();
    books.get(i).setAuthor(author);
    
    System.out.println("\n Enter the Library Code: ");
    int code=addInput.nextInt();
    books.get(i).setCode(code);
    
    System.out.println("\n Enter the name of Publisher: ");
    String pub=addInput.nextLine();
    books.get(i).setPublishers(pub);
    
    System.out.println("\n Enter the Genere: ");
    String gen=addInput.nextLine();
    books.get(i).setGenere(gen);
        
     this.createFile(books);
     }
  }
  public void viewBooks(ArrayList<Book> books)
  {
    for (int i=0; i<books.size(); i++)
    {
      System.out.println("Book "+i);
      System.out.println("________________________\n");
      System.out.println("Name : "+books.get(i).getName()+"\nAuthor : "+ books.get(i).getAuthor()+"\nCode : "+books.get(i).getCode());
      System.out.println("________________________\n");
    }
  }
  public void deleteBooks(ArrayList<Book> books)
  {
    Scanner delete = new Scanner(System.in);
    System.out.println("\n Enter the Index Number of Book: ");
    int deleteIndex=delete.nextInt();
    books.remove(deleteIndex);
    System.out.println("Books after deletion is ");  
    this.viewBooks(books);
    this.createFile(books);
  }

  public void updateBooks(ArrayList<Book> books)
  {
    Scanner update = new Scanner(System.in);
    System.out.println("\n Enter the Index Number of Book: ");
    int editInput =update.nextInt();
    
    System.out.println("\n Enter the name of Book: ");
    String editname = update.nextLine();
    books.get(editInput).setName(editname);
    
    System.out.println("\n Enter the name of Author: ");
    String editauthor=update.nextLine();
    books.get(editInput).setAuthor(editauthor);
    
    System.out.println("\n Enter the Library Code: ");
    int editcode=update.nextInt();
    books.get(editInput).setCode(editcode);

    System.out.println("\n Enter the name of Publisher: ");
    String publisher=update.nextLine();
    books.get(editInput).setPublishers(publisher);

    System.out.println("Sucsfully updated");
    
 
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
      
      book.displayNovelDetails();
      }
      
      if(books.get(i).getGenere() .equals("magazine") )
      {
      System.out.println(books.get(i).getName());
      
      book.displayMagazineDetails();

      }

       if(books.get(i).getGenere() .equals("Science") )
      {
      System.out.println(books.get(i).getName());
      
      book.displayScienceDetails();
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
  public void createFile(ArrayList<Book> books) 
  {
    //this.bookDetails();
  try{
            FileWriter writeData = new FileWriter("Library_Data.txt");
            Writer writeStream = new BufferedWriter(writeData);
            int sz=books.size();
            for(int i=0; i<sz; i++)
            {
              writeStream.write("Detals Of Book "+i+"\nName : "+books.get(i).getName()+"\nAuthor : "+ books.get(i).getAuthor()+"\nCode : "+books.get(i).getCode()+"\nGenere : "+books.get(i).getGenere()+"\n\n\n");
            }
            writeStream.flush();
            writeStream.close();
            System.out.println("Sucessfully Exported");

        }catch (IOException e) 
        {
            e.printStackTrace();
        }
      }

public void readFile(ArrayList<Book> books) 
  {
    
  try{
            FileReader readData = new FileReader("Library_Data.txt");
            Scanner datareader= new Scanner (readData);
            int sz=books.size();
            while (datareader.hasNextLine())
            {
              String data = datareader.nextLine();
              System.out.println(data);  
            }
            datareader.close();

        }catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }

    }
  }