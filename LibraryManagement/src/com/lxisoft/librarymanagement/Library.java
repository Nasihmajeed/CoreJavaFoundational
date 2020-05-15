package com.lxisoft.librarymanagement;
import com.lxisoft.repository.*;
import java.util.*;
public class Library
{
	FileRepo repo=new FileRepo();
	private String book;
	
	public void setBook(String book)
	{
		this.book = book;
	}
	public String getBook()
	{
		return book;
	}


	public int display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n             Enter your choice:");
		System.out.println("             1-Add\n             2-View\n             3-Sort\n             4-Exit");
		int ch=sc.nextInt();
		return ch;
	}	

	public void display(int ch)
    {
        do
        {
            ch=display();
			switch(ch)
            {
                case 1:addBook();break;
                case 2:getAllBooks();break; 
                case 3:sorted();    
                case 4:break;
            } 
        }while(ch!=3);
       
    }


    public Book addBook()
	{
		Scanner sc=new Scanner(System.in);
		Book b=new Book();
		System.out.println("\nEnter Book name:");
		String name=sc.next();
		b.setName(name);
		System.out.println("\nEnter Auther name:");
		String auther=sc.next();
		b.setAuther(auther);
		System.out.println("\nEnter Publisher name:");
		String publisher=sc.next();
		b.setPublisher(publisher);
		repo.create(b);
	    return b;
	}

	public void getAllBooks()
	{ 
		List<Book>bookList=repo.read();    
        
    }

    public int sort()
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your choice:");
			System.out.println("1-Sorted Id\n2-Sorted Name\n3-Sorted number\n4-Exit");
			int a=sc.nextInt();
			return a;
	}

	 public void sorted()
	    {
	    	int a=0;
	        List<Book>bookList=null;
	        do
	        {
	            a=sort();
	            switch(a)
	            {
	                case 1:bookList=repo.idSort();break;
	                case 2:break;
	            }
	        }while(a!=3);
	    }
}