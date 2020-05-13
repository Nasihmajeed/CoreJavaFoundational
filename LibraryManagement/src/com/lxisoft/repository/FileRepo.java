package com.lxisoft.repository;
import com.lxisoft.librarymanagement.*;
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
				fw.write(id+","+b.getName()+","+b.getAuthor()+","b.getPublisher()+"\n");
				fw.flush();
			}
			catch(IOException e)
			{
				System.out.println("an error occured");
			}
			return bookList;	
		}
}