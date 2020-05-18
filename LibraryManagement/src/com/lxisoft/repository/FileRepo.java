package com.lxisoft.repository;
import com.lxisoft.librarymanagement.*;
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
					b.setAuther(str[3]);
					bookList.add(b);

				}
			}
			catch(IOException e)
			{
				System.out.println("Book list empty!!!!");
			}	
			return bookList;
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
}