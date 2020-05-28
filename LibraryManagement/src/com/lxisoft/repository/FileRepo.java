package com.lxisoft.repository;
import com.lxisoft.library_management.*;
import java.util.*;
import java.io.*;
public class FileRepo
{
	File file=new File("D:\\git_core\\CoreJavaFoundational\\LibraryManagement\\src\\com\\lxisoft\\repository\\Text.csv");
	FileWriter fw=null;
	FileWriter f=null;
	BufferedWriter bw=null;
	static int id=0;
	List<Book>bookList=new ArrayList<Book>();

	public List<Book> create(Book b)
	{
		try
		{
			fw=new FileWriter(file,true);
			count();
			fw.write(id+","+b.getName()+","+b.getAuther()+","+b.getPublisher()+"\n");
			fw.flush();
		}
		catch(IOException e)
		{
			System.out.println("an error occured");
		}
		return bookList;	
	}

	public List<Book> read()
	{
		Set<Book> ts=new TreeSet<Book>();
		try
		{
		    bookList.clear();
		    fw=new FileWriter(file,true);
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String read;       
			while((read=br.readLine())!=null)
			{
				String[] str=read.split(",",4);
				Book b=new Book();
				b.setId(str[0]);
				b.setName(str[1]);
				b.setAuther(str[2]);
				b.setPublisher(str[3]);
				// System.out.println(Arrays.toString(str));
				// System.out.println("Book=="+b.toString()+"\n");
				// ts.add(b);
				bookList.add(b);
			}
			// bookList.addAll(ts);
		}
		catch(IOException e)
		{
			System.out.println("Book list empty!!!!");
			e.printStackTrace();
		}	
		return bookList;
	}

	@Override
	public String toString()
	{
		Book b=new Book();
		return String.format(id+""+b.getName()+","+b.getAuther()+","+b.getPublisher()) ;
	}

	public final void count()
	{
		try
		{
			id=0;
			Book b=new Book();
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String read;
			while((read=br.readLine())!=null)
			id++;
		}
		catch(IOException e)
		{
			System.out.println("an error ");
		}	
	}

	public List<Book> idSort()
  	{
  		bookList=read();
  		Collections.sort(bookList,new IdComparator());
		return bookList;
  	}

  	public List<Book> nameSort()
  	{
  		bookList=read();
  		Collections.sort(bookList,new NameComparator());
		return bookList;
  	}

  	public List<Book> autherSort()
  	{
  		bookList=read();
  		Collections.sort(bookList,new AutherComparator());
		return bookList;
  	}
}