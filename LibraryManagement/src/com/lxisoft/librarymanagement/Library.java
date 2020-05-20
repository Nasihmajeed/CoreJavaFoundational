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
		List<Book>bookList=new ArrayList<Book>();
        do
        {
            ch=display();
			switch(ch)
            {
                case 1:addBook();break;
                case 2:getAllBooks();break; 
                case 3:sorted(bookList);    
                case 4:System.exit(0);break;
            } 
        }while(ch!=5);
    }


    public Book addBook()
	{
		Scanner sc=new Scanner(System.in);
		Book b=new Book();
		System.out.println("             \nEnter Book name:");
		String name=sc.next();
		b.setName(name);
		System.out.println("             \nEnter Auther name:");
		String auther=sc.next();
		b.setAuther(auther);
		System.out.println("             \nEnter Publisher name:");
		String publisher=sc.next();
		b.setPublisher(publisher);
		repo.create(b);
	    return b;
	}

	public void getAllBooks()
	{
		List<Book>bookList=repo.read();
		if((bookList.size()!=0))
		{
			System.out.println("         Book List \n       ---------------");
			System.out.println("\t ID \tNAME \tAuthor \tPublisher ");
			for(int i=0;i<bookList.size();i++)
			{
				System.out.println("\t  "+bookList.get(i).getId()+"\t"+bookList.get(i).getName()+"\t"+bookList.get(i).getAuther()+"\t"+bookList.get(i).getPublisher());
			}
			
		}
		 
	}

	// public void sortBook(List<Book>bookList)
	// {
	// 	for(int i=0;i<bookList.size();i++)
	// 	{
	// 		System.out.println("Id="+bookList.get(i).getId());
 //     		System.out.println("Name="+bookList.get(i).getName());
 //     		System.out.println("Auther="+bookList.get(i).getAuther());
 //     		System.out.println("Publisher="+bookList.get(i).getPublisher());
 //     	}
	// }

    public int sort(List<Book>bookList)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("             Enter your choice:");
		System.out.println("             1-Sorted Id\n             2-Sorted Name\n             3-Exit");
		int a=sc.nextInt();
		for(int i=0;i<bookList.size();i++)
		{
			System.out.println("Id="+bookList.get(i).getId());
     		System.out.println("Name="+bookList.get(i).getName());
     		System.out.println("Auther="+bookList.get(i).getAuther());
     		System.out.println("Publisher="+bookList.get(i).getPublisher());
     	}
		return a;
	}

	public void sorted(List<Book>bookList)
	{
		int a=0;
		// List<Book>bookList=null;
		do
		{
			a=sort(bookList);
			switch(a)
			{
				case 1:bookList=repo.idSort();break;
				case 2:bookList=repo.nameSort();break;
				case 3:System.exit(0);break;
			}
			// sortBook(bookList);
		}while(a!=4);
	}
}