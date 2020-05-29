package com.lxisoft.library_management;
import com.lxisoft.library_management.*;
import com.lxisoft.repository.*;
import java.util.*;
public class Librarian
{
	FileRepo repo=new FileRepo();
	Book b=new Book();


	public int displayOptions()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n             Enter your choice:");
		System.out.println("             1-Add\n             2-View\n             3-Search\n             4-ReturnBook\n             5-Sort\n             6-Exit");
		int ch=sc.nextInt();
		return ch;
	}


	public void options()
    {
    	Reader r=new Reader();
    	int ch=0;
		List<Book>bookList=new ArrayList<Book>();
        do
        {
            ch=displayOptions();
			switch(ch)
            {
                case 1:addBook();break;
                case 2:getAllBooks();break; 
                case 3:searchDetails();break;
                case 4:r.returnBook();break;
                case 5:sorted(bookList);break;    
                case 6:System.exit(0);break;
            } 
        }while(ch!=7);
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

    public int sortBooks(List<Book>bookList)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("             Enter your choice:");
		System.out.println("             1-Sorted by Id\n             2-Sorted by Name\n             3-Sorted by Auther\n             4-Exit");
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
		do
		{
			a=sortBooks(bookList);
			switch(a)
			{
				case 1:bookList=repo.idSort();break;
				case 2:bookList=repo.nameSort();break;
				case 3:bookList=repo.autherSort();break;
				case 4:System.exit(0);break;
			}
		}while(a!=5);
	}

	public void searchBook(List<String> s)
	{
		if(s.size()!=0)
		{
			for(int i=0;i<s.size();i++)
			{
				System.out.println(s.get(i));
			}
		}
		else
		{
			System.out.println("Not Found Search Results");
		}
	}

	public void searchDetails()
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Search name");
		String n=sc.next();
        List<String>s=new ArrayList<String>();
        List<Book>bookList=repo.read();
        for(int i=0;i<bookList.size();i++)
        {
            if(bookList.get(i).getName().contains(n))
            {
                s.add(bookList.get(i).getName());
            }
        }
        searchBook(s);

    }
}